package org.example;

import java.util.Scanner;

public class Premier {
    public static void main(String[] args) {
        int conCandidato1 = 0;
        int conCandidato2 = 0;
        int conCandidato3 = 0;

        int conCandidatoRadio1 = 0;
        int conCandidatoRadio2 = 0;
        int conCandidatoRadio3 = 0;

        int conCandidatoInternet1 = 0;
        int conCandidatoInternet2 = 0;
        int conCandidatoInternet3 = 0;

        int conCandidatoTele1 = 0;
        int conCandidatoTele2 = 0;
        int conCandidatoTele3 = 0;

        int conMedioRadio = 0;
        int conMedioInternet = 0;
        int conMedioTelevision = 0;

        int costoCandidato1 = 0;
        int costoCandidato2=0;
        int costoCandidato3=0;

        int opcion;
        int opcionMedio;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---------- Premier Represenation ----------");
            System.out.println("1. Votar canditato eleccion");
            System.out.println("2. Calcular el costo de campaña Candidato");
            System.out.println("3. Vaciar urnas de votación");
            System.out.println("4. Conocer Numero total de Votos");
            System.out.println("5. Porcentaje de votos obtenidos por cada candidato");
            System.out.println("6. Costo promedio de campana en las elecciones");
            System.out.println("Elija una Opción:  ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el numero del candidato que desea votar");
                    System.out.println("1. Julian");
                    System.out.println("2. Andres");
                    System.out.println("3. William");
                    int opcionCandidato = scanner.nextInt();
                    switch (opcionCandidato) {
                        case 1 -> {
                            conCandidato1++;
                            System.out.println("Gracias por su Voto!");
                            System.out.println("Por cual medio se influencio");
                            System.out.println("1. Internet");
                            System.out.println("2. Radio");
                            System.out.println("3. Television");
                            opcionMedio = scanner.nextInt();
                            if (opcionMedio==1){
                                conCandidatoInternet1++;
                            } else if (opcionMedio==2) {
                                conCandidatoRadio1++;
                            } else if (opcionMedio==3) {
                                conCandidatoTele1++;
                            }
                        }
                        case 2 -> {
                            conCandidato2++;
                            System.out.println("Gracias por su Voto!");
                            System.out.println("Por cual medio se influencio");
                            System.out.println("1. Internet");
                            System.out.println("2. Radio");
                            System.out.println("3. Television");
                            opcionMedio = scanner.nextInt();
                            if (opcionMedio==1){
                                conCandidatoInternet2++;
                            } else if (opcionMedio==2) {
                                conCandidatoRadio2++;
                            } else if (opcionMedio==3) {
                                conCandidatoTele2++;
                            }
                        }
                        case 3 -> {
                            conCandidato3++;
                            System.out.println("Gracias por su Voto!");
                            System.out.println("Por cual medio se influencio");
                            System.out.println("1. Internet");
                            System.out.println("2. Radio");
                            System.out.println("3. Television");
                            opcionMedio = scanner.nextInt();
                            if (opcionMedio==1){
                                conCandidatoInternet3++;
                            } else if (opcionMedio==2) {
                                conCandidatoRadio3++;
                            } else if (opcionMedio==3) {
                                conCandidatoTele3++;
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Costo de campaña por candidato");
                     costoCandidato1=(conCandidatoInternet1*700000+conCandidatoRadio1*200000+conCandidatoTele1*600000);
                     costoCandidato2=(conCandidatoInternet2*700000+conCandidatoRadio2*200000+conCandidatoTele2*600000);
                     costoCandidato3=(conCandidatoInternet3*700000+conCandidatoRadio3*200000+conCandidatoTele3*600000);
                    System.out.println("Candidato 1: "+costoCandidato1);
                    System.out.println("Candidato 2: "+costoCandidato2);
                    System.out.println("Candidato 3: "+costoCandidato3);
                }
                case 3 -> {
                    conCandidato1=0;
                    conCandidato2=0;
                    conCandidato3=0;
                    System.out.println("Urnas Vaciadas");
                }
                case 4 -> {
                    System.out.println("Numero total de votos es: "+(conCandidato1+conCandidato2+conCandidato3));
                }
                case 5 -> {
                    System.out.println("Porcentajes de Votos ");
                    System.out.println("Candidato 1: "+(conCandidato1*100)/(conCandidato1+conCandidato2+conCandidato3)+"%");
                    System.out.println("Candidato 2: "+(conCandidato2*100)/(conCandidato1+conCandidato2+conCandidato3)+"%");
                    System.out.println("Candidato 3: "+(conCandidato3*100)/(conCandidato1+conCandidato2+conCandidato3)+"%");
                }
                case 6 -> {
                    try {
                        System.out.println("Costo promedio de campana en las elecciones");
                        System.out.println("Candidato 1: "+ (costoCandidato1/conCandidato1));
                        System.out.println("Candidato 2: "+(costoCandidato2/conCandidato2));
                        System.out.println("Candidato 3: "+(costoCandidato3/conCandidato3));
                    }catch (ArithmeticException e){
                        System.out.println("No se puede dividir por cero"+e);
                    }catch (Exception e){
                        System.out.println("Error"+e);
                    }

                }
            }


        } while (opcion >= 1 && opcion <= 6);

    }
}
