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
public class CrearDirectorio {
                
    public static void crearDir(String nombre){
        File directorio = new File("src/main/java/" + nombre);
        if(directorio.mkdirs()){
            System.out.println("Directorio creado");
        }else{
            System.out.println("Error al crear el directorio");
        }
    }
}
