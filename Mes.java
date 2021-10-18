import java.io.*;
import java.util.*;
import java.text.*;

//clase mes
class Mes {
	
	private String nombre;
	private byte temperatura;
   
	public Mes(String nombre, byte temperatura) {
		setNombre(nombre);
		setTemperatura(temperatura);
	}
	//metodos set y get
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setTemperatura(byte temperatura) {
		this.temperatura=temperatura;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	public String toString(){
		return " "+getTemperatura();
	}
}
//clase principal
class Principal{
	public static void main (String agrs []){
		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		Mes m[]=new Mes[12];
		for (byte i=0;i<12;i++){
         System.out.println("Ingresa la temperatura promedio de "+meses[i]);
			m[i]=new Mes(meses[i],Principal.capturarTemperatura());
		}
      System.out.println("Promedio de temperaturas del año 2020"+"\n\n  Mes            Promedio Temperatura\n");
		String nombreMes;
      for (byte i=0;i<12;i++){
         nombreMes= Principal.espacios(m[i].getNombre());
			System.out.println(nombreMes+m[i].getTemperatura());
		}
	}

	public static byte capturarTemperatura(){
		Scanner s=new Scanner(System.in);
		byte temperatura=s.nextByte();
		return temperatura;
	}
   public static String espacios(String variable){
      while(variable.length() < 25){
          variable += " ";
      }
      return variable;
  }
}
