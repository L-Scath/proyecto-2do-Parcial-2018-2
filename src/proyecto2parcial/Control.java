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
    private Menu m;    
    
    
    //-----------------Constructor por defecto------------------//
    public Control() {
            almacen=new Producto[15];
            ventas =new Producto[15];
            facturas=new Factura[15];
            m = new Menu();
    }//------------Fin del Constructor por defecto------------------//
       
    
    
    
    public void	addAlmacen(){
        
    } 
    public void	modifyAlmacen(){
        
    } 
    public double calculateIngresos(){
        
        return 0;
    }
    public double calculateEgresos(){
        
        return 0;
    }
    
    public void top10(){
        
    }
    public void bajaExistencia(){
        
    }    
    
}
