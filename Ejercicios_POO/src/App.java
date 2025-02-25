public class App {
    public static void main(String[] args)  {
       AbsVehiculo objTaxi = new AbsVehiculo("NHI42D", "2015");
       objTaxi.imprimirDatos();
       AbsVehiculo.setcolor("VERDE");
       String auxColor = objTaxi.getcolor();
       System.out.println("El color es: "+auxColor);
       System.out.println("-----------------------");

       AbsVehiculo objBus = new AbsVehiculo("NHO31D", "2016");
       objBus.imprimirDatos();
       AbsVehiculo.setcolor("NARANJA");
       System.out.println("El color es: "+objBus.getcolor());
       System.out.println("------------------------");

       AbsMoto objMoto = new AbsMoto("DUX23C","2010");
       AbsVehiculo.setcolor("ROJO");
       AbsMoto.setcantidadCauchos(2);
       objMoto.imprimirDatos();
    }
}
