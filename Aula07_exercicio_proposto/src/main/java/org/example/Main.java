package org.example;

// exercicio envolvendo classes abstratas e interfaces

public class Main {
    public static void main(String[] args) {
        // criando um objeto de cada tipo de carro
        Hatch h1 = new Hatch();
        h1.setPortas(4);
        h1.setAno(2000);
        h1.setCor("preto");
        h1.setValor(20000);
        h1.mostraInfo();

        Sedan s1 = new Sedan();
        s1.setPortMalas(400);
        s1.setAno(2020);
        s1.setCor("azul");
        s1.setValor(50000);
        s1.mostraInfo();

        SUV s2 = new SUV();
        s2.setTracao("4X4");
        s2.setAno(2005);
        s2.setCor("rosa");
        s2.setValor(20000);
        s2.mostraInfo();

    }
}