package org.example;

public class Main {
    public static void main(String[] args) {
        // definindo um Held Item -> sera adicionado no pikachu
        HeldItem h = new HeldItem();
        h.tipo = "eletricidade";

        // instanciando o treinador e dando o seu nome
        Treinador treinador = new Treinador();
        treinador.setNome("Vivi");

        // instanciando os pokemons
        Squirtle squirtle = new Squirtle("Sapinho", "àgua");
        squirtle.setMultiplicadorAgua(500);
        squirtle.fazerBarulho();
        squirtle.atacar();
        // squirtle.mostraInfo();

        Bulbassaur bulbassaur = new Bulbassaur("Ze", "planta");
        bulbassaur.setLuminosidadeAmbiente(450);
        bulbassaur.fazerBarulho();
        bulbassaur.atacar();
        bulbassaur.ataqueEspecial();
        // bulbassaur.mostraInfo();

        Pikachu pikachu = new Pikachu("Lele", "eletricidade");
        pikachu.setSoltaRaios(600);
        pikachu.setParalisiaEletrica(100);
        pikachu.heldItem = h;
        pikachu.fazerBarulho();
        pikachu.atacar();
        pikachu.ataqueEspecial();
        // pikachu.mostraInfo();

        // definindo os pokemons do treinador
        treinador.addPokemon(squirtle);
        treinador.addPokemon(bulbassaur);
        treinador.addPokemon(pikachu);

        // mostrando os pokemons do treinador
        treinador.mostraInfo();

        // mostrando a quantidade de pokemons
        System.out.println("QUANTIDADE DE POKEMONS: " + Pokemon.qtdPokemon);

    }
}