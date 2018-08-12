package proyecto2parcial;
/**
 *
 * @author luis.uzcategui
 */
public class Carne extends ProductoCant{
    
    //-----------------Constructor por defecto------------------//
    public Carne() {
        super();
    }//------------Fin del Constructor por defecto-----------------------//
    
    
    //-----------------Constructor parametrico------------------//
    public Carne(double existencia, String codigo, String descripcion, double pCompra, double pVenta) {
        super(existencia, codigo, descripcion, pCompra, pVenta);
    }//----------------Fin del Constructor parametrico------------------------//
    
}
