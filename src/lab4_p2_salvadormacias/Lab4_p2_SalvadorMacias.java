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

    public static ArrayList<Animal> lista = new ArrayList();
    public static ArrayList listaGranja = new ArrayList();

    public static double dinero = 5000.00;
    public static Double ganancia = 00.00;

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
                    comprarAnimal();
                }

                break;
                case 4: {
                    listarGranja();
                }

                break;
                case 5: {
                    System.out.println("\n---recoleccion de productos---");

                    for (Object x : listaGranja) {
                        if (x instanceof Gallina) {
                            System.out.println("Gallinas\n");
                            ((Gallina) x).recolectarProductos();
                            if (((Gallina) x).getProduccionHuevos() < 10) {
                                ganancia = +00.00;
                                dinero = dinero + ganancia;
                            } else if (((Gallina) x).getProduccionHuevos() >= 10 && ((Gallina) x).getProduccionHuevos() <= 49) {
                                ganancia = +100.00;
                                dinero = dinero + ganancia;

                            } else if (((Gallina) x).getProduccionHuevos() >= 50 && ((Gallina) x).getProduccionHuevos() <= 74) {
                                ganancia = +300.00;
                                dinero = dinero + ganancia;

                            } else if (((Gallina) x).getProduccionHuevos() >= 75 && ((Gallina) x).getProduccionHuevos() <= 100) {
                                ganancia = +500.00;
                                dinero = dinero + ganancia;

                            }

                        } else if (x instanceof Vaca) {
                            ((Vaca) x).recolectarProductos();
                            System.out.println("Vacas\n");
                            if (((Vaca) x).getProduccionLeche() < 10) {
                                ganancia = +00.00;
                                dinero = dinero + ganancia;

                            } else if (((Vaca) x).getProduccionLeche() >= 10 && ((Vaca) x).getProduccionLeche() <= 49) {
                                ganancia = +1400.00;
                                dinero = dinero + ganancia;

                            } else if (((Vaca) x).getProduccionLeche() >= 50 && ((Vaca) x).getProduccionLeche() <= 74) {
                                ganancia = +2100.00;
                                dinero = dinero + ganancia;

                            } else if (((Vaca) x).getProduccionLeche() >= 75 && ((Vaca) x).getProduccionLeche() <= 100) {
                                ganancia = +2800.00;
                                dinero = dinero + ganancia;

                            }

                        } else if (x instanceof Cerdo) {
                            ((Cerdo) x).recolectarProductos();
                            System.out.println("Cerdos\n");
                            if (((Cerdo) x).getCapacidadBusqueda() < 10) {
                                ganancia = +00.00;
                                dinero = dinero + ganancia;
                            } else if (((Cerdo) x).getCapacidadBusqueda() >= 10 && ((Cerdo) x).getCapacidadBusqueda() <= 49) {
                                ganancia = +6000.00;
                                dinero = dinero + ganancia;
                            } else if (((Cerdo) x).getCapacidadBusqueda() >= 50 && ((Cerdo) x).getCapacidadBusqueda() <= 74) {
                                ganancia = +6000.00;

                                dinero = dinero + ganancia;

                            } else if (((Cerdo) x).getCapacidadBusqueda() >= 75 && ((Cerdo) x).getCapacidadBusqueda() <= 100) {
                                ganancia = +6000.00;

                                dinero = dinero + ganancia;

                            }

                        }

                    }
                    System.out.println("Dinero ganado: " + ganancia);

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
                System.out.println("Ingrese la resistencia: ");
                int resitencia = lea.nextInt();
                System.out.println("Ingrese la capacidad de busqueda: ");
                int capacidadBusqueda = lea.nextInt();
                if (capacidadBusqueda > 0 && capacidadBusqueda <= 100) {
                    lista.add(new Cerdo(capacidadBusqueda, resitencia, nombre, precio));

                } else {
                    System.out.println("la capacidad de busqueda tiene que estar en el rango de 0 a 100");
                }

                System.out.println("el cerdo fue agregado a la lista de animales\n");

            }

            break;

            case 2: {
                System.out.println("Ingrese el nombre: ");
                String nombre = str.nextLine();
                System.out.println("Ingrese el precio: ");
                Double precio = lea.nextDouble();
                System.out.println("Ingrese el color del plumaje: ");
                String color = str.nextLine();
                System.out.println("Ingrese la produccion de huevos: ");
                int produccionHuevos = lea.nextInt();
                if (produccionHuevos > 0 && produccionHuevos <= 100) {
                    lista.add(new Gallina(produccionHuevos, color, nombre, precio));

                } else {
                    System.out.println("la produccion de huevos tiene que estar en el rango de 0 a 100");
                }

                System.out.println("la gallina fue agregada a la lista de animales\n");
            }

            break;
            case 3: {
                System.out.println("Ingrese el nombre: ");
                String nombre = str.nextLine();
                System.out.println("Ingrese el precio: ");
                Double precio = lea.nextDouble();
                System.out.println("Ingrese el temperamento de la vaca: ");
                String temperamento = str.nextLine();
                System.out.println("Ingrese la produccion de leche: ");
                int produccionLeche = lea.nextInt();
                if (produccionLeche > 0 && produccionLeche <= 100) {
                    lista.add(new Gallina(produccionLeche, nombre, nombre, precio));

                } else {
                    System.out.println("la produccion de leche tiene que estar en el rango de 0 a 100");
                }

                System.out.println("la vaca fue agregada a la lista de animales\n");

            }

            break;
            default:
                System.out.println("la opcion ingresada es invalida\n");
        }

    }// fin registrar animal

    public static void listarAnimales() {
        System.out.println("\n---Base de datos de animales---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Indice en base de datos : " + i);
            System.out.println(lista.get(i));
            System.out.println("\n");

        }

    }

    public static void comprarAnimal() {
        System.out.println("\n---Comprar animales---");
        listarAnimales();
        System.out.println("Ingrese el indice del animal que desea comprar: ");
        int indiceCompra = lea.nextInt();
        if (dinero > lista.get(indiceCompra).getPrecio()) {
            listaGranja.add(lista.get(indiceCompra));
            System.out.println("se agrego el animal a la granja\n");
            dinero = dinero - lista.get(indiceCompra).getPrecio();
        } else {
            System.out.println("el dinero no es suficiente para comprar el animal");
        }

    }

    public static void listarGranja() {
        System.out.println("\n---Animales en granja---");
        for (int i = 0; i < listaGranja.size(); i++) {
            System.out.println("Indice en base de datos : " + i);
            System.out.println(listaGranja.get(i));
            System.out.println("\n");

        }

    }

    public static void recoleccion() {
        System.out.println("\n---recoleccion de productos---");
        for (int i = 0; i < listaGranja.size(); i++) {
            if (lista.get(i) instanceof Gallina) {
                //System.out.println(lista.get(i).recolectarProductos());
            }

        }

    }

}//fin clase
