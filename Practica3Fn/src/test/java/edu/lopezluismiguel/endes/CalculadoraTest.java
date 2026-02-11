
package edu.lopezluismiguel.endes;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(0, Calculadora.sumar(-2, 2));
    }

    @Test
    public void testRestar() {
        assertEquals(1, Calculadora.restar(3, 2));
        assertEquals(-4, Calculadora.restar(-2, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, Calculadora.multiplicar(2, 3));
        assertEquals(-4, Calculadora.multiplicar(-2, 2));
    }

    @Test
    public void testDividir() {
        assertEquals(2, Calculadora.dividir(6, 3));
    }
    @Test
    public void testDividirPorCero() {
        try {
            Calculadora.dividir(6, 0);
            fail("Se esperaba ArithmeticException");
        } catch (ArithmeticException e) {
            // Aquí validas que la excepción es la correcta
            assertEquals("No se puede dividir por cero", e.getMessage());
        } finally {
            System.out.println("No se puede dividir por 0");
        }
    }









}

