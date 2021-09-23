package br.com.zup;

public class Mago extends Heroi{
    private double poderMagico;

    public Mago(String nome, double poderMagico, double poderMagico1) {
        super(nome, poderMagico);
        this.poderMagico = poderMagico1;
    }

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }
}
