/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

import java.io.File;

/**
 *
 * @author guerig
 */
public class Directorios {
                
    public static void crearDir(String nombre){
        File directorio = new File(nombre);
        if(directorio.mkdirs()){
            System.out.println("Directorio creado");
        }else{
            System.out.println("Error al crear el directorio");
        }
    }
    
    public static void mostrarDirectorio(String nombre) {

        File f = new File(nombre);
        if (f.exists()) {
            // Obtiene los ficheros y directorios dentro de f y los 
            // devuelve en un array
            File[] ficheros = f.listFiles();                       
            
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
    }
}
