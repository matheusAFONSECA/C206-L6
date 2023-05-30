package org.example;

public class Jogo implements Comparable<Jogo>{
    // atributos
    private String nome;        // nome do jogo
    private double preco;       // preço do jogo
    private String genero;      // genero do jogo

    // getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        // Aqui faço o tratamento se o preço será adicionado
        // -> caso o preço seja negativo, não será adicionado no arquivo .txt
//        try{
//
//            if(preco < 0){
//                throw new PrecoNegativoException(preco);
//            }
//            else {
//                this.preco = preco;
//            }
//
//        }catch (PrecoNegativoException e){
//
//            System.out.println(e);
//
//        }
        this.preco = preco;


    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // metodo para ordenação
    @Override
    public int compareTo(Jogo o) {
        return Double.compare(preco, o.preco);
    }
}
