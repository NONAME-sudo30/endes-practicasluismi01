
package edu.lopezluismiguel.endes.src.test;
import static org.junit.jupiter.api.Assertions.*;

import edu.lopezluismiguel.endes.Calculadora;
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




}

