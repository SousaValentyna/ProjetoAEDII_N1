package main;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import util.FileReaderUtil;
import util.FileWriterUtil;
import util.Menu;

public class Main {
    public static void main(String[] args) throws Exception {
        String caminhoAluno = "data/Alunos.txt"; // caminho relativo
        String caminhoDisciplina = "data/Disciplinas.txt";
        String caminhoCurso = "data/Cursos.txt";

        Aluno[] alunos = FileReaderUtil.lerAlunosTxt(caminhoAluno);
        Disciplina[] disciplinas = FileReaderUtil.lerDisciplinasTxt(caminhoDisciplina);
        Curso[] cursos = FileReaderUtil.lerCursosTxt(caminhoCurso);

        Menu.menu(alunos, disciplinas, cursos);
    }
}
