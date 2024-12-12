package org.example;


// classe abstrata que tera as informações dos pokemons
public abstract class Pokemon {
    // Atributos
    static int qtdPokemon;      // quantidade de pokemons do treinador
    private String nome;        // nome do pokemon
    private String tipo;        // tipo do pokemon
    HeldItem heldItem;          // Held Item do pokemon

    // construtor
    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // metodos
    public void mostraInfo(){   // mostra as informações do pokemon
        System.out.println("NOME: " + this.nome);
        System.out.println("TIPO: " + this.tipo);
        if (heldItem != null){
            System.out.println("HELD INTEM: " + heldItem.tipo);
        }
    }

    public abstract void atacar();  // metodo abstrato de atacar

    // getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
