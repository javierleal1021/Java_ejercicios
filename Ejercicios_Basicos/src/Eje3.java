import java.util.Scanner;

public class Eje3 {
    private int peso;
    private int piso;
    private String mensaje;

    public void inicio(Scanner sc){
        System.out.println("BIENVENIDO AL ASCENSOR");
        System.out.println("Ingrese su peso por favor");
        peso = sc.nextInt();
    }

    public void proceso(Scanner sc){
        if (peso <= 95) {
            System.out.println("Ingrese el piso al que desea ir");
            piso = sc.nextInt();
            if (piso >=1 && piso <=10) {
                mensaje = "El ascensor se dirije al piso deseado";
            }else{
                mensaje = "El piso ingresado no es correcto";
            }
        }else{
            mensaje = "Su peso excede el limite por persona para dirigirse en el ascensor";
        }
    }

    public void resultado(){
        System.out.println(mensaje);
    }
}
