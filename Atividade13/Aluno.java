package Mapa_Vetor;

public class Aluno {
    private String nome;
    private double nota;
    private int idade;
    private int matricula;

    public Aluno(int matricula, String nome, double nota, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public String toString() {
        return "Matricula: " + matricula +
                ", Nome: " + nome +
                ", Idade: " + idade +
                ", Nota: " + nota +
                "\n";
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}