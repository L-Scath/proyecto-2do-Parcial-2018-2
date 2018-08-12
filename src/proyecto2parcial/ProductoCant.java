package proyecto2parcial;

/**
 *
 * @author luis.uzcategui
 */
public class ProductoCant extends Producto{
    private double existencia;//---Cantidad en Kilos o Litros del Producto---//   
    
   
    //-----------------Constructor por defecto------------------// 
    public ProductoCant() {
        super();
        this.existencia = 0;
    }//------------Fin del Constructor por defecto-----------------------//
    
    
   //-----------------Constructor parametrico------------------// 
   public ProductoCant(double existencia, String codigo, String descripcion, double pCompra, double pVenta) {
        super(codigo, descripcion, pCompra, pVenta);
        this.existencia = existencia;
    }//------------Fin del Constructor parametrico-----------------------//   
}
