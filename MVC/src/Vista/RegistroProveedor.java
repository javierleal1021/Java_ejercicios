package Vista;

import java.util.Scanner;

public class RegistroProveedor {
    private String colorBoton;
    private int numBotones;
    private int numLabel;
    private String colorLabel;
    private String colorFormulario;
    private Scanner objTeclado;

    public RegistroProveedor(){
        this.colorBoton = "rojo";
        this.numBotones = 5;
        this.numLabel = 10;
        this.colorLabel = "blanco";
        this.colorFormulario = "amarillo";
    }

    public int mostrarMenu(){
        System.out.println("1. Registrar proveedor");
        System.out.println("2. Ver lista de proveedores");
        System.out.println("3. Volver");
        this.objTeclado = new Scanner(System.in);
        int opcionMenu = objTeclado.nextInt();
        return opcionMenu;
    }

    public String tomarRegistro_proveedor(){
        this.objTeclado = new Scanner(System.in);
        System.out.println("*** Bienvenido al registro de Proveedores ***");
        System.out.println("Digite el nombre del proveedor: ");
        String nombreProveedor = objTeclado.nextLine();
        System.out.println("Digite el apellido del proveedor: ");
        String apellidoProveedor = objTeclado.nextLine();
        System.out.println("Digite el Nro de documento del proveedor: ");
        String documentoProveedor = objTeclado.nextLine();
        return nombreProveedor;
    }
}
