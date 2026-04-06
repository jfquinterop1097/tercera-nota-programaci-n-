package Unidad1;
import java.util.Scanner;

public class Parcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitud de datos
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el documento o identificación: ");
        String documento = sc.nextLine();

        System.out.print("Ingrese el puntaje de desempeño (0 a 100): ");

        // Validación de entrada numérica
        if (sc.hasNextDouble()) {
            double puntaje = sc.nextDouble();

            // Validación de rango
            if (puntaje < 0 || puntaje > 100) {
                System.out.println(" El puntaje ingresado es inválido. Debe estar entre 0 y 100.");
            } else {
                String clasificacion;

                // Clasificación del desempeño
                if (puntaje <= 59) {
                    clasificacion = "Desempeño insuficiente";
                } else if (puntaje <= 74) {
                    clasificacion = "Desempeño aceptable";
                } else if (puntaje <= 89) {
                    clasificacion = "Buen desempeño";
                } else {
                    clasificacion = "Desempeño sobresaliente";
                }

                // Salida organizada
                System.out.println("\n===== RESULTADO DE EVALUACIÓN =====");
                System.out.println("Nombre: " + nombre);
                System.out.println("Documento: " + documento);
                System.out.println("Puntaje obtenido: " + puntaje);
                System.out.println("Clasificación: " + clasificacion);
            }
        } else {
            System.out.println(" Debe ingresar un valor numérico válido para el puntaje.");
        }

        sc.close();
    }
}
