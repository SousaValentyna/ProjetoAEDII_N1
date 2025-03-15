package util;

import java.util.Scanner;
import model.*;
import service.BuscarAluno;
import service.BuscarDisciplina;

public class Menu {

    public static void menu(Aluno[] alunos, Disciplina[] disciplinas, Curso[] cursos) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("======================= MENU ========================");
        System.out.println("");
        System.out.println("               Selecione uma das opçãoes:");
        System.out.println("               1 - Buscar resultados");
        System.out.println("               0 - Sair");

        opcao = scanner.nextInt();

        if (opcao == 1) {
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
                    BuscarAluno.buscarPorNome(alunos, nome);
                } else if (opcao == 2) {
                    System.out.println("Informe o numero da matrícula do aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    BuscarAluno.buscarMatricula(alunos, matricula);
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
                    BuscarDisciplina.buscarPorNome(disciplinas, nome);
                } else if (opcao == 2) {
                    System.out.println("Informe o código da disciplina: ");
                    int codigoDisciplina = scanner.nextInt();
                    scanner.nextLine();
                    BuscarDisciplina.buscarPorCodigo(disciplinas, codigoDisciplina);
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
