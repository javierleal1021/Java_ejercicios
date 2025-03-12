import java.util.Scanner;



public class App {

   private static String[] listaNombre_clientes;
    
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
        System.out.println("------------------------------------------------------");
        System.out.println("BIENVENIDO AL SISTEMA DE NORMALIZACION DE TEMPERATURA");
        System.out.println("Digite 1 para ingresar la temperatura");
        System.out.println("Digite 2 para salir del sistema");
        opcion = sc.nextInt();
        sc.nextLine();
        if (opcion == 1) {
            Sensor objSensor = new Sensor(opcion);
            objSensor.activarSensor(sc);
        }
       
        if (opcion == 1) {
            System.out.println("Esperando 5 segundos para volver a tomar la temperatura...");
            Thread.sleep(6000);
        }
        
        } while (opcion == 1);
            System.out.println("HASTA PRONTO");

        sc.close();
    }
}
