package org.example;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numer ");
        double N1 = sc.nextInt();

        System.out.println("Digite outro numero ");
        double N2 = sc.nextInt();

        double soma = N1 + N2;
        double subtração = N1 - N2;
        double multiplicação = N1 * N2;
        double resto = N1/N2;


        System.out.println("Soma: " + soma);
        System.out.println("subtração: " + subtração);
        System.out.println("multiplicação: " + multiplicação);
        System.out.println("divisão: " + resto);



    }
}
