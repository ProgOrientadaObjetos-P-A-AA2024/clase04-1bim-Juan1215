
package paquete2;

public class Ejecutable {
     public static void main(String[]args){
         
         Computadora1 portatil = new Computadora1("Intel-x19", 6.1+4.2);
         
         
         System.out.printf("%s - %.2f",portatil.obtenerTipoProcesador(),
                 portatil.obtenerMemoria());
         
     }
    
}
