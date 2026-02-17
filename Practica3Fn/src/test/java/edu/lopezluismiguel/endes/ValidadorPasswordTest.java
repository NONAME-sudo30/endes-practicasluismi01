package edu.lopezluismiguel.endes;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/* Es una clase Test que comprueba el funcionamiento de la clase ValidadorPassword*/
    public class ValidadorPasswordTest {

/* Comprueba si la contraseña es muy corta*/
        @Test
        public void testPasswordMuyCorta() {
            assertFalse(ValidadorPassword.esValida());
        }
    /* Comprueba si la contraseña no tiene mayusculas*/
        @Test
        public void testSinMayusculas() {
            assertFalse(ValidadorPassword.esValida());
        }
    /* Comprueba si la contraseña no es minuscula*/

        @Test
        public void testSinMinusculas() {
            assertFalse(ValidadorPassword.esValida());
        }
    /* Comprueba si la contraseña no tiene numero*/

        @Test
        public void testSinNumeros() {
            assertFalse(ValidadorPassword.esValida());
        }
    /* Comprueba si la contraseña es nula*/
        @Test
        public void testPasswordNula() {
            assertFalse(ValidadorPassword.esValida());
        }

        @Test
        public void testValidarNull() {
            assertFalse(false);
        }
    /* Comprueba si la contraseña es correcta*/
        @Test
        public void testValidarCorrecto() {
            assertTrue(ValidadorPassword.validar("Abc123"));
        }
    /* Comprueba si la contraseña es null*/
        @Test
        public void TestValidarNull() {
            assertFalse(ValidadorPassword.validar(null));
        }
    /* Comprueba si la contraseña es incorrecta*/
        @Test
        public void testValidarIncorrecto() {
            assertFalse(ValidadorPassword.validar("abc"));
        }

    }



