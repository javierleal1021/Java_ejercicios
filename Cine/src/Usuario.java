import java.util.Scanner;

public class Usuario extends Persona{
    private Sala sala;

    public Usuario (String datoNombre, int datoDocumento, Sala sala){
        super(datoNombre,datoDocumento);
        this.sala = sala;
    }

    public void reservar(Scanner sc){
        int opcion;
        
        do {
            
        if (sala.getDisponibles() == 0) {
            System.out.println("No hay asientos disponibles.");
            return;
        }
         
        System.out.println("Señor "+getNombre()+" A continuacion elija cuantas sillas desea reservar");
        int cantidad = sc.nextInt();
        
        if (sala.reservarSillas(cantidad)) {
            System.out.println("Su reserva ha sido exitosa");
        }else{
            System.out.println("No hay suficientes sillas disponibles.");
        }

            System.out.println("¿Desea reservar más ASIENTOS?");
            System.out.println("1 - Sí");
            System.out.println("2 - No, finalizar reserva");
            opcion = sc.nextInt();
    }   while (opcion == 1 && sala.getDisponibles() > 0);
}
}
        
       