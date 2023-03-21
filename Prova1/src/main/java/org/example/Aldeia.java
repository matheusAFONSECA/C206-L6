package org.example;

public class Aldeia {
    // classe da Aldeia ninja

    // atributos
    String nome;        // nome da aldeia
    int qtdMoradores;   // quantidade de moradores da aldeia(civis)
    String regiao;      // regiao onde a aldeia se encontra

    // array da classe Ninja
    Ninja[] ninjas = new Ninja[20];     // ninjas da aldeia

    // metodos
    public void adicionarNinja(Ninja ninja){       // adiciona um ninja na aldeia
        for(int i = 0; i < ninjas.length; i++){
            if (ninjas[i] == null){
                ninjas[i] = ninja;
                System.out.println("Ninja registrado com sucesso!!!");
                break;
            }
        }
    }

    public void mostraInfo(){           // mostra as informaçõe da aldeia
        System.out.println("Nome da aldeia: " + nome);
        System.out.println("Quantidade de moradores: " + qtdMoradores);
        System.out.println("Localizada na região: " + regiao);
        System.out.println("------------------------------------");
        System.out.println("Sobre os seus ninjas:");
        for(int i = 0; i < ninjas.length; i++){
            if (ninjas[i] != null){
                ninjas[i].mostraInfo();
                System.out.println("------------------------------------");
            }
        }
    }

    public void rankingS(){             // mostra os ninjas de ranking S da aldeia

        System.out.println("Nome dos ninjas do ranking S:");
        for(int i = 0; i < ninjas.length; i++){
            if (ninjas[i] != null){
                if (ninjas[i].ranking.equals("S")){
                    System.out.println(ninjas[i].nome);
                }
            }
        }

    }

    void qtdTitulos(){                  // mostra a quantidade de titulos da aldeia
        int anbu = 0;       // quantidade de ninjas anbu
        int gennin = 0;     // quantidade de ninjas gennin
        int chunnin = 0;    // quantidade de ninjas chunnin

        for(int i = 0; i < ninjas.length; i++){
            if (ninjas[i] != null){
                if (ninjas[i].titulo.equals("Gennin")){
                    gennin++;       // incrementa a qauntidade de gennins
                }
                if (ninjas[i].titulo.equals("Chunnin")){
                    chunnin++;      // incrementa a quantidade de chunnins
                }
                if (ninjas[i].titulo.equals("ANBU")){
                    anbu++;         // incrementa a quantidade de anbus
                }
            }
        }

        // mostra a qauntidade de ninjas com cada titulo
        System.out.println("São " + anbu + " Ninja(s) ANBU");
        System.out.println("São " + chunnin + " Ninja(s) Chunnin");
        System.out.println("São " + gennin + " Ninja(s) Gennin");

    }
}
