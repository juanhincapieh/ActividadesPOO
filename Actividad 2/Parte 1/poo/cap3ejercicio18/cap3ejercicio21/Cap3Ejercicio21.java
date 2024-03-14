package poo.cap3ejercicio21;

import java.util.Scanner;

public class Cap3Ejercicio21 {

    public static void main(String[] args) {
        // Creamos un nuevo triangulo
        Triangulo triangulo1 = new Triangulo();
        
        // Le pedimos al usuario que ingrese el valor de los lados
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado A del triangulo: ");
        triangulo1.ladoa = entrada1.nextDouble();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado B del triangulo: ");
        triangulo1.ladob = entrada2.nextDouble();
        
        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado C del triangulo: ");
        triangulo1.ladoc = entrada3.nextDouble();
        
        // Hacemos uso de los métodos de la clase Triangulo
        triangulo1.perimetro = triangulo1.calcular_perimetro();
        triangulo1.semiperimetro = triangulo1.calcular_semiperimetro();
        triangulo1.area = triangulo1.calcular_area();
        
        // Imprimimos en consola los resultados
        System.out.println("Valor del perimetro: " + triangulo1.perimetro);
        System.out.println("Valor del semiperimetro: " + triangulo1.semiperimetro);
        System.out.println("Valor del area: " + triangulo1.area);
    }
}
