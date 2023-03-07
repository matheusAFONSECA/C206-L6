package org.example;

public class Main {
    /*
    * Agora vemos sobre composição e agregação
    * composição = losango preenchido
    * agregação = losango vazio
    */
    public static void main(String[] args) {

        // instanciando a var a1 como uma classe Arma
        Arma a1 = new Arma("Fogo", 300);

        // instanciando a var n1 como uma classe Nave
        Nave n1 = new Nave("Falcon", 500, false, a1);

        /*
        * Observe que a var a1 foi passada para a var n1 como um argumento e levando consigo as info
        que foram colodas na a1
        * Isso ocorre pq foi definido na argumentacao desse metodo
        */

        n1.MostraInfo();
    }
}