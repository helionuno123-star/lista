package org.example;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu consumo? ");
        double consumo = sc.nextDouble();

        if (consumo <= 100) {
            double fatura = consumo * 0.50;
            System.out.println("Seu consumo é: " + fatura);

        }else if (consumo <= 300 ) {
            double fatura2 = consumo * 0.75;
            System.out.println("Seu consumo é: " + fatura2);

        }else{
            double fatura3 = consumo * 1.10;
            System.out.printf("A diagonal é %.2f é: ", fatura3);

            }
        }
    }

