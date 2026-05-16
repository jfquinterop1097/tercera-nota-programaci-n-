import java.util.Scanner;
public class ventasTienda {

    private static String cont50a500;
    private static String contMayor500;
    private static String totalventas;
    public static void main (String[] arg) {
        try ( Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.print("ingrese la cantidad de Ventas:" );
            n = sc.nextInt();
            double[] ventas = new double [n];
            for ( int  i = 0; i < n; i++) {
                System.out.print("ingrese la venta" + (i + 1) + ":");
                ventas[i] = sc.nextDouble();
            }
            int cont50a500 = 0;
            int contMayor500 = 0;
            double totalventas = 0;
            for ( int i = 0; i < n; i++) {
                totalventas += ventas[i];
                if (ventas[i] >= 50 && ventas[i] <=500) {
                    cont50a500++;
                } else {
                    if ( ventas[i] > 500){
                        contMayor500++;
                    }
                }
                }

            }
            System.out.println("\nResultados:");
            System.out.println("ventas entre 50 y 500:" + cont50a500);
            System.out.println("ventas mayores a 500:" + contMayor500);
            System.out.println("total de vendido:" + totalventas);
             
            sc.close();

        
        }
    }

