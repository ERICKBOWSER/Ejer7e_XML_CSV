/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;

/**
 *
 * @author guerig
 */
public class Factura {

    public static Random getGenerar() {
        return generar;
    }

    public static void setGenerar(Random aGenerar) {
        generar = aGenerar;
    }
    private String CODIGO;
    private LocalDateTime fechaEmision;
    private String descripcion;
    private DoubleStream totalImporteFactura;
    private static Random generar = new Random();

    public Factura(String CODIGO, LocalDateTime fechaEmision, String descripcion, DoubleStream totalImporteFactura) {
        this.CODIGO = CODIGO;
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.totalImporteFactura = totalImporteFactura;
    }
    
    

    public Factura() {
        this.CODIGO = CODIGO;
        
        LocalDateTime ahora = LocalDateTime.now();
        this.fechaEmision = ahora;
        
        this.descripcion = "asdfas";
        
        this.totalImporteFactura = generarDouble();
        
        Factura factura = new Factura("1", fechaEmision, descripcion, totalImporteFactura);
        
    }
    
    public static DoubleStream generarDouble(){
        DoubleStream res = generar.doubles(100, 100, 1000);
        return res;
    }
    
    
//    public static String contadorInstancias(List<Factura> fact){
//        
//        int contador = 0;
//        
//        for (int i = 0; i < fact.size(); i++) {
//            contador++;
//        }
//        String res = String.valueOf(contador);
//        
//        return res;        
//    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public DoubleStream getTotalImporteFactura() {
        return totalImporteFactura;
    }

    public void setTotalImporteFactura(DoubleStream totalImporteFactura) {
        this.totalImporteFactura = totalImporteFactura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura{");
        sb.append("CODIGO=").append(CODIGO).append(";");
        sb.append("fechaEmision=").append(fechaEmision).append(";");;
        sb.append("descripcion=").append(descripcion).append(";");;
        sb.append("totalImporteFactura=").append(totalImporteFactura).append(";");;
        sb.append('}');
        return sb.toString();
    }

    
    
   
    
    
    
    
    
    
}
