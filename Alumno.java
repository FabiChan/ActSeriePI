//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Alumno.java
//  @ Date : 9/3/2021
//  @ Author : 
//
//

import java.util.*;
import java.text.*;


public class Alumno {
	private int matricula;
	private int cantCreditos;
	public void Alumno() {
	
	}
	//Creando sets y gets 
	public void setMatricula(double matricula){
      	this.matricula=matricula;
      }
    	public double getMatricula(){
      	return matricula;
      }
        public void setCantCreditos(double cantCreditos){
        this.cantCreditos=cantCreditos;
      }
        public double getCantCreditos(){
        return cantCreditos;
      }
      

	public String toString() {
		DecimalFormat d = new DecimalFormat("0.00");
		return "El costo de la colegiatura es de $"+d.format(calcularColegiatura());
	}
	
	public double calcularColegiatura() {
	
	}
}
class Principal{
      public static void main(String arg[]){
         Scanner s = new Scanner(System.in);
         System.out.println("Escriba su matricula");
         int matricula = s.nextInt();
         System.out.println("Escriba la cantidad de creditos que cursara");
         int cantCreditos = s.nextInt();
         Alumno A1 = new Alumno(matricula, cantCreditos);
         System.out.println(A1);
}
