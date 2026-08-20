package org.example;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        int N1 = sc.nextInt();
        System.out.println("Digite a nota 2: ");
        int N2 = sc.nextInt();
        System.out.println("Digite a nota 3: ");
        int N3 = sc.nextInt();
        System.out.println("Digite a nota 4: ");
        int N4 = sc.nextInt();

        int media = (N1 + N2 + N3 + N4)/4;

        System.out.println("Sua media é: " + media);


    }
}
