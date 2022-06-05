package org.ejercicio4;

import java.util.Scanner;

/**
 * Clase perteneciente a la solucion del ejercicio 4, tiene dos atributos, el precio y una constante que es el porcentaje del iva
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio4PrecioProducto {
    double precio;
    protected double iva= 0.21;

    protected static final Scanner scanner = new Scanner(System.in);
    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * Contruye el objeto de la clase invocando el metodo para pedir el precio del producto
     * @constructor
     */
    Ejercicio4PrecioProducto(){
getPrecio();
    }

    /**
     * Imprime en pantalla la peticion al usuario para que ingrese el precio del producto y lo captura
     */
    public void getPrecio(){
 logger.info("Ingrese el valor del producto");
 String precioStr = scanner.nextLine();
 precioStr= precioStr.replace(",",".");
 this.precio= Double.parseDouble(precioStr);

}

    /**
     * Calcula el precio mas iva ingresado por el usuario
     * @return El nuevo valor del atributo precio mas iva
     */
    public double calcularPrecioMasIva(){
    this.precio = this.precio + this.precio*iva ;
    return this.precio;

}

    /**
     * Imprime en pantalla el precio mas iva
     */
    public void mostrarPrecio(){
        calcularPrecioMasIva();
        logger.info("El precio más iva del producto que ingresó es: "+this.precio);
}
}
