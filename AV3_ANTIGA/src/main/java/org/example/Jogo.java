package org.example;

public class Jogo implements Comparable<Jogo>{
    // atributos
    private String nome;        // nome do jogo
    private double preco;       // preço do jogo
    private String genero;      // genero do jogo

    // getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // metodo para ordenação
    @Override
    public int compareTo(Jogo o) {
        return Double.compare(preco, o.preco);
    }
}
