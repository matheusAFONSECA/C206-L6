package org.example;

/*
* Thread permite que ocorra dois processos ao mesmo tempo, porém o código fica mais
pesado para rodar
* Theads não ocorrem por meio de um padrão -> é possivel de resolver
*/
public class ThreadContador implements Runnable{
    // atributos
    String nome;

    // construtor
    public ThreadContador(String nome) {
        this.nome = nome;
    }

    // metodos
    public void run(){      // toda thread precisa de um metodo run

        for(int i = 0; i < 10; i++){
            System.out.println(this.nome + " - " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
