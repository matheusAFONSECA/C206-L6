package org.example;

// classe que representa o pokemon bulbassaur
public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial{
    // Atributos
    private float luminosidadeAmbiente;     // luminosiade ambiente do bulbassaur

    // construtor
    public Bulbassaur(String nome, String tipo) {
        super(nome, tipo);
    }

    // metodos
    @Override
    public void mostraInfo() {
        System.out.println("-INFORMAÇÕES DO BULBASSAUR-");
        super.mostraInfo();
        if (heldItem != null) {
            luminosidadeAmbiente = luminosidadeAmbiente + 300;
        }
        System.out.println("LUMINOSIDADE AMBIENTE: " + getLuminosidadeAmbiente());
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " esta atacando!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + "esta fazendo barulho!");
    }

    @Override
    public void ataqueEspecial() {
        if (luminosidadeAmbiente > 650){
            System.out.println(getNome() + " conseguiu ganhar de seu oponente!");
        } else {
            System.out.println(getNome() + " perdeu a batalha...");
        }
    }

    // getter e setter
    public float getLuminosidadeAmbiente() {
        return luminosidadeAmbiente;
    }

    public void setLuminosidadeAmbiente(float luminosidadeAmbiente) {
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

}
