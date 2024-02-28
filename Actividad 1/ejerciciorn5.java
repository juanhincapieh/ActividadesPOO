package main.java.ejercicioclase;

public class ejerciciorn5 {

    public static void main(String[] args) {

        double suma = 0;
        double x = 20;
        double y = 40;
        
        suma = suma + x;
        x = x + Math.pow(y, 2);
        suma = suma + (x / y);
        
        System.out.println("El valor de la suma es: " + suma);
        }
    }
