import java.util.*;

class Ejercicio1 {
    public static void main (String[] args){
        
        Scanner lector = new Scanner(System.in);
        int a,b;
        System.out.println("Ingrese un numero:");
        a=lector.nextInt();
        System.out.println("Ingrese un numero:");
        b=lector.nextInt();
         if(a%b == 0){
            System.out.println(b+ " Es divisor de " +a);
        }else{
            System.out.println(b+ " No es divisor de "+ a);
        }
    }
}