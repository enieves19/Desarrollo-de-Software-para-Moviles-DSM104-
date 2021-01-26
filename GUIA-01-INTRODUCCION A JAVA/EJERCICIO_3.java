import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int pares = 0;
    int impares = 0;
    int x = 1;
    int n;
    int valor ;
    System.out.print("Cuantos numeros ingresara: ");
    n= teclado.nextInt();
    while(x<=n){
      System.out.print("Ingrese un valor entero: ");
      valor = teclado.nextInt();
      if(valor%2==0){
        pares = pares +1 ;
      } else {
        impares = impares +1 ;
      }
      x=x+1;
    }
    System.out.println(" Cantidad de pares "+pares);
     System.out.println(" Cantidad de impares "+impares);
  }
}