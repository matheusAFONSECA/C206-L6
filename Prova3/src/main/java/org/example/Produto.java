package org.example;

public class Produto implements Comparable<Produto>{
    // atributos
    private String nome;        // nome do produto
    private double preco;       // preço do produto
    private String tipo;        // tipo do produto

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int compareTo(Produto o) {
        return Double.compare(preco, o.preco);      // comprara o preço de um produto com outro
    }
}
