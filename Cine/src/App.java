import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sala objSala = new Sala();
            
            
        System.out.println("Bienvenido al SENA-CINE, por favor ingrese sus datos.");

        while (objSala.getDisponibles() > 0) {
            
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su documento");
        int doc = sc.nextInt();

        //Persona objPersona = new Persona(nombre,doc);
        Usuario usuario1 = new Usuario(nombre,doc,objSala);

        int opcion;

        do {
        System.out.println("-----------------------------------------------------");
        System.out.println("Acontinuacion seleccione la opcion que desea realizar");
        System.out.println("-----------------------------------------------------");
        System.out.println("Ingrese 1 si desea reservar una silla en esta sala");
        System.out.println("Ingrese 2 si desea consultar disponibilidad de sillas");
        System.out.println("Ingrese 3 si desea finalizar reserva.");
        System.out.println("Ingrese 4 para salir del sistema");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
            usuario1.reservar(sc);
                break;
            case 2:
            objSala.disponibilidad();
                break;
            case 3:
            System.out.println("reserva realizada, hasta una proxima");
                break;
            case 4:
            System.out.println("reserva realizada, hasta una proxima");
            sc.close();
                return;
            default:
            System.out.println("ingrese una opcion valida");
        }
        } while (opcion !=3 && objSala.getDisponibles() > 0 );
        }
        System.out.println("En este momento no hay asientos disponibles");
        sc.close();
    }
}
        