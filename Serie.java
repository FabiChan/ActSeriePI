//Equipo alfa buena maravilla onda dinamita escuadrón lobo
//Objetivo del programa: calcular la suma de la serie
import java.io.*;
import java.util.*;
import java.text.*;
class Serie {
   public static void main(String arg[]) {
      double x = Serie.pedirX();
      //Si x = 0, automáticamente la suma de la serie es 1
      if(x!=0) {
         double suma = 0;
         double termino = 1, fact = 1;
         byte n = 1;
         do {
            suma+=termino;
            fact = Serie.calcularFactorial(n,fact);
            termino = Serie.sacarTermino(x,n,fact);
            n++;
         }while(termino > (Math.pow(10,-8)));
      else
         byte suma = 1;
      Serie.imprimir(suma);
   }
//Agregar Método pedirX() - Marifer
   
//Agregar Método validarX() - Marifer
      
//Agregar Método calcularFactorial(n,fact) - JP
      
//Agregar Método sacarTermino(x,f,fact) - Fátima
      
//Agregar Método imprimir(suma) - JP
}
  
  
