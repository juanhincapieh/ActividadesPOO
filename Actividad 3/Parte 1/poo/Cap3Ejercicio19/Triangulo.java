package poo.cap3ejercicio19;

public class Triangulo {
    double valor_lado;
    double perimetro;
    double altura;
    double area;
    
    public double calcular_perimetro() {
        perimetro = valor_lado * 3;
        return perimetro;
    }
    
    public double calcular_altura() {
        altura = Math.sqrt(Math.pow(valor_lado, 2) - Math.pow(valor_lado/2, 2));
        return altura;
    }
    
    public double calcular_area() {
        area = (valor_lado * altura)/2;
        return area;
    }
}