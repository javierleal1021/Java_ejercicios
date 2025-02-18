import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Eje1 datos = new Eje1();
        datos.ingresarDatos(sc);
        datos.operacion();
        datos.resultado();
        System.out.println("FIN DEL JUEGO");
  
    }
}
