import java.util.ArrayList;
import java.util.List;

public class App {

    private static PersonaModelo[] listaNombre_clientes;
    public static List<String> listaCliente = new ArrayList<>();

    public static void main(String[] args) {
        //App.crearArreglo_estatico();
        //App.imprimirArreglo();
        App.crearArray_dinamico();
        App.datosArrayDinamico();
    }

    public static void crearArray_dinamico(){
        App.listaCliente.add("Nelson");
        App.listaCliente.add("Pedro");
        App.listaCliente.add("Maria");
        App.listaCliente.add("Juan");
    }

    public static void datosArrayDinamico(){
        for (int i = 0; i < listaCliente.size(); i++) {
            String aux = listaCliente.get(i);
            System.out.println(aux);
        }
    }

    public static void crearArreglo_estatico(){
        App.listaNombre_clientes = new PersonaModelo[3];
        PersonaModelo objPersona = new PersonaModelo("CARLOS", "RODDRIGUEZ", 50);
        App.listaNombre_clientes[0]= objPersona;
        App.listaNombre_clientes[1]= new PersonaModelo("ANDREA", "LEAL", 35);
        App.listaNombre_clientes[2]= new PersonaModelo("FELIPE", "CONTRERAS", 25);
        System.out.println("SE CREO EL ARRAY EXITOSAMENTE");
    }
    public static void imprimirArreglo (){
        for (int i = 0; i < listaNombre_clientes.length; i++) {
            PersonaModelo auxPersona = App.listaNombre_clientes[i];
            if (auxPersona != null) {
                System.out.println((i+1)+". Persona.----------------");
                auxPersona.imprimirDatos();
            }else{
                System.out.println("No existen personas.....");
            }
        }
    }
}
