import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {
    private Moneda1000 moneda1000;
    private Moneda500 moneda500;

    @BeforeEach
    void setUp() {
        moneda1000 = new Moneda1000();
        moneda500 = new Moneda500();
    }

    @Test
    @DisplayName("Test para CompareTo con moneda de valor menor con una de valor mayor")
    void compareToValorMenorAMayor() {
        assertTrue(moneda500.compareTo(moneda1000) < 0);
    }

    @Test
    @DisplayName("Test para CompareTo con moneda de valor mayor con una de menor valor")
    void compareToValorMayorAMenor() {
        assertTrue(moneda1000.compareTo(moneda500) > 0);
    }

    @Test
    @DisplayName("Test para CompareTo con monedas del mismo valor")
    void compareToMismoValor() {
        assertTrue(moneda1000.compareTo(moneda1000) == 0);
    }
}