package service;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import util.FileWriterUtil;

public class BuscarDisciplina {
    public static Disciplina buscarPorNome(Disciplina[] disciplinas, String nome) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina != null) {
                if (disciplina.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(disciplina.getCodigoDisciplina() + " " + disciplina.getNome() + " " + disciplina.getNotaMinima());
                    return disciplina;
                }
            } else
                break;
        }
        return null;
    }

    public static Disciplina buscarPorCodigo(Disciplina[] disciplinas, int codigoDisciplina) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina != null) {
                if (disciplina.getCodigoDisciplina() == codigoDisciplina && disciplina != null) {
                    System.out.println(disciplina.getCodigoDisciplina() + " " + disciplina.getNome() + " " + disciplina.getNotaMinima());
                    return disciplina;
                }
            } else
                break;
        }
        return null;
    }

    public static void exibirAlunosPorDisciplina(Aluno[] alunos, Curso[] cursos, Disciplina[] disciplinas, Disciplina disciplina) {
        String linha = "";
        String aprovacao = "";
        float notaMinima = 0;
        for (Curso curso : cursos) {
            if (curso != null && curso.getCodigoDisciplina() == disciplina.getCodigoDisciplina()) {
                notaMinima = disciplina.getNotaMinima();

                for (Aluno aluno : alunos) {
                    if (aluno != null && aluno.getMatricula() == curso.getMatricula()) {
                        System.out.println("Nota 1: " + curso.getNota1());
                        System.out.println("Nota 2 :" + curso.getNota2());
                        float media = (curso.getNota1() + curso.getNota2()) / 2;
                        if (media >= notaMinima) {
                            aprovacao = "Aluno aprovado!";
                            System.out.println(aprovacao);
                        } else {
                            aprovacao = "Aluno reprovado!";
                            System.out.println(aprovacao);
                        }
                        linha += "Aluno: " + aluno.getNome() + "\n" + "Nota 1:" + curso.getNota1() + "\n" + "Nota 2: " + curso.getNota2() + "\n" + "Status da aprovação: " + aprovacao;
                    }
                }
            }
        }
        FileWriterUtil.escreverString(linha, "data/" + disciplina.getCodigoDisciplina() + ".txt");
    }
}