package org.example;

// classe auxiliar para tratar execeções de preço negativo
public class PrecoNegativoException extends Exception{

    public PrecoNegativoException(double valor){
        System.out.println("NÃO PODEMOS ADICIONAR ESSE PREÇO " + valor + ", POIS É NAGATIVO...");
    }

}
