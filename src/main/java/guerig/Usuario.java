/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Usuario {
    
    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Listado de las facturas");
        
        Directorios.mostrarDirectorio(".\\facturascsv");
        
        System.out.println("Selecciona una factura: ");
        
        String facturaMostrar = teclado.nextLine();
        
        System.out.println("Datos de la factura seleccionada: ");
        Ficheros.mostrarFichero(facturaMostrar);
                
        Ficheros.eliminarFicheros(facturaMostrar);
        
        System.out.println("Carpeta después de eliminar la factura que se selecciono: ");
        Directorios.mostrarDirectorio(".\\facturascsv");
        
    }
}
