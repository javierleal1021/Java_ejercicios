package Vista;

import java.util.Scanner;
import Controlador.Controlador;
import Modelo.Cliente;
import Modelo.Proveedor;

public class MenuModulos {
    private Cliente menuCliente;
    private RegistroCliente menuRegistroCliente;
    private Proveedor menuProveedor;
    private RegistroProveedor menRegistroProveedor;
    private Controlador menuControlador;

    public MenuModulos(){
        this.menuCliente = new Cliente();
        this.menRegistroProveedor = new RegistroProveedor();
        this.menuProveedor = new Proveedor();
        this.menRegistroProveedor = new RegistroProveedor();
    }
    public void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        boolean retornar = true;

        while (retornar) {
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("A que modulo deseas entrar?");
        System.out.println("1. MODULO CLIENTES");
        System.out.println("2. MODULO PROVEEDORES");
        System.out.println("3. Salir del sistema");
        int opcion = sc.nextInt();
        System.out.println();
        sc.nextLine();

        switch (opcion) {
            case 1:
                this.menuControlador = new Controlador(new Cliente(), new RegistroCliente());
                this.menuControlador.iniciarFormularioCliente();
                break;
            case 2:
                this.menuControlador = new Controlador(new Proveedor(), new RegistroProveedor());
                this.menuControlador.iniciarFormularioProveedor();
                break;
            case 3:
                System.out.println("Saliendo del sistema....");
                retornar = false;
                break;
            default:
                System.out.println("Opcion no valida");
        }
        }
    } 
}