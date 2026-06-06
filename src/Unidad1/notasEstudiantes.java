import java.util.Scanner;

public class notasEstudiantes {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, entre3y4 = 0, mas4 = 0;
        double sumaNotas = 0;

        System.out.print("Cantidad de estudiantes: ");
        n = teclado.nextInt();

        double[] notas = new double[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Nota estudiante " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();

            if(notas[i] >= 3.0 && notas[i] <= 4.0)
                entre3y4++;
            else if(notas[i] > 4.0)
                mas4++;

            sumaNotas += notas[i];
        }

        System.out.println("Notas entre 3.0 y 4.0: " + entre3y4);
        System.out.println("Notas mayores a 4.0: " + mas4);
        System.out.println("Suma notas: " + sumaNotas);
    }
}