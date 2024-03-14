
package poo.cap3ejercicio21;

public class Triangulo {
    double ladoa;
    double ladob;
    double ladoc;
    double perimetro;
    double semiperimetro;
    double area;
    
    public double calcular_perimetro() {
        perimetro = ladoa + ladob + ladoc;
        return perimetro;
    }

    public double calcular_semiperimetro() {
        semiperimetro = perimetro/2;
        return semiperimetro;
    }
    
    public double calcular_area() {
        // Usamos la formula de Heron para calcular el area
        area = Math.sqrt(semiperimetro * (semiperimetro - ladoa) * (semiperimetro - ladob) * (semiperimetro - ladoc));
        return area;
    }
}
