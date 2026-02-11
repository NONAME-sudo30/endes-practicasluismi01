package edu.lopezluismiguel.endes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.* ;

class ConversorTemperaturaTest {

    @Test
    void testCelsiusAFahrenheit() {
        Assertions.assertEquals(32.0, ConverseTemperatura.celsiusAFahrenheit(0), 0.0001);
        assertEquals(212.0, ConverseTemperatura.celsiusAFahrenheit(100), 0.0001);
        assertEquals(98.6, ConverseTemperatura.celsiusAFahrenheit(37), 0.1);
    }

    @Test
    void testFahrenheitACelsius() {
        assertEquals(0.0, ConverseTemperatura.fahrenheitACelsius(32), 0.0001);
        assertEquals(100.0, ConverseTemperatura.fahrenheitACelsius(212), 0.0001);
        assertEquals(37.0, ConverseTemperatura.fahrenheitACelsius(98.6), 0.1);
    }
}

