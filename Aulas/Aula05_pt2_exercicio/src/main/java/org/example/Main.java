package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // var aux
        String nome;
        int id;
        int salario;
        int pagamento = 0;

        // instanciando 5 funcionários
        Funcionario[] funcionarios = new Funcionario[5];

        // Scanner de entrada de dados
        Scanner entrada = new Scanner(System.in);

        // entrando com a quantidade de funcionários
        for (int i = 0; i < funcionarios.length; i++){
            System.out.println("Nome do funcionário " +  i + ":");
            nome = entrada.nextLine();
            System.out.println("Id do funcionário " +  i + ":");
            id = entrada.nextInt();
            System.out.println("Slario do funcionário " +  i + ":");
            salario = entrada.nextInt();
            funcionarios[i] = new Funcionario(nome, id, salario);
        }

        // quantidade de funcionários
        System.out.println("Quantidade de Funcionários: " + Funcionario.getCont());

        // quanto de pagamento a empresa tem que fazer
        for (int i = 0; i < funcionarios.length; i++){
            pagamento = pagamento + funcionarios[i].getSalario();
        }
        System.out.println("Quantidade de pagamento dos funcionários: ");

        // fechando o Scanner
        entrada.close();
    }
}