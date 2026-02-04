package edu.lopezluismiguel.endes;

public class ConversorTemperatura {
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
    static void main() {
        double c = 25;
        double f = 77;

        System.out.println(c + " °C = " + celsiusAFahrenheit(c) + " °F");
        System.out.println(f + " °F = " + fahrenheitACelsius(f) + " °C");
    }




}
