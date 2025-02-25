

public class AbsMoto extends AbsVehiculo{
    private int cantidadCauchos;

    public AbsMoto (String datoPlaca, String datoModelo, String datoColor,int datoCauchos){
        super(datoPlaca, datoModelo, datoColor);
        this.cantidadCauchos = datoCauchos;
    }

    public void setcantidadCauchos(int datoCantidad){
        this.cantidadCauchos = datoCantidad;
    }

    public int getcantidadCauchos(){
        return this.cantidadCauchos;
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("El color es: "+super.getcolor());
        System.out.println("La cantidad de cauchos es: "+this.cantidadCauchos);
    }
}
