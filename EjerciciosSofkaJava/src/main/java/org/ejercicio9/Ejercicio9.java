package org.ejercicio9;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio9 {
    String texto;

    protected static final Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger("org.ejercicio9");

    public Ejercicio9(){
        this.texto="La sonrisa sera la mejor arma contra la tristeza";
    }

    public String cambiarAporE(){
        String textoACambiar = this.texto;
        textoACambiar=textoACambiar.replace("a","e");
        this.texto=textoACambiar;
        return this.texto;
    }

    public String concatenarTexto(){
        cambiarAporE();
        LOGGER.info("Ingrese un texto que quiera concatenar al texto modificado: ");
        String textoInput = scanner.nextLine();
        return this.texto + " " +textoInput;
    }

    public void mostrarTexto(){
        String textoAMostrar = concatenarTexto();
        LOGGER.info(textoAMostrar);
    }
}
