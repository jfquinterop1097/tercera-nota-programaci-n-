/*### 2. Edades en un evento

En un evento ingresan `n` personas. Se debe almacenar en un arreglo la edad de cada persona.

Realizar un programa que informe:

- Cuántas personas tienen entre `18` y `30` años.
- Cuántas personas tienen más de `30` años.
- La suma total de las edades ingresadas.
/* */
/*analisis del problema
Que se debe allar?
- Cantidad de personas entre 18 y 30 años
- Cantidad de personas con más de 30 años
- Suma total de las edades
-almacenar los datos en un arreglo
PROCESO

El programa debe realizar los siguientes pasos:

Leer la cantidad de personas.
Crear un arreglo con tamaño n.
Leer y almacenar las edades en el arreglo.
Recorrer el arreglo.
Sumar todas las edades.
Verificar cada edad:
Si está entre 18 y 30 años.
Si es mayor de 30 años.
Contar las personas según el rango.
Mostrar resultados.
*/
import java.util.Scanner;
public class edadesEvento {
public static void main(String[] arg) {
    try (Scanner sc = new Scanner(System.in)) {
        int n;
        System.out.print("ingrese la cantidad de peronas");
        n = sc.nextInt();
        int[] edades = new int [n];
        for (int i = 0; i <n; i++) {
            System.out.print("ingrese la cantidad de la persona " + (i + 1) + ":");
            edades[i] = sc.nextInt();
        }
        int Cont18a30 = 0;
        int ContMayor30 = 0;
        int Sumaedades = 0;
        
        for (int i = 0; i < n; i++) {
            
            Sumaedades += edades [i];
            
            if (edades[i] >= 18 && edades[i] <= 30) {
                Cont18a30++;
            } else {
                ContMayor30++;
            }
        }
        System.out.println("\nResultados:");
        System.out.println("personas entre 18 y 30 años:" + Cont18a30);
        System.out.println("personas con más de 30 años:" + ContMayor30);
        System.out.println("suma total de edades:" + Sumaedades);
    }
}
}

