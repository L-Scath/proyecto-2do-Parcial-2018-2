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

    //-----------------Constructor por defecto------------------//
    public Producto() {
        this.codigo = " ";
        this.descripcion = " ";
        this.pCompra = 0;
        this.pVenta = 0;
    }//------------Fin del Constructor por defecto-----------------------//
    
    
    //-----------------Constructor parametrico------------------//
    public Producto(String codigo, String descripcion, double pCompra, double pVenta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
    }//----------------Fin del Constructor parametrico------------------------//
}
