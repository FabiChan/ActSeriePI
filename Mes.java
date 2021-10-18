import java.io.*;
import java.util.*;
import java.text.*;


//clase calendario que contiene arreglo de objetos mes
class Calendario{
   private short anio;
   private Mes[] m;
   
   public Calendario(Mes[] m,short anio){
      setM(m);
	  setAnio(anio);
   }
   
   public void setM(Mes[] m){
      this.m=m;
   }
   public void setAnio(short anio){
	   this.anio=anio;
   }
   public short anio(){
	   return anio;
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
      String salida = "Promedio de temperaturas del año "+anio+"\n\n  Mes            Promedio Temperatura\n";
      String nombreMes;
      for (byte i=0;i<12;i++){
         nombreMes= espacios(m[i].getNombre());
			salida += "\n"+nombreMes+d.format(m[i].getTemperatura());
		}
      salida+="\n";
      return salida;
   }
}
//clase mes
class Mes {
	
	private String nombre;
	private double temperatura;
   
	public Mes(String nombre, double temperatura) {
		setNombre(nombre);
		setTemperatura(temperatura);
	}
	//metodos set y get
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setTemperatura(double temperatura) {
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
		Scanner s=new Scanner (System.in);
		String respuesta="si";
		int anios=0;
		short anio=0;
		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		Mes m[]=new Mes[12];
		do{			
			System.out.println("Ingrese el año: ");
			anio=capturarAnio();
			anios++;
		for (byte i=0;i<12;i++){
			System.out.println("Ingresa la temperatura promedio de "+meses[i]);
			m[i]=new Mes(meses[i],Principal.capturarTemperatura());
		}
			System.out.println("¿Desea agregar otro año?");
			respuesta=s.next();
		}while(respuesta.equalsIgnoreCase("si"));
		
		for (int i=0;i<anios;i++){
			Calendario calendarios=new Calendario(m,anio);
			listaCalendarios.add(calendarios);
		}
      for (byte x=0; x<anios; x++){
		   System.out.println(listaCalendarios.get(x));
      }
	}

	public static double capturarTemperatura(){
		double temperatura=0;
		String numeroS="";
		boolean verdadero=true;
		  do{
			Scanner s=new Scanner(System.in);
		 	numeroS=s.nextLine();
		  //validar que no sea una letra
			try {  
				temperatura=Double.parseDouble(numeroS); 
				if(temperatura>50 || temperatura<-15)
                System.out.println("La temperatura no parece ser real, intenta de nuevo");
				else
				return temperatura;
			  } catch(NumberFormatException e){ 
				verdadero=false;
				System.out.println("Tiene que ser un numero"); 
			  } 
			  }while((temperatura>50 || temperatura<-15)||verdadero==false);
			  return temperatura;
	}
	//metodo para preguntar el año
	public static short capturarAnio(){
		short anio=0;
		String numeroS="";
		boolean verdadero=true;
		  do{
			Scanner s=new Scanner(System.in);
		 	numeroS=s.nextLine();
		  //validar que no sea una letra
			try {  
				anio=Short.parseShort(numeroS); 
				if(anio>2022 || anio<1500)
                System.out.println("El año no parece ser real, intenta de nuevo");
				else
				return anio;
			  } catch(NumberFormatException e){ 
				verdadero=false;
				System.out.println("Tiene que ser un numero"); 
			  } 
			  }while((anio>2022 || anio<1500)||verdadero==false);
			  return anio;
	}
	//crear lista de objetos de Año
	static ArrayList<Calendario> listaCalendarios=new ArrayList<Calendario>();
}
