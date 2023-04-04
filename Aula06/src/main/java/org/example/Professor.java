package org.example;

// Agora que existe o "extends Funcionario" a classe Arquiteto herdou os atributos
// e metodos da classe Funcionario
public class Professor extends Funcionario{

    private String materia;     // materia que o professor leciona

    // construtor
    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    // "@Override" é como sobrescrever em sobre algo, geralmente um metodo da classe pai
    @Override
    public void mostraInfo() {
        System.out.println("INFORMAÇÕES DO PROFESSOR: ");
        super.mostraInfo();
        System.out.println("Materia: " + materia);
        System.out.println("---------------------------------");
    }

    @Override
    public void executacaoAcao() {
        super.executacaoAcao();
        System.out.println("O professor(a) " + getNome() + " leciona Aulas no INATEL");
    }

    // metodo
    public void corrigirProvas(){
        System.out.println("O professor(a) " + getNome() + " esta corrigindo provas");
    }

    // getter e setter
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
