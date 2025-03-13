package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import model.*;

public class FileWriterUtil {
    public static void escreverAlunoTxt(Aluno aluno, String caminhoAluno) {
        try {
            // tudo que é responável pela escrita
            BufferedWriter escrever = new BufferedWriter(new FileWriter(caminhoAluno, true)); // append true: mantém o que há no arquivo e escreve uma nova linha
            escrever.write(aluno.getMatricula() + ";" + aluno.getNome() + ";" + aluno.getIdade());
            escrever.newLine();
            escrever.close();

        } catch (IOException erro) {
            // tratar erro
            erro.printStackTrace();
        }
    }

    public static void escreverDisciplinaTxt(Disciplina disciplina, String caminhoDisciplina) {
        try {
            BufferedWriter escrever = new BufferedWriter(new FileWriter(caminhoDisciplina, true));
            escrever.write(disciplina.getCodigoDisciplina() + ";" + disciplina.getNome() + ";" + disciplina.getNotaMinima());
            escrever.newLine();
            escrever.close();
            
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }

    public static void escreverCursoTxt(Curso curso, String caminhoCurso) {
        try {
            BufferedWriter escrever = new BufferedWriter(new FileWriter(caminhoCurso, true));
            escrever.write(curso.getMatricula() + ";" + curso.getCodigoDisciplina() + ";" + curso.getNota1() + ";" + curso.getNota2());
            escrever.newLine();
            escrever.close();
            
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }
}
