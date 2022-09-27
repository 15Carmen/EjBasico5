package ejbasico5;

import java.util.Scanner;

public class EjBasico5 {
    public static void main(String[] args) {

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner (System.in);

        //Declaramos las variables radio, longitud y area
        double radio, longitud, area;

        /**
         * Le pedimos al usuario que introduzca el radio de la circunferencia y lo
         * guardamos en la variable homónima previamente declarada
         */
        System.out.println("Introduzca el radio de la circunferencia");
        radio=sc.nextDouble();

        /**
         * Calculamos la longitud de la circunferencia multiplicando el radio por 2 y
         * el resultado multiplicándolo por pi
         */
        longitud = (radio*2)*Math.PI;

        /**
         * Calculamos el area elevando el radio al cuadrado y el resultado multiplicándolo por pi
         */
        area = (Math.pow(radio,2))*Math.PI;
        //Otra forma de calcular el area: area = ((radio*radio)*Math.PI;

        //Mostramos por pantalla la longitud y el área de la circunferencia
        System.out.println("La longitud de la circunferencia es "+longitud+" y el area es "+area);

    }
}
