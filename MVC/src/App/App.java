package App;

import java.rmi.registry.Registry;
import java.util.ResourceBundle.Control;

import Controlador.Controlador;
import Modelo.Cliente;
import Vista.MenuModulos;
import Vista.RegistroCliente;

public class App {
    public static void main(String[] args) {
        //Cliente objCliente = new Cliente();
        //RegistroCliente objFormulario = new RegistroCliente();
        //Controlador objControlador = new Controlador(objCliente, objFormulario);
        //objControlador.iniciarFormularioCliente();
        MenuModulos objMenuModulos = new MenuModulos();
        objMenuModulos.menuPrincipal();
    }
}
