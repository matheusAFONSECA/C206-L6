package org.example;

// classe abstrata de carros
public abstract class Carro implements Controle{
    // Atributos
    private double valor;       // valor do carro
    private String cor;         // cor do carro
    private int ano;            // ano do carro

    // metodos
    @Override
    public void taxa() {
        System.out.println("VALOR DO CARRO: R$ " + valor);
    }

    @Override
    public void mostraInfo() {
        System.out.println("COR DO CARRO: " + cor);
        System.out.println("VALOR DO CARRO: R$ " + valor);
        System.out.println("ANO DO CARRO: " + ano);
    }

    // getter e setter
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
