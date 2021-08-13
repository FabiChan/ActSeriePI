//Equipo alfa buena maravilla onda dinamita escuadrón lobo
//Objetivo del programa: calcular la suma de la serie
import java.io.*;
import java.text.*;
import java.util.*;
class SerieF {
   public static void main(String arg[]) {
      double x = SerieF.pedirX();
      double suma = 0;      
      //Si x = 0, automáticamente la suma de la serie es 1
      if(x!=0) {
         double termino = 1;
         int fact = 1;
         byte n = 1;
         suma = SerieF.sumar(suma,x,termino,fact,n);
      }else
         suma = 1;
      SerieF.imprimir(suma);
   }
//Agregar Método pedirX() - Marifer
   public static double pedirX(){
   Scanner s=new Scanner(System.in);
      System.out.println("Escribe el numero de x: ");
      double x = s.nextDouble();
      x = SerieF.validarX(x);
      return x;
      }
//Agregar Método validarX() - Marifer
    public static double validarX(double x){
      Scanner s=new Scanner(System.in);
      while(x<0.0 || x>1.0){
         System.out.println("Intenta otro numero entre 0 y 1 incluidos: ");
         x = s.nextDouble();}
      return x;
      }
      
//Agregar Método sumar(suma, x, termino, fact, n)
   public static double sumar(double suma, double x, double termino, int fact, byte n) {
      do {  
            suma+=termino;
            fact = SerieF.calcularFactorial(n,fact);
            termino = SerieF.sacarTermino(x,n,fact);
            n++;
      }while(termino > (Math.pow(10,-8)));
      return suma;
   }

   
//Agregar Método calcularFactorial(n,fact) - JP
      public static int calcularFactorial(byte n, int fact){
         return fact*= n;
      }
         
      
//Agregar Método sacarTermino(x,f,fact) - Fátima
   public static double sacarTermino(double x, byte n, int fact){
      return Math.pow(x,n)/fact;
   }   

//Agregar Método imprimir(suma) - Fátima
   public static void imprimir(double suma){
      DecimalFormat d = new DecimalFormat("0.00");
      System.out.println("El resultado de la suma es: "+ d.format(suma));
   }
}
  
