package ejbasico5;

import java.util.Scanner;

public class EjBasico5 {
    public static void main(String[] args) {

        //Creamos un Scanner para leer por consola
        Scanner sc = new Scanner (System.in);

        //Le pedimos al usuario que introduzca el radio de la circunfererncia
        System.out.println("Introduzca el radio de la circunferencia");

        //Declaro la variable radio donde se guarda el radio introducido y lo guardo
        double radio=sc.nextDouble();

        //Declaro la variable longitud donde se calcula multiplicando por 2 el radio introducido y luego multiplicando eso por PI
        double longitud = (radio*2)*Math.PI;

        //Declaro la variable area donde se calcula multipicando el radio al cuadrado por PI
        double area = (Math.pow(radio,2))*Math.PI;
        //otra forma de calcular el area es: double area = ((radio*radio)*Math.PI;

        //Muestro por consola la longitud y el area
        System.out.println("La longitud de la circunferencia es "+longitud+" y el area es "+area);

    }
}
