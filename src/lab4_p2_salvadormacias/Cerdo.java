/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4_p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class Cerdo extends Animal {

    public int capacidadBusqueda;
    public int resitencia;

    public Cerdo() {
    }

    public Cerdo(int capacidadBusqueda, int resitencia, String nombre, double precio) {
        super(nombre, precio);
        this.capacidadBusqueda = capacidadBusqueda;
        this.resitencia = resitencia;
    }

    public int getCapacidadBusqueda() {
        return capacidadBusqueda;
    }

    public void setCapacidadBusqueda(int capacidadBusqueda) {
        this.capacidadBusqueda = capacidadBusqueda;
    }

    public int getResitencia() {
        return resitencia;
    }

    public void setResitencia(int resitencia) {
        this.resitencia = resitencia;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString() + "Cerdo{" + "capacidadBusqueda=" + capacidadBusqueda + ", resitencia=" + resitencia + '}';
    }

}
