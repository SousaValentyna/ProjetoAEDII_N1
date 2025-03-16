package service;

import java.io.FileWriter;

import model.Aluno;
import model.Disciplina;
import util.FileWriterUtil;
import model.Curso;

public class BuscarAluno {
    public static Aluno buscarPorNome(Aluno[] alunos, String nome) {
        // Tipo //nome_objeto //vetor alunos
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                // Não funcionou corretamente -> aluno.getNome().toLowerCase() ==
                // nome.toLowerCase()
                if (aluno.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(aluno.getMatricula() + " " + aluno.getNome() + " " + aluno.getIdade());
                    // exibirDisciplinasDoAluno(alunos, cursos, disciplinas, aluno.getMatricula());
                    return aluno;
                }
            } else
                break;
        }
        return null;
    }

    public static Aluno buscarMatricula(Aluno[] alunos, int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                if (aluno.getMatricula() == matricula) {
                    System.out.println(aluno.getMatricula() + " " + aluno.getNome() + " " + aluno.getIdade());
                    return aluno;
                }
            } else
                break;
        }
        return null;
    }

    // alunos se relaciona com disciplinas através de cursos
    public static void exibirDisciplinasDoAluno(Aluno[] alunos, Curso[] cursos, Disciplina[] disciplinas, Aluno aluno) {
        String linha = "";
        String aprovacao = "";
        // matricula do aluno = matricula do curso
        // codigo do curso = codigo da disciplina
        if (cursos != null) {
            for (Curso curso : cursos) {
                if (curso != null && curso.getMatricula() == aluno.getMatricula()) {

                    for (Disciplina disciplina : disciplinas) {
                        if (disciplina != null && disciplina.getCodigoDisciplina() == curso.getCodigoDisciplina()) {
                            float media = (curso.getNota1() + curso.getNota2()) / 2;
                            System.out.println("Disciplina: " + disciplina.getNome());
                            System.out.println("Nota 1: " + curso.getNota1());
                            System.out.println("Nota 2: " + curso.getNota2());
                            if (media >= disciplina.getNotaMinima()) {
                                aprovacao = "Aluno aprovado!";
                                System.out.println(aprovacao);
                            } else {
                                aprovacao = "Aluno reprovado!";
                                System.out.println(aprovacao);
                            }
                            linha += "Código da disciplina: " + disciplina.getCodigoDisciplina() + "\n" + "Nome da disciplina: " + disciplina.getNome() + "\n" + "Nota 1: " + curso.getNota1() + "\n" + "Nota 2: " + curso.getNota2() + "\n" + "Status de aprovação: " + aprovacao;
                        }
                    }
                }
            }
            FileWriterUtil.escreverString(linha, "data/" + aluno.getMatricula() + ".txt");
        }
    }
}

/*
 * Deverá listar na tela todas as disciplinas que o aluno cursou, as notas, a
 * média das notas e o
 * resultado “Aprovado” ou “Reprovado”.
 * i. Aprovado: média da disciplina maior ou igual à Nota Mínima da disciplina;
 * ii. Reprovado: média da disciplina menor que a Nota Mínima da disciplina;
 */