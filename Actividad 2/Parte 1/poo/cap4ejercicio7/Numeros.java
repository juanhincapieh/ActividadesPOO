package poo.cap4ejercicio7;

public class Numeros {
    double numeroA;
    double numeroB;

    public void revisar_numeros() {
        if (numeroA > numeroB) {
            System.out.println(numeroA + " es mayor que " + numeroB);
        } 
        
        else if (numeroA == numeroB) {
            System.out.println(numeroA + " es igual a " + numeroB);
        } 
        
        else {
            System.out.println(numeroA + " es menor que " + numeroB);
        }
    }
}
