import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numero objNumero = new Numero();
        int opcion;

        do {
        System.out.println("Bienvenido al juego FIZZ BUZZ");
        System.out.println("Para iniciar, registre su nombre por favor");
        String nombre = sc.nextLine();
        Usuario objUsuario = new Usuario(nombre);
        System.out.println("Acontinuacion ingresa dos numeros para construir el rango en el que deseas jugar");
        System.out.println("Ingresa el numero donde quieres que inicie el rango");
        objNumero.setRango1(sc);
        System.out.println("Ingrese el numero donde quieres que finalice el rango");
        objNumero.setRango2(sc);
        System.out.println("Ahora ingresa el primero numero para evaluar (FIZZ)");
        objNumero.setNum1(sc);
        System.out.println("Ahora ingresa el segundo numero para evaluar (BUZZ)");
        objNumero.setNum2(sc);
        System.out.println("Iniciando juego...");

        Juego objJuego = new Juego(objUsuario.getNombre(),objNumero);
        objJuego.fizzBuzz();
        System.out.println("--------------------------------");
        System.out.println("Desea volver a jugar?");
        System.out.println("Ingrese 1 para iniciar el juego");
        System.out.println("Ingrese 2 para salir del juego");
        opcion = sc.nextInt();
        sc.nextLine();

    } while (opcion == 1);
        System.out.println("FIN DEL JUEGO");    
        sc.close();
    }
}
