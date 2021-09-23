package br.com.zup;

public class InimigoVoadores extends Inimigo {
    private double danoTiro;

    public InimigoVoadores(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }

    public double getDanoTiro() {
        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }
}
