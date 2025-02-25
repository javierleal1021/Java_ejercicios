public class AbsVehiculo {
    private static String placa;
    private static String modelo;
    private static String color;

    public AbsVehiculo(String datoPlaca, String datoModelo){
        AbsVehiculo.placa = datoPlaca;
        AbsVehiculo.modelo = datoModelo;
        
    }

    public static void setcolor (String datoColor){
        color = datoColor;
    }

    public String getcolor (){
        return color;
    }

    public void imprimirDatos (){
        System.out.println("La placa es: "+AbsVehiculo.placa);
        System.out.println("El modelo es: "+AbsVehiculo.modelo);
    }

    
}
