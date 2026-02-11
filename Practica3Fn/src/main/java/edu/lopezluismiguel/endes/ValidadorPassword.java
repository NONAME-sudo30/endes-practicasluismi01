package edu.lopezluismiguel.endes;


import java.util.Scanner;

    public class ValidadorPassword {

        public static boolean validar(String password) {
            if (password == null) {
                return false;
            }

            String regex = "^(?=.*[A-Z])(?=.*[0-9]).{6,}$";

            return password.matches(regex);
        }

        public static boolean esValida() {
            return false;
        }
    }


