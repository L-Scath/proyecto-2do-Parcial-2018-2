package proyecto2parcial;

/**
 *
 * @author luis.uzcategui
 */
public class Enlatado extends ProductoUnit implements Iva{
    
    
    
    
//----------------Metodo para calcular el precio del Producto con IVA ------------------------------//
         public double precioNuevo(double d){
         d *= impuesto;
         return d;
//---------------------------------------------------------------------------------------------------//         
     }
}
