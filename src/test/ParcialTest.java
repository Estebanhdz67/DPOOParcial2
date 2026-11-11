
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class ParcialTest {

    private Parcial parcial;

    @BeforeEach
    public void setUp() {
        this.parcial = new Parcial();
    }

    @Test
    public void calcularRaicesTest1() throws Exception {
        assertEquals("x=3.0, x= 2.0",
                this.parcial.calcularRaices(1, -5, 6));
    }

    @Test
    public void calcularRaicesTest2() throws Exception {
        assertEquals("x=1.0, x= 1.0",
                this.parcial.calcularRaices(1, -2, 1));
    }

    @Test
    public void calcularRaicesTest3() {
        assertThrows(Exception.class,
                () -> this.parcial.calcularRaices(0, 2, 1));
    }

    @Test
    public void calcularRaicesTest4() {
        assertThrows(Exception.class,
                () -> this.parcial.calcularRaices(1, 2, 5));
    }
    @Test
    public void calcularRaicesTest5() {
        assertThrows(Exception.class,
                () -> this.parcial.calcularRaices(Double.NaN, 2, 1));
    }
}
