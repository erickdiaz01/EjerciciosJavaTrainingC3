package org.ejercicio18;

/**
 *Clase perteneciente a la solucion del ejercicio 18, tiene como atributos la informacion basica
 * de un videojuego
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Videojuego implements Entregable {
    String titulo;
    String genero;
    String compañia;
    int horasEstimadas;
    boolean entregado;
    /**
     * Contructor por defecto
     * @constructor
     */
    public Videojuego(){
        this.horasEstimadas=10;
        this.entregado=false;
    }
    /**
     * Contructor que instacia el objeto segun la informacion suministrada del titulo y las horas estimadas,
     * el resto por defecto
     * @constructor
     * @param titulo
     * @param horasEstimadas
     */
    public Videojuego(String titulo,int horasEstimadas){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.entregado=false;
    }

    /**
     * Constructor que instancia el objeto a partir de toda la informacion suministrada excepto el estado entregado
     * @param titulo
     * @param genero
     * @param compañia
     * @param horasEstimadas
     */
    public Videojuego(String titulo, String genero, String compañia, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compañia = compañia;
        this.horasEstimadas = horasEstimadas;
        this.entregado=false;
    }

    /**
     * Getters y setters de los atributos excepto del estado entregado
     *
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    /**
     * Metodo sobreescrito que permite obtener la informacion del objeto de una forma mas entendible
     * @return {String}
     */
    @Override
    public String toString(){
        return "\nTitulo: "+this.titulo+
                "\nHoras estimadas: "+this.horasEstimadas+
                "\nEntregado: "+this.entregado+
                "\nGenero: "+this.genero+
                "\nCompañia: "+this.compañia;
    }

    /**
     * Metodos sobreescritos de la interface Entregable que maneja el atributo interno entregado
     */
    @Override
    public void entregar() {
this.entregado=true;
    }

    @Override
    public void devolver() {
this.entregado=false;
    }

    @Override
    public boolean isEntregado() {

        return this.entregado;
    }
    /**
     * Metodo que compara el atributo de horas estimadas del objeto que lo invoca con el objeto
     * pasado por parametros
     * @param a
     * @return {int}
     */
    @Override
    public int compareTo(Object a) {
        Videojuego serie = (Videojuego) a;

        if(this.getHorasEstimadas()> serie.getHorasEstimadas()){
            return -1;
        }else if(this.getHorasEstimadas()== serie.getHorasEstimadas()){
            return 0;
        }else {
            return 1;
        }
    }
}
