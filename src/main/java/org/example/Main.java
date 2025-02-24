package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int conVeinte = 0;
        int concicuenta = 0;
        int conCien = 0;
        int conDoscientos = 0;
        int conQuinientos = 0;
        int totalMonedas = 0;
        int totalDinero = 0;
        int numero;

        do {

            System.out.print("1. Agregar Monedas \n");
            System.out.print("2. Contar monedas \n");
            System.out.print("3. Contar total de dinero ahorrado\n");
            System.out.print("4. Romper alcancias\n");
            System.out.print("Ingresa una opcion: ");
            numero = scanner.nextInt();
            switch (numero) {
                case 1: {
                    System.out.println("Ingresa la denomicacion de la modena");
                    System.out.println("1. 20");
                    System.out.println("2. 50");
                    System.out.println("3. 100");
                    System.out.println("4. 200");
                    System.out.println("5. 500");
                    int opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            conVeinte++;
                            break;
                        case 2:
                            concicuenta++;
                            break;
                        case 3:
                            conCien++;
                            break;
                        case 4:
                            conDoscientos++;
                            break;
                        case 5:
                            conQuinientos++;
                            break;
                    }
                }
                break;

                case 2: {
                    System.out.println("El total de monedas es: ");
                    totalMonedas = conVeinte + concicuenta + conCien + conDoscientos + conQuinientos;
                    System.out.println(totalMonedas);
                    System.out.println("Monedas de 20: "+conVeinte);
                    System.out.println("Monedas de 50: "+concicuenta);
                    System.out.println("Monedas de 100: "+conCien);
                    System.out.println("Monedas de 200: "+conDoscientos);
                    System.out.println("Monedas de 500: "+conQuinientos);
                }
                break;

                case 3: {
                    System.out.println("el total del dinero ahorrado es");
                    totalDinero = (conVeinte * 20) + (concicuenta * 50) + (conCien * 100) + (conDoscientos * 200) + (conQuinientos * 500);
                    System.out.println(totalDinero);
                }
                break;
                case 4: {
                    System.out.println("Rompiendo Dinero");
                    conVeinte = 0;
                    concicuenta = 0;
                    conCien = 0;
                    conDoscientos = 0;
                    conQuinientos = 0;
                    totalMonedas = 0;
                    totalDinero = 0;
                }
                break;
            }
        } while (numero >= 1 && numero <= 4);
    }
}