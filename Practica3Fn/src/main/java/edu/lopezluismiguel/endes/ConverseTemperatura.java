package edu.lopezluismiguel.endes;


    public class ConverseTemperatura {
        public static double celsiusAFahrenheit(double celsius) {
            return (celsius * 9.0 / 5.0) + 32.0;
        }

        public static double fahrenheitACelsius(double fahrenheit) {
            return (fahrenheit - 32.0) * 5.0 / 9.0;
        }
    }



