package model;

public class Curso {
    // Atributos
    private int matricula;
    private int codigoDisciplina;
    private float nota1;
    private float nota2;

    // Construtor da classe
    public Curso(int matricula, int codigoDisciplina, float nota1, float nota2) {
        this.matricula = matricula;
        this.codigoDisciplina = codigoDisciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Métodos getters e setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
}
