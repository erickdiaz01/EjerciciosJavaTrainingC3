package org.ejercicio15;

import java.util.Scanner;

/**
 *Clase perteneciente a la solucion del ejercicio 15, tiene como atributo la opcion escogida por el usuario
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio15 {
int opcionEscogida;

    protected static final Scanner scanner = new Scanner(System.in);
    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * Inicializa el atributo en 0
     * @constructor
     */
    public Ejercicio15(){
this.opcionEscogida=0;
    }

    /**
     * Imprime el menu a mostrar al usuario
     */
    public void mostrarMenu(){
         logger.info("****** GESTION CINEMATOGRÁFICA ********\n" +
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

    /**
     * Metodo que se invoca en el metodo principal para manejar los eventos de la opcion escogida por el usuario
     */
    public void elegirOpcion(){
        do{
mostrarMenu();

 this.opcionEscogida= scanner.nextInt();
            switch (this.opcionEscogida){
                case 1, 2, 3,4, 5 , 6, 7:
                    logger.info("Opcion escogida " +this.opcionEscogida);
                    break;
                case 8:
                    continue;
                default:
                    logger.info("OPCION ERRONEA, INGRESE UN NUMERO VALIDO: ");
                    break;

            }
        }while(this.opcionEscogida!=8);
        logger.info("HA SALIDO DEL MENU, GRACIAS POR UTILIZAR NUESTROS SERVICIOS");
    }
}
