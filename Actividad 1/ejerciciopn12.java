package main.java.ejercicioclase;

public class ejerciciopn12 {

    public static void main(String[] args) {
        double horas_trabajadas, valor_hora;
        double retencion, porcentaje_retencion;
        double salario_bruto, salario_neto;

        valor_hora = 5000;
        horas_trabajadas = 48;
        salario_bruto = valor_hora * horas_trabajadas;
        porcentaje_retencion = 0.125;
        retencion = salario_bruto * porcentaje_retencion;
        salario_neto = salario_bruto - retencion;
        
        System.out.println("Las horas trabajadas son: " + horas_trabajadas);
        System.out.println("El salario bruto es: " + salario_bruto);
        System.out.println("El salario neto es: " + salario_neto);
        System.out.println("La retencion es: " + retencion);
        System.out.println("El porcentaje de retencion es: " + porcentaje_retencion*100 + "%");
        System.out.println("El valor de la hora es: " + valor_hora);
    }
}
