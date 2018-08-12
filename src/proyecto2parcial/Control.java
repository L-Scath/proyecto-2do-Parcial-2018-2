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

    public Control() {
        for (int i = 0; i < 10; i++) {
            almacen[i]=new ProductoUnit();
            ventas[i]=new ProductoUnit();
            facturas[i]=new Factura();
        } 
    }
    
    
    
    
    
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
