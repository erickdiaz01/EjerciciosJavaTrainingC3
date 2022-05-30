package org.ejercicio10;

import java.util.Scanner;
import java.util.logging.Logger;

public class AppEjercicio10 {
    protected static final Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger("org.ejercicio10");
    public static void main(String[] args) {
LOGGER.info("Ingrese un texto para quitarle los espacios: ");
String textoInput= scanner.nextLine();
Ejercicio10 ejercicio10 = new Ejercicio10(textoInput);
ejercicio10.mostrarTextoModificado();
    }
}
