package util;

import java.io.BufferedReader;
import java.io.FileReader;

import model.*;

public class FileReaderUtil {
    public static Aluno[] lerAlunosTxt(String caminhoAluno) {
        try {
            BufferedReader ler = new BufferedReader(new FileReader(caminhoAluno));
            String linha = ler.readLine();
            Aluno[] alunos = new Aluno[80];
            int i = 0;

            while (linha != null) {
                String[] dadosAluno = linha.split(";"); // armazena a linha em vetor de string splitando com ; pra salvar cada dado em um indice do vetor
                alunos[i] = new Aluno(Integer.parseInt(dadosAluno[0]), dadosAluno[1], Integer.parseInt(dadosAluno[2])); // armazena no vetor alunos um novo Aluno
                linha = ler.readLine(); // quebra uma linha
                i++; // incrementa
            }
            ler.close();
            return alunos;

        } catch (Exception erro) {
            erro.printStackTrace();
            return null;
        }
    }

    public static Disciplina[] lerDisciplinasTxt(String caminhoDisciplina) {
        try {
            BufferedReader ler = new BufferedReader(new FileReader(caminhoDisciplina)); 
            String linha = ler.readLine();
            Disciplina[] disciplinas = new Disciplina[20];
            int i = 0;

            while(linha != null) {
                String[] dadosDisciplinas = linha.split(";");
                disciplinas[i] = new Disciplina(Integer.parseInt(dadosDisciplinas[0]), dadosDisciplinas[1], Float.parseFloat(dadosDisciplinas[2]));
                linha = ler.readLine();
                i++;
            }
            ler.close();
            return disciplinas;
        } 
        catch (Exception erro) {
            erro.printStackTrace();
            return null;
        }
    }

    public static Curso[] lerCursosTxt(String caminhoCurso) {
        try {
            BufferedReader ler = new BufferedReader(new FileReader(caminhoCurso));
            String linha = ler.readLine();
            Curso[] cursos = new Curso[10];
            int i = 0;
            
            while(linha != null) {
                String[] dadosCursos = linha.split(";");
                cursos[i] = new Curso(Integer.parseInt(dadosCursos[0]), Integer.parseInt(dadosCursos[1]), Float.parseFloat(dadosCursos[2]),Float.parseFloat(dadosCursos[3]));
                System.out.println(cursos[i].getMatricula());
                linha = ler.readLine();
                i++; 
            }
            ler.close();
            return cursos;
            
        } catch (Exception erro) {
            erro.printStackTrace();
            return null;
        }
    }
}
