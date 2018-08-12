package proyecto2parcial;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class Menu {
    private int pos;
    private char entrada;

    public Menu() {
        this.pos = 0;
        this.entrada =' ';
    }
    
    public void imprimir(){//esto es una prueba
        System.out.print("\u001B[30m");// colores (cambian con el n 30-37) para el menu
        System.out.print( (char)(9744));//simbolos para el menu
        System.out.print( (char)(9745));
        System.out.print( (char)(9746));
        System.out.print( (char)(10004));
        System.out.print( (char)(10006));
        System.out.print( (char)(10853));
        System.out.print( (char)(10852));
        System.out.print( (char)(10853));
        System.out.print( (char)(9654));
        System.out.print( (char)(9655));
        System.out.print( (char)(9664));
        System.out.print( (char)(9665));        
        System.out.print( (char)(9553));        
        System.out.print( (char)(9559));
        System.out.print( (char)(9565));
        System.out.print( (char)(9562));
        System.out.print( (char)(9556));
        System.out.print( (char)(9552));        
        System.out.print( (char)(9608));
        
    }
    
}
