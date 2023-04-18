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
        super.mostraInfo();
        System.out.println("LUMINOSIDADE AMBIENTE: " + getLuminosidadeAmbiente());
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + "esta atacando!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + "esta fazendo barulho!");
    }

    @Override
    public void ataqueEspecial() {

    }

    // getter e setter
    public float getLuminosidadeAmbiente() {
        return luminosidadeAmbiente;
    }

    public void setLuminosidadeAmbiente(float luminosidadeAmbiente) {
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

}
