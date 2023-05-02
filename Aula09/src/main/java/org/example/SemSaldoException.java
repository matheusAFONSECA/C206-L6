package org.example;

// classe auxiliar para tratar exceções
public class SemSaldoException extends Exception{
    public SemSaldoException(double valor){
        System.out.println("Sem valor disponivel, seu saque de " + valor + " não pode ser efetuado");
    }
}
