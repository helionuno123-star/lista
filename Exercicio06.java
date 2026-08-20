package org.example;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o raio da circunferencia?");
        int raio = sc.nextInt();

        double area = (int) (3.14 * (raio*raio));
        double perimetro = 2 * 3.14 * raio;

        System.out.println("A area da sua circunferencia é: " + area);
        System.out.printf("O perimetro da sua circunferencia é: %.2f ", perimetro);
    }
}
