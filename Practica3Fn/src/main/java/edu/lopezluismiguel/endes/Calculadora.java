package edu.lopezluismiguel.endes;


/*la clase calculadora en este caso representa distintos metodos
 de operaciones arimeticas(suma,resta,multiplicación y división)*/
public class Calculadora {

    /*Suma de dos valores
    * parametro (a)
    * parametro (b)
    * devuelve la suma de los dos valores */
    public static int sumar(int a, int b) {
        return a + b;
    }
    /* Resta de dos valores
    * parametro(a)
    * parametro (b)
    * devuelve la resta de los valores */

    public static int restar(int a, int b) {
        return a - b;
    }
    /* Multiplicación de dos valores
    parametro (a)
    parametro (b)
    delvuelve la multiplicación o el producto de dos valores
     */

    public static int multiplicar(int a, int b) {
        return a * b;
    }
    /*División de dos valores,en caso de dividir entre 0
    * se lanzara una ArithmeticException
    * param (a)
    * param ( b)
    * delvuelve el resultado de la división o
    * en caso de dividir por o, una excepción*/

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

}

