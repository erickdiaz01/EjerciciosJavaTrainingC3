package org.ejercicio7;

import java.util.Scanner;

/**
 *Clase perteneciente a la solucion del ejercicio 7, tiene dos atributos,
 * un numero a ingresar por el usuario y un numero temporal que da manejo al formato del numero ingresado
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio7 {
    double numeroIngresado;
    String numeroTemporal;

    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");
    protected static final Scanner scanner = new Scanner(System.in);

    /**
     * Invoca el metodo que recibe los valores de los atributos del objeto a construir
     * @constructor
     */
    public Ejercicio7(){
getNumero();
    }

    /**
     * Imprime mensajes por consola para pedir el valor del numero mayor a cero,
     * no termina la ejecucion si no es mayor a cero
     */
    public void getNumero(){
        do{
            logger.info("Ingrese un numero mayor o igual a cero");
            this.numeroTemporal = scanner.next();
            this.numeroTemporal=  numeroTemporal.replace(",",".");
this.numeroIngresado= Double.parseDouble(numeroTemporal);
        }while (Double.parseDouble(numeroTemporal)<0);
mostrarNumero();


    }

    /**
     * Imprime en pantalla un mensaje que indica que el numero ingresado es mayor a cero
     */
    public void mostrarNumero(){
        logger.info("El numero ingresado: "+numeroIngresado+" es mayor o igual a cero");
    }
}
