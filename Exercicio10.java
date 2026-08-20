package org.example;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite outra nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1+nota2)/2;
        double mediaescola = 7;

        if (media >= mediaescola) {
            System.out.println("Aprovado");
        } else if (media >= 5.0) { // Fica entre 5.0 e 6.99
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
        

            
        
    

