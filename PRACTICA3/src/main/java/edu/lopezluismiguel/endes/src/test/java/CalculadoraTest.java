package edu.lopezluismiguel.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar_deberiaRetornarLaSumaCorrecta() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void restar_deberiaRetornarLaRestaCorrecta() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(4, 3));
    }

    @Test
    void multiplicar_deberiaRetornarLaMultiplicacionCorrecta() {
        Calculadora calc = new Calculadora();
        assertEquals(12, calc.multiplicar(4, 3));
    }

    @Test
    void dividir_deberiaRetornarLaDivisionCorrecta() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void dividir_deberiaLanzarExcepcionCuandoEsDivisionPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }
}