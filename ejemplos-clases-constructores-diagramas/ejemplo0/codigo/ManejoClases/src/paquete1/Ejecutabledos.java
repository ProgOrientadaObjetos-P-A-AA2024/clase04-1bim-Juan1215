
package paquete1;

public class Ejecutabledos {
   
    public static void main(String[]args){
        
        Computadora personal = new Computadora(24.0);
        personal.establecerTipoProcesador("Intel vPRO");
        
        System.out.printf("%s - %.2f",personal.obtenerTipoProcesador(),
                personal.obtenerMemoria() );
    }
}
