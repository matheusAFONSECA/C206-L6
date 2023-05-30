package org.example;

// classe auxiliar para tratar execeções de preço negativo e do tipo errado de produto
public class InfoInvalidaException extends Exception{

    public InfoInvalidaException(double valor){
        System.out.println("NÃO PODEMOS ADICIONAR ESSE PREÇO " + valor + ", POIS É NAGATIVO...");
    }

    public InfoInvalidaException(String tipo){
        System.out.println("NÃO PODEMOS ADICIONAR ESSE TIPO " + tipo + ", POIS NÃO VENDEMOS ESSE TIPO DE PRODUTO...");
    }

}
