package poo.cap3ejercicio18;

public class Empleado {
    int codigo;
    String nombres;
    int numero_horas;
    double valor_hora;
    double porcentaje_retencion;
    double salario_bruto;
    double retencion;
    double salario_neto;

    public void calcular_salario() {
        // Calculamos el porcentaje de retencion, ya que el usuario nos da un valor de 0 a 100,
        // y lo convertimos en un valor de 0 a 1 para mayor facilidad
        porcentaje_retencion = porcentaje_retencion / 100;
        
        salario_bruto = numero_horas * valor_hora;
        retencion = salario_bruto * porcentaje_retencion;
        salario_neto = salario_bruto - retencion;
    }
}