package edu.lopezluismiguel.endes;


import java.util.Scanner;
/*Esta clase utiliza metodo para validar las contraseñas */
    public class ValidadorPassword {
/*Valida la contraseña utilizando distintos metodos */
        public static boolean validar(String password) {
            if (password == null) {
                return false;
            }

            String regex = "^(?=.*[A-Z])(?=.*[0-9]).{6,}$";

            return password.matches(regex);
        }
/* Indica si la contraseña es valida*/
        public static boolean esValida() {
            return false;
        }
    }


