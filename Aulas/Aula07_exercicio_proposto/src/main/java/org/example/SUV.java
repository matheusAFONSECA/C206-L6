package org.example;

public class SUV extends Carro{     // Classe filha que herda as informações da classe Carro
    // Atributos
    private String tracao;      // tipo de tracao que a SUV possui

    // metodos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("TIPO DE TRACAO: " + tracao);
    }

    // getter e setter
    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }
}
