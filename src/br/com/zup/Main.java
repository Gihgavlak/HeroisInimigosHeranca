package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Xablau", 500, 50);
        Mago mago = new Mago("Athin", 2000, 1000);

        InimigoRasteiros rasteiro  = new InimigoRasteiros("Coxin", 1000, 80);
        InimigoVoadores voadores = new InimigoVoadores("Espencer", 1500,200);

        double danoGuerreiro = guerreiro.aplicarDano();
        double danoMago = mago.aplicarMagia();

        double danoRasteiro = rasteiro.aplicarDano();
        double danoVoadores = voadores.poderDano();



        //testando vida Xablau
        System.out.println("---------------------------------");
        System.out.println(guerreiro.getNome() +"  " +guerreiro.exibirVida());
        guerreiro.receberDano(danoRasteiro);
        System.out.println( guerreiro.getNome()+"  "+guerreiro.exibirVida());
        guerreiro.receberDano(danoRasteiro);
        System.out.println( guerreiro.getNome()+"  "+guerreiro.exibirVida());
        guerreiro.receberDano(danoRasteiro);
        System.out.println( guerreiro.getNome()+"  "+guerreiro.exibirVida());

        // testando vida coxin
        System.out.println("---------------------------------");
        System.out.println(rasteiro.getNome()+ "  "+rasteiro.exibirVida());
        rasteiro.receberDano(danoGuerreiro);
        System.out.println(rasteiro.getNome()+ "  "+rasteiro.exibirVida());
        rasteiro.receberDano(danoGuerreiro);
        System.out.println(rasteiro.getNome()+ "  "+rasteiro.exibirVida());
        rasteiro.receberDano(danoGuerreiro);
        System.out.println(rasteiro.getNome()+ "  "+rasteiro.exibirVida());

        //testando vida Athin
        System.out.println("---------------------------------");
        System.out.println(mago.getNome()+ "  "+ mago.exibirVida());
        mago.receberDano(danoVoadores);
        System.out.println(mago.getNome()+ "  "+ mago.exibirVida());
        mago.receberDano(danoVoadores);
        System.out.println(mago.getNome()+ "  "+ mago.exibirVida());
        mago.receberDano(danoVoadores);
        System.out.println(mago.getNome()+ "  "+ mago.exibirVida());

        //testando vida Espencer
        System.out.println("---------------------------------");
        System.out.println(voadores.getNome()+"  "+voadores.exibirVida());
        voadores.receberDano(danoMago);
        System.out.println(voadores.getNome()+"  "+voadores.exibirVida());
        voadores.receberDano(danoMago);

        //testando trocar nome
        System.out.println("---------------------------------");
        System.out.println(guerreiro.getNome());
        guerreiro.setNome("Gan");
        System.out.println(guerreiro.getNome());

        System.out.println("---------------------------------");
        System.out.println(mago.getNome());
        mago.setNome("Tharan");
        System.out.println(mago.getNome());

        System.out.println("---------------------------------");
        System.out.println(rasteiro.getNome());
        rasteiro.setNome("Francisco");
        System.out.println(rasteiro.getNome());

        System.out.println("---------------------------------");
        System.out.println(voadores.getNome());
        voadores.setNome("Loied");
        System.out.println(voadores.getNome());






    }
}
