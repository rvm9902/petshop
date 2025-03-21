package br.com.petshop;

public class Gato extends Animal {
    private String corPelo;


    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade); 
        this.corPelo = corPelo;
    }


    public void miar() {
        System.out.println(getNome() + " estÃ¡ miando: Miau Miau!");
    }

    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor do Pelo: " + corPelo);
    }
}
