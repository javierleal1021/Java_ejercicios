package Modelo;

public class Cliente {
    private String nombreCliente;
    private String[] listaClientes;
    private int contador;

    public Cliente(){
        this.nombreCliente = " ";
        this.contador = 0;
        this.listaClientes = new String[3];
    }

    public String getNombreCliente(){
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    public String[] getListaCliente(){
        return listaClientes;
    }
    public void guardarCliente(String datoNombre){
        if (this.contador < this.listaClientes.length) {
            this.listaClientes[this.contador] = datoNombre; 
            this.contador ++;
            System.out.println("Informacion guardada");          
        }
    }
    public void imprimirCliente(){
        for (int i = 0; i < this.listaClientes.length; i++) {
            System.out.println("XXXX; "+this.listaClientes[i]);
        }
    }
}
