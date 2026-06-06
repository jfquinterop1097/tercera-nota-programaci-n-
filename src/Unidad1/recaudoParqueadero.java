import java.util.Scanner;

public class recaudoParqueadero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, entre2000y20000 = 0, mas20000 = 0;
        double totalRecaudado = 0;

        System.out.print("Cantidad de vehículos: ");
        n = teclado.nextInt();

        double[] pagos = new double[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Pago vehículo " + (i + 1) + ": ");
            pagos[i] = teclado.nextDouble();

            if(pagos[i] >= 2000 && pagos[i] <= 20000)
                entre2000y20000++;
            else if(pagos[i] > 20000)
                mas20000++;

            totalRecaudado += pagos[i];
        }

        System.out.println("Pagos entre $2.000 y $20.000: " + entre2000y20000);
        System.out.println("Pagos mayores a $20.000: " + mas20000);
        System.out.println("Total recaudado: $" + totalRecaudado);
    }
}