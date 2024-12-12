package org.example;

public class Funcionario {
    // atributos do obejto
    String nome;        // nome do funcionário
    int id;             // numero de identificação do funcionário

    // atributos da classe
    private static int cont = 0;     // quantidade de funcionários
    private  int salario;
    /*
    * Quando colocamos o atributo "private" somente a propria classe pode usar
    * Quando colocamos o atributo "public" em qualquer lugar podemos mudar e acessar o valor
    dessa variável
    * Os valores de uma variável "private" só podem ser mostrados e modificados ao usarmos
    getter(mostrar) e setter(modificar)
    * Observe que getter e setter saõ declarados e funcionam como métodos da classe
    */

    // contrutor
    public Funcionario(String nome, int id, int salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        cont++;         // incremento na quantidade de funcionários
    }

    // metodos
    public void mostraInfo(){   // mostra as informações do funcionário
        System.out.println("Nome: " + this.nome);
        System.out.println("ID: " + this.id);
    }

    // getter
    public static int getCont() {
        return cont;
    }
    public int getSalario() {
        return salario;
    }

    // setter
    public static void setCont(int cont) {
        Funcionario.cont = cont;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
