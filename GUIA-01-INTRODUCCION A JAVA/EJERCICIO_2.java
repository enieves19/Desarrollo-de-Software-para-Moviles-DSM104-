import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int altas , bajas , x , nota;
    altas = 0;
    bajas = 0;
    x=1;
    while(x<=10){
      System.out.println("Ingrese Nota: ");
      nota=teclado.nextInt();
      if(nota>=7){
        altas = altas + 1 ;
      
      } else {
        bajas = bajas +1 ;
      }
      x=x+1;
    }
    System.out.println(" Cantidad de alumnos con mayores notas "+altas);
     System.out.println(" Cantidad de alumnos con menores notas "+bajas);
  }
}