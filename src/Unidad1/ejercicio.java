package Unidad1;
import java.util.Scanner;
public class ejercicio {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
     Scanner scanner = new Scanner(System.in);
     int [] numeros = new int[5];
     int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio es: " + promedio);
     scanner.close();
    } 
}
    

