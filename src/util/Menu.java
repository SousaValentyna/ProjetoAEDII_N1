package util;

import java.util.Scanner;
import model.*;
import service.BuscarAluno;
import service.BuscarDisciplina;

public class Menu {

    public static void menu(Aluno[] alunos, Disciplina[] disciplinas, Curso[] cursos) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while(true) {

            System.out.println("======================= MENU ========================");
            System.out.println("");
            System.out.println("               Selecione uma das opçãoes:");
            System.out.println("               1 - Buscar resultados");
            System.out.println("               0 - Sair");
    
            opcao = scanner.nextInt();
    
            if(opcao == 0) {
                break;
            }
    
            else if (opcao == 1) {
                System.out.println("           Buscar resultador por:");
                System.out.println("           1 - Aluno");
                System.out.println("           2 - Disciplina");
    
                opcao = scanner.nextInt();
                scanner.nextLine();
    
                if (opcao == 1) {
                    // Deverá permitir ao usuário informar o nome ou a matrícula do aluno;
                    System.out.println("Buscar aluno por:");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Matrícula");
                    opcao = scanner.nextInt();
                    scanner.nextLine();
    
                    if (opcao == 1) {
                        System.out.println("Informe o nome do aluno: ");
                        String nome = scanner.nextLine();
                        Aluno aluno = BuscarAluno.buscarPorNome(alunos, nome);
                        BuscarAluno.exibirDisciplinasDoAluno(alunos, cursos, disciplinas, aluno);
                    } else if (opcao == 2) {
                        System.out.println("Informe o numero da matrícula do aluno: ");
                        int matricula = scanner.nextInt();
                        scanner.nextLine();
                        Aluno aluno = BuscarAluno.buscarMatricula(alunos, matricula);
                        BuscarAluno.exibirDisciplinasDoAluno(alunos, cursos, disciplinas, aluno);
                    } else {
                        System.out.println("Erro. Selecione # uma opção existente.");
                    }
                }
                else if(opcao == 2) {
                    System.out.println("Buscar disciplina por:");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Código da disciplina");
                    opcao = scanner.nextInt();
                    scanner.nextLine();
    
                    if (opcao == 1) {
                        System.out.println("Informe o nome da disciplina: ");
                        String nome = scanner.nextLine();
                        Disciplina disciplina = BuscarDisciplina.buscarPorNome(disciplinas, nome);
                        BuscarDisciplina.exibirAlunosPorDisciplina(alunos, cursos, disciplinas, disciplina);
                    } else if (opcao == 2) {
                        System.out.println("Informe o código da disciplina: ");
                        int codigoDisciplina = scanner.nextInt();
                        scanner.nextLine();
                        Disciplina disciplina = BuscarDisciplina.buscarPorCodigo(disciplinas, codigoDisciplina);
                        BuscarDisciplina.exibirAlunosPorDisciplina(alunos, cursos, disciplinas, disciplina);
                    } else {
                        System.out.println("Erro. Selecione & uma opção existente.");
                    }
                }
                else {
                    System.out.println("Erro. Selecione uma opção existente.");
                }
            }
            else {
                System.out.println("Erro. Selecione uma das opções existentes.");
            }
        }
    }
}
