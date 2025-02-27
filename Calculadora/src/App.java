import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion2;

        do {
        System.out.println("-------------------------------------------");
        System.out.println("Bienvenido a la Calculadora");
        System.out.println("Para iniciar, Ingrese su nombre por favor");
        String nombre = sc.nextLine();
        Usuario objUsuario = new Usuario(nombre);
        System.out.println("Acontinuacion debe elegir que operacion desea realizar");
        System.out.println("Ingrese 1 para SUMAR");
        System.out.println("Ingrese 2 para RESTAR");
        System.out.println("Ingrese 3 para MULTIPLICAR");
        System.out.println("Ingrese 4 para DIVIDIR");
        System.out.println("Ingresa 5 para cerrar la calculadora");
        int opcion = sc.nextInt();
        if (opcion >=5 ) {
            System.out.println("HASTA PRONTO");
            return;
        }else{
        System.out.println("Digite el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Digite el segundo numero");
        double num2 = sc.nextDouble();
        sc.nextLine();
        Calculadora objCalculadora = new Calculadora(opcion, num1, num2,objUsuario);
        objCalculadora.operaciones();
        }
        System.out.println("--------------------------------");
        System.out.println("Desea volver a usar la calculadora?");
        System.out.println("Ingrese 1 para inciar nuevamente");
        System.out.println("Ingrese 2 para cerrar la calculadora");
        opcion2 = sc.nextInt();
        sc.nextLine();
        } while (opcion2 ==1);
        System.out.println("HASTA PRONTO");
        sc.close();
    }
}
