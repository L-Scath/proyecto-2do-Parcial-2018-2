package proyecto2parcial;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Control {
    private ArrayList <Producto>almacen;
    private ArrayList <Producto>ventas;
    private ArrayList <Factura>facturas;
    //-----------------Constructor por defecto------------------//
    public Control() {
            almacen=new ArrayList();
            ventas =new ArrayList();
            facturas=new ArrayList();
    }//------------Fin del Constructor por defecto------------------//

    public Producto getProducto(int n){
        return almacen.get(n);
    }
    
    public ArrayList getVProducto(){
        return almacen;
    }
    public void addAlmacenCarne(double existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Carne(existencia,codigo,descripcion,pCompra,pVenta);
            almacen.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    public void addAlmacenLacteo(boolean solido, double existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Lacteo(solido,existencia,codigo,descripcion,pCompra,pVenta);
            almacen.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    public void addAlmacenViveres(String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Viveres(marca,existencia,codigo,descripcion,pCompra,pVenta);
            almacen.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    public void addAlmacenEnlatado(String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Enlatado(marca,existencia,codigo,descripcion,pCompra,pVenta);
            almacen.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    
    public Producto getVenta(int n){
        return ventas.get(n);
    }

    public ArrayList getVventas(){
        return ventas;
    }

    public void addVentaCarne(double existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Carne(existencia,codigo,descripcion,pCompra,pVenta);
            ventas.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    public void addVentaLacteo(boolean solido, double existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Lacteo(solido,existencia,codigo,descripcion,pCompra,pVenta);
            ventas.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    public void addVentaViveres(String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Viveres(marca,existencia,codigo,descripcion,pCompra,pVenta);
            ventas.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    public void addVentaEnlatado(String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Enlatado(marca,existencia,codigo,descripcion,pCompra,pVenta);
            ventas.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }    
    
    public ArrayList getFactura() {
        return facturas;
    }

    public void addFacturas(Factura fac) {        
        facturas.add(fac);
    }
       
        
}
