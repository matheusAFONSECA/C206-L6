package org.example;

public class Main {
    public static void main(String[] args) {
        // instanciando o treinador e dando o seu nome
        Treinador treinador = new Treinador();
        treinador.setNome("Vivi");
        treinador.mostraInfo();

        // instanciando os pokemons
        Squirtle squirtle = new Squirtle("Sapinho", "àgua");
        squirtle.setMultiplicadorAgua(500);
        squirtle.mostraInfo();

        Bulbassaur bulbassaur = new Bulbassaur("Ze", "planta");
        bulbassaur.setLuminosidadeAmbiente(450);
        bulbassaur.mostraInfo();

        Pikachu pikachu = new Pikachu("Lele", "eletricidade");
        pikachu.setSoltaRaios(300);
        pikachu.setParalisiaEletrica(100);
        pikachu.mostraInfo();

    }
}