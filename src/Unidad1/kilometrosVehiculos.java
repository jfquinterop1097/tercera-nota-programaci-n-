import java.util.Scanner;

public class kilometrosVehiculos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, entre10y300 = 0, mas300 = 0, totalKm = 0;

        System.out.print("Cantidad de vehículos: ");
        n = teclado.nextInt();

        int[] kilometros = new int[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Kilómetros vehículo " + (i + 1) + ": ");
            kilometros[i] = teclado.nextInt();

            if(kilometros[i] >= 10 && kilometros[i] <= 300)
                entre10y300++;
            else if(kilometros[i] > 300)
                mas300++;

            totalKm += kilometros[i];
        }

        System.out.println("Entre 10 y 300 km: " + entre10y300);
        System.out.println("Más de 300 km: " + mas300);
        System.out.println("Kilómetros totales: " + totalKm);
    }
}