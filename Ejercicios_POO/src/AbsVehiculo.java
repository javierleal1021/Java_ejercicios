public class AbsVehiculo {
    private static String placa;
    private static String modelo;
    private String color;

    public AbsVehiculo(String datoPlaca, String datoModelo, String datoColor){
        AbsVehiculo.placa = datoPlaca;
        AbsVehiculo.modelo = datoModelo;
        this.color = datoColor;
    }

    public void setcolor (String datoColor){
        this.color = datoColor;
    }

    public String getcolor (){
        String auxColor = this.color;
        return auxColor;
    }

    public void imprimirDatos (){
        System.out.println("La placa es: "+AbsVehiculo.placa);
        System.out.println("El modelo es: "+AbsVehiculo.modelo);
    }

    
}
