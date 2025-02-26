public class Sala {
    private static int cantidadSillas = 10;
    private static int ocupadas = 0;
    
    public Sala (){}

    public boolean reservarSillas(int cantidad) {
        if (cantidad <= getDisponibles()) {
            ocupadas += cantidad;
            return true;
        }
        return false;
    }

    public void disponibilidad(){
        System.out.println("Sillas disponibles: " + getDisponibles());
    }

    public int getDisponibles (){
        return cantidadSillas - ocupadas;
    }
}
