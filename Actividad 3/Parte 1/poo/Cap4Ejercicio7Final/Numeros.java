package poo.cap4ejercicio7final;

public class Numeros {
    double numeroA;
    double numeroB;
    String resultado;

    public void revisar_numeros() {
        if (numeroA > numeroB) {
            resultado = numeroA + " es mayor que " + numeroB;
        } 
        
        else if (numeroA == numeroB) {
            resultado = numeroA + " es igual a " + numeroB;
        } 
        
        else {
            resultado = numeroA + " es menor que " + numeroB;
        }
    }
}
