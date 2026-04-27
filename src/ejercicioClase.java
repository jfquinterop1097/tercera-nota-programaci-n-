import java.util.Scanner;

class Participante {
    String nombre;
    double marca2024, marca2025, marca2026;
    int dorsal;

    public Participante(String nombre, double m2024, double m2025, double m2026, int dorsal) {
        this.nombre = nombre;
        this.marca2024 = m2024;
        this.marca2025 = m2025;
        this.marca2026 = m2026;
        this.dorsal = dorsal;
    }
}

public class ejercicioClase {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
            Participante[] participantes = new Participante[10];
            int contador = 0;
            int opcion;
            
            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Inscribir participante");
                System.out.println("2. Mostrar listado por dorsal");
                System.out.println("3. Mostrar listado por marca 2024");
                System.out.println("4. Finalizar programa");
                System.out.print("Seleccione una opcion: ");
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch (opcion) {
                    
                    case 1 -> {
                        if (contador < 10) {
                            System.out.print("Nombre: ");
                            String nombre = sc.nextLine();
                            
                            System.out.print("Marca 2024: ");
                            double m2024 = sc.nextDouble();
                            
                            System.out.print("Marca 2025: ");
                            double m2025 = sc.nextDouble();
                            
                            System.out.print("Marca 2026: ");
                            double m2026 = sc.nextDouble();
                            
                            participantes[contador] = new Participante(nombre, m2024, m2025, m2026, contador + 1);
                            contador++;
                            
                            System.out.println("Participante registrado.");
                        } else {
                            System.out.println("Cupos llenos (maximo 10).");
                        }
                    }
                    
                    case 2 -> {
                        if (contador == 0) {
                            System.out.println("No hay participantes.");
                        } else {
                            System.out.println("\n--- LISTADO POR DORSAL ---");
                            for (int i = 0; i < contador; i++) {
                                System.out.println("Dorsal: " + participantes[i].dorsal +
                                        " | Nombre: " + participantes[i].nombre +
                                        " | 2024: " + participantes[i].marca2024 +
                                        " | 2025: " + participantes[i].marca2025 +
                                        " | 2026: " + participantes[i].marca2026);
                            }
                        }
                    }
                    
                    case 3 -> {
                        if (contador == 0) {
                            System.out.println("No hay participantes.");
                        } else {
                            Participante[] copia = new Participante[contador];
                            
                            for (int i = 0; i < contador; i++) {
                                copia[i] = participantes[i];
                            }
                            
                            // Ordenar por marca 2024 (mayor a menor)
                            for (int i = 0; i < contador - 1; i++) {
                                for (int j = 0; j < contador - i - 1; j++) {
                                    if (copia[j].marca2024 < copia[j + 1].marca2024) {
                                        Participante aux = copia[j];
                                        copia[j] = copia[j + 1];
                                        copia[j + 1] = aux;
                                    }
                                }
                            }
                            
                            System.out.println("\n--- ORDENADOS POR MARCA 2024 ---");
                            for (int i = 0; i < contador; i++) {
                                System.out.println("Nombre: " + copia[i].nombre +
                                        " | Marca 2024: " + copia[i].marca2024);
                            }
                        }
                    }
                    
                    case 4 -> System.out.println("Programa finalizado.");
                    
                    default -> System.out.println("Opcion invalida.");
                }
                
            } while (opcion != 4);
        }
    }