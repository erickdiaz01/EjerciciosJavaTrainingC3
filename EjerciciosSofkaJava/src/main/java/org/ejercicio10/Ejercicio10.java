package org.ejercicio10;

/**
 *Clase perteneciente a la solucion del ejercicio 10, tiene un atributo que es el
 * texto a ingresar por el usuario
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio10 {
    String textoInput;

    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * Construye un objeto del ejercicio 10 a partir del texto ingresado por el usuario
     * @constructor
     * @param textoInput
     */
    public Ejercicio10(String textoInput){
        this.textoInput = textoInput;
    }

    /**
     * Metodo que elimina los espacios en blanco del texto ingresado
     * @return El texto modificado como el atributo
     */
    public String quitarEspacios(){
        this.textoInput = this.textoInput.replace(" ", "");
       return this.textoInput;
    }

    /**
     * Imprime en pantalla el texto finalmente modificado sin espacios
     */
    public void mostrarTextoModificado(){
       String textoModificado= quitarEspacios();
 logger.info("Este es el texto modificado: "+ textoModificado);
    }
}
