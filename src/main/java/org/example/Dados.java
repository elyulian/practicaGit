package org.example;

import java.util.Random;

public class Dados {
//    public static void main(String[] args) {
//        Dados dados = new Dados();
//        int lanzadasJuego = dados.lanzada();
//        System.out.println("Lanzadas: " + lanzadasJuego);
//        int conDado1 = 0;
//        int conDado2 = 0;
//
//        for (int i = 1; i <= lanzadasJuego; i++) {
//            conDado1 += dados.numeroDado();
//            conDado2 += dados.numeroDado();
//        }
//        System.out.println("Total Dado 1: " + conDado1);
//        System.out.println("Total Dado 2: " + conDado2);
//        if (conDado1 > conDado2) {
//            System.out.println("Gano Dado 1");
//        } else if (conDado1 < conDado2) {
//            System.out.println("Gano Dado 2");
//        } else {
//            System.out.println("Empate");
//        }
//    }

    public int lanzada() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public int numeroDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
