package org.ejercicio18;

/**
 *Clase perteneciente a la solucion del ejercicio 18, tiene como atributos la informacion basica
 * de una serie
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Serie implements Entregable{
    String titulo;
    String genero;
    String creador;
    int numeroTemporadas;
    boolean entregado;

    /**
     * Contructor por defecto
     * @constructor
     */
    public Serie(){
        this.numeroTemporadas=3;
        this.entregado=false;
    }

    /**
     * Contructor que instacia el objeto segun la informacion suministrada del titulo y el creador, el resto por
     * defecto
     * @constructor
     * @param titulo
     * @param creador
     */
    public Serie(String titulo,String creador){
        this.titulo=titulo;
        this.creador=creador;
        this.numeroTemporadas=3;
        this.entregado=false;
    }

    /**
     * Constructor que instancia el objeto a partir de toda la informacion suministrada excepto el estado entregado
     * @param titulo
     * @param genero
     * @param creador
     * @param numeroTemporadas
     */
    public Serie(String titulo, String genero, String creador, int numeroTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
this.entregado=false;
    }

    /**
     * Metodos getters y setter excepto los del estado entregado
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    /**
     * Metodo sobreescrito que permite obtener la informacion del objeto de una forma mas entendible
     * @return {String}
     */
    public String toString(){
        return "\nTitulo: "+this.titulo+
                "\n# Temporadas: "+this.numeroTemporadas+
                "\nEntregado: "+this.entregado+
                "\nGenero: "+this.genero+
                "\nCreador: "+this.creador;
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
     * Metodo que compara el atributo del numero de temporadas del objeto que lo invoca con el objeto
     * pasados por parametros
     * @param a
     * @return
     */
    @Override
    public int compareTo(Object a) {
        Serie serie = (Serie) a;

        if(this.getNumeroTemporadas()> serie.getNumeroTemporadas()){
            return -1;
        }else if(this.getNumeroTemporadas()== serie.getNumeroTemporadas()){
            return 0;
        }else {
            return 1;
        }
    }
}
