import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DepositoTest {
    Deposito<Producto> depositoGenerico;
    @BeforeEach
    void setUp(){
        depositoGenerico = new Deposito<>();
        for(int i=1;i<=2;i++){
            depositoGenerico.addElemento(new CocaCola(i));
        }
    }
    @Test
    @DisplayName("Test para sacar una bebida")
    void getBebida(){
        assertNotNull(depositoGenerico.getElemento());
    }
    @Test
    @DisplayName("Test para verificar si está vacío el depósito")
    void getBebidaVacio() {
        depositoGenerico.getElemento();
        depositoGenerico.getElemento();

        assertNull(depositoGenerico.getElemento());
    }
}
