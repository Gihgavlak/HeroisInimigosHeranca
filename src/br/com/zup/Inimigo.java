package br.com.zup;

public class Inimigo {
    private String nome;
    private double vida;

    public Inimigo(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void trocarNome(String nome) {
        setNome(nome);
    }

    public void receberDano(double dano) {
        setVida(this.vida - dano);
    }

    public double exibirVida() {
        return this.vida;
    }
}
