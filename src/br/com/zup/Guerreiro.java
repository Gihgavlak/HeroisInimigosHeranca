package br.com.zup;

public class Guerreiro extends Heroi {
    private double poderAtaque;

    public Guerreiro(String nome, double poderMagico, double poderAtaque) {
        super(nome, poderMagico);
        this.poderAtaque = poderAtaque;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }
}
