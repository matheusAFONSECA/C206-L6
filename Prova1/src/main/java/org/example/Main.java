package org.example;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declarando o Sacanner
        Scanner entrada = new Scanner(System.in);

        // instancioando o obejto aldeia e adicionando informações nela
        Aldeia aldeia = new Aldeia();

        System.out.println("Nome da Aldeia: ");
        aldeia.nome = entrada.nextLine();
        System.out.println("Região que a Aldeia se encontra:");
        aldeia.regiao = entrada.nextLine();
        System.out.println("Quantidade de moradores: ");
        aldeia.qtdMoradores = entrada.nextInt();

        // entrando no menu do sistema da aldeia
        boolean flag = true;        // flag para ajudar no controle do sistema

        while (flag){
            System.out.println("BEM VINDO AO MENU DA ALDEIA: " + aldeia.nome);
            System.out.println("1 - Registrar um novo ninja");
            System.out.println("2 - Mostrar informações da aldeia e dos ninjas dela");
            System.out.println("3 - Mostrar os nomes dos ninjas de ranking S");
            System.out.println("4 - Mostrar a quantidade de ninjas Gennin, Chunnin e ANBU");
            System.out.println("5 - Sair do menu");

            int op;     // operador que determina o que será feito
            op = entrada.nextInt();

            switch (op){
                case 1:
                    System.out.println("ACIONE O NOVO NINJA");
                    entrada.nextLine();

                    System.out.println("Entre com o nome do ninja: ");  // adiciona o nome do ninja
                    String nomeNinja = entrada.nextLine();

                    System.out.println("Entre com a idade do " + nomeNinja + ": ");  // adiciona a idade
                    int idadeNinja = entrada.nextInt();

                    entrada.nextLine();
                    System.out.println("Entre com o Título do " + nomeNinja + ": ");   // adiciona o Título
                    String tituloNinja = entrada.nextLine();

                    System.out.println("Entre com o Ranking do " + nomeNinja + ": ");   // adiciona o Ranking
                    String rankingNinja = entrada.nextLine();

                    // instanciando o novo Ninja e adicionando o mesmo na aldeia
                    Ninja novoNinja = new Ninja(nomeNinja, idadeNinja, tituloNinja, rankingNinja);
                    aldeia.adicionarNinja(novoNinja);     // adiciona o estudante na escola
                    break;

                case 2:     // mostra as informações da aldeia
                    aldeia.mostraInfo();
                    break;

                case 3:     // mostra o nome dos ninjas do ranking S
                    aldeia.rankingS();
                    break;

                case 4:     // mostra a quantidade de ninjas com cada título
                    aldeia.qtdTitulos();
                    break;

                case 5:     // sair do sistema
                    flag = false;
                    break;

                default:    // caso entre com um valor errado
                    System.out.println("INSIRA UM NÚMERO VÁLIDO");
                    break;
            }
        }

        // fechamento do Scanner de entrada de dados
        entrada.close();
    }
}