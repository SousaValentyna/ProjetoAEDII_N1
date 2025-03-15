package service;

import model.Aluno;

public class BuscarAluno {
    public static void buscarPorNome(Aluno[] alunos, String nome) {
        // Tipo //nome_objeto //vetor alunos
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                // Não funcionou corretamente -> aluno.getNome().toLowerCase() == nome.toLowerCase()
                if (aluno.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(aluno.getMatricula() + " " + aluno.getNome() + " " + aluno.getIdade());
                }
            } else
                break;
        }
    }

    public static void buscarMatricula(Aluno[] alunos, int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                if (aluno.getMatricula() == matricula && aluno != null) {
                    System.out.println(aluno.getMatricula() + " " + aluno.getNome() + " " + aluno.getIdade());
                }
            } else break;
        }
    }
}
