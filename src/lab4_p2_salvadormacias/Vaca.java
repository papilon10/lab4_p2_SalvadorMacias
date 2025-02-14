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
        if (temperamento.contains("normal")) {
            if (produccionLeche < 10) {
                System.out.println("no se produjo leche");
            } else if (produccionLeche >= 10 && produccionLeche <= 49) {
                System.out.println("se produjeron 2 baldes de leche");
            } else if (produccionLeche >= 50 && produccionLeche <= 74) {
                System.out.println("se produjeron 3 baldes de leche");
            } else if (produccionLeche >= 75 && produccionLeche <= 100) {
                System.out.println("se produjeron 4 baldes de leche");

            }

        } else if (temperamento.contains("estresada")) {
            produccionLeche = produccionLeche / 2;
            if (produccionLeche < 10) {
                System.out.println("no se produjo leche");
            } else if (produccionLeche >= 10 && produccionLeche <= 49) {
                System.out.println("se produjeron 2 baldes de leche");
            } else if (produccionLeche >= 50 && produccionLeche <= 74) {
                System.out.println("se produjeron 3 baldes de leche");
            } else if (produccionLeche >= 75 && produccionLeche <= 100) {
                System.out.println("se produjeron 4 baldes de leche");

            }

        } else if (temperamento.contains("bueno")) {
            produccionLeche = produccionLeche * 2;
            if (produccionLeche < 10) {
                System.out.println("no se produjo leche");
            } else if (produccionLeche >= 10 && produccionLeche <= 49) {
                System.out.println("se produjeron 2 baldes de leche");
            } else if (produccionLeche >= 50 && produccionLeche <= 74) {
                System.out.println("se produjeron 3 baldes de leche");
            } else if (produccionLeche >= 75 && produccionLeche <= 100) {
                System.out.println("se produjeron 4 baldes de leche");

            }

        }

    }

    @Override
    public String toString() {
        return "tipo de animal : vaca\n"
                + super.toString()
                + "\nproduccion de leche: " + produccionLeche + "\ntemperamento de la vaca: " + temperamento;
    }

}
