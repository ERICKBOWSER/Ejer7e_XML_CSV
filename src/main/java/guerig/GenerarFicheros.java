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
        
        for (int i = 0; i <= 50; i++) {
            Factura f1 = new Factura();
            listaFactura.add(f1);
        }
        
        for (int i = 0; i < listaFactura.size(); i++) {
            System.out.println(listaFactura.get(i));
        }
        
        CrearDirectorio.crearDir("csv");
        CrearDirectorio.crearDir("xml");
        
    }
}
