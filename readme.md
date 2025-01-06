### PRACTICA CON ARREGLOS(ARRAYS)
### Programa en Java para Calcular Promedio Final de un Estudiante
Crea un programa que use dos arrays para almacenar cinco calificaciones
de un estudiante (tareas, participaciones, asistencia, examen y proyecto
final) y calcular su promedio final. Los valores para calcular el promedio
estarán en otro array que contiene los porcentajes asignados a cada tipo
de calificación (la ponderación).

### El programa realiza las siguientes acciones: 

1. **Definir las Áreas de Calificación**

2. **Almacenar las Calificaciones**.

3. **Ponderaciones para el Promedio**

4. **Cálculo del Promedio Final**

5. **Entrada de Datos**

6. **Mostrar los Resultados**

### Código 

    import java.util.Scanner; // Importar la clase Scanner para la entrada de datos

    public class PromedioFinal {

    public static void main(String[] args) {

        // Definir los nombres de las áreas de calificación

        String[] areas = {"Tareas", "Participaciones", "Asistencia", "Examen", "Proyecto 
    
        Final"};

        // Crear un array para almacenar las calificaciones (escala de 0 a 10)

        double[] calificaciones = new double[5];

        // Crear un array para almacenar las ponderaciones (porcentajes)

        double[] ponderaciones = {0.20, 0.15, 0.10, 0.25, 0.30}; // Tareas 20%, 

        Participaciones 15%, etc.

        // Crear un objeto Scanner para la entrada de datos

        Scanner scanner = new Scanner(System.in);

        // Ingresar las calificaciones del estudiante

        for (int i = 0; i < areas.length; i++) {

            System.out.print("Ingresa la calificación para " + areas[i] + " (0-10): ");

            calificaciones[i] = scanner.nextDouble();

        }

        // Calcular el promedio ponderado

        double promedioFinal = 0;

        for (int i = 0; i < areas.length; i++) {

            promedioFinal += calificaciones[i] * ponderaciones[i];

        }

        // Mostrar las calificaciones y el promedio final

        System.out.println("\n--- Calificaciones ---");

        for (int i = 0; i < areas.length; i++) {

            System.out.println(areas[i] + ": " + calificaciones[i]);

        }       

        // Mostrar el promedio final

        System.out.println("\nPromedio final ponderado: " + promedioFinal);

        // Cerrar el scanner

        scanner.close();

      }
    }
