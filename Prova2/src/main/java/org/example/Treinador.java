package org.example;

// classe que representa o treinamdor que possui os pokemons
public class Treinador {
    private String nome;                            // nome do treinador
    private Pokemon[] pokemons = new Pokemon[20];   // Array de pokemons do treinador

    // metodos
    public void addPokemon(Pokemon p){   // adiciona um pokemon à lista de pokemons do treinador
        for(int i = 0; i < pokemons.length; i++){
            if (pokemons[i] == null){
                pokemons[i] = p;
                System.out.println("Pokemon adicionado com sucesso!!!");
                break;
            }
            Pokemon.qtdPokemon++;
        }
    }

    public void mostraInfo(){           // mostra as informações do treinador e dos pokemons dele

        System.out.println("NOME DO TREINADOR: " + nome);
        System.out.println("POKEMONS DO TREINADOR(A) " + getNome() + ":");
        for(int i = 0; i < pokemons.length; i++){
            if (pokemons[i] != null){
                pokemons[i].mostraInfo();
                System.out.println("------------------------------------");
            }
        }

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
