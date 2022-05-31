package org.ejercicio15;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio15 {
int opcionEscogida;

    protected static final Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger("org.ejercicio15");

    public Ejercicio15(){
this.opcionEscogida=0;
    }


    public void mostrarMenu(){
         LOGGER.info("****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +

                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR \n"+
                "Seleccione un número para ingresar a la opción indicada:");
    }


    public void elegirOpcion(){
        do{
mostrarMenu();

 this.opcionEscogida= scanner.nextInt();
            switch (this.opcionEscogida){
                case 1: case 2: case 3: case 4: case 5 : case 6: case 7:
                    LOGGER.info("Opcion escogida " +this.opcionEscogida);
                    break;
                case 8:
                    continue;
                default:
                    LOGGER.info("OPCION ERRONEA, INGRESE UN NUMERO VALIDO: ");
                    break;

            }
        }while(this.opcionEscogida!=8);
        LOGGER.info("HA SALIDO DEL MENU, GRACIAS POR UTILIZAR NUESTROS SERVICIOS");
    }
}
