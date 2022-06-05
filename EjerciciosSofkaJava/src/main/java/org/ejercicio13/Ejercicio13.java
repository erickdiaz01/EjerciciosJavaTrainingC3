package org.ejercicio13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *Clase perteneciente a la solucion del ejercicio 13, tiene como atributos las palabras a comparar
 *y sus diferencias
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio13 {
    String fechaActual;

    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * Instancia un objeto de tipo Date y formatea la fecha actual con el formato establecido
     * @constructor
     */
    public Ejercicio13(){
        Date fechaAct = Calendar.getInstance().getTime();
       DateFormat formateador = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        this.fechaActual = formateador.format(fechaAct);

    }

    /**
     * Imprime la informacion de la fecha con el formato solicitado
     */
    public void mostrarFechaActual(){
logger.info("La fecha actual es:" + this.fechaActual);
    }
}
