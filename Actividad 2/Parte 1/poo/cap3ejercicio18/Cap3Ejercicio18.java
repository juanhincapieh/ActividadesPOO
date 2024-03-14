package poo.cap3ejercicio18;

import java.util.Scanner;

public class Cap3Ejercicio18 {

    public static void main(String[] args) {
        
        // Creamos un nuevo empleado
        Empleado empleado1 = new Empleado();
        
        // Pedimos los datos por consola
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Ingrese el codigo del empleado: ");
        empleado1.codigo = entrada1.nextInt();
                
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingrese los nombres del empleado: ");
        empleado1.nombres = entrada2.nextLine();
        
        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        empleado1.numero_horas = entrada3.nextInt();

        Scanner entrada4 = new Scanner(System.in);
        System.out.print("Ingrese el valor por hora: ");
        empleado1.valor_hora = entrada4.nextDouble();

        Scanner entrada5 = new Scanner(System.in);
        System.out.print("Ingrese el porcentaje de 0 a 100: ");
        empleado1.porcentaje_retencion = entrada5.nextDouble();
        
        // Realizamos los computos con el metodo de la clase
        empleado1.calcular_salario();

        // Imprimimos en consola los resultados
        System.out.println("\nEsta es la informacion del empleado:");
        System.out.println("Codigo: " + empleado1.codigo);
        System.out.println("Nombres: " + empleado1.nombres);
        System.out.println("Salario Bruto: " + empleado1.salario_bruto);
        System.out.println("Salario Neto: " + empleado1.salario_neto);
    }
}
