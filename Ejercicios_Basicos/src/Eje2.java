import java.util.Scanner;

public class Eje2 {
    private String subir;
    private int piso;

    public void incio(Scanner sc){
        System.out.println("BIENVENIDOS AL ASCENSOR");
        System.out.println("Ingrese el piso a donde se dirige");
        piso = sc.nextInt();
    }

    public void ejecutar(){
        if (piso >= 1 && piso <= 10) {
            subir = "El ascensor se dirige al piso deseado";
        }else{
            subir = "El piso ingresado es incorrecto";
        }
    }

    public void resultado(){
        System.out.println(subir);
    }
    
    
}
