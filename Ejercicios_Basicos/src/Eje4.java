import java.util.Scanner;

public class Eje4 {
    private int temperatura;
    private String mensaje;

    public void incio(Scanner sc){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Ingrese la temperatura");
        temperatura = sc.nextInt();
    }

    public void proceso(){
        if (temperatura >= 16 && temperatura <= 30) {
            mensaje = "La temperatura ingresada es adecuada";
        }else{
            mensaje = "La temperatura ingresada no es correcta";
        }
    }

    public void resultado (){
        System.out.println(mensaje);
    }
    
}
