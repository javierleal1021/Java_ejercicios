import java.util.Scanner;

public class Eje6 {
    private int piso;
    private int temperatura;
    private String mensaje;

    public void incio(Scanner sc){
        System.out.println("BIENVENIDO AL ASCENSOR");
        System.out.println("Ingrese el piso al que desea ir");
        piso = sc.nextInt();
    }

    public void proceso(Scanner sc){
        if (piso >=1 && piso <=10) {
            System.out.println("Ingrese la temperatura actual");
            temperatura = sc.nextInt();
            if (temperatura >=15 && temperatura <=40) {
                mensaje = "El ascensor se dirije al piso ingresado";
            }else{
                mensaje = "ALERTA - temperatura inadecuada para el uso del ascensor";
            }
        }else{
            mensaje = "El piso ingresado es incorrecto";
        }
    }

    public void resultado(){
        System.out.println(mensaje);
    }
}
