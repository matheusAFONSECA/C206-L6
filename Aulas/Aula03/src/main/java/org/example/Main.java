package org.example;

public class Main {
    public static void main(String[] args) {
        // instanciando o obejto funcionario
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        // instanciando o objeto funcionario e usando o construtor
        //Funcionario f2 = new Funcionario(21, "Fulano", 11111111, 500);

        // entrada de dados de f1
        f1.salario = 500;
        f1.cpf = 1111111;
        f1.nome = "Fulano";
        f1.idade = 21;

        // entrada de dados de f2
        f2.salario = 400;
        f2.cpf = 23232323;
        f2.nome = "Ciclano";
        f2.idade = 20;

        f1 = f2;
        if (f1 == f2){
            System.out.println("São os mesmos objetos");
        } else
            System.out.println("São obejtos diferentes");

        // metodos da classe Funcionario
        System.out.println("O salários anual do " + f1.nome + " é:");
        System.out.println(f1.salarioAnual());

        f1.tirarFerias("Junho", 27);


    }
}