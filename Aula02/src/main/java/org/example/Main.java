package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Aula 02 de POO -> Var primitivas:
        * sempre declarar var com letra minuscula no comeco:

            double saldoDaConta;
            double saldo_Da_Poupanca;

        * sempre declarar com lestra maiuscula var constante:

            int NUMEROS_ALUNOS = 18;

        * toda classe comeca com a letra maiuscula:

            String nome = "seu_nome_aqui";

        * casting:

            double numDouble = 1.74;
            float numFloat;

            numFloat = (float) numDouble;
            System.out.println(numFloat);

        * Entrada de dados:

            Scanner entrada = new Scanner(System.in);   // criando uma classe Scanner

            System.out.println("Entre com um num double: ");     // entrando com double
            double numDouble = entrada.nextDouble();

            System.out.println("Entre com um num float: ");     // entrando com float
            float numFloat = entrada.nextFloat();

            System.out.println("Entre com um num int: ");       // entrando com int
            int numInt = entrada.nextInt();

            entrada.nextLine();     // para entrar com a string

            System.out.println("Entre com seu nome: ");         // entrando com uma string
            String nome = entrada.nextLine();

         * controle de fluxo:

            int num1 = 10;
            int num2 = 20;
            if (num1 == num2){
                System.out.println("os numeros sao iguais");
            }
            else{
                System.out.println("os numeros não são iguais");
            }

        */

        // Exercíco da aula -> calculo de IMC
        float peso;       // peso da pessoa
        float altura;     // altura da pessoa
        float imc;        // imc da pessoa

        // entrada do peso e altura da pessoa
        Scanner entrada = new Scanner(System.in);

        System.out.println("O seu peso: ");
        peso = entrada.nextFloat();

        System.out.println("A sua altura: ");
        altura = entrada.nextFloat();

        // calculo do IMC
        altura = altura * altura;
        imc = peso / altura;

        // determinacao da classificacao do IMC da pessoa
        System.out.println("O seu IMC é de: " + String.format("%.2f", imc));
        if (imc < 18.5){
            System.out.println("Você está abaixo do peso");
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("O seu peso está nomal");
        }
        else if (imc >= 25 && imc <= 29.9){
            System.out.println("Você está com sobrepeso");
        }
        else if (imc >= 30 && imc <= 34.9){
            System.out.println("Você está com obesidade de grau 1");
        }
        else if (imc >= 35 && imc <= 39.9){
            System.out.println("Você está com obesidade de grau 2");
        }
        else {
            System.out.println("Você está com obesidade de grau 3 ou morbida");
        }

    }
}