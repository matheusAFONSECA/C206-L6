package org.example;

public class Main {
    /*
    * Agora vemos sobre composição e agregação
    * composição = losango preenchido
    * agregação = losango vazio
    */
    public static void main(String[] args) {

        Arma a1 = new Arma("Fogo", 300);

        Nave n1 = new Nave("Falcon", 500, false, a1);

        n1.MostraInfo();
    }
}