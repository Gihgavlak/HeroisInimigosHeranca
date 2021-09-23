package br.com.zup;

public class Mago {
    private String nome;
    private double poderMagico;

    public Mago(String nome, double poderMagico) {
        this.nome = nome;
        this.poderMagico = poderMagico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }
}
