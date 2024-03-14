
package poo.cap3ejercicio19;

import java.util.Scanner;

public class Cap3Ejercicio19 {

    public static void main(String[] args) {
        
        // Creamos un nuevo triangulo
        Triangulo triangulo1 = new Triangulo();
        
        // Le pedimos al usuario que ingrese el valor del lado
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado del triangulo: ");
        triangulo1.valor_lado = entrada.nextDouble();
        
        // Hacemos uso de los métodos de la clase Triangulo
        triangulo1.perimetro = triangulo1.calcular_perimetro();
        triangulo1.altura = triangulo1.calcular_altura();
        triangulo1.area = triangulo1.calcular_area();
        
        // Imprimimos en consola los resultados
        System.out.println("Valor del perimetro: " + triangulo1.perimetro);
        System.out.println("Valor de la altura: " + triangulo1.altura);
        System.out.println("Valor del area: " + triangulo1.area);
    }
}
