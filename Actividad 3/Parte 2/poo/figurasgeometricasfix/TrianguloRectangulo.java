package poo.figurasgeometricasfix;

public class TrianguloRectangulo {

    int base; // Atributo que define la base de un triangulo rectangulo
    int altura; // Atributo que define la altura de un triangulo rectangulo
    String tipodetriangulo;
    /**
    * Constructor de la clase TrianguloRectangulo
    * @param base Parametro que define la base de un triangulo
    * rectangulo
    * @param altura Parametro que define la altura de un triangulo
    * rectangulo
    */

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
    * Metodo que calcula y devuelve el area de un triangulo rectangulo
    * como la base multiplicada por la altura sobre 2
    * @return Area de un triangulo rectangulo
    */

    double calcularArea() {
        return (base * altura / 2);
    }

    /**
    * Metodo que calcula y devuelve el perimetro de un triangulo
    * rectangulo como la suma de la base, la altura y la hipotenusa
    * @return Perimetro de un triangulo rectangulo
    */

    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); /* Invoca al metodo calcular hipotenusa */
    }

    /**
    * Metodo que calcula y devuelve la hipotenusa de un triangulo
    * rectangulo utilizando el teorema de Pitagoras
    * @return Hipotenusa de un triangulo rectangulo
    */

    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    /**
    * Metodo que determina si un triangulo es:
    * - Equilatero: si sus tres lados son iguales
    * - Escaleno: si sus tres lados son todos diferentes
    * - Escaleno: si dos de sus lados son iguales y el otro es diferente de
    * los demas
    */

    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
        tipodetriangulo = "Equilatero"; /* Todos sus lados son iguales */
        }

        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
        tipodetriangulo = "Escaleno"; /* Todos sus lados son diferentes */
        }

        else {
        tipodetriangulo = "Isosceles"; /* De otra manera, es isosceles */
        }

    }
}
