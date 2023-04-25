package org.example;

public class Conta implements Comparable<Conta>{
    // atributos
    String nome;
    int saldo;

    // construtor
    public Conta(String nome, int saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // metodo que deriva de uma interface(Comparable) do java.util
    @Override
    public int compareTo(Conta o) {     // compara um objeto com outro objeto
        return Integer.compare(this.saldo, o.saldo);
    }
}
