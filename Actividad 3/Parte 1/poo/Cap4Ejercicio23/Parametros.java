package poo.cap4ejercicio23;

public class Parametros {
    double A;
    double B;
    double C;
    double solucion1;
    double solucion2;
    String soluciones;

    // Usamos la formula de la ecuacion cuadratica para hallar las soluciones
    public void hallar_soluciones() {
        double discriminante = Math.pow(B, 2) - 4 * A * C;

        // Definimos el caso para cuando el discriminante es mayor a 0, en cuyo caso tendria dos soluciones
        if (discriminante > 0) {
            solucion1 = (-B + (Math.sqrt(discriminante))) / (2 * A);
            solucion2 = (-B - (Math.sqrt(discriminante))) / (2 * A);
            soluciones = "x1 = " + String.format("%.4f", solucion1) + ",  x2 = " + String.format("%.4f", solucion2);

        }
        
        // Definimos el caso para cuando el discriminante es igual a 0, en cuyo caso tendria solo una solucion
        else if (discriminante == 0) {
            solucion1 = -B / (2 * A);
            soluciones = "x = " + solucion1;
        } 
        
        // Definimos el caso para cuando el discriminante es menor que 0, en cuyo caso no tendria soluciones reales
        // porque la raiz cuadrada de un numero negativo no existe en los numeros reales
        else {
            soluciones = "No hay soluciones reales";
        }
    }
}
