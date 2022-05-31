package org.ejercicio13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class Ejercicio13 {
    String fechaActual;

    private static final Logger LOGGER = Logger.getLogger("org.ejercicio13");

    public Ejercicio13(){
        Date fechaAct = Calendar.getInstance().getTime();
       DateFormat formateador = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        this.fechaActual = formateador.format(fechaAct);

    }
    public void mostrarFechaActual(){
LOGGER.info("La fecha actual es:" + this.fechaActual);
    }
}
