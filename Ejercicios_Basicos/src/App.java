import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Eje1 datos = new Eje1();
        datos.ingresarDatos(sc);
        datos.operacion();
        datos.resultado();*/

        Eje2 datos2 = new Eje2();
        datos2.incio(sc);
        datos2.ejecutar();
        datos2.resultado();

        
  
    }
}
