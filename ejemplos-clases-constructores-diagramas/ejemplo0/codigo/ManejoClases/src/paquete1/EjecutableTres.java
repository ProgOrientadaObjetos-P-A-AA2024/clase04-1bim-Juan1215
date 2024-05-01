
package paquete1;

public class EjecutableTres {
   
    public static void main(String[]args){
        
        Computadora personsal = new Computadora(24.0);
        
        Computadora personal = new Computadora(24.0);
        personal.establecerTipoProcesador("Intel vPRO");
        
        System.out.printf("%s - %.2f",personal.obtenerTipoProcesador(),
                personal.obtenerMemoria() );
    }
}
