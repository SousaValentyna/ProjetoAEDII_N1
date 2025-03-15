package service;

import model.Disciplina;

public class BuscarDisciplina {
    public static void buscarPorNome(Disciplina[] disciplinas, String nome) {
        for(Disciplina disciplina : disciplinas) {
            if(disciplina != null) {
                if(disciplina.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(disciplina.getCodigoDisciplina() + " " + disciplina.getNome() + " " + disciplina.getNotaMinima());
                }
            } else break;
        }
    }

    public static void buscarPorCodigo(Disciplina[] disciplinas, int codigoDisciplina) {
        for(Disciplina disciplina : disciplinas) {
            if(disciplina != null) {
                if(disciplina.getCodigoDisciplina() == codigoDisciplina && disciplina != null) {
                    System.out.println(disciplina.getCodigoDisciplina() + " " + disciplina.getNome() + " " + disciplina.getNotaMinima());
                }
            } else break;
        }
    }
}