package com.mycompany;

public class Aula08Funcoes {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("--- Tabuada do " + numero + "---");

        for (int i = 1; i <= 10; i++ ) {
            System.out.println(numero + " x " + i + " = " + numero * i);

        }
    }

    /*
     * Não posso declarar métodos dentro de outros métodos.
     * 
     * Toda função deve ter um returno, quando não há retorno utilizamos void.
     * 
     * Uma função pode não ter parâmetros, ou ter 1 ou mais.
     */
    public static int multiplicacao(int num, int num2) {
        return num * num2;
    }
    /*
     * Funções recursivas
     * 
     * uma função recursiva faz uma chamada para ela própia
     * 
     * porém, toda recursividade deve ter um pomnto de parada,
     * caso contrário pode resultar em um loop infinito
     * 
     */
    public static int fatorial(int n) {
        if (n != 0) {
            return n * fatorial(n - 1);
        } else {
            return 1;
        }
    }
}