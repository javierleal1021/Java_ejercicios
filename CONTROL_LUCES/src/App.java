import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        



        System.out.println("CONTROL DE LUCES");
        System.out.println("1. para activar el control de luces automaticas");
        System.out.println("2. para apagar el sistema");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Sistema de control de luces activado");
            while (true) {
                LocalTime hora = LocalTime.now();
                if (hora.isAfter(LocalTime.of(18, 0)) && hora.isBefore(LocalTime.of(6, 00))) {
                    System.out.println("LUCES ENCENDIDAS");
                }else{
                    System.out.println("LUCES APAGADAS");
                }
                Thread.sleep(10000);
            }
        }else{
            System.out.println("Cerrando el sitema....");
        }
    }
}
