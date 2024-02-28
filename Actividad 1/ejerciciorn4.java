package actividad1;

public class ejerciciorn4 {

    public static void main(String[] args) {
        int edJuan = 9;
        int edAlber, edAna, edMama;

        edAlber = 2*(edJuan/3);
        edAna = 4*(edJuan/3);
        edMama = edJuan + edAlber + edAna;

        System.out.println("Las edades son:");
        System.out.println("Alberto: " + edAlber);
        System.out.println("Juan: " + edJuan);
        System.out.println("Ana: " + edAna);
        System.out.println("Mamá: " + edMama);
    }
}
