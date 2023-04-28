package org.example;

import java.util.ArrayList;
import java.util.List;

// representa o objeto do carrinho
public class Carrinho {
    // ArrayList de produtos
    private ArrayList<Produto> produtos = new ArrayList<>();

    // metodos
    public void addProduto(Produto produto){        // adiciona um produto no carrinho
        produtos.add(produto);
    }


    // getters e setters
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
