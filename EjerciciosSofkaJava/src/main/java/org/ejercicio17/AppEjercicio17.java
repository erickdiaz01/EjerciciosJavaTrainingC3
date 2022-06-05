package org.ejercicio17;
import org.jboss.logging.Logger;
public class AppEjercicio17 {
    static final org.jboss.logging.Logger logger = Logger.getLogger("logger");

    /**
     * En este método principal se instancia una lista de objetos de tipo
     * "electrodoméstico", "lavadora" y "televisor" para mostrar su precio según sus características
     * @param args
     */
    public static void main(String[] args) {
        Electrodomestico [] arrayElectrodomesticos = new Electrodomestico[10];
        for(int i=0;i<arrayElectrodomesticos.length-5;i++){
            arrayElectrodomesticos[i]= new Electrodomestico((1+i)*100,i*10);
        }
        for(int i=5;i<arrayElectrodomesticos.length-2;i++){
            arrayElectrodomesticos[i]= new Lavadora((1+i)*100,i*10);
        }
        for(int i=8;i<arrayElectrodomesticos.length;i++){
            arrayElectrodomesticos[i]= new Television(i*200,"Blanco",'E',i*10,i*20,true);
        }
        int precioTelevisores = 0;
        int precioLavadoras =0;
        int precioElectrodomesticos =0;

        for(int i=0;i<arrayElectrodomesticos.length;i++){
            Electrodomestico electrodomestico = arrayElectrodomesticos[i];
            if(electrodomestico instanceof Television){
                precioTelevisores+=electrodomestico.precioFinal();

            }else if(electrodomestico instanceof Lavadora){
                precioLavadoras+=electrodomestico.precioFinal();
            }else {
                precioElectrodomesticos+=electrodomestico.precioFinal();
            }

        }

        logger.info("\nPrecio lavadoras: "+precioLavadoras+"\nPrecio televisores:"+precioTelevisores+"\nPrecio electrodomesticos: "+(precioElectrodomesticos+precioLavadoras+precioTelevisores));



    }
}
