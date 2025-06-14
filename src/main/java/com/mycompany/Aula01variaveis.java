package com.mycompany;

public class Aula01variaveis {
    public static void main(String[] args) {
        // Variavel lógica

        //Tipo primitivo
        boolean valorLogicoPrimitivo = true;
        
        //Exibe o valor
        System.out.println(valorLogicoPrimitivo);

        //Tipo abstrato
        boolean valorLogicoAbstrato = false;

        //Exibe com texto
        System.out.println("O valor da variável valorLogicoAbstrato é: " + valorLogicoAbstrato);

        //Variáveis Inteiras

        //Tipo Primitivo
        int valorInteiro = 10; //32bits
        long valorInteiroLongo = 10L; //64bits

        //Tipo Abstrato
        Integer valorInteiroAbs = 20;
        Long valorLongoAbs = 20L;

        System.out.println("O valor de valorInteiro é: " + valorInteiro + ", e o valor de valorInteiroLongo é: " + valorInteiroLongo);

        //Variáveis decimais

        //Tipo primitivo
        float numeroFloat = 10.5f;
        double numeroDouble = 10.5;

        //Tipo abstrato
        Float numeroFloatAbs  = 10.5f;
        Double numeroDoubleAbs = 10.5;

        System.out.println("O valor de numeroFloat é: " + numeroFloat + ", e o valor de numeroDouble é: " + numeroDouble);
    }
}
