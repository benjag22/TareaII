import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {
    private Expendedor expendedorSimple;
    @BeforeEach
    void setUp() {
        expendedorSimple = new Expendedor(3);
    }
    @Test
    @DisplayName("Test para comprar un producto sin moneda (moneda null)")
    void comprarProductoPagoIncorrecto() {
        int selector = 2;
        assertThrows(PagoIncorrectoException.class, () -> {
            expendedorSimple.comprarProducto(null, selector);
        });
        assertNull(expendedorSimple.getVuelto());
    }

    @Test
    @DisplayName("Test para comprar un producto con moneda insuficiente")
    void comprarProductoPagoInsuficiente() throws PagoInsuficienteException {
        int selector = 3;
        assertThrows(PagoInsuficienteException.class, () -> {
            expendedorSimple.comprarProducto(new Moneda500(), selector);
        });
        assertNotNull(expendedorSimple.getVuelto());
    }

    @Test
    @DisplayName("Test para comprar un producto que no está en la selección")
    void comprarProductoInexistente() throws PagoInsuficienteException, PagoIncorrectoException {
        int selector = 6;
        assertNull(expendedorSimple.comprarProducto(new Moneda1000(), selector));
    }
    @Test
    @DisplayName("Test cuando se compran mas productos de los que ya hay")
    public void testComprarCuatroBebida(){
        int selector=2;
        Exception exception = assertThrows(NoHayProductoException.class,()->{
            expendedorSimple.comprarProducto(new Moneda500(),selector);
            expendedorSimple.comprarProducto(new Moneda500(),selector);
            expendedorSimple.comprarProducto(new Moneda500(),selector);
            expendedorSimple.comprarProducto(new Moneda500(),selector);
        });
    }

}