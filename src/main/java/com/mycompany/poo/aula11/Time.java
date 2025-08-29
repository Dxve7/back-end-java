package com.mycompany.poo.aula11;

public class Time {
    
    // Atributos privados para garantir o encapsulamento
    private String nome;
    private String abreviacao;
    private String torcida;
    private String estado;
    private String cidade;
    
    // --- Métodos Acessores (Getters) ---
    // Métodos públicos para acessar os valores dos atributos

    public String getNome() {
        return nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public String getTorcida() {
        return torcida;
    }
    
    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }
    
    // --- Métodos Modificadores (Setters) ---
    // Métodos públicos para modificar os valores dos atributos

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }
    
    public void setTorcida(String torcida) {
        this.torcida = torcida;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}