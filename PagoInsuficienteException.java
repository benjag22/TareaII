/**
 * Esta clase se encarga de las excpeciones de pagos insuficientes, es decir cuando
 * el valor de la moneda no alcanza para el valor del producto
 */
public class PagoInsuficienteException extends Exception{
    /**
     * El constructor se encarga del mensaje que se visualiza cuando se captura la excepcion.
     * @param mensaje mensaje que se muestra en pantalla cuando ocurre la excepcion
     */
    public PagoInsuficienteException(String mensaje){
        super(mensaje);
    }
}