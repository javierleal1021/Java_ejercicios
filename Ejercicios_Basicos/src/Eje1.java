import java.util.Scanner;

public class Eje1 {
    private String nombreCliente;
    private String producto;
    private int precioProd;
    private int cantidad;
    private int tipoCliente;
    private double total;

    public void ingresarDatos (Scanner sc){
        System.out.println("Bienvenido al sistema");
        System.out.println("por favor ingrese el nombre del cliente:");
        nombreCliente = sc.nextLine();
        System.out.println("El cliente ingresado es estudiante? ingrese 1-SI o 2-NO");
        tipoCliente = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el producto:");
        producto = sc.nextLine();
        System.out.println("Cual es el precio del producto:");
        precioProd = sc.nextInt();
        System.out.println("Ingrese la cantidad:");
        cantidad = sc.nextInt();
    }

    public void operacion (){
        double subtotal = precioProd * cantidad;
        double impuesto;
        if (tipoCliente == 1) {
            impuesto = 0.05;
        }else{
            impuesto = 0.13;
        }
        double valorImpuesto = subtotal * impuesto;
        total = subtotal + valorImpuesto;
    }

    public void resultado (){
        System.out.println("---------FACTURA--------");
        System.out.println("NOMBRE DEL CLIENTE: "+nombreCliente);
        System.out.println("PRODUCTO: "+producto);
        System.out.println("CANTIDAD: "+cantidad);
        System.out.println("TOTAL A PAGAR: "+total);
    }
}
