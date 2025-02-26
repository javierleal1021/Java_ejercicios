
public class Persona {
    private String nombre;
    private int documento;

    public Persona (String datoNombre, int datoDocumento){
        this.nombre = datoNombre;
        this.documento = datoDocumento;
    }

    public String getNombre (){
        return nombre;
    }
    
    public int getDocumento (){
        return documento;
    }

    public void imprimirDatos (){
        System.out.println("El nombre ingresado es: "+nombre);
        System.out.println("El documento ingresado es: "+documento);
    }
}
