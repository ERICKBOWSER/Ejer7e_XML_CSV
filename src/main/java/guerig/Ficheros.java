/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Ficheros {
    public static void escribir(List<Factura> factura, String nombre){
        
        String tmp = "";
        String ruta = "";
        
        if(nombre.equalsIgnoreCase("facturas.csv")){
            ruta = ".\\csv\\" + nombre;
        }else if(nombre.equalsIgnoreCase("facturas.xml")){
            ruta = ".\\xml\\" + nombre;
        }else{
            ruta = ".\\facturascsv\\" + nombre;
        }
        
        try(BufferedWriter flujo = new BufferedWriter(new FileWriter(ruta))){
                
            for (Factura fact : factura) {
                tmp = String.valueOf(fact);
                
                flujo.write(tmp); // Escritura
                flujo.newLine(); // Nueva linea 
                //System.out.println(tmp);
            }
                // Guardar cambios en el disco
                flujo.flush();
                
            } catch(IOException e){
                System.out.println(e.getMessage());
            }   
        
    }
    
    public static void mostrarFichero(String nombre){
        
        String ruta = "";
        String linea;
        
        if(nombre.equalsIgnoreCase("facturas.csv")){
            ruta = ".\\csv\\" + nombre;
        }else if(nombre.equalsIgnoreCase("facturas.xml")){
            ruta = ".\\xml\\" + nombre;
        }else{
            ruta = ".\\facturascsv\\" + nombre;
        }
        
        try (Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void eliminarFicheros(String nombre){
        
        String ruta = ".\\facturascsv\\" + nombre;
        
        Path file = Paths.get(ruta);
        try {
            Files.delete(file);
        } catch (NoSuchFileException nsfe) {
            System.out.println("No se puede borrar " + nombre + " porque no existe");
        } catch (DirectoryNotEmptyException dnee) {
            System.out.println("No se puede borrar el directorio porque no está vacío");
        } catch (IOException e) {
            System.out.println("Problema borrando el elemento " + nombre);
        }
    }
    
}
