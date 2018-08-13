package proyecto2parcial;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Control {
    private Producto[] almacen;
    private Producto[] ventas;
    private Factura[] facturas;
    //-----------------Constructor por defecto------------------//
    public Control() {
            almacen=new Producto[15];
            ventas =new Producto[15];
            facturas=new Factura[15];
    }//------------Fin del Constructor por defecto------------------//

    public Producto getProducto(int n){
        return almacen[n];
    }
    
    public Producto[]getVProducto(){
        return almacen;
    }
    public void addAlmacenCarne(int n,double existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            almacen[n]=new Carne(existencia,codigo,descripcion,pCompra,pVenta);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
    }
    public void addAlmacenLacteo(int n,boolean solido, double existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            almacen[n]=new Lacteo(solido,existencia,codigo,descripcion,pCompra,pVenta);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
    }
    public void addAlmacenViveres(int n,String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            almacen[n]=new Viveres(marca,existencia,codigo,descripcion,pCompra,pVenta);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
    }
    public void addAlmacenEnlatado(int n,String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            almacen[n]=new Enlatado(marca,existencia,codigo,descripcion,pCompra,pVenta);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
    }
    
    public Producto[] getVentas() {
        return ventas;
    }

    public void setVentas(Producto[] ventas) {
        this.ventas = ventas;
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public void setFacturas(Factura[] facturas) {
        this.facturas = facturas;
    }
       
        
}
