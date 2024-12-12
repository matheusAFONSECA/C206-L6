package org.example;

public class Escola {
    // atributos
    String nome;        // nome da escola
    String email;       // email da escola
    int numTelefone;    // telefone da escola
    String endereco;    // endereco da escola

    // Array dessa classe
    Estudante[] estudantes = new Estudante[20];     // estudantes das escola

    // metodos
    public void addEstudante(Estudante e){  // adicionar um estudante à escola

        for (int i = 0; i < estudantes.length; i++){
            if (estudantes[i] == null){
                estudantes[i] = e;
                System.out.println("Estudante matriculado!!!!");
                break;
            }
        }

    }

    public void mostraInfo(){               // mostra as informaçõe dos estudantes

        System.out.println("Nome da Escola: " + nome);  // mostra o nome da escola
        System.out.println("----------------------------------");

        for (int i = 0; i < estudantes.length; i++){
            if (estudantes[i] != null){     // se não estiver null a memória mostra as informações
                estudantes[i].mostraInfo();
                System.out.println("----------------------------------");
            }
        }

    }

    public void QtdEstudantesPorAno(){      // mosta a quantidade de estudantes em cada ano letivo

        System.out.println("----------------------------------");
        System.out.println("ALUNOS DO PRIMEIRO ANO: ");
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                if (estudantes[i].ano.equals("PRIMEIRO")) {     // quer dizer que o aluno está no primeiro ano
                    estudantes[i].mostraInfo();
                }
            }
        }

        System.out.println("----------------------------------");
        System.out.println("ALUNOS DO SEGUNDO ANO: ");
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                if (estudantes[i].ano.equals("SEGUNDO")) {     // quer dizer que o aluno está no segundo ano
                    estudantes[i].mostraInfo();
                }
            }
        }

        System.out.println("----------------------------------");
        System.out.println("ALUNOS DO TERCEIRO ANO: ");
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                if (estudantes[i].ano.equals("TERCEIRO")) {     // quer dizer que o aluno está no terceiro ano
                    estudantes[i].mostraInfo();
                }
            }
        }

    }

}
