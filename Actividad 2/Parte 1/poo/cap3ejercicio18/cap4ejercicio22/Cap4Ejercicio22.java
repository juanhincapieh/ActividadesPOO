package poo.cap4ejercicio22;

import java.util.Scanner;

public class Cap4Ejercicio22 {

    public static void main(String[] args) {
            
        // Creamos un nuevo empleado
        Empleado empleado1 = new Empleado();

        // Le pedimos al usuario que ingrese los datos
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        empleado1.nombre = entrada1.nextLine();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingrese el salario basico por hora: ");
        empleado1.salario_hora = entrada2.nextDouble();

        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas en el mes: ");
        empleado1.numero_horas = entrada3.nextDouble();

        empleado1.calcular_salario();
    }
}
