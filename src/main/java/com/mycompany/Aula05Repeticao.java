package com.mycompany;

public class Aula05Repeticao {

    public static void main(String[] args) throws InterruptedException {
        /**
         * For (para)
         * 
         * Para cada elemento repita
         * 
         * 1° variável de iteração
         * 2° condição de incremento
         * 3° incremento ou decremento
         */

            //Incremento
        for(int i = 0;i < 10; i = i +2) {
            System.out.println(i);
        }

            //Decremento
            System.out.println("Contagem Regressiva...");
            for (int i = 10; i >= 0; i--) {
                Thread.sleep(1000L);
                System.out.println(i + "...");
            }
            System.out.println("Booom !!");


        }
    }
