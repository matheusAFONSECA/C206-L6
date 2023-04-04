package org.example;

// Agora que existe o "extends Funcionario" a classe Arquiteto herdou os atributos
// e metodos da classe Funcionario
public class Engenheiro extends Funcionario{

    private String ramo;    // ramo do engenheiro

    // construtor
    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    // "@Override" é como sobrescrever em sobre algo, geralmente um metodo da classe pai
    @Override
    public void mostraInfo() {
        System.out.println("INFORMAÇÕES DO ENGENHEIRO:");
        super.mostraInfo();
        System.out.println("Ramo: " + ramo);
        System.out.println("---------------------------------------");
    }

    @Override
    public void executacaoAcao() {
        super.executacaoAcao();
        System.out.println("O engenheiro(a) " + getNome() + " esta codando...");
    }

    // getter e setter
    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
}
