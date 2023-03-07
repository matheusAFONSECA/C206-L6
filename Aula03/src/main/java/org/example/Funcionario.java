package org.example;

public class Funcionario {

    // atributos
    int idade;  // idade do funcionário
    String nome;    // nome do funcionário
    int cpf;    // cpf do funcionário
    float salario;  // salario do funcionario

//    construtor
//    public Funcionario(int idade, String nome, int cpf, float salario) {
//        this.idade = idade;
//        this.nome = nome;
//        this.cpf = cpf;
//        this.salario = salario;
//    }

    // metodos
    public void tirarFerias(String mes, int qtdias){
        System.out.println("O funcionário " + nome + " tirou ferias no mes de " + mes + " por " + qtdias + " dias");
    }

    public float salarioAnual(){
        float salAnual = salario * 12;
        return salAnual;
    }

    // esse metodo é diferente do anterior pq esse possui parâmetro enquanto o outro não
    public float salarioAnual(float decimoTerceiro){
        float salAnual = salario * 12;
        return salAnual + decimoTerceiro;
    }

    /*
    * Dois metodos podem ter o mesmo nome, desde que possuam alguma diferenciação, como parâmetros
    */
}
