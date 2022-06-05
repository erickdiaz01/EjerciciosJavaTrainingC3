package org.ejercicio10;

import java.util.Scanner;
import java.util.logging.Logger;

public class AppEjercicio10 {
    protected static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger("org.ejercicio10");

    /**
     *  En este método principal se instancia el objeto del Ejercicio10 pidiendo inicialmente
     *  la frase a la que se le quiere quitar los espacio, para después mostrar el texto modificado
     * @param args
     */
    public static void main(String[] args) {
logger.info("Ingrese un texto para quitarle los espacios: ");
String textoInput= scanner.nextLine();
Ejercicio10 ejercicio10 = new Ejercicio10(textoInput);
ejercicio10.mostrarTextoModificado();
    }
}
