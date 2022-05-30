package org.ejercicio7;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio7 {
    double numeroIngresado;
    String numeroTemporal;

    private static final Logger LOGGER = Logger.getLogger("org.ejercicio7");
    protected static final Scanner scanner = new Scanner(System.in);

    public Ejercicio7(){

    }
    public void getNumero(){
        do{
            LOGGER.info("Ingrese un numero mayor o igual a cero");
            this.numeroTemporal = scanner.next();
            this.numeroTemporal=  numeroTemporal.replace(",",".");
this.numeroIngresado= Double.parseDouble(numeroTemporal);
        }while (Double.parseDouble(numeroTemporal)<0);
mostrarNumero();


    }
    public void mostrarNumero(){
        LOGGER.info("El numero ingresado: "+numeroIngresado+" es mayor o igual a cero");
    }
}
