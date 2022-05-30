package org.ejercicio1y2;

import java.util.logging.Logger;
public class Ejercicio1 {
    private static final  Logger LOGGER = Logger.getLogger("org.ejercicio1y2");

    int variableNumerica1;
int variableNumerica2 = 10;
    public Ejercicio1(){
variableNumerica1=5;
    }
    public void mostrarComparacion(){


    LOGGER.info("La variable numeric uno con valor de " + variableNumerica1 + " es minor que la variable numeric dos con valor de " + variableNumerica2);

    }
}
