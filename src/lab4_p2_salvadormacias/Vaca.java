/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4_p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class Vaca extends Animal {

    public int produccionLeche;
    public String temperamento;

    public Vaca() {
    }

    public Vaca(int produccionLeche, String temperamento, String nombre, double precio) {
        super(nombre, precio);
        this.produccionLeche = produccionLeche;
        this.temperamento = temperamento;
    }

    public int getProduccionLeche() {
        return produccionLeche;
    }

    public void setProduccionLeche(int produccionLeche) {
        this.produccionLeche = produccionLeche;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
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
        return super.toString()+ "Vaca{" + "produccionLeche=" + produccionLeche + ", temperamento=" + temperamento + '}';
    }

}
