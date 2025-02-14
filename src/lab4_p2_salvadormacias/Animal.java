/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4_p2_salvadormacias;

/**
 *
 * @author Apple
 */
public abstract class Animal {

    public String nombre;
    public double precio;

    public Animal() {
    }

    public Animal(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
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

    public abstract void recolectarProductos();

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

}
