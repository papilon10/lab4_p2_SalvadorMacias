/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4_p2_salvadormacias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Lab4_p2_SalvadorMacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static ArrayList lista = new ArrayList();
    public static ArrayList listaGranja = new ArrayList();

    public static double dinero = 2000.00;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean salida = false;
        do {
            System.out.println("--- STARDEW ANIMAL ADMINISTRATOR ---");
            System.out.println("1.Registrar animal a la base de datos");
            System.out.println("2.Listar base de datps de animales");
            System.out.println("3.Comprar animal para la granja");
            System.out.println("4.Listar animales dentro de granja");
            System.out.println("5.Recolectar productos y venderlos");
            System.out.println("6.Salir");
            int opc_menu = lea.nextInt();
            switch (opc_menu) {
                case 1: {
                    registrarAnimal();
                }

                break;
                case 2: {
                    listarAnimales();

                }

                break;
                case 3: {
                }

                break;
                case 4: {
                }

                break;
                case 5: {
                }

                break;
                case 6: {
                    salida = true;
                }

                break;
                default:
                    System.out.println("opcion ingresada es invalida...");
            }//fin switch

        } while (salida
                != true);//fin while

    }//fin main

    public static void registrarAnimal() {
        System.out.println("\n---Registrar animal---");
        System.out.println("1.Cerdo");
        System.out.println("2.Gallina");
        System.out.println("3.Vaca");
        System.out.println("ingrese opcion: ");
        int opc_registrar = lea.nextInt();
        switch (opc_registrar) {
            case 1: {
                System.out.println("Ingrese el nombre: ");
                String nombre = str.nextLine();
                System.out.println("Ingrese el precio: ");
                Double precio = lea.nextDouble();
                System.out.println("Ingrese la capacidad de busqueda: ");
                int capacidadBusqueda = lea.nextInt();
                System.out.println("Ingrese la resistencia: ");
                int resitencia = lea.nextInt();
                lista.add(new Cerdo(capacidadBusqueda, resitencia, nombre, precio));
                System.out.println("el cerdo fue agregado a la lista de animales\n");

            }

            break;

            case 2: {
                System.out.println("Ingrese el nombre: ");
                String nombre = str.nextLine();
                System.out.println("Ingrese el precio: ");
                Double precio = lea.nextDouble();
                System.out.println("Ingrese la produccion de huevos: ");
                int produccionHuevos = lea.nextInt();
                System.out.println("Ingrese el color del plumaje: ");
                String color = str.nextLine();
                lista.add(new Gallina(produccionHuevos, color, nombre, precio));
                System.out.println("la gallina fue agregada a la lista de animales\n");
            }

            break;
            case 3: {
                System.out.println("Ingrese el nombre: ");
                String nombre = str.nextLine();
                System.out.println("Ingrese el precio: ");
                Double precio = lea.nextDouble();
                System.out.println("Ingrese la produccion de leche: ");
                int produccionLeche = lea.nextInt();
                System.out.println("Ingrese el temperamento de la vaca: ");
                String temperamento = str.nextLine();
                lista.add(new Gallina(produccionLeche, nombre, nombre, precio));
                System.out.println("la vaca fue agregada a la lista de animales\n");

            }

            break;
            default:
                System.out.println("la opcion ingresada es invalida\n");
        }

    }// fin registrar animal

    public static void listarAnimales() {
        System.out.println("---Base de datos de animales---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Indice en base de datos : " + i);
            System.out.println(lista.get(i));
            System.out.println("\n");

        }

    }

    public static void comprarAnimal() {
    }

    public static void listarGranja() {
    }

    public static void recoleccion() {
    }

}//fin clase
