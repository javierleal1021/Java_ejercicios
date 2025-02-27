import java.util.Scanner;

public class Numero {
    private int num1=0;
    private int num2=0;
    private int rango1=0;
    private int rango2=0;

    public Numero(){}

    public void setRango1(Scanner sc){
        this.rango1 = sc.nextInt();
    }
    public void setRango2(Scanner sc){
        this.rango2 = sc.nextInt(); 
    }
    public void setNum1(Scanner sc){
        this.num1 = sc.nextInt();
    }
    public void setNum2(Scanner sc){
        this.num2 = sc.nextInt();
    }
    public int getRango1(){
       return rango1;
    }
    public int getRango2(){
       return rango2; 
    }
    public int getNum1(){
       return num1;
    }
    public int getNum2(){
       return num2;
    }   
}
