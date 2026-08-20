package org.example;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Em que temperatura vc esta ?");
        int temp = sc.nextInt();

        double Fahrenheit = (temp*1.8) + 32;
        double Kelvin = temp + 273.15;

        System.out.println("Fahrenheit: " + Fahrenheit);
        System.out.println("Kelvin: " + Kelvin);
    }
}
