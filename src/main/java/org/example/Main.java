package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta(0,"Julian","123456");
        Cuenta cuenta2 = new Cuenta(500000,"Andres","654321");
        Cuenta cuenta3 = new Cuenta(700000,"Alexander","987654");
        Cuenta cuenta4 = new Cuenta();
        cuenta4.setNumeroCuenta("45678");
        cuenta4.setSaldo(45000);
        cuenta4.setTitular("David");

        List<Cuenta> listaCuenta = new ArrayList<>();
        listaCuenta.add(cuenta1);
        listaCuenta.add(cuenta2);
        listaCuenta.add(cuenta3);
        listaCuenta.add(cuenta4);

        int opcion = 0;
        do {
            System.out.println("----------Banca MIA----------");
            System.out.println("1. Mostrar información");
            System.out.println("2. Consignar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.println("Digite una opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1->{
                   for(Cuenta miLista: listaCuenta){
                       System.out.println(miLista);
                   }
                }
                case 2 ->{
                    System.out.println("Ingrese el numero de cuenta: ");
                    String numeroCuenta = scanner.next();
                    for (int i=0; i<listaCuenta.size(); i++){
                        if(listaCuenta.get(i).getNumeroCuenta().equals(numeroCuenta)){
                            System.out.println("Ingrese el valor a consignar");
                            double valor = scanner.nextDouble();
                            while (valor <=0){
                                System.out.println("El valor de no puede ser negativo o 0");
                                System.out.println("Ingrese el valor a consignar");
                                 valor = scanner.nextDouble();
                            }
                            listaCuenta.get(i).consignar(valor);
                            System.out.println("Consignación Exitosa");
                            break;
                        }else {

                            System.out.println("El numero de cuenta no existe");
                        }
                    }
                }
                case 3->{
                    System.out.println("Ingrese el numero de cuenta: ");
                    String numeroCuenta = scanner.next();
                    for (int i=0; i<listaCuenta.size(); i++){
                        while(listaCuenta.get(i).getNumeroCuenta() != numeroCuenta) {
                            if (listaCuenta.get(i).getNumeroCuenta().equals(numeroCuenta)) {
                                System.out.println("Ingrese el valor a Retirar");
                                double valor = scanner.nextDouble();
                                while (valor > listaCuenta.get(i).getSaldo()) {
                                    System.out.println("Fondos Insuficientes su saldo es:" + listaCuenta.get(i).getSaldo());
                                    System.out.println("Ingrese el valor a retirar");
                                    valor = scanner.nextDouble();
                                }
                                listaCuenta.get(i).retirar(valor);
                                System.out.println("Retiro Exitoso");
                                break;
                            } else {
                                System.out.println("El numero de cuenta no existe");
                            }
                        }
                    }
                }
            }


        }while (opcion != 4);



    }
}