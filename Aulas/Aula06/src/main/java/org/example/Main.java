package org.example;

public class Main {
    public static void main(String[] args) {

        // array de funcionarios
        Funcionario[] funcionario = new Funcionario[20];

        Arquiteto a1 = new Arquiteto("Anna", 20, 1400, "Predial");
//        a1.setNome("Anna");
//        a1.setIdade(20);
//        a1.setSalario(1400);
//        a1.setEspecialidade("Predial");

//        System.out.println("Bonus: " + a1.salarioBonus());
//        a1.executacaoAcao();
//        a1.mostraInfo();

        Engenheiro e1 = new Engenheiro("Mateus", 30, 5000, "Computação");
//        e1.setNome("Mateus");
//        e1.setIdade(30);
//        e1.setSalario(5000);
//        e1.setRamo("Computação");

//        e1.executacaoAcao();
//        e1.mostraInfo();

        Professor p1 = new Professor("Chris", 25, 9000, "POO");
//        p1.setNome("Chris");
//        p1.setIdade(25);
//        p1.setSalario(9000);
//        p1.setMateria("POO");

//        e1.executacaoAcao();
//        p1.mostraInfo();
//        p1.corrigirProvas();

        // definindo os funcionarios
        funcionario[0] = a1;
        funcionario[1] = e1;
        funcionario[2] = p1;

        for(int i = 0; i < funcionario.length; i++){
            if(funcionario[i] != null){
                if (funcionario[i] instanceof Engenheiro){
                    Engenheiro e = (Engenheiro) funcionario[i];
                    e.mostraInfo();
                } else if(funcionario[i] instanceof Professor){
                    Professor p = (Professor) funcionario[i];
                    p.mostraInfo();
                } else if (funcionario[i] instanceof Arquiteto){
                    Arquiteto a = (Arquiteto) funcionario[i];
                    a.mostraInfo();
                }
            }
        }
    }
}