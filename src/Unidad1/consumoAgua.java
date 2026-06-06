import java.util.Scanner;

public class consumoAgua {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, entre1y50 = 0, mas50 = 0, totalConsumo = 0;

        System.out.print("Cantidad de apartamentos: ");
        n = teclado.nextInt();

        int[] consumo = new int[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Consumo apartamento " + (i + 1) + ": ");
            consumo[i] = teclado.nextInt();

            if(consumo[i] >= 1 && consumo[i] <= 50)
                entre1y50++;
            else if(consumo[i] > 50)
                mas50++;

            totalConsumo += consumo[i];
        }

        System.out.println("Entre 1 y 50 m3: " + entre1y50);
        System.out.println("Más de 50 m3: " + mas50);
        System.out.println("Consumo total: " + totalConsumo);
    }
}