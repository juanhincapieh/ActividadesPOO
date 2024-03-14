package poo.cap4ejercicio23;

import java.util.Scanner;

public class Cap4Ejercicio23 {

    public static void main(String[] args) {

        // Creamos nuevos parametros
        Parametros parametros = new Parametros();

        // Le pedimos al usuario que ingrese los datos
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Ingrese el parametro A: ");
        parametros.A = entrada1.nextDouble();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingrese el parametro B: ");
        parametros.B = entrada2.nextDouble();

        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Ingrese el parametro C: ");
        parametros.C = entrada3.nextDouble();

        parametros.hallar_soluciones();
    }
}
