package com.mycompany;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar altura
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        // Solicitar peso
        System.out.print("Digite seu peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();

        // Calcular IMC
        double imc = peso / (altura * altura);

        // Exibir o IMC
        System.out.printf("Seu IMC é: %.2f", imc);

        // Classificação do IMC
        if (imc < 18.5) {
            System.out.println(" Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println(" Classificação: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println(" Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println(" Classificação: Obesidade grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println(" Classificação: Obesidade grau II");
        } else {
            System.out.println(" Classificação: Obesidade grau III");
        }

        scanner.close();
    }
}