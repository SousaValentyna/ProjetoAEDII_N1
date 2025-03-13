package main;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import util.FileReaderUtil;
import util.FileWriterUtil;

public class Main {
    public static void main(String[] args) throws Exception {
        String caminhoAluno = "data/Alunos.txt"; // caminho relativo
        String caminhoDisciplina = "data/Disciplinas.txt";
        String caminhoCurso = "data/Cursos.txt";

        Aluno[] resultado = FileReaderUtil.lerAlunosTxt(caminhoAluno);
        for (Aluno aluno : resultado) {
            if (aluno != null) {
                System.out.println(aluno.getNome() + " " + aluno.getMatricula() + " " + aluno.getIdade());
            }
        }

        Aluno aluno = new Aluno(15656, "valentina", 242);
        // classe // metodo
        FileWriterUtil.escreverAlunoTxt(aluno, caminhoAluno);

        Disciplina disciplina = new Disciplina(23442, "matematica", 6);
        FileWriterUtil.escreverDisciplinaTxt(disciplina, caminhoDisciplina);

        Curso curso = new Curso(13131, 233230, 4, 10);
        FileWriterUtil.escreverCursoTxt(curso, caminhoCurso);
    }
}
