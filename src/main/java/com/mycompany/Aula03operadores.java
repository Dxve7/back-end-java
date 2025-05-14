package com.mycompany;

public class Aula03operadores {

    public static void main(String[] args){
        
        /**
         * Tipos de Comentários
         */
         
        // Comentários de uma linha
        
        /**
         * Comentários de
         * múltiplas
         * linhas
         */

        /**
         * Declaração de Váriaveis
         */
        
         String var1; // Toda váriavel declarada sem valor, automáticamente é null
         String var2 = null; // Váriavel declarada com valor null
         String var3 = ""; // Váriavel declarada com valor VAZIO, é diferente de null

         /**
          * Operadores Matemáticos
          */
          
          int num1 = 10;
          int num2 = 2;

          // Soma
          int soma = num1 + num2;
          System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + soma);

          // Subtração
          int subtracao = num1 - num2;
          System.out.println("A subtração de " + num1 + " por " + num2 + " é: " + subtracao);

          // Multiplicação
          int multiplicacao = num1 * num2;
          System.out.println("A multiplicação de " + num1 + " por " + num2 + " é: " + multiplicacao);

          // Divisão
          int divisao = num1 / num2;
          System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + divisao);
    }
}