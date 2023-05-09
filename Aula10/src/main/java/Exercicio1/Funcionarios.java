package Exercicio1;

public class Funcionarios implements Comparable<Funcionarios>{

    // Atributos do funcionário
    private String nomeFunc;
    private String cpfFunc;
    private int idadeFunc;

    // Getters and setters

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getCpfFunc() {
        return cpfFunc;
    }

    public void setCpfFunc(String cpfFunc) {
        this.cpfFunc = cpfFunc;
    }

    public int getIdadeFunc() {
        return idadeFunc;
    }

    public void setIdadeFunc(int idadeFunc) {
        this.idadeFunc = idadeFunc;
    }

    // metodos
    @Override
    public int compareTo(Funcionarios o) {
        return nomeFunc.compareTo(o.nomeFunc);
    }
}