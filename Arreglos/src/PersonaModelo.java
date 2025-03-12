
public class PersonaModelo {
    private String nombrePersona;
    private String apellidoPersona;
    private int edadPersona;

    public PersonaModelo (String datoNombre, String datoApellido, int datoEdad){
        this.nombrePersona = datoNombre;
        this.apellidoPersona = datoApellido;
        this.edadPersona = datoEdad;
    }
    public void imprimirDatos(){
        System.out.println("Nombre es: "+this.nombrePersona);
        System.out.println("Apellido es: "+this.apellidoPersona);
        System.out.println("Edad es: "+this.edadPersona);
    }

    
}



