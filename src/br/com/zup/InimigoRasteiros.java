package br.com.zup;

public class InimigoRasteiros extends Inimigo{
    private double danosEspinhos;

    public InimigoRasteiros(String nome, double vida, double danosEspinhos) {
        super(nome, vida);
        this.danosEspinhos = danosEspinhos;
    }


    public double getDanosEspinhos() {
        return danosEspinhos;
    }

    public void setDanosEspinhos(double danosEspinhos) {
        this.danosEspinhos = danosEspinhos;
    }
    public double aplicarDano(){
        return danosEspinhos;
    }
}
