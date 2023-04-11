package org.example;

// Agora que existe o "extends Funcionario" a classe Arquiteto herdou os atributos
// e metodos da classe Funcionario
public class Arquiteto extends Funcionario{

    private String especialidade;   // especialidade do arquiteto

    // construtor
    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    // "@Override" é como sobrescrever em sobre algo, geralmente um metodo da classe pai
    @Override
    public void mostraInfo() {
        System.out.println("INFORMAÇÕES DO ARQUITETO: ");
        super.mostraInfo();
        System.out.println("Especialidade: " + especialidade);
        System.out.println("---------------------------------------------");
    }

    @Override
    public void executacaoAcao() {
        super.executacaoAcao();
        System.out.println("O arquiteto(a)" + getNome() + "executa um predio");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 700;
    }

    // getter e setter
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
