package com.company;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite um outro número: ");
        double numero2 = scanner.nextDouble();
        Boolean numero1EMaiorOuMenor = numero1 > numero2;
        if (numero1EMaiorOuMenor) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else {
            System.out.println("O segundo número é maior que o primeiro. ");
        }
        scanner.close();
    }
}
