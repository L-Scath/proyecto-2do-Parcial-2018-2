package proyecto2parcial;

/**
 *
 * @author luis.uzcategui
 */
public class ProductoUnit extends Producto{
    private String marca;//---Marca del Producto---//
    private int existencia;//---Cantidad en Unidades del Producto---//
    
    //-----------------Constructor por defecto------------------// 
    public ProductoUnit() {
        super();
        this.marca =" ";
        this.existencia = 0;
    }//------------Fin del Constructor por defecto-----------------------//
    
    
   //---------------------Constructor parametrico-----------------------// 
    public ProductoUnit(String marca, int existencia, String codigo, String descripcion, double pCompra, double pVenta) {
        super(codigo, descripcion, pCompra, pVenta);
        this.marca = marca;
        this.existencia = existencia;
    }//----------------Fin del Constructor parametrico------------------------//
    
    
    //------------------------------Getters y setters------------------------//
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getExistencia() {
        return existencia;
    }
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }//---------------------------------fin de los Getters y Setters-------------------------//
    
}
