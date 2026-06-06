import java.util.Scanner;

public class produccionFabrica {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, entre10y100 = 0, mas100 = 0, totalProduccion = 0;

        System.out.print("Cantidad de operarios: ");
        n = teclado.nextInt();

        int[] produccion = new int[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Producción operario " + (i + 1) + ": ");
            produccion[i] = teclado.nextInt();

            if(produccion[i] >= 10 && produccion[i] <= 100)
                entre10y100++;
            else if(produccion[i] > 100)
                mas100++;

            totalProduccion += produccion[i];
        }

        System.out.println("Entre 10 y 100 unidades: " + entre10y100);
        System.out.println("Más de 100 unidades: " + mas100);
        System.out.println("Producción total: " + totalProduccion);
    }
}