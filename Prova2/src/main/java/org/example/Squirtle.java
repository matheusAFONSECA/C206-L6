package org.example;

public class Squirtle extends Pokemon implements FazerBarulho{
    // Atributos
    private float multiplicadorAgua;        // multiplicador de água do Squirtle

    // construtor
    public Squirtle(String nome, String tipo) {
        super(nome, tipo);
    }

    // metodos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("MULTIPLICADOR DE ÁGUA: " + getMultiplicadorAgua());
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando!");
    }
    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " está fazendo barulho!");
    }

    // getter e setter
    public float getMultiplicadorAgua() {
        return multiplicadorAgua;
    }

    public void setMultiplicadorAgua(float multiplicadorAgua) {
        this.multiplicadorAgua = multiplicadorAgua;
    }

}
