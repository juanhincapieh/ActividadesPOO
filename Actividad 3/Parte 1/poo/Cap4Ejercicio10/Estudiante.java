package poo.cap4ejercicio10;

public class Estudiante {
    String NI;
    String NOM;
    double PAT;
    int EST;
    double PAGMAT;

    public void calcular_matricula() {
        PAGMAT = 50000;

        if (PAT > 2000000 && EST > 3) {
            PAGMAT = PAGMAT + 0.03 * PAT;
        }
    }
}
