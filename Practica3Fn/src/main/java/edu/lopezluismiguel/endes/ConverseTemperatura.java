package edu.lopezluismiguel.endes;

/*Esta clase utiliza metodos para cambiar el valor de la temperatura entre celsius y farenheit */
    public class ConverseTemperatura {
        /* Convertir los valores de temperatura entre celsius y farenheit*/
        public static double celsiusAFahrenheit(double celsius) {
            return (celsius * 9.0 / 5.0) + 32.0;
        }
        /* Convertir los valores entres farenheit y celsius*/

        public static double fahrenheitACelsius(double fahrenheit) {
            return (fahrenheit - 32.0) * 5.0 / 9.0;
        }
    }



