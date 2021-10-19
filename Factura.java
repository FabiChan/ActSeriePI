import java.io.*;
import java.util.*;
import java.text.*;


class Factura
{
   private int numFactura;
   private Producto producto1;
   private Producto producto2;
   private Producto producto3;
   private double descuento;
   
   public Factura(int numFactura, Producto producto1, Producto producto2, Producto producto3, double descuento)
   {
      setNumFactura(numFactura);
      setProducto1(producto1);
      setProducto2(producto2);
      setProducto3(producto3);
      setDescuento(descuento);
   }

   public void setNumFactura(int numFactura)
   {
      this.numFactura=numFactura;
   }
   public void setProducto1(Producto producto1)
   {
      this.producto1=producto1;
   }
   public void setProducto2(Producto producto2)
   {
      this.producto2=producto2;
   }
   public void setProducto3(Producto producto3)
   {
      this.producto3=producto3;
   }
   public void setDescuento(double descuento)
   {
      this.descuento=descuento;
   }
   
   public int getNumFactura()
   {
      return numFactura;
   }
   
   public Producto getProducto1()
   {
      return producto1;
   }
   public Producto getProducto2()
   {
      return producto2;
   }
   public Producto getProducto3()
   {
      return producto3;
   }
   public double getDescuento()
   {
      return descuento;
   }

   //Calcular subtotal
   public double calcularSubtotal(){
      return producto1.getPrecio()*producto1.getCant()+producto2.getPrecio()*producto2.getCant()+producto3.getPrecio()*producto3.getCant();
   }
      
   //Calcular descuento
   public double calcularDescuento (){
    double subtotal = calcularSubtotal();
    if (descuento != 0)  
      return subtotal*(descuento*0.01);
    return descuento;
   }
   
   //Calcular IVA
   public double calcularIVA(){
    return (calcularSubtotal()-calcularDescuento())*0.16;
   }
   
   //Calcular total
   public double calcularTotal(){
    return calcularSubtotal()-calcularDescuento()+calcularIVA();
   }

  public String espacios(String variable){
      while(variable.length() < 20){
          variable += " ";
      }
      return variable;
  }

  public String espacios2(String variable){
      variable="$"+variable;
      while(variable.length() < 10){
          variable = " "+variable;
      }
      return variable;
  }
   
   public String toString(){
      DecimalFormat d= new DecimalFormat("0.00");
       return "\n-------------------------------Detalle de Factura-------------------------------\n" + "Clave               Cantidad            Nombre              Precio              \n"+espacios(Integer.toString(producto1.getClave()))+espacios(Integer.toString(producto1.getCant()))+espacios(producto1.getNombreProducto())+espacios2(d.format(producto1.getPrecio()))+"\n"+espacios(Integer.toString(producto2.getClave()))+espacios(Integer.toString(producto2.getCant()))+espacios(producto2.getNombreProducto())+espacios2(d.format(producto2.getPrecio()))+"\n"+espacios(Integer.toString(producto3.getClave()))+espacios(Integer.toString(producto3.getCant()))+espacios(producto3.getNombreProducto())+espacios2(d.format(producto3.getPrecio()))+
       "\n\n                                             Descuento:     "+espacios2(d.format(calcularDescuento()))+"\n                                             Subtotal:      "+espacios2(d.format(calcularSubtotal()))+"\n                                             IVA:           "+espacios2(d.format(calcularIVA()))+"\n                                             Total:         "+ espacios2(d.format(calcularTotal()));       
   }
}

class Cliente
{
   private Nombre nombre;
   private Direccion direccion;
   private String rfc;

   public Cliente(Nombre nombre, Direccion direccion, String rfc)
   {
      setNombre(nombre);
      setDireccion(direccion);
      setRfc(rfc);
   }

   public void setNombre(Nombre nombre)
   {
   this.nombre=nombre;
   }
   public void setDireccion(Direccion direccion)
   {
   this.direccion=direccion;
   }
  
   public void setRfc(String rfc)
   {
   this.rfc=rfc;
   }

   public Nombre getNombre()
   {
      return nombre;
   }
   public Direccion getDireccion()
   {
      return direccion;
   }
   public String getRfc()
   {
      return rfc;
   }
   
   public String toString(){
       return "\n----------------------------Informacion  del Cliente----------------------------\n" + "Nombre: "+getNombre() + "\nRFC: "+getRfc()+"\nDireccion: "+getDireccion();
       }
}

class Nombre
{
   private String primerNombre;
   private String apellido1;
   private String apellido2;

   public Nombre(String primerNombre, String apellido1, String apellido2)
   {
      setPrimerNombre(primerNombre);
      setApellido1(apellido1);
      setApellido2(apellido2);
   }

   public void setPrimerNombre(String primerNombre)
   {
      this.primerNombre=primerNombre;
   }

   public void setApellido1(String apellido1)
   {
      this.apellido1=apellido1;
   }

   public void setApellido2(String apellido2)
   {
      this.apellido2=apellido2;
   }

   public String getPrimerNombre()
   {
      return primerNombre;
   }

   public String getApellido1()
   {
      return apellido1;
   }

   public String getApellido2()
   {
      return apellido2;
   }

   public String toString()
   {
      return primerNombre+" "+apellido1+" "+apellido2;
   }
}

class Direccion
{
   private String calle;
   private String numero;
   private String colonia;
   private String municipio;
   private int cp;

   public Direccion(String calle, String numero, String colonia, String municipio, int cp)
   {
      setCalle(calle);
      setNumero(numero);
      setColonia(colonia);
      setMunicipio(municipio);
      setCp(cp);
   }

   public void setCalle(String calle)
   {
      this.calle=calle;
   }

   public void setNumero(String numero)
   {
      this.numero=numero;
   }

   public void setColonia(String colonia)
   {
      this.colonia=colonia;
   }

   public void setMunicipio(String municipio)
   {
      this.municipio=municipio;
   }

   public void setCp(int cp)
   {
      this.cp=cp;
   }

   public String getCalle()
   {
      return calle;
   }

   public String getNumero()
   {
      return numero;
   }

   public String getColonia()
   {
      return colonia;
   }

   public String getMunicipio()
   {
      return municipio;
   }

   public int getCp()
   {
      return cp;
   }

   public String toString()
   {
      return calle+", "+numero+", "+colonia+", "+municipio+", "+cp;
   }
}

class Producto
{
   private int clave;
   private String nombreProducto;
   private int cant;
   private double precio;
   
   public Producto(int clave, String nombreProducto, int cant, double precio)
   {
      setClave(clave);
      setNombreProducto(nombreProducto);
      setCant(cant);
      setPrecio(precio);
   }

   public void setClave(int clave)
   {
      this.clave=clave;
   }

   public void setNombreProducto(String nombreProducto)
   {
      this.nombreProducto=nombreProducto;
   }

   public void setCant(int cant)
   {
      this.cant=cant;
   }

   public void setPrecio(double precio)
   {
      this.precio=precio;
   }

   public int getClave()
   {
      return clave;
   }

   public String getNombreProducto()
   {
      return nombreProducto;
   }

   public int getCant()
   {
      return cant;
   }

   public double getPrecio()
   {
      return precio;
   }
   
}

class Empresa{
    private Direccion direccion;
    private String nombreEmpresa;
 
    public Empresa(Direccion direccion, String nombreEmpresa)
    {
       setDireccion(direccion);
       setNombreEmpresa(nombreEmpresa);
    }
 
    public void setDireccion(Direccion direccion)
    {
       this.direccion=direccion;
    }
 
    public void setNombreEmpresa(String nombreEmpresa)
    {
       this.nombreEmpresa=nombreEmpresa;
    }

    public Direccion getDireccion()
    {
       return direccion;
    }
 
    public String getNombreEmpresa()
    {
       return nombreEmpresa;
    }
    
    public String toString(){
       return "\n---------------------------Informacion de  la Empresa---------------------------\n" + "Nombre: "+getNombreEmpresa() + "\nDireccion: "+getDireccion();
       }
 
}
class Principal{
    public static void main(String args[]){
        //Crear objeto de nombre
        System.out.println("\t\t\t ----- Datos del cliente -----");
        Nombre nombre1=new Nombre(Principal.capturar("Ingrese el nombre del cliente"), Principal.capturar("Ingrese el apellido paterno"), Principal.capturar("Ingrese el apellido materno"));
        //Crear objeto DireccionCliente
        Direccion direccionCliente=new Direccion(Principal.capturar("Ingrese la calle"), Principal.capturar("Ingrese el numero de su domicilio"), Principal.capturar("Ingrese la colonia"), Principal.capturar("Ingrese el municipio"), Principal.pedirNum("Ingrese el codigo postal"));
        //Crear objeto cliente
        Cliente cliente1=new Cliente(nombre1, direccionCliente, Principal.capturar("Ingrese el RFC"));
        //Crear objeto Empresa
        System.out.println("\n\t\t\t ----- Datos de la empresa -----");
        Direccion direccionEmpresa=new Direccion(Principal.capturar("Ingrese la calle"), Principal.capturar("Ingrese el numero"), Principal.capturar("Ingrese la colonia"), Principal.capturar("Ingrese el municipio"), Principal.pedirNum("Ingrese el codigo postal"));
        Empresa empresa1=new Empresa(direccionEmpresa, Principal.capturar("Ingrese el nombre de la empresa"));
        //Crear objeto Producto
        System.out.println("\n\t\t\t ----- Datos del producto -----");
        Producto producto1=new Producto(Principal.pedirClave(), Principal.capturar("Ingrese el nombre del producto"), Principal.pedirCant(), Double.parseDouble(Principal.capturar("Ingrese el precio del producto")));
        Producto producto2=new Producto(Principal.pedirClave(), Principal.capturar("Ingrese el nombre del producto"), Principal.pedirCant(), Double.parseDouble(Principal.capturar("Ingrese el precio del producto")));
        Producto producto3=new Producto(Principal.pedirClave(), Principal.capturar("Ingrese el nombre del producto"), Principal.pedirCant(), Double.parseDouble(Principal.capturar("Ingrese el precio del producto")));
        //Crear objeto Factura
        System.out.println("\n\t\t\t ----- Datos de la factura -----");
        Factura factura1=new Factura(Integer.parseInt(Principal.capturar("Ingrese el numero de factura")),producto1,producto2,producto3, Double.parseDouble(Principal.capturar("Ingrese el descuento en porcentaje. Si no tiene ingrese 0.")));
        System.out.println("                                  Factura #"+factura1.getNumFactura());
        System.out.println(empresa1);
        System.out.println(cliente1);
        System.out.println(factura1);
        

    }
    public static String capturar(String mensaje){
        Scanner s=new Scanner(System.in);
        System.out.println(mensaje);
        return s.nextLine();
    }
    public static int pedirNum(String mensaje){
    int numEntero=0;
    String numeroS="";
    boolean verdadero=true;
      do{
        Scanner s=new Scanner(System.in);
            System.out.println(mensaje);
            numeroS=s.nextLine(); 
        try {  
            numEntero=Integer.parseInt(numeroS); 
            if(numeroS.length()!=5)
            System.out.println("Tiene que ser un numero entero de 5 digitos");
            else
            return numEntero;
          } catch(NumberFormatException e){ 
            verdadero=false;
            System.out.println("Tiene que ser un numero entero"); 
          } 
          }while(numeroS.length()!=5||verdadero==false);
          return numEntero;
    }
    public static int pedirClave(){
    int numEntero=0;
    String numeroS="";
    boolean verdadero=true;
      do{
        Scanner s=new Scanner(System.in);
            System.out.println("Ingresa la clave del producto: ");
            numeroS=s.nextLine(); 
        try {  
            numEntero=Integer.parseInt(numeroS); 
            if(numeroS.length()!=6)
            System.out.println("Tiene que ser un numero entero de 6 digitos");
            else
            return numEntero;
          } catch(NumberFormatException e){ 
            verdadero=false;
            System.out.println("Tiene que ser un numero entero"); 
          } 
          }while(numeroS.length()!=6||verdadero==false);
          return numEntero;
    }
  public static int pedirCant(){
    int numEntero=0;
    String numeroS="";
    boolean verdadero=true;
      do{
        Scanner s=new Scanner(System.in);
            System.out.println("Ingresa la cantidad: ");
            numeroS=s.nextLine(); 
        try {  
            numEntero=Integer.parseInt(numeroS); 
            return numEntero;
          } catch(NumberFormatException e){ 
            verdadero=false;
            System.out.println("Tiene que ser un numero entero"); 
          } 
          }while(verdadero==false);
          return numEntero;
    }
    public static double pedirPrecio(){
    double numDouble=0;
    String numeroS="";
    boolean verdadero=true;
      do{
        Scanner s=new Scanner(System.in);
            System.out.println("Ingresa el precio: ");
            numeroS=s.nextLine(); 
        try {  
            numDouble=Double.parseDouble(numeroS); 
            return numDouble;
          } catch(NumberFormatException e){ 
            verdadero=false;
            System.out.println("Tiene que ser un numero"); 
          } 
          }while(verdadero==false);
          return numDouble;
    }


}
