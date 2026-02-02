package edu.lopezluismiguel.endes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {
   public static int  suma(int a, int b){
   return a+b;}
    public static int resta(int a, int b){
       return a-b;
       }
        public static int multiplicar(int a,int b){
            return a * b;
        }
        public static int division(int a,int b){
       return a / b;
        }

    static void main() {
        System.out.println(suma(1,2));
        System.out.println(resta(2,8));
        System.out.println(multiplicar(2,8));
        System.out.println(division(2,1));
    }

/**para que su prueba unitaria funcione*/
    public static int sumar(int i, int b) {
        return i + b;
    }

    public static int restar(int i, int b ) {
        return i - b;
    }

    public static int dividir(int i, int b) {
        return i * b;
    }
}
