package Controlador;

import Modelo.Cliente;
import Modelo.Proveedor;
import Vista.RegistroCliente;
import Vista.RegistroProveedor;

public class Controlador {
    private RegistroCliente formularioCliente;
    private Cliente objModelo_Cliente;
    private RegistroProveedor formularioProveedor;
    private Proveedor objModelo_Proveedor;

    public Controlador (Object tipoModulo, Object formulario){
            if (tipoModulo instanceof Cliente && formulario instanceof RegistroCliente) {
                this.objModelo_Cliente = (Cliente) tipoModulo;
                this.formularioCliente = (RegistroCliente) formulario;
            }else if (tipoModulo instanceof Proveedor && formulario instanceof RegistroProveedor) {
                this.objModelo_Proveedor = (Proveedor) tipoModulo;
                this.formularioProveedor = (RegistroProveedor) formulario;
            }else{
                System.out.println("Parametros invalidos");
                return;
            }
    }

    public void iniciarFormularioCliente(){
        int opcion = 0;
        do {
            opcion = this.formularioCliente.mostrarMenu();
            switch (opcion) {
                case 1:
                    String auxNombre = this.formularioCliente.tomarRegistro_cliente();
                    this.objModelo_Cliente.guardarCliente(auxNombre);
                    break;
                case 2:
                    this.objModelo_Cliente.imprimirCliente();
                    break;
                case 3:
                    System.out.println("Volviendo al menu principal....");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 3);
    }

    public void iniciarFormularioProveedor(){
        int opcion = 0;
        do {
            opcion = this.formularioProveedor.mostrarMenu();
            switch (opcion) {
                case 1:
                    String auxNombre = this.formularioProveedor.tomarRegistro_proveedor();
                    this.objModelo_Proveedor.guardarProveedor(auxNombre);
                    break;
                case 2:
                    this.objModelo_Proveedor.imprimirProveedor();
                    break;
                case 3:
                    System.out.println("Volviendo al menu principal");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion !=3);
    }
}
