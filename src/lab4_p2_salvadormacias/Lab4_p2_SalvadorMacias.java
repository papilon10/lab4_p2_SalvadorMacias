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
                }

                break;
                case 2: {
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

    }

    public static void listarAnimales() {
    }
    
    public static void comprarAnimal(){
    }
    
    public static void listarGranja(){}
    
    public static void recoleccion(){}

}//fin clase
