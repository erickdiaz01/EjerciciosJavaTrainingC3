package org.ejercicio9;

import java.util.Scanner;
/**
 *Clase perteneciente a la solucion del ejercicio 9, tiene un atributo que es el
 * texto a ingresar por el usuario
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio9 {
    String texto;

    protected static final Scanner scanner = new Scanner(System.in);
    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * Inicializa con la frase a cambiar las 'a' por 'e'
     * @constructor
     */
    public Ejercicio9(){
        this.texto="La sonrisa sera la mejor arma contra la tristeza";
    }

    /**
     * MEtodo que reemplaza las letras 'a' por las 'e'
     * @return El texto cambiado
     */
    public String cambiarAporE(){
        String textoACambiar = this.texto;
        textoACambiar=textoACambiar.replace("a","e");
        this.texto=textoACambiar;
        return this.texto;
    }

    /**
     * Une el texto modificado con el texto ingresado por el usuario
     * @return
     */
    public String concatenarTexto(){
        cambiarAporE();
        logger.info("Ingrese un texto que quiera concatenar al texto modificado: ");
        String textoInput = scanner.nextLine();
        return this.texto + " " +textoInput;
    }

    /**
     * Imprime la concatenacion del texto final
     */
    public void mostrarTexto(){
        String textoAMostrar = concatenarTexto();
        logger.info(textoAMostrar);
    }
}
