package Unidad1.parcial;

    import java.util.Scanner;

    public class ejercicio2 {
    
        
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cantidad de estudiantes
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = sc.nextInt();

        // Crear arreglo
        double[] notas = new double[n];

        // Ingresar notas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Variables para cálculos
        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];
        int aprobados = 0;
        int reprobados = 0;

        // Recorrer arreglo
        for (int i = 0; i < n; i++) {
            suma += notas[i];

            if (notas[i] > mayor) {
                mayor = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma / n;

        // Mostrar notas
        System.out.println("\n--- Notas ingresadas ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);
        }

        // Mostrar resumen
        System.out.println("\n--- Resumen del grupo ---");
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        sc.close();
    }
}

