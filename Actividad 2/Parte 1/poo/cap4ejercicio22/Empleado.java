package poo.cap4ejercicio22;

public class Empleado {
    String nombre;
    double salario_hora;
    double numero_horas;
    double salario_mes;

    public void calcular_salario() {
        salario_mes = salario_hora * numero_horas;

        if (salario_mes > 450000) {
            System.out.println("Nombre del empleado: " + nombre);
            System.out.println("Salario mensual del empleado: " + salario_mes);
        }

        else {
            System.out.println("Nombre del empleado: " + nombre);
        }
    }
}
