package model;

public class Disciplina {
    // Atributos
    private int codigoDisciplina;
    private String nome;
    private float notaMinima;

    // Construtor da classe
    public Disciplina(int codigoDisciplina, String nome, float notaMinima) {
        this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
        this.notaMinima = notaMinima;
    }

    // Métodos getters e setters
    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaMinima() {
        return notaMinima;
    }

    public void setNotaMinima(float notaMinima) {
        this.notaMinima = notaMinima;
    } 
}
