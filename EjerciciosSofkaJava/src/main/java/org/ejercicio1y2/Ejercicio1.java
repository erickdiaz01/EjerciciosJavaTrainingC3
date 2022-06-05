package org.ejercicio1y2;

import org.jboss.logging.Logger;


/**
 *Clase perteneciente al ejercicio 1, con atributos de variables numericas a comparar
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio1 {
    static final org.jboss.logging.Logger logger = Logger.getLogger("logger");

    int variableNumerica1;
int variableNumerica2;

    /**
     * Iniciacion por defecto de la variable uno igual a 5 y variable dos igual a 10
     * @constructor
     */
    public Ejercicio1(){
     variableNumerica1=5;
     variableNumerica2=10;
    }

    /**
     * Metodo que imprime la comparacion entre las dos variables numericas, indicando cual es la mayor
     */
    public void mostrarComparacion(){


    logger.info("La variable numeric uno con valor de " + variableNumerica1 + " es menor que la variable numeric dos con valor de " + variableNumerica2);

    }
}
