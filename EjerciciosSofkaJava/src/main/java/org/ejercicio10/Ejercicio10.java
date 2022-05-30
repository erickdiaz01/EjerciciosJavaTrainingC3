package org.ejercicio10;

import java.util.logging.Logger;

public class Ejercicio10 {
    String textoInput;

    private static final Logger LOGGER = Logger.getLogger("org.ejercicio10");

    public Ejercicio10(String textoInput){
        this.textoInput = textoInput;
    }
    public String quitarEspacios(){
        this.textoInput = this.textoInput.replace(" ", "");
       return this.textoInput;
    }
    public void mostrarTextoModificado(){
       String textoModificado= quitarEspacios();
 LOGGER.info("Este es el texto modificado: "+ textoModificado);
    }
}
