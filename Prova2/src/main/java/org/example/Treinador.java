package org.example;

// classe que representa o treinamdor que possui os pokemons
public class Treinador {
    private String nome;                            // nome do treinador
    private Pokemon[] pokemons = new Pokemon[20];   // Array de pokemons do treinador

    // metodos
    public void addPokemon(Pokemon p){   // adiciona um pokemon à lista de pokemons do treinador

    }

    public void mostraInfo(){           // mostra as informações do treinador e dos pokemons dele

        System.out.println("NOME DO TREINADOR: " + nome);

    }

    // getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }
}
