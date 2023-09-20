/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double guitarra = 1250.45;
        double piano = 3743.00;
        double bajo = 2683.78;

        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Nombre del instrumento");
        String nombre1 = lectura.nextLine();
        System.out.println("Nombre del instrumento");
        String nombre2 = lectura.nextLine();
        System.out.println("Nombre del instrumento");
        String nombre3 = lectura.nextLine();
        
        System.out.println("Ingrese el precio de compra");
        double precioCompra1 = lectura.nextDouble();
        System.out.println("Ingrese el precio de compra");
        double precioCompra2 = lectura.nextDouble();
        System.out.println("Ingrese el precio de compra");
        double precioCompra3 = lectura.nextDouble();
        
        double ganacia1 = guitarra - precioCompra1;
        double ganacia2 = piano - precioCompra2;
        double ganacia3 = bajo - precioCompra3;
        
        double total1 = (ganacia1/precioCompra1)*100;
        double total2 = (ganacia2/precioCompra2)*100;
        double total3 = (ganacia3/precioCompra3)*100;
        
        System.out.println("Ganacia de la guitarra es: " + ganacia1);
        System.out.println("Ganacia del piano es: " + ganacia2);
        System.out.println("Ganacia del bajo es: " + ganacia3);
        
        System.out.println("Total de la guitarra es: " + total1);
        System.out.println("Total del piano es: " + total2);
        System.out.println("Total del bajo es: " + total3);
    }
    
}
