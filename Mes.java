import java.io.*;
import java.util.*;
import java.text.*;

//clase mes
class Calendario{
   
   private Mes[] m;
   
   public Calendario(Mes[] m){
      setM(m);
   }
   
   public void setM(Mes[] m){
      this.m=m;
   }
   public Mes[] getMes()
   {
      return m;
   }
   public String espacios(String variable){
      while(variable.length() < 25){
          variable += " ";
      }
      return variable;
  }
   public String toString(){
      DecimalFormat d= new DecimalFormat("0");
      String salida = "Promedio de temperaturas del año 2020"+"\n\n  Mes            Promedio Temperatura\n";
      String nombreMes;
      for (byte i=0;i<12;i++){
         nombreMes= espacios(m[i].getNombre());
			salida += "\n"+nombreMes+d.format(m[i].getTemperatura());
		}
      return salida;
   }
}
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
      Calendario c2020 = new Calendario(m);
      System.out.println(c2020);
	}

	public static byte capturarTemperatura(){
		Scanner s=new Scanner(System.in);
		byte temperatura=s.nextByte();
		return temperatura;
	}
}
