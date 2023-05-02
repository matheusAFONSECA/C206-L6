package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // declarando um Scanner
        Scanner in = new Scanner(System.in);

        // atributos
        int n3 = 0;

        try {

            int n1 = in.nextInt();
            int n2 = in.nextInt();
            n3 = n1 / n2;

        } catch (ArithmeticException e){

            System.out.println("UM NÚMERO NÃO PODE SER DIVISIL POR ZERO!!!");

        } catch (InputMismatchException e){

            System.out.println("NÃO PODE COLOCAR UM FLOAT NO ATRIBUTO INT!!!");

        } finally {

            System.out.println(n3);

        }

    }
}
