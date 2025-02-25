

public class AbsMoto extends AbsVehiculo{
    private static int cantidadCauchos;

    public AbsMoto (String datoPlaca, String datoModelo){
        super(datoPlaca, datoModelo);
    }

    public static void setcantidadCauchos(int datoCantidad){
        cantidadCauchos = datoCantidad;
    }

    public int getcantidadCauchos(){
        return cantidadCauchos;
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("El color es: "+super.getcolor());
        System.out.println("La cantidad de cauchos es: "+cantidadCauchos);
    }
}
