import java.util.Scanner;

public class Sensor {
    private int opcion;
    private int temp;

    public Sensor(int opcion){
        this.opcion = opcion;
    }
    public int getTemp(){
        return temp;
    }
    public void activarSensor(Scanner sc){
        
        if (opcion == 1) {
            System.out.println("Ingrese La temperatura actual");
            temp = sc.nextInt();
            sc.nextLine();
            if (temp < 10) {
                System.out.println("Se ha encendido el calefactor");
            }else if (temp >=10 && temp <=25) {
                System.out.println("Temperatura normal, sistema inactivo");
            }else if (temp > 25) {
                System.out.println("Se ha encendido el ventilador");
            }
        }else{
            System.out.println("GRACIAS POR USAR NUESTRO SISTEMA");
        }   
    }
}
