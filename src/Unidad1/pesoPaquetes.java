import java.util.Scanner;

public class pesoPaquetes {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, entre1y20 = 0, mas20 = 0;
        double pesoTotal = 0;

        System.out.print("Cantidad de paquetes: ");
        n = teclado.nextInt();

        double[] pesos = new double[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Peso paquete " + (i + 1) + ": ");
            pesos[i] = teclado.nextDouble();

            if(pesos[i] >= 1 && pesos[i] <= 20)
                entre1y20++;
            else if(pesos[i] > 20)
                mas20++;

            pesoTotal += pesos[i];
        }

        System.out.println("Entre 1 y 20 kg: " + entre1y20);
        System.out.println("Más de 20 kg: " + mas20);
        System.out.println("Peso total: " + pesoTotal);
    }
}