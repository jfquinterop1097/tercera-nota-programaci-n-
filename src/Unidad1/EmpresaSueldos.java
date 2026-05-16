// analisis
// 1 una empresa tiene n empleados. cada empleado gana un sueldo que estan entre $100 y 500
// se necesita crear un programa que:
// 1. lea la cantidad de empleados 
// 2. lea el sueldo de cada empleado 
// 3. cuente cuantos empleados ganan entre 100$ y 300$
// 4. cuente cuantos empleados ganan mas de 300$
// 5. muestre el total que gasta la empresa en sueldos

// resultados esperados
import java.util.Scanner;

public class EmpresaSueldos {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int empleados;
            double sueldo;
            int empleados100a300 = 0;
            int empleadosMas300 = 0;
            double totalSueldos = 0;
            
            // Pedir cantidad de empleados
            System.out.print("Ingrese la cantidad de empleados: ");
            empleados = entrada.nextInt();
            
            // Ciclo para ingresar sueldos
            for (int i = 1; i <= empleados; i++) {
                
                System.out.print("Ingrese el sueldo del empleado " + i + ": ");
                sueldo = entrada.nextDouble();
                
                // Validar rango del sueldo
                if (sueldo >= 100 && sueldo <= 300) {
                    empleados100a300++;
                } else if (sueldo > 300 && sueldo <= 500) {
                    empleadosMas300++;
                }
                
                // Acumular total de sueldos
                totalSueldos = totalSueldos + sueldo;
            }
            
            // Mostrar resultados
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Empleados que cobran entre 100 y 300 dolares: " + empleados100a300);
            System.out.println("Empleados que cobran mas de 300 dolares: " + empleadosMas300);
            System.out.println("Total que gasta la empresa en sueldos: $" + totalSueldos);
        }
    }
}
