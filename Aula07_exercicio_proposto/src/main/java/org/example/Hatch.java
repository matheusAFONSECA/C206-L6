package org.example;

public class Hatch extends Carro{   // Classe filha que herda as informações da classe Carro
    // Atributos
    private int portas;

    // metodos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("QUANTIDADE DE PORTAS: " + portas);
    }

    // getter e setter
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
