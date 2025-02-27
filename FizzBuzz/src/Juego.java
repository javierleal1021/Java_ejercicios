public class Juego extends Usuario{
    private Numero numero;

    public Juego(String nombre, Numero numero){
        super(nombre);
        this.numero = numero;
    }

    public void fizzBuzz(){

        for (int i = numero.getRango1(); i <= numero.getRango2(); i++) {

            if (i %numero.getNum1() == 0 && i %numero.getNum2() == 0) {
                System.out.println("FIZZ BUZZ");
            }else if (i %numero.getNum1() == 0) {
                System.out.println("FIZZ");
            }else if (i %numero.getNum2() == 0 ) {
                System.out.println("BUZZ");
            }else{
                System.out.println(i);
            }
            
        }
        System.out.println(super.getNombre()+" Gracias por jugar");
    }
}
