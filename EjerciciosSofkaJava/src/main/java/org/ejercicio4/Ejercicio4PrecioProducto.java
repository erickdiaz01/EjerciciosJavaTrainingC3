package org.ejercicio4;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio4PrecioProducto {
    double precio;
    protected double iva= 0.21;

    protected static final Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger("org.ejercicio4");

    Ejercicio4PrecioProducto(){

    }
public void getPrecio(){
 LOGGER.info("Ingrese el valor del producto");
 String precioStr = scanner.nextLine();
 precioStr= precioStr.replace(",",".");
 this.precio= Double.parseDouble(precioStr);

}
public double calcularPrecioMasIva(){
    this.precio = this.precio + this.precio*iva ;
    return this.precio;

}
public void mostrarPrecio(){
        calcularPrecioMasIva();
        LOGGER.info("El precio más iva del producto que ingresó es: "+this.precio);
}
}
