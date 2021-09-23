package br.com.zup;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi(String nome, double poderMagico) {
        this.nome = nome;
        this.vida = poderMagico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPoderMagico() {
        return vida;
    }

    public void setPoderMagico(double poderMagico) {
        this.vida = poderMagico;
    }
    public void trocarNome(String nome){
        this.nome= nome;
    }
    public void receberDano(double dano){
        this.vida = this.vida - dano;
    }
    public double exibirVida(){
        return this.vida;
    }
}
