package org.example;

public class Main {
    public static void main(String[] args) {
        // array de conta
        Conta[] contas = new Conta[10];

        // criando contas
        Conta c1 = new Conta(1000, "Vivi");
        Conta c2 = new Conta(2000, "Ju");
        Conta c3 = new Conta(500, "Char");

        contas[0] = c1;
        contas[1] = c2;
        contas[2] = c3;

        // tratando o erro de colocar uma conta em uma posição onde não podemos
//        try {
//            contas[0] = c1;
//            contas[1] = c2;
//            contas[10] = c3;
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);                          // mostra qual exceção está ocorrendo
//            System.out.println(e.fillInStackTrace());       // mostra os detalhes da exceção
//        }

        // saindo com as informações das pessoas
        System.out.println("CONTAS:");
        try {       // tratamento de erro usando o TRY e CATCH -> tratamento de erro por exceção
            for (int i = 0; i < contas.length; i++){
                System.out.println("\tNome: " + contas[i].getDono());
                System.out.println("\tSaldo: " + contas[i].getSaldo());
            }
        } catch (NullPointerException e){

        }

        // sacando dinheiro da conta
        c1.sacar(1200);
        try {
            c2.sacar1(2500);
        } catch (SemSaldoException e){
            System.out.println(e);
        }
    }
}