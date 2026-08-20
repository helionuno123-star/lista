package org.example;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a base do seu retangulo? ");
        int base = sc.nextInt();
        System.out.println("Qual a altura do seu retangulo? ");
        int altura = sc.nextInt();

        double area = 2 * (base + altura);
        double perimetro = base * altura;
        double diagonal = (base*base) + (altura*altura);

        double raiz = Math.sqrt(diagonal);

        System.out.println("Sua area é: " + area);
        System.out.println("Seu perimetro é: " + perimetro);
        System.out.printf("A diagonal é: %.2f ", raiz);

    }
}
