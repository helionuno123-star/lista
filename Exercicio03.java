package org.example;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor ");
        double reais = sc.nextDouble();

        double dolar = 5.0;
        double cotação = reais/dolar;

        System.out.println("Sua cotação é: " + cotação);



    }
}
