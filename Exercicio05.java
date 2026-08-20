package org.example;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da sua hora? ");
        double valor = sc.nextDouble();
        System.out.println("Quantas horas trabalhou nesse mês ");
        double horas = sc.nextDouble();

        double salariobruto = valor * horas;
        double desconto = 0.08 * salariobruto;
        double salarioliquido = salariobruto - desconto;

        System.out.println("--------------------------------------------" );
        System.out.println("Seu salario bruto é: " + salariobruto);
        System.out.println("Desconto é de: " + desconto);
        System.out.println("Seu salario liquido é de>: " + salarioliquido);
        System.out.println("--------------------------------------------" );

    }
}
