public class ejercicio3 {
    public static void main(String[] args) throws Exception {
        double camiseta = 25.0;
        double pantalon = 30.0;
    
        double camisetaDesc = 0.10; // 10% de descuento
        double pantalonDesc = 0.15; // 15% de descuento
    
        double totalbasico = (camiseta * (1 - camisetaDesc)) + (pantalon * (1 - pantalonDesc));
    
        double segundacamiseta = camiseta * (1 - camisetaDesc) * 0.95;
        
        double totalfinal = (camiseta * (1 - camisetaDesc)) + segundacamiseta + (pantalon * (1 - pantalonDesc));
        System.out.println("Total ( 1 camiseta y 1 pantalon):$" + totalbasico);
        System.out.println("Total ( 2 camisetas y 1 pantalon):$" + totalfinal);
    }
}


