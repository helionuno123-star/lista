package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nome = sc.nextLine();
        System.out.println("Digite sua data de Nascimento ");
        int anoNascimento = sc.nextInt();
        int idade = 2026 - anoNascimento;
        System.out.println("Digite sua altura ");
        double altura = sc.nextDouble();


        System.out.println("---------------formulário--------------------");
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("-----------------------------------------------");


    }
}
