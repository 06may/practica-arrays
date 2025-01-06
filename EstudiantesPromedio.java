import java.util.Scanner;

public class EstudiantesPromedio {
    public static void main(String[] args) {

        String[] areas = {"Tareas", "Participaciones", "Asistencia", "Examen", "Proyecto Final"};

        double[] calificaciones = new double[5];

        double[] ponderaciones = {0.20, 0.15, 0.10, 0.25, 0.30};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < areas.length; i++) {
            System.out.print("Ingresa la calificación para " + areas[i] + " (0-10): ");
            calificaciones[i] = scanner.nextDouble();
        }

        double promedioFinal = 0;
        for (int i = 0; i < areas.length; i++) {
            promedioFinal += calificaciones[i] * ponderaciones[i];
        }

        System.out.println("\n--- Calificaciones ---");
        for (int i = 0; i < areas.length; i++) {
            System.out.println(areas[i] + ": " + calificaciones[i]);
        }
        System.out.println("\nPromedio final ponderado: " + promedioFinal);

        scanner.close();
    }
}
