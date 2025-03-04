public class Calculadora {
    private int opcion;
    private double num1;
    private double num2;
    Usuario usuario;

    public Calculadora(int opcion, double  num1, double num2, Usuario usuario){
        this.opcion = opcion;
        this.num1 = num1;
        this.num2 = num2;
        this.usuario = usuario;
    }
    public double sumar(){
        return num1 + num2;
    }
    public double restar(){
        return num1 - num2;
    }
    public double multiplicar(){
        return num1 * num2;
    }
    public double dividir(){
        if (num2 == 0) {
            System.out.println("No se puede dividir por 0");
            return Double.NaN;
        }
        return num1 / num2;
    }
    
    public void operaciones(){

        switch (opcion) {
            case 1:
                System.out.println("Estimado "+usuario.getNombre()+" El resultado es: "+sumar());
                break;
            case 2:
                System.out.println("Estimado "+usuario.getNombre()+" El resultado es: "+restar());
                break;
            case 3:
                System.out.println("Estimado "+usuario.getNombre()+" El resultado es: "+multiplicar());
                break;
            case 4:
                System.out.println("Estimado "+usuario.getNombre()+" El resultado es: "+dividir());
                break;
            
        }
    }
}
