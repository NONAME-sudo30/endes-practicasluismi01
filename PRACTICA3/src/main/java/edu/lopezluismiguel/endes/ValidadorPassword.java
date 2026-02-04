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

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la contraseña: ");
        String entrada = sc.nextLine();

        if (validar(entrada)) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña inválida");
        }
    }

    public static boolean esValida() {
        return false;
    }
}
