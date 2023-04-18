package org.example;

// classe que representa o pokemon Pikachu
public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial{
    // Atributos
    private float soltaRaios;           // quantidade de raios que o pikachu solta
    private float paralisiaEletrica;    // pikachu realiza uma paralisia eletrica

    // construtor
    public Pikachu(String nome, String tipo) {
        super(nome, tipo);
    }

    // metodos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("SOLTA RAIOS: " + getSoltaRaios());
        System.out.println("PARALISIA ELETRICA: " + getParalisiaEletrica());
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando!");
    }

    @Override
    public void ataqueEspecial() {

    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " esta fazendo barulho!");
    }

    // getter e setter
    public float getSoltaRaios() {
        return soltaRaios;
    }

    public void setSoltaRaios(float soltaRaios) {
        this.soltaRaios = soltaRaios;
    }

    public float getParalisiaEletrica() {
        return paralisiaEletrica;
    }

    public void setParalisiaEletrica(float paralisiaEletrica) {
        this.paralisiaEletrica = paralisiaEletrica;
    }

}
