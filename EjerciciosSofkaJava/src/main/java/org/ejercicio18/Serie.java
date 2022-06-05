package org.ejercicio18;

public class Serie implements Entregable{
    String titulo;
    String genero;
    String creador;
    int numeroTemporadas;
    boolean entregado;

    public Serie(){
        this.numeroTemporadas=3;
        this.entregado=false;
    }
    public Serie(String titulo,String creador){
        this.titulo=titulo;
        this.creador=creador;
        this.numeroTemporadas=3;
        this.entregado=false;
    }

    public Serie(String titulo, String genero, String creador, int numeroTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
this.entregado=false;
    }

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

    public String toString(){
        return "\nTitulo: "+this.titulo+
                "\n# Temporadas: "+this.numeroTemporadas+
                "\nEntregado: "+this.entregado+
                "\nGenero: "+this.genero+
                "\nCreador: "+this.creador;
    }

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
