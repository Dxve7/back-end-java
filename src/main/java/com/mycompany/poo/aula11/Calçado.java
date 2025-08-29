package com.mycompany.poo.aula11;

public class Calçado {
    
    // Atributos privados para garantir o encapsulamento
    private String marca;
    private String modelo;
    private String cor;
    private int tamanho;
    
    // --- Métodos Acessores (Getters) ---
    // Métodos públicos para acessar os valores dos atributos

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }
    
    public int getTamanho() {
        return tamanho;
    }
    
    // --- Métodos Modificadores (Setters) ---
    // Métodos públicos para modificar os valores dos atributos

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        // Exemplo de validação: garante que o tamanho seja um valor positivo.
        if (tamanho > 1) {
            this.tamanho = tamanho;
        } else {
            System.out.println("Erro: O tamanho do calçado deve ser um valor positivo.");
        }
    }
}