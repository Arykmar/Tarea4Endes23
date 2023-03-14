/*
  * and open the template in the editor.
 */

package entidadFinanciera;


public class CCuenta {
/**
 * variable constante 
 */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
	/**
	 * declaracion de variables de clase
	 */
    private String nombre;
    private String miCuenta;
    private double saldo;
    private double tipoInteres;
/**
 * constructor vacio de la clase
 */
    public CCuenta()
    {
    }
/**
 * constructor de la clase
 * @param nom -nombre de cliente
 * @param cue -numero cuenta
 * @param sal -saldo 
 * @param tipo -tipo de cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        miCuenta=cue;
        saldo=sal;
    }
    /**
     * metodo para ver estado de la cuenta
     * @return saldo -saldo de la cuenta
     */
    public double estado(){
        return this.saldo;
    }
/**
 * metodo para ingresar dinero
 * @param cantidad -cantidad a ingresar
 * @throws Exception salta exception si cantidad es negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        saldo = saldo + cantidad;
    }
/**
 * metodo para retirar saldo
 * @param cantidad - cantidad a retirar 
 * @throws Exception salta si cantidad es negativa o no hay suficiente saldo
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
	/**
	 * metodo para ver tipo de interes
	 * @return tipoInteres
	 */
    private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * metodo para actualizar tipo de interes
	 * @param tipoInteres
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}


    
   