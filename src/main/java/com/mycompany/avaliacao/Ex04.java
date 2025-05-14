package com.mycompany.avaliacao;

public class Ex04 {
    public static void main(String[] args) {
        double precoOriginal = 850.00;
        double percentualDesconto = 30.0;

    // Calcula o novo preço
        double novoPreco = precoOriginal - (precoOriginal * percentualDesconto / 100);

    // Exibe o resultado
        System.out.println("O preço do produto após o desconto é: R$ " + novoPreco);
    }
}