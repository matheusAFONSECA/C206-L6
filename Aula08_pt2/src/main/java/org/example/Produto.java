package org.example;

// classe que representa um produto
public class Produto implements Comparable<Produto>{
    // atributos
    private String nome;        // nome do produto
    private double preco;       // preco do produto

    // construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // getters e setters
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


    @Override
    public int compareTo(Produto o) {
        return CharSequence.compare(this.nome, o.getNome());
    }
}
