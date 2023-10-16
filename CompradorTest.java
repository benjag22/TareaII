import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CompradorTest {
    private Comprador comprador;
    private Expendedor expendedor;
    private Moneda moneda;
    private Moneda nada=null;

    @BeforeEach
    void SetUp(){
        expendedor = new Expendedor(1);
        moneda = new Moneda1000();
    }
    @Test
    @DisplayName("test compra exitosa")
    public void testCompraExitosa()throws Exception{
        System.out.println("Compra exitosa para cada producto");
        assertNotNull(comprador = new Comprador(moneda,1,expendedor));
        assertNotNull(comprador = new Comprador(moneda,2,expendedor));
        assertNotNull(comprador = new Comprador(moneda,3,expendedor));
        assertNotNull(comprador = new Comprador(moneda,4,expendedor));
        assertNotNull(comprador = new Comprador(moneda,5,expendedor));
    }
    @Test
    @DisplayName("Test PagoIncorrectoException")
    public void testComprarProductoSinMoneda(){
        Exception exception = assertThrows(PagoIncorrectoException.class,()->{
            comprador = new Comprador(nada,1,expendedor);
            comprador = new Comprador(nada,2,expendedor);
            comprador = new Comprador(nada,3,expendedor);
            comprador = new Comprador(nada,4,expendedor);
            comprador = new Comprador(nada,5,expendedor);
        });
    }
    @Test
    @DisplayName("Test NoHayProductoException")
    public void testComprarProductoSinProductos(){
        expendedor = new Expendedor(0);
        Exception exception = assertThrows(NoHayProductoException.class,()->{
            comprador = new Comprador(moneda,1,expendedor);
            comprador = new Comprador(moneda,2,expendedor);
            comprador = new Comprador(moneda,3,expendedor);
            comprador = new Comprador(moneda,4,expendedor);
            comprador = new Comprador(moneda,5,expendedor);
        });
    }
}