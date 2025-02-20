import java.util.Scanner;

public class Eje5 {
    private int temperatura;
    private String mensaje;

    public void incio(Scanner sc){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Ingrese la temperatura actual");
        temperatura = sc.nextInt();
    }

    public void proceso(){
        if (temperatura > 55) {
            mensaje = "ALERTA - la temperatura esta por encima del umbral permitido";
        }else{
            mensaje = "La temperatura ingresada es NORMAL";
        }
    }

    public void resultado (){
        System.out.println(mensaje);
    }
}
