package org.example;

// -> Ao se colocar o "Abstract" na classe, ela se torna uma classe que serve como classe "mãe" para
// as outras classes, ou seja, não pode ser usada como um objeto na main
// -> Se colocar "Abstract" em algum método, não poderemos usar o comando "super." na classe filha
// e o método se torna obrigatório na classe filha, ou seja, o corpo do metodo fica estruturado na classe
// filha e o método se torna obrigatório estar presente
public abstract class Funcionario {
    // atributos
    private String nome;        // nome do funcionário
    private int idade;          // idade do funcionário
    private double salario;     // salario do funcionário

    // construtor
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // metodos
    public abstract void executa();

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
    }

    public void executacaoAcao(){

    }

    public double salarioBonus(){
        return salario;
    }

    // getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
