package proyecto2parcial;

/**
 *
 * @author luis.uzcategui
 */
public class Lacteo extends ProductoCant{
    private boolean solido;//---Atributo para saber si el lacteo es Liquido(false) Solido(true)---//
    
    //-----------------Constructor por defecto------------------//
    public Lacteo() {
        super();
        this.solido = false;
    }//------------Fin del Constructor por defecto-----------------------//
    
    
    //-----------------Constructor parametrico------------------//
    public Lacteo(boolean solido, double existencia, String codigo, String descripcion, double pCompra, double pVenta) {
        super(existencia, codigo, descripcion, pCompra, pVenta);
        this.solido = solido;
    }//----------------Fin del Constructor parametrico------------------------//

    
}
