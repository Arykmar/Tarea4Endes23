/**
 * clase principal que contiene metodo main y todo el codigo
 *que tiene que ver con la entarada y salida de datos
 */

package entidadFinanciera;

/**
 * @author Marina
 *
 */
public class Main {
/**
 * clase main
 * @param args
 */
    public static void main(String[] args) {
       /**
        * variable de tipo CCuenta y tipo double
        */
    	CCuenta objetoCuenta;
        double saldoActual;
       /**
        * inicializamos objeto de tipo CCuenta 
        */

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
    }
    /**
     * metodo probarIngresar 
     * @param c -numero de cuenta
     * @param cantidad -cantidad a ingresar
     * @param cantidadEsperada
     * @throws Exception
     */
    public static void probarIngresar(CCuenta c, int cantidad, double cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        
    }
    /**
     * metodo probarRetirar
     * @param c -numero de cuenta
     * @param cantidad -cantidad a retirar
     * @param cantidadEsperada 
     * @throws Exception
     */
    public static void probarRetirar(CCuenta c, int cantidad, double cantidadEsperada) throws Exception{
        c.retirar(cantidad);
    }
}
