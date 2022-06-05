package org.ejercicio14;

import java.util.Scanner;
/**
 *Clase perteneciente a la solucion del ejercicio 14, tiene como atributo el numero a ingresar por el usuario
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio14 {
    int numeroInput;

    protected static final Scanner scanner = new Scanner(System.in);
    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * Invocacion del metodo para capturar el dato del numero
     * @constructor
     */
    public Ejercicio14(){
getNumeroInput();
    }

    /**
     * Imprime peticiones y captura el numero desde donde inicia el ciclo
     * @return El numero ingresado por el usuario
     */
    public int getNumeroInput(){
        do {
            logger.info("Ingrese un numero menor a 1000: ");
            this.numeroInput = scanner.nextInt();
        }while(this.numeroInput>1000);
        return this.numeroInput;
    }

    /**
     * Imprime la serie de numeros pares;
     */
    public void mostrarSerie(){

        int contador;
        for( contador = getNumeroInput(); contador<=1000;contador+=2 ){
logger.info(String.valueOf(contador));
        }
    }
}
