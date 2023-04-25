package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Podemos colocar qualquer objeto/variável na Array List

        // declando um Array List heterogêneo -> aceita qualquer coisa
        ArrayList array = new ArrayList();

        // declarando um Array List homogêneo -> aceita somente o tipo que determinarmos
        ArrayList <Integer> arrayInteiro = new ArrayList();
        ArrayList <Conta> contas = new ArrayList();

        // criando Contas
        Conta c1 = new Conta("ZE", 100);
        Conta c2 = new Conta("Vivi", 20000);
        Conta c3 = new Conta("JuJu", 5000);

        // adicionando valores/objetos na Array
        array.add(10);
        array.add(c1);
        array.add("Vivi");
        array.add(false);

        arrayInteiro.add(20);
        arrayInteiro.add(50);
        arrayInteiro.add(30);
        arrayInteiro.add(18);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        // removendo valores/objetos na Array
        array.remove(c1);           // para obejtos podemos definir a variável que representa o objeto
        array.remove(2);   // para outros tipos, que não sejam objetos, colocamos a posição

        // caso queira remover um valor específico, podemos usar a seguinte configuração
        array.remove((Integer) 10);
        arrayInteiro.remove((Integer)20);

        // varrendo o Array
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }

        for(int i = 0; i < arrayInteiro.size(); i++){
            System.out.println(arrayInteiro.get(i));
        }

        for(int i = 0; i < contas.size(); i++){
            System.out.println(contas.get(i));
        }

        // Ordenando o Array de forma crescente
        Collections.sort(arrayInteiro);
        System.out.println("ARRAY ORDENADO CRESCENTE: ");
        for(int i = 0; i < arrayInteiro.size(); i++){
            System.out.println("\t" + arrayInteiro.get(i));
        }

        // Ordenando o Array de forma decrescente
        Collections.reverse(arrayInteiro);
        System.out.println("ARRAY ORDENADO DECRESCENTE: ");
        for(int i = 0; i < arrayInteiro.size(); i++){
            System.out.println("\t" + arrayInteiro.get(i));
        }

        // Varrendo as contas e mostrando as informações
        System.out.println("INFORMAÇÕES DAS CONTAS: ");
        for(int i = 0; i < contas.size(); i++){
            System.out.println("\tCONTA " + i + " :");
            System.out.println("\t\tNOME: " + contas.get(i).nome);
            System.out.println("\t\tSALDO: " + contas.get(i).saldo);
        }

        // Ordenando a Array de contas -> para conseguir fazer isso temos que implementar
        // a interface do java.util na classe do objeto
        Collections.sort(contas);
        System.out.println("INFORMAÇÕES DAS CONTAS: ");
        for(int i = 0; i < contas.size(); i++){
            System.out.println("\tCONTA " + i + " :");
            System.out.println("\t\tNOME: " + contas.get(i).nome);
            System.out.println("\t\tSALDO: " + contas.get(i).saldo);
        }
    }
}