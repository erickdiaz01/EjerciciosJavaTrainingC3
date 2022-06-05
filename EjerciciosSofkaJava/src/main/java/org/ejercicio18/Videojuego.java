package org.ejercicio18;

public class Videojuego implements Entregable {
    String titulo;
    String genero;
    String compañia;
    int horasEstimadas;
    boolean entregado;

    public Videojuego(){
        this.horasEstimadas=10;
        this.entregado=false;
    }
    public Videojuego(String titulo,int horasEstimadas){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.entregado=false;
    }
    public Videojuego(String titulo, String genero, String compañia, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compañia = compañia;
        this.horasEstimadas = horasEstimadas;
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
    @Override
    public String toString(){
        return "\nTitulo: "+this.titulo+
                "\nHoras estimadas: "+this.horasEstimadas+
                "\nEntregado: "+this.entregado+
                "\nGenero: "+this.genero+
                "\nCompañia: "+this.compañia;
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
