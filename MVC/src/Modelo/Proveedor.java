package Modelo;

public class Proveedor {
    private String nombreProveedor;
    private String[] listaProveedor;
    private int contador;

    public Proveedor(){
        this.nombreProveedor = " ";
        this.contador = 0;
        this.listaProveedor = new String[3];
    }

    public String getNombreProveedor(){
        return nombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor){
        this.nombreProveedor = nombreProveedor;
    }
    public String[] getListaProveedor(){
        return listaProveedor;
    }
    public void guardarProveedor(String datoNombre){
        if (this.contador < this.listaProveedor.length) {
            this.listaProveedor[this.contador] = datoNombre; 
            this.contador ++;
            System.out.println("Informacion guardada");          
        }
    }
    public void imprimirProveedor(){
        for (int i = 0; i < this.listaProveedor.length; i++) {
            System.out.println("XXXX; "+this.listaProveedor[i]);
        }
    }
}
