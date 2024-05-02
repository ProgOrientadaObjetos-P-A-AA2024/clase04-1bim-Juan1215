/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        Hospital h1 = new Hospital();
        
        h1.establecerNombre("Hospital Militar Privado");
        
        Hospital h2 = new Hospital();
        
        System.out.printf("Nombre del Hospital: %s\n"
                + "Nombre de la Ciudad: %s\n"
                + "Numero de doctores: %d\n"
                + "Numero de Enfermrros: %d\n",
                h1.obtenerNombre(),h1.obtenerCiudad(),
                h1.obtenerNumeroDoctores(),h1.obtenerNumeroEnfermeros());
        System.out.println("=====================");
        System.out.printf("Nombre del Hospital: %s\n"
                + "Nombre de la Ciudad: %s\n"
                + "Numero de doctores: %d\n"
                + "Numero de Enfermrros: %d\n",
                h2.obtenerNombre(),h2.obtenerCiudad(),
                h2.obtenerNumeroDoctores(),h2.obtenerNumeroEnfermeros());
        
    }
}
