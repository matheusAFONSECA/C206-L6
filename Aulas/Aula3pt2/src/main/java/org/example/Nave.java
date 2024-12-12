package org.example;

public class Nave {
    // atributos
    String nome;
    int velocidade;
    boolean velocidadeDaLuz;
    Arma arma;

    public Nave(String nome, int velocidade, boolean velocidadeDaLuz, Arma arma) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;

        this.arma = arma;
    }

    // metodos
    public void MostraInfo(){
        System.out.println("Nome da nave: " + this.nome);
        System.out.println("Velocidade da nave: " + this.velocidade);
        if (this.arma == null){
            System.out.println("Não tem arma adicionada");
        } else {
            System.out.println("Tipo da arma: " + this.arma.tipo);
            System.out.println("Forca da arma: " + this.arma.forca);
        }
    }

    public void viajarvelocidadedaluz(){
        if (this.velocidadeDaLuz){
            System.out.println("Viaja na velocidade da luz");
        } else {
            System.out.println("Não viaja na velocidade da luz");
        }
    }

    public void addArma(Arma arma){
        System.out.println("Arma foi adicionada");
        this.arma = arma;
    }
}
