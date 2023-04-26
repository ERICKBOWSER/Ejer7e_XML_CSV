/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guerig
 */
public class GenerarFicheros {
    public static void main(String[] args) {
        List<Factura> listaFactura = new ArrayList();
        
        // Bucle para crear las 50 facturas
        for (int i = 0; i < 50; i++) {
            Factura f1 = new Factura();
            listaFactura.add(f1);
        }
        
        System.out.println("50 facturas: ");
        for (int i = 0; i < listaFactura.size(); i++) {
            System.out.println(listaFactura.get(i));
        }
        
        // Crear directorios
        Directorios.crearDir(".\\csv");
        Directorios.crearDir(".\\xml");
        Directorios.crearDir(".\\facturascsv");
        
        // Guardar los datos en sus respectivas carpetas
        Ficheros.escribir(listaFactura, "facturas.csv");
        Ficheros.escribir(listaFactura, "facturas.xml");
        
        // Guardar cada dato de la lista en un fichero aparte
        for (int i = 0; i < listaFactura.size(); i++) {
            
            List<Factura> aux = new ArrayList();
            
            aux.add(listaFactura.get(i));
            
            Ficheros.escribir(aux, listaFactura.get(i).getCodigo());
        }
        
        
    }
}
