public class App {
    public static void main(String[] args)  {
       AbsVehiculo objTaxi = new AbsVehiculo("NHI42D", "2015", "NEGRO");
       objTaxi.imprimirDatos();
       String auxColor = objTaxi.getcolor();
       System.out.println("El color es: "+auxColor);
       System.out.println("-----------------------");

       AbsVehiculo objBus = new AbsVehiculo("NHO31D", "2016", "AZUL");
       objBus.imprimirDatos();
       String auxColor2 = objBus.getcolor();
       System.out.println("El color es: "+auxColor2);
       System.out.println("------------------------");

       AbsMoto objMoto = new AbsMoto("DUX23C","2010","ROJO",2);
       objMoto.imprimirDatos();
    }
}
