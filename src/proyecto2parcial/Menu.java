package proyecto2parcial;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Menu {
    private char entrada=' ';
    Control cont;

    public Menu() {
        this.entrada ='a';
        cont=new Control();
    }
    
    
    
    public void	addAlmacen() throws InterruptedException{     
        Scanner scanner = new Scanner(System.in);
        String auxDescripcion;
        double auxpCompra=0;
        double auxpVenta=0;
        String auxCodigo;
        double auxExistencia=0;
        String auxMarca;
        boolean auxSolido=false;
        int auxCedula=0;
         do{
            auxCodigo="°°";
            System.out.println("Desea añadir Productos al Almacen?: si(S)/no(N)");                
            entrada = scanner.nextLine().charAt(0);
            entrada = Character.toUpperCase(entrada);
            if(entrada=='S'||entrada=='N'){
                switch(entrada){                    
                    case 'S':{  
                                auxCodigo=" ";
                                System.out.println("Ingrese Codigo del Producto");
                                auxCodigo = scanner.nextLine();
                                System.out.println(cont.getVProducto().size());
                                boolean band=false;
                                do{
                                    for (int i = 0; i < cont.getVProducto().size(); i++) {
                                            if (auxCodigo==cont.getProducto(i).getCodigo()) {
                                            System.out.println("El codigo ingresado ya existe en el Almacen");
                                            System.out.println("el programa se cerrara");  
                                            System.exit(0);
                                            band=true;
                                        }
                                    }
                                        if (band==false) {
                                            do {
                                                System.out.println("Ingrese el tipo de Producto a agregar al Almacen \n(1)Carne\n(2)Enlatado\n(3)Lacteo\n(4)Viveres");
                                                entrada = scanner.nextLine().charAt(0);
                                            }while (entrada!='1'&&entrada!='2'&&entrada!='2'&&entrada!='4');
                                                if (entrada=='1'){
                                                    System.out.println("Ingrese descripción del Producto");
                                                    auxDescripcion = scanner.nextLine();
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese cantidad de Producto a Agregar en Kilos");
                                                            auxExistencia = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxExistencia==0);                                                    
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese costo de compra del Producto");
                                                            auxpCompra = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxpCompra==0); 
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese el precio de venta del Producto");
                                                            auxpVenta = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxpVenta==0);
                                                    cont.addAlmacenCarne(auxExistencia, auxCodigo, auxDescripcion, auxpCompra, auxpVenta);
                                                    System.out.println("Producto Añadido exitosamente");
                                                    Thread.sleep(1600);
                                                    band=true;
                                                }
                                                if (entrada=='2'){
                                                    System.out.println("Ingrese Marca del Producto");
                                                    auxMarca = scanner.nextLine();                                                    
                                                    System.out.println("Ingrese descripción del Producto");
                                                    auxDescripcion = scanner.nextLine();
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese unidades de Producto a Agregar");
                                                            auxExistencia = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxExistencia==0);
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese costo de compra del Producto");
                                                            auxpCompra = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxpCompra==0);
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese el precio de venta del Producto");
                                                            auxpVenta = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxpVenta==0);
                                                    cont.addAlmacenEnlatado(auxMarca,(int)auxExistencia, auxCodigo, auxDescripcion, auxpCompra, auxpVenta);
                                                    System.out.println("Producto Añadido exitosamente");
                                                    Thread.sleep(1000);
                                                    band=true;                                                   
                                                }
                                                if (entrada=='3'){
                                                    do {
                                                       System.out.println("Ingrese el estado del Producto:(S)solido/(L)liquido");
                                                        entrada = scanner.nextLine().charAt(0); 
                                                        entrada = Character.toUpperCase(entrada);
                                                        if (entrada=='S') {
                                                            auxSolido=true;
                                                        }else if (entrada=='L') {
                                                            auxSolido=false;
                                                        }
                                                    } while (entrada!='S'||entrada!='L');  
                                                    System.out.println("Ingrese descripción del Producto");
                                                    auxDescripcion = scanner.nextLine();
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese cantidad de Producto a Agregar en Kilos/Litros");
                                                            auxExistencia = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxExistencia==0);
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese costo de compra del Producto");
                                                            auxpCompra = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxpCompra==0);
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese el precio de venta del Producto");
                                                            auxpVenta = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxpVenta==0);
                                                    cont.addAlmacenLacteo(auxSolido, auxExistencia, auxCodigo, auxDescripcion, auxpCompra, auxpVenta);                                                   
                                                    System.out.println("Producto Añadido exitosamente");
                                                    Thread.sleep(1000);
                                                    band=true;
                                                }
                                                if (entrada=='4'){
                                                    System.out.println("Ingrese Marca del Producto");
                                                    auxMarca = scanner.nextLine();
                                                    System.out.println("Ingrese descripción del Producto");
                                                    auxDescripcion = scanner.nextLine();
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese unidades de Producto a Agregar");
                                                            auxExistencia = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxExistencia==0);
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese costo de compra del Producto");
                                                            auxpCompra = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxpCompra==0);
                                                    do {			
                                                        try {
                                                            System.out.println("Ingrese el precio de venta del Producto");
                                                            auxpVenta = scanner.nextInt();
                                                        } catch (InputMismatchException ime){
                                                        System.out.println("¡Cuidado! Solo puedes insertar números");
                                                        scanner.next();
                                                        }
                                                    } while (auxpVenta==0);
                                                    cont.addAlmacenViveres(auxMarca,(int)auxExistencia, auxCodigo, auxDescripcion, auxpCompra, auxpVenta);                                                    
                                                    System.out.println("Producto Añadido exitosamente");
                                                    Thread.sleep(1000);
                                                    band=true;
                                                }    
                                            }
                                }while(band==false);
                        menuPpal();
                        break;} 
                    case 'N':{
                        menuPpal();
                        break;}  
                }
            }
        }while(entrada!='S'&&entrada!='N');       
    } 
    
   
    public void	modifyAlmacen(){
        
    } 
    public void Facturar(){
        
    } 
    public double calculateIngresos(){
        
        return 0;
    }
    public double calculateEgresos(){
        
        return 0;
    }
    
    public void top10(){
        
    }
    public void bajaExistencia(){
        
    }
    
    
    
    public void menuPpal() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("\n\n\n");
        }
        System.out.println("\u001B[34m"+"\t\t     "+(char)(9733)+"MENU PRINCIPAL"+(char)(9733));
        //------------------linea superior------------------------//
        System.out.print("\u001B[32m");// colores (cambian con el n 30-37) para el menu
        System.out.print( (char)(9556)); 
        for (int i = 0; i < 35; i++) {
            System.out.print( (char)(9552)); 
        }        
        System.out.print( (char)(9559));
        //-------------------------------------------------------//
        
        //----------------------lineas centrales-----------------//
        System.out.print("\n"+"\u001B[32m"+(char)(9553)+"\u001B[31m\t    (1)\u001B[34m Añadir un producto al almacen\u001B[31m (1)\t \u001B[32m"+(char)(9553));
        System.out.print("\n"+"\u001B[32m"+(char)(9553)+"\u001B[31m\t(2)\u001B[34m Modificar existencia de un producto\u001B[31m (2)\t \u001B[32m"+(char)(9553));
        System.out.print("\n"+"\u001B[32m"+(char)(9553)+"\u001B[31m\t\t  (3)\u001B[34m Facturar Venta\u001B[31m (3)\t\t \u001B[32m"+(char)(9553));
        System.out.print("\n"+"\u001B[32m"+(char)(9553)+"\u001B[31m\t\t (4)\u001B[34m Ingresos brutos\u001B[31m (4)\t\t \u001B[32m"+(char)(9553));
        System.out.print("\n"+"\u001B[32m"+(char)(9553)+"\u001B[31m\t      (5)\u001B[34m Egresos de la empresa\u001B[31m (5)\t\t \u001B[32m"+(char)(9553));
        System.out.print("\n"+"\u001B[32m"+(char)(9553)+"\u001B[31m\t (6)\u001B[34m Reporte exentos mayores ventas\u001B[31m (6)\t\t \u001B[32m"+(char)(9553));
        System.out.print("\n"+"\u001B[32m"+(char)(9553)+"\u001B[31m\t(7)\u001B[34m Reporte productos existencia baja\u001B[31m (7)\t \u001B[32m"+(char)(9553));
        System.out.print("\n"+"\u001B[32m"+(char)(9553)+"\u001B[31m\t\t     (8)\u001B[34m Salir\u001B[31m (8)\t\t\t \u001B[32m"+(char)(9553));
        //-------------------------------------------------------//
        
        //------------------linea inferior----------------------//
        System.out.print("\n"+"\u001B[32m");// colores (cambian con el n 30-37) para el menu
        System.out.print( (char)(9562)); 
        for (int i = 0; i < 35; i++) {
            System.out.print( (char)(9552)); 
        }
        System.out.print( (char)(9565));
        //-------------------------------------------------------// 
         for (int i = 0; i < 8; i++) {
            System.out.println("\n\n");
        }
         System.out.println("Ingrese la accion a Realizar (1-8): ");
         entrada = scanner.nextLine().charAt(0);
         System.out.println("opcion escogida: "+entrada);
             if (entrada=='1'){
                 addAlmacen();              
             }
             if (entrada=='2'){
                 modifyAlmacen();
             }
             if (entrada=='3'){
                 System.out.println("facturas");    
             }
             if (entrada=='4'){
                 calculateIngresos();
             }
             if (entrada=='5'){
                 calculateEgresos();              
             }
             if (entrada=='6'){
                 top10();
             }
             if (entrada=='7'){
                 bajaExistencia();              
             }
             if (entrada=='8'){
                 System.exit(0);
             }
             else{
                 menuPpal();
             }             
         }
    }
    

