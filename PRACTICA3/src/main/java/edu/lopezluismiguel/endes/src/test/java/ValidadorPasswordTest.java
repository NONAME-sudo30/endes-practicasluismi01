package edu.lopezluismiguel.endes.src.test.java;

import edu.lopezluismiguel.endes.ValidadorPassword;


    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    public class ValidadorPasswordTest {

        @Test
        public void testPasswordValida() {
            assertTrue(ValidadorPassword.esValida("Abcdef12"));
        }

        @Test
        public void testPasswordMuyCorta() {
            assertFalse(ValidadorPassword.esValida("Abc12"));
        }

        @Test
        public void testSinMayusculas() {
            assertFalse(ValidadorPassword.esValida("abcdef12"));
        }

        @Test
        public void testSinMinusculas() {
            assertFalse(ValidadorPassword.esValida("ABCDEF12"));
        }

        @Test
        public void testSinNumeros() {
            assertFalse(ValidadorPassword.esValida("Abcdefgh"));
        }

        @Test
        public void testPasswordNula() {
            assertFalse(ValidadorPassword.esValida(null));
        }
    }
