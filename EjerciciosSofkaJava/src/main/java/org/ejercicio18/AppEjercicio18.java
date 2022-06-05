package org.ejercicio18;

import org.jboss.logging.Logger;

public class AppEjercicio18 {
    static final org.jboss.logging.Logger logger = Logger.getLogger("logger");

    /**
     * Este método principal instancia una lista de objetos de tipo "videojuegos" y
     * una lista de objetos de tipo "series" con información respecto a el número de temporadas
     * y el número de horas estimadas para luego mostrar el conteo de entregas, devoluciones
     * y la serie con más temporadas y el videojuego con más horas estimadas
     * @param args
     */
    public static void main(String[] args) {
        Serie[] arraySeries = new Serie[5];
        Videojuego[] arrayVideojuegos = new Videojuego[5];
        arraySeries[0] = new Serie("Walking Dead", "Creador1");
        arraySeries[1] = new Serie("Stranger things", "Creador2");
        arraySeries[2] = new Serie();
        arraySeries[3] = new Serie("Breaking Bad", "Drama", "Vince Gilligan", 5);
        arraySeries[4] = new Serie("Its Okay to Not Be OKay", "Drama", "Park Shin-woo", 1);
        arrayVideojuegos[0] = new Videojuego();
        arrayVideojuegos[1] = new Videojuego("Halo", 450);
        arrayVideojuegos[2] = new Videojuego("Fifa", 2000);
        arrayVideojuegos[3] = new Videojuego("Mario bros", "Plataformas", "Nintendo", 300);
        arrayVideojuegos[4] = new Videojuego("GTA V", 1200);
        arraySeries[2].entregar();
        arraySeries[4].entregar();
        arrayVideojuegos[0].entregar();
        arrayVideojuegos[1].entregar();
        arrayVideojuegos[4].entregar();
        int seriesEntregadas = 0, videojuegosEntregados = 0;
        Videojuego videojuegoMayor = new Videojuego();
        Serie serieMayor = new Serie();
        int maxindexVideo=0, maxindexSerie=0;
        for (int i = 0; i < 5; i++) {


            if (arraySeries[i].isEntregado()) {seriesEntregadas+=1;};
            if (arrayVideojuegos[i].isEntregado()) videojuegosEntregados++;


            if (arrayVideojuegos[i].compareTo(arrayVideojuegos[maxindexVideo]) < 0) {
                videojuegoMayor = arrayVideojuegos[i];
                maxindexVideo=i;


            } else if (arrayVideojuegos[i].compareTo(arrayVideojuegos[maxindexVideo]) > 0) {
                videojuegoMayor = arrayVideojuegos[maxindexVideo];
            } else {
                videojuegoMayor = arrayVideojuegos[maxindexVideo];
            }
            if (arraySeries[i].compareTo(arraySeries[maxindexSerie]) < 0) {
                serieMayor = arraySeries[i];
                maxindexSerie=i;

            } else if (arraySeries[i].compareTo(arraySeries[maxindexSerie]) > 0) {
                serieMayor = arraySeries[maxindexSerie];
            } else {
                serieMayor = arraySeries[maxindexSerie];
            }



        }
        logger.info("\nSeries entregadas: " + seriesEntregadas + "\nVideojuegos entregados: " + videojuegosEntregados);
        logger.info("\nVideojuego con mas horas estimadas: " + videojuegoMayor.toString() + "\nSerie con mas temporadas" + serieMayor.toString());

    }
}
