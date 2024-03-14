package poo.cap4ejercicio10;

import java.util.Scanner;

public class Cap4Ejercicio10 {

    public static void main(String[] args) {
        
        // Creamos un nuevo estudiante
        Estudiante estudiante = new Estudiante();

        // Le pedimos al usuario que ingrese los numeros
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Ingrese el Numero de Inscripcion: ");
        estudiante.NI = entrada1.next();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingrese los nombres: ");
        estudiante.NOM = entrada2.nextLine();

        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Ingrese el patrimonio: ");
        estudiante.PAT = entrada3.nextDouble();

        Scanner entrada4 = new Scanner(System.in);
        System.out.print("Ingrese el estrato: ");
        estudiante.EST = entrada4.nextInt();

        estudiante.calcular_matricula();
    }
}
