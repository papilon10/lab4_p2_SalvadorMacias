/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4_p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class Gallina extends Animal {

    public int produccionHuevos;
    public String color;

    public Gallina() {
    }

    public Gallina(int produccionHuevos, String color, String nombre, double precio) {
        super(nombre, precio);
        this.produccionHuevos = produccionHuevos;
        this.color = color;
    }

    public int getProduccionHuevos() {
        return produccionHuevos;
    }

    public void setProduccionHuevos(int produccionHuevos) {
        this.produccionHuevos = produccionHuevos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void recolectarProductos() {
        if (produccionHuevos < 10) {
            System.out.println("no se produjeron huevos");

        } else if (produccionHuevos >= 10 && produccionHuevos <= 49) {
            System.out.println("se produjo 1 huevo");

        } else if (produccionHuevos >= 50 && produccionHuevos <= 74) {
            System.out.println("se produjeron 3 huevos");

        } else if (produccionHuevos >= 75 && produccionHuevos <= 100) {
            System.out.println("se produjeron 5 huevos");

        }
    }

    @Override
    public String toString() {
        return "tipo de animal : gallina\n"
                + super.toString()
                + "\nproduccion de huevos: " + produccionHuevos + "\nColor de plumaje : " + color;
    }

}
