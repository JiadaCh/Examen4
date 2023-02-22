/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuestas;

/**
 * 
 * @author Jiada Chen
 */

public class Apuestas {
    
    /**
     * @param args los líneas de comandos
     */
    public static void main(String[] args) {
        Apuesta laApuesta;

        laApuesta = new Apuesta(1000, 4, 2);
        operativa_Apuesta(laApuesta, 0);
        
    }
    /**
     * Comprueba que se ha hecho bien la operación de la apuesta
     * 
     * @param laApuesta la apuesta que hhiciste
     * @param dinero dinero apostado
     */
    public static void operativa_Apuesta(Apuesta laApuesta, int dinero) {
        try {
            System.out.println("Apostando...");
            laApuesta.apostar(25);
        } catch (Exception e) {
            System.out.println("Fallo al realizar la Apuesta");
        }

        try {
            System.out.println("Intento cobrar apuesta segun el resultado del partido");
            laApuesta.cobrar_apuesta(2, 3);
        } catch (Exception e) {
            System.out.println("Fallo al cobrar la apuesta");
        }
        dinero = laApuesta.getDinero_disp();
        System.out.println("El dinero que tengo tras las apuestas es " + dinero);
    }
    
}
