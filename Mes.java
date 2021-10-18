import java.io.*;
import java.util.*;
import java.text.*;


//clase calendario que contiene arreglo de objetos mes
class Calendario{
   private short anio;
   private Mes[] m;
   
   //Método constructor de la clase Calendario	
   public Calendario(Mes[] m,short anio){
      setM(m);
	  setAnio(anio);
   }
   
   //Método para asignar los meses al arreglo para cada año	
   public void setM(Mes[] m){
      this.m=m;
   }
	
   //Método para asignar el valor del año al que se quiera reportar el promedio de las temperaturas	
   public void setAnio(short anio){
	   this.anio=anio;
   }
	
   //Método get para obtener el valor del año 	
   public short anio(){
	   return anio;
   }
	
   //Método para obtener el arreglo de valores de meses del año	
   public Mes[] getMes()
   {
      return m;
   }
	
   //Método para generar los espacios para dar formato de salida en la tabla	
   public String espacios(String variable){
      while(variable.length() < 25){
          variable += " ";
      }
      return variable;
  }
	
   //Método para imprimir un objeto de Calendario	
   public String toString(){
      DecimalFormat d= new DecimalFormat("0");
      String salida = "Promedio de temperaturas del año "+anio+"\n\n  Mes            Promedio Temperatura en °C\n";
      String nombreMes;
      //Ciclo para imprimir cada objeto Mes del arreglo m	   
      for (byte i=0;i<12;i++){
		salida += "\n"+espacios(m[i].getNombre())+d.format(m[i].getTemperatura());
	}
      return salida+="\n";
   }
}
//clase mes
class Mes {
	
	private String nombre;
	private double temperatura;
   	
	//Método constructor para un objeto de la clase Mes
	public Mes(String nombre, double temperatura) {
		setNombre(nombre);
		setTemperatura(temperatura);
	}
	//metodos set para asignar el nombre del mes
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	//método para asignar el valor de la temperatura de un mes
	public void setTemperatura(double temperatura) {
		this.temperatura=temperatura;
	}
	//método get para obtener el valor del nombre del mes
	public String getNombre() {
		return nombre;
	}
	//método get para obtener el valor del promedio de la temperatura en el mes
	public double getTemperatura() {
		return temperatura;
	}
	//método toString para imprimir el objeto de la clase Mes
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
		//arreglo que contiene los meses
		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		//inicializar arreglo de objetos de meses
		Mes m[]=new Mes[12];
		//ciclo para agregar más años
		do{			
			System.out.println("Ingrese el año: ");
			anio=capturarAnio();
			anios++;
		//ciclo para llenar arreglo con temperatura
		for (byte i=0;i<12;i++){
			System.out.println("Ingresa la temperatura promedio de "+meses[i]);
			//creando objetos de mes
			m[i]=new Mes(meses[i],Principal.capturarTemperatura());
		}
			System.out.println("¿Desea agregar otro año?");
			respuesta=s.next();
		}while(respuesta.equalsIgnoreCase("si"));
		//crear arreglo de objetos de los años
		for (int i=0;i<anios;i++){
			Calendario calendarios=new Calendario(m,anio);
			listaCalendarios.add(calendarios);
		}
	//imprimir arreglo de objetos de año
      for (byte x=0; x<anios; x++){
		   System.out.println(listaCalendarios.get(x));
      }
	}
	//método para preguntar y validar temperatura
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
