package edu.lopezluismiguel.endes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.* ;
/* Es un clase que va a testear el correcto funcionamiento
 de los metodos de la clase ConverseTemperature sin necesidad de un main*/
class ConversorTemperaturaTest {
/* sirve para testear los metodos  de  Celsius a A Farenheit*/
    @Test
    void testCelsiusAFahrenheit() {
        Assertions.assertEquals(32.0, ConverseTemperatura.celsiusAFahrenheit(0), 0.0001);
        assertEquals(212.0, ConverseTemperatura.celsiusAFahrenheit(100), 0.0001);
        assertEquals(98.6, ConverseTemperatura.celsiusAFahrenheit(37), 0.1);
    }
    /*Sirve para Testear  los metodos de Farenheit a Celsius */

    @Test
    void testFahrenheitACelsius() {
        assertEquals(0.0, ConverseTemperatura.fahrenheitACelsius(32), 0.0001);
        assertEquals(100.0, ConverseTemperatura.fahrenheitACelsius(212), 0.0001);
        assertEquals(37.0, ConverseTemperatura.fahrenheitACelsius(98.6), 0.1);
    }
}

