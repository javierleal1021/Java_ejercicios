import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = sc.nextLine();

        Usuario objUsuario = new Usuario(nombre, apellido);
        
        Juego objJuego = new Juego(objUsuario.getNombre(),objUsuario.getApellido());
        objJuego.fizzBuzz();
    }
}
