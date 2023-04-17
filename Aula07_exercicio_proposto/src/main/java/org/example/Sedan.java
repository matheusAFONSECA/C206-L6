package org.example;

public class Sedan extends Carro{       // Classe filha que herda as informações da classe Carro
    // atributos
    private int portMalas;      // capacidade do porta malas

    // metodos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("CAPACIDADE DO PORTA MALAS: " + portMalas);
    }

    // getter e setter
    public int getPortMalas() {
        return portMalas;
    }

    public void setPortMalas(int portMalas) {
        this.portMalas = portMalas;
    }
}
