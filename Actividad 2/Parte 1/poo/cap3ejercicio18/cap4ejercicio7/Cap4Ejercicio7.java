package poo.cap4ejercicio7;

import java.util.Scanner;

public class Cap4Ejercicio7 {

    public static void main(String[] args) {
        // Creamos nuevos numeros como objetos
        Numeros numeros = new Numeros();
        
        // Le pedimos al usuario que ingrese los numeros
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Ingrese el número A: ");
        numeros.numeroA = entrada1.nextDouble();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingrese el número B: ");
        numeros.numeroB = entrada2.nextDouble();

        numeros.revisar_numeros();
    }
}
