package org.ejercicio14;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio14 {
    int numeroInput;

    protected static final Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger("org.ejercicio14");

    public Ejercicio14(){

    }
    public int getNumeroInput(){
        do {
            LOGGER.info("Ingrese un numero menor a 1000: ");
            this.numeroInput = scanner.nextInt();
        }while(this.numeroInput>1000);
        return this.numeroInput;
    }

    public void mostrarSerie(){

        int contador = getNumeroInput();
        for( contador = this.numeroInput; contador<=1000;contador+=2 ){
LOGGER.info(String.valueOf(contador));
        }
    }
}
