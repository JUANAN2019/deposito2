package cuenta2;
/**
 * Esta clase se usa para tener los datos de 
 * las cuentas bancarias de los clientes de bankia
 * @author Juan Antonio
 * @version Beta
 */
public class CCuenta2{

//Estos son las llamadas que va a hacer a los parametros de la clase cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta2()
    {
    }
    /**nos informa del tipo de llamada que va a hacer, y que significa la abreviatura, 
     * tambien indicar que la abreviatura double tipo, no estaba indicada como parametro en 
     * el recurso de contenidos y he tenido que añadirlo
     * @param nom se refiere al parametro nombre
     * @param cue se refiere al parametro cuenta
     * @param sal se refiere al parametro saldo
     * @param tipo se refiere al parametro tipoInteres
     */
    public CCuenta2(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInterés(tipo);
    }
    /** 
     * vemos el estado de la cuenta
     * comentario multilinea
     * @return nos devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * se ejecuta cuando realicemos un ingreso 
     * @param cantidad
     * @throws Exception nos devuelve que no se puede ingresar
     * una cantidad negativa en caso de haberse hecho asi
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Sirve para el buen funcionamiento de nuestra cuenta  y que nos 
     * indique cuando estamos intentando hacer una operacion no 
     * permitida
     * se ejecuta cuando retiremos dinero de la cuenta
     * @param cantidad
     * @throws Exception en esta nos devuelve que no podemos
     * retirar una cantidad negativa, si asi lo hemos intentado hacer
     * @throws Exception nos devuelve que no podemos retirar
     * una cantidad mayor que el saldo, si el importe que intentamos
     * retirar es mayor que el saldo disponible
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * este es le metodo get de la variable nombre, para poder acceder a el
     * de una forma publica o eso es lo que he entendido con los apuntes,
     * pues al refactorizar se han creado los metodos get y set para acceder a ellos 
     * aunque se ha declarado private y en principio solo se podria acceder desde la clase
     * actual que han sido declarados
     * @return devuelve el valor nombre
     */
	private String getNombre() {
		return nombre;
	}
	/**este es el metodo set que se ha creado al refactorizar e igual que en el anterior
	 * sirve para poder acceder a la variable nombre
	 * @param nombre nos define el parametro nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/** igual que en el metodo get de nombre explicado mas arriba pero de cuenta			
	 * @return  nos devuelve cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}
	/**este es el metodo set que se ha creado al refactorizar e igual que en el anterior
	 * sirve para poder acceder a la variable cuenta
	 * @param nombre nos define el parametro cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/** igual que en el metodo get de nombre explicado mas arriba pero de saldo			
	 * @return  nos devuelve saldo
	 */
	private double getSaldo() {
		return saldo;
	}
	/**este es el metodo set que se ha creado al refactorizar e igual que en el anterior
	 * sirve para poder acceder a la variable saldo
	 * @param nombre nos define el parametro saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/** igual que en el metodo get de nombre explicado mas arriba pero de tipoInteres			
	 * @return  nos devuelve el tipo de interes
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}
	/**este es el metodo set que se ha creado al refactorizar e igual que en el anterior
	 * sirve para poder acceder a la variable tipoInteres
	 * @param nombre nos define el parametro tipoInteres
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
