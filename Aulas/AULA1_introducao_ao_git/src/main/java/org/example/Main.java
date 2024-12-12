package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Sistema de almoxarifado
        System.out.println("BEM VINDO AO ALMOXARIFADO");
        System.out.println("RESISTOR | CAPACITOR | PROTOBOARD");
        System.out.println("FAÇA SUA REQUISICAO: ");

        // entrada de dados
        Scanner in = new Scanner(System.in);
        String componente = in.nextLine();  // in.nextLine() -> entrada de dados do tipo String
        // in.nextInt() -> entrada de dados do tipo Int

        // estrutura de decisão -> switch
        switch (componente) {
            case "RESISTOR":
                System.out.println("Requisitou um resistor");
                break;
            case "CAPACITOR":
                System.out.println("Requisitou um capacitor");
                break;
            case "PROTOBOARD":
                System.out.println("Requisitou um protobiard");
                break;
            default:
                System.out.println("INVALIDO");
                break;
        }

        // identacao automatica na IDE intellij -> ctrl + shift + alt + l

    }
}