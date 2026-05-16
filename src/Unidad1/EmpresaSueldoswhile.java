/*
========================================================
ANALISIS DEL PROBLEMA
========================================================

La empresa necesita un programa que permita:

1. Ingresar la cantidad de empleados.
2. Leer el sueldo de cada empleado.
3. Contar cuántos empleados ganan entre
   100 y 300 dólares.
4. Contar cuántos empleados ganan más
   de 300 dólares.
5. Calcular el total que la empresa paga
   en sueldos.

--------------------------------------------------------
ENTRADA
--------------------------------------------------------

- Cantidad de empleados
- Sueldo de cada empleado

--------------------------------------------------------
PROCESO
--------------------------------------------------------

1. Pedir la cantidad de empleados.
2. Crear contadores y acumuladores.
3. Utilizar un ciclo WHILE para repetir
   el ingreso de sueldos.
4. Evaluar el sueldo:
   - Si está entre 100 y 300:
       aumentar contador.
   - Si es mayor a 300:
       aumentar contador.
5. Acumular todos los sueldos.
6. Mostrar resultados.

--------------------------------------------------------
SALIDA
--------------------------------------------------------

- Cantidad de empleados que ganan
  entre 100 y 300.
- Cantidad de empleados que ganan
  más de 300.
- Total gastado en sueldos.

========================================================
*/

import java.util.Scanner;

public class EmpresaSueldoswhile {

    public static void main(String[] args) {

        // Variables
        try (Scanner entrada = new Scanner(System.in)) {
            // Variables
            int empleados;
            int contador = 1;
            
            double sueldo;
            double totalSueldos = 0;
            
            int empleados100a300 = 0;
            int empleadosMas300 = 0;
            
            // Entrada
            System.out.print("Ingrese la cantidad de empleados: ");
            empleados = entrada.nextInt();
            
            // Ciclo while
            while (contador <= empleados) {
                
                System.out.print("Ingrese el sueldo del empleado " + contador + ": ");
                sueldo = entrada.nextDouble();
                
                // Verificar sueldo
                if (sueldo >= 100 && sueldo <= 300) {
                    
                    empleados100a300++;
                    
                } else if (sueldo > 300) {
                    
                    empleadosMas300++;
                }
                
                // Acumular total
                totalSueldos = totalSueldos + sueldo;
                
                // Incrementar contador
                contador++;
            }
            
            // Resultados
            System.out.println("\n========= RESULTADOS =========");
            System.out.println("Empleados que ganan entre 100 y 300: " + empleados100a300);
            System.out.println("Empleados que ganan más de 300: " + empleadosMas300);
            System.out.println("Total gastado en sueldos: $" + totalSueldos);
        }
    }
}