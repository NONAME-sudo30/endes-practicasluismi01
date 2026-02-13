
package edu.lopezluismiguel.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*Esta clase sirve para realizar
 pruebas unitarias de funcionamiento en
  la clase Calculadora sin necesidad de un Main */
public class CalculadoraTest {
    /* Comprueba que el metodo de la suma devuelva el valor correcto
     * realizando sumas con valores negativos y positivos*/
    @Test
    public void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(0, Calculadora.sumar(-2, 2));
    }
    /* Comprueba que el metodo de la resta devuelva el valor correcto
     * restando numeros negativos y positivos*/

    @Test
    public void testRestar() {
        assertEquals(1, Calculadora.restar(3, 2));
        assertEquals(-4, Calculadora.restar(-2, 2));
    }

/*Comprueba el correcto funcionamiento de la multiplicación
* realizando operaciones con distintos numeros enteros */
    @Test
    public void testMultiplicar() {
        assertEquals(6, Calculadora.multiplicar(2, 3));
        assertEquals(-4, Calculadora.multiplicar(-2, 2));
    }
/* Comprueba el funcionamiento correcto de la división
* realizando operaciones*/
    @Test
    public void testDividir() {
        assertEquals(2, Calculadora.dividir(6, 3));
    }
/*Comprueba que la división devuelva una excepción
* al dividir un numero entre 0 */
    @Test
    public void testDividirPorCero() {
        try {
            Calculadora.dividir(6, 0);
            fail("Se esperaba ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("No se puede dividir por cero", e.getMessage());
        } finally {
            System.out.println("No se puede dividir por 0");
        }
    }


}

