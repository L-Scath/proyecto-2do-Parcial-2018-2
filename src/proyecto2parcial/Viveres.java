package proyecto2parcial;

/**
 *
 * @author luis.uzcategui
 */
public class Viveres extends ProductoUnit implements Iva{
    
    
    //-----------------Constructor por defecto------------------// 
    public Viveres() {
        super();
    }//------------Fin del Constructor por defecto-----------------------//
    
    
   //---------------------Constructor parametrico-----------------------//     
    public Viveres(String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta) {
        super(marca, existencia, codigo, descripcion, pCompra, pVenta);
    }//----------------Fin del Constructor parametrico------------------------//
   
    
//----------------Metodo para calcular el precio del Producto con IVA ------------------------------//    
     public double precioNuevo(double d){
         d *= impuesto;
         return d;
     }//------------------------------------Fin del Metodo--------------------------------------------//  
     
     
}
