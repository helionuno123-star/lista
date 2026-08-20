package org.example;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero ");
        int numero = sc.nextInt();

        if (numero % 2 == 0)
        {
            System.out.println("Seu numero:  " + numero + " é par");

        }else{
            System.out.println("O numero: " + numero + " É impar");
        }
    }
}