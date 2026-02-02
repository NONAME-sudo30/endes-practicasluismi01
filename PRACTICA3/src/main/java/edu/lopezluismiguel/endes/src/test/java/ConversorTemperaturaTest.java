package edu.lopezluismiguel.endes.src.test.java;

import edu.lopezluismiguel.endes.ConversorTemperatura;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    @Test
    void testCelsiusAFahrenheit() {
        assertEquals(32.0, ConversorTemperatura.celsiusAFahrenheit(0), 0.0001);
        assertEquals(212.0, ConversorTemperatura.celsiusAFahrenheit(100), 0.0001);
        assertEquals(98.6, ConversorTemperatura.celsiusAFahrenheit(37), 0.1);
    }

    @Test
    void testFahrenheitACelsius() {
        assertEquals(0.0, ConversorTemperatura.fahrenheitACelsius(32), 0.0001);
        assertEquals(100.0, ConversorTemperatura.fahrenheitACelsius(212), 0.0001);
        assertEquals(37.0, ConversorTemperatura.fahrenheitACelsius(98.6), 0.1);
    }
}
