import java.util.Scanner;

public class gastoClientes {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, entre20000y100000 = 0, mas100000 = 0;
        double totalDinero = 0;

        System.out.print("Cantidad de clientes: ");
        n = teclado.nextInt();

        double[] gastos = new double[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Gasto cliente " + (i + 1) + ": ");
            gastos[i] = teclado.nextDouble();

            if(gastos[i] >= 20000 && gastos[i] <= 100000)
                entre20000y100000++;
            else if(gastos[i] > 100000)
                mas100000++;

            totalDinero += gastos[i];
        }

        System.out.println("Entre $20.000 y $100.000: " + entre20000y100000);
        System.out.println("Más de $100.000: " + mas100000);
        System.out.println("Total recibido: $" + totalDinero);
    }
}