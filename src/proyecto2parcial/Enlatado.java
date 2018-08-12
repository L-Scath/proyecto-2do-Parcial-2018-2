package proyecto2parcial;

/**
 *
 * @author luis.uzcategui
 */
public class Enlatado extends ProductoUnit implements Iva{
    
    //-----------------Constructor por defecto------------------// 
    public Enlatado() {
        super();
    }//------------Fin del Constructor por defecto-----------------------//
    
    
   //---------------------Constructor parametrico-----------------------//     
    public Enlatado(String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta) {
        super(marca, existencia, codigo, descripcion, pCompra, pVenta);
    }//----------------Fin del Constructor parametrico------------------------//
    
    
    //--------------------Metodo para calcular el precio del Producto con IVA -------------------------//
    public double precioNuevo(double d){
        d *= impuesto;
        return d;
     }//------------------------------------Fin del Metodo--------------------------------------------//      
    
    
}