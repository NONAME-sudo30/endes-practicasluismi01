package src.test;
import static org.junit.jupiter.api.Assertions.*;

import edu.lopezluismiguel.endes.ValidadorPassword;
import org.junit.jupiter.api.Test;

public class ValidadorPasswordTest {

    @Test
    public void testPasswordValida() {
        assertTrue(ValidadorPassword.esValida());
    }

    @Test
    public void testPasswordMuyCorta() {
        assertFalse(ValidadorPassword.esValida());
    }

    @Test
    public void testSinMayusculas() {
        assertFalse(ValidadorPassword.esValida());
    }

    @Test
    public void testSinMinusculas() {
        assertFalse(ValidadorPassword.esValida());
    }

    @Test
    public void testSinNumeros() {
        assertFalse(ValidadorPassword.esValida());
    }

    @Test
    public void testPasswordNula() {
        assertFalse(ValidadorPassword.esValida());
    }
}