public class Juego extends Usuario{

    public Juego(String nombre, String apellido){
        super(nombre,apellido);}

    public void fizzBuzz(){

        for (int i = 1; i <= 100; i++) {

            if (i %3 == 0 && i %5 == 0) {
                System.out.println("FIZZ BUZZ");
            }else if (i %3 == 0) {
                System.out.println("FIZZ");
            }else if (i %5 == 0 ) {
                System.out.println("BUZZ");
            }else{
                System.out.println(i);
            }
            
        }
        System.out.println("FIN DEL JUEGO");
        System.out.println("Gracias por jugar"+super.getNombre()+" "+super.getApellido());
    }
    
}
