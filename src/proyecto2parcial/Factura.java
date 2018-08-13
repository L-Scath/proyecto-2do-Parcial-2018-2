package proyecto2parcial;  
import java.util.ArrayList;

/**
 *
 * @author cuenta.inscripcion
 */
public class Factura {
    private ArrayList articulos;
    private int cedula; 

    
    //-----------------Constructor por defecto------------------//
    public Factura() {
        articulos = new ArrayList();
        this.cedula = 0;
    }//------------Fin del Constructor por defecto-----------------------//
    
    public ArrayList getArticulos() {
        return articulos;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public void addArticuloCarne(int n,double existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Carne(existencia,codigo,descripcion,pCompra,pVenta);
            articulos.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    public void addArticuloLacteo(int n,boolean solido, double existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Lacteo(solido,existencia,codigo,descripcion,pCompra,pVenta);
            articulos.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    public void addArticuloViveres(int n,String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Viveres(marca,existencia,codigo,descripcion,pCompra,pVenta);
            articulos.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    public void addArticuloEnlatado(int n,String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta){
        try{
            Producto e =new Enlatado(marca,existencia,codigo,descripcion,pCompra,pVenta);
            articulos.add(e);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }

    
}
