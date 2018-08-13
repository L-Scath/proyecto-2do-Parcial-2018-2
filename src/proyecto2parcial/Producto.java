package proyecto2parcial;

/**
 *
 * @author luis.uzcategui
 */
public class Producto {
    private String codigo;//---Codigo alfanumerico del Producto---//
    private String descripcion;//---Descripcion del Producto---//
    private double pCompra;//---Precio de compra del Producto---//
    private double pVenta;//---Precio de venta del Producto---//
     private double existencia;
    //-----------------Constructor por defecto------------------//
    public Producto() {
        this.codigo = " ";
        this.descripcion = " ";
        this.pCompra = 0;
        this.pVenta = 0;
        this.existencia = 0;
        
    }//------------Fin del Constructor por defecto-----------------------//
    
    
    //-----------------Constructor parametrico------------------//
    public Producto(String codigo, String descripcion, double pCompra, double pVenta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
    }//----------------Fin del Constructor parametrico------------------------//
    
    

    //------------------------------Getters y setters------------------------//
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getpCompra() {
        return pCompra;
    }
    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }
    public double getpVenta() {
        return pVenta;
    }
    public double getExistencia() {
        return existencia;
    }
    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }    
    public void setpVenta(double pVenta) {
        this.pVenta = pVenta;
    }//---------------------------------fin de los Getters y Setters-------------------------//
    
    
}
