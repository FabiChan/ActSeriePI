import java.io.*;
import java.util.*;
//clase padre Producto 
class Producto{
   protected int codigoProd;
   protected String nomProd;
   protected double precio;
   protected String descripcion;
   protected int cantidad;
   
   public Producto(int codigoProd, String nomProd, double precio, String descripcion, int cantidad){
      setCodigoProd(codigoProd);
      setNomProd(nomProd);
      setPrecio(precio);
      setDescripcion(descripcion);
      setCantidad(cantidad);
   }
   
   public void setCodigoProd(int codigoProd) {
      this.codigoProd=codigoProd;
   }
   
   public int getCodigoProd() {
      return codigoProd;
   } 
   public void setNomProd(String nomProd) {
      this.nomProd=nomProd;
   }
   
   public String getNomProd() {
      return nomProd;
   }
   
   public void setPrecio(double precio) {
      this.precio=precio;
   }
   
   public double getPrecio() {
      return precio;
   }
   
   public void setDescripcion(String descripcion) {
      this.descripcion=descripcion;
   }
   
   public String getDescripcion() {
      return descripcion;
   }

   public void setCantidad(int cantidad) {
      this.cantidad = cantidad;
   }
   
   public int getCantidad(){
      return cantidad;
   }
   
   public String toString() {
      return nomProd + precio + descripcion + cantidad;
   }
   
}


//clase hija Prodcuto Alimento que hereda de la clase padre Producto
class Alimento extends Producto {   
   private Fecha fechaCadu;
   
   public Alimento(int codigoProd, String nomProd, double precio, String descripcion, int cantidad, Fecha fechaCadu) {
      super(codigoProd, nomProd, precio, descripcion, cantidad);
      setFechaCadu(fechaCadu);
   }
   
   public void setFechaCadu(Fecha fechaCadu) {
      this.fechaCadu=fechaCadu;
   }
   
   public Fecha getFechaCadu(){
      return fechaCadu;
   }
   
   public String toString() {
      return super.toString() + "Fecha de caducidad: " + fechaCadu;
   }
}


//clase hija Prodcuto Ropa que hereda de la clase padre Producto
class Ropa extends Producto{   
   private char talla;
   
   public Ropa(int codigoProd, String nomProd, double precio, String descripcion, int cantidad, char talla) {
      super(codigoProd, nomProd, precio, descripcion, cantidad);
      setTalla(talla);
   }
   
   public void setTalla(char talla) {
      this.talla=talla;
   }
   
   public char getTalla() {
      return talla;
   }
   
   public String toString() {
      return super.toString() + "Talla: " + talla;
   }
}


//clase hija Prodcuto Limpieza que hereda de la clase padre Producto
class Limpieza extends Producto{   
   private String tipo;
   
   public Limpieza(int codigoProd, String nomProd, double precio, String descripcion, int cantidad, String tipo){
      super(codigoProd, nomProd, precio, descripcion, cantidad);
      setTipo(tipo);
   }
   
   public void setTipo(String tipo) {
      this.tipo=tipo;
   }
   
   public String getTipo(){
      return tipo;
   }
   
   public String toString() {
      return super.toString() + "Tipo: " + tipo;
   }
}


//clase Fecha que tiene dia mes y año
class Fecha {

   private int dia;
   private int mes;
   private int anio;

   public Fecha(int dia, int mes, int anio)
   {
      setDia(dia);
      setMes(mes);
      setAnio(anio);
   }

   public void setDia(int dia)
   {
      this.dia=dia;
   }

   public void setMes(int mes)
   {
      this.mes=mes;
   }

   public void setAnio(int anio)
   {
      this.anio=anio;
   }

   public int getDia()
   {
      return dia;
   }

   public int getMes()
   {
      return mes;
   }

   public int getAnio()
   {
      return anio;
   }

   public String toString()
   {
      return dia+"-"+mes+"-"+anio;
   }
}

//clase qu guarda las cuentas del sistema usuario-contraseña
class UsuarioContrasena {
   HashMap<String,String> accounts = new HashMap<String,String>();
   
   //metodo constructor que crea el "diccionario" de usuarios con sus contraseñas
   UsuarioContrasena() {
      accounts.put("Arturo","abc123*");
      accounts.put("Laura","p4t1t0");
      accounts.put("Juan","PASSWORD");
      accounts.put("Maria","qwerty");
   }
   
   protected HashMap getAccounts() {
      return accounts;
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


class Empleado{
    private Nombre nomEmpleado;
    private Fecha cumple;
    public Empleado(Nombre nomEmpleado, Fecha cumple){
        setNomEmpleado(nomEmpleado);
        setCumple(cumple);
    }
    public void setNomEmpleado(Nombre nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }
    public void setCumple(Fecha cumple) {
        this.cumple = cumple;
    }
    public Nombre getNomEmpleado() {
        return nomEmpleado;
    }
    public Fecha getCumple() {
        return cumple;
    }
    public String toString() {

        return "Empleado: "+getNomEmpleado()+" " +getCumple();
    }
}

class Venta{
    private int codigoVenta;
    private Empleado empleado;
    private Producto compras[];
    private double descuento;
    public Venta(int codigoVenta, Empleado empleado, Producto compras[], double descuento){
        setCodigoVenta(codigoVenta);
        setEmpleado(empleado);
        setCompras(compras);
        setDescuento(descuento);
    }
    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public void setCompras(Producto[] compras) {
        this.compras = compras;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public int getCodigoVenta() {
        return codigoVenta;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public Producto[] getCompras() {
        return compras;
    }
    public double getDescuento() {
        return descuento;
    }

    public double calcularTotal(){
        return calcularSubtotal()-calcularDescuento()+calcularIVA();
    }
    public double calcularSubtotal(){
        double subtotal = 0;
      for(int i=0; i<compras.length; i++) 
         subtotal += compras[i].getCantidad() * compras[i].getPrecio();
      return subtotal;

    }
    public double calcularIVA(){
        return (calcularSubtotal()-calcularDescuento())*0.16;
    }
    public double calcularDescuento(){
        double subtotal = calcularSubtotal();
    if (descuento != 0)  
      return subtotal*descuento*0.01;
    return descuento;
    }


    public String toString() {
        //DecimalFormat d= new DecimalFormat("0.00");
        String salida = "\n-------------------------------Venta-------------------------------\n" + "\n";
        for (byte i=0;i<compras.length;i++) {
          salida += "\n"+(Integer.toString(compras[i].getCodigoProd()))+(Integer.toString(compras[i].getCantidad()))+(compras[i].getNomProd())+((compras[i].getPrecio()))+"\n";
         }
        salida += "\n\n                                             Descuento:     "+((calcularDescuento()))+"\n                                             Subtotal:      "+((calcularSubtotal()))+"\n                                             IVA:           "+((calcularIVA()))+"\n                                             Total:         "+ ((calcularTotal())); 
        return salida;             
    }
}

class ReporteDiario{
    private Venta ventasDia;
    public ReporteDiario (Venta ventasDia){
        setVentasDia(ventasDia);
    }
    public void setVentasDia(Venta ventasDia) {
        this.ventasDia = ventasDia;
    }
    public Venta getVentasDia() {
        return ventasDia;
    }
    public int calcularNumVentas(){
        return 0;
    }
    public double calcularTotalIngresos(){
        return 0;
    }

    public String toString() {
        return "Reporte Diario: ";
    }
}



//clase principal del sistema
@SuppressWarnings("unchecked")
class Principal {
   public static void main(String[] args) {
      Principal p = new Principal();
      boolean acceso = p.darAcceso();
      if (acceso) {
         System.out.println("\n'Bienvenido!'");
         Nombre nombre=new Nombre(p.validarString("Ingrese el nombre: "), p.validarString("Ingresa el apellido paterno: "), p.validarString("Ingresar el apellido materno: "));
         Fecha fecha=new Fecha(p.validarInt("Ingresa el dia: "), p.validarInt("Ingresa el mes: "), p.validarInt("Ingresa el año: "));
         Empleado empleado=new Empleado(nombre,fecha); 
         Scanner s=new Scanner (System.in);
         System.out.println("Ingrese cuantos productos desea comprar (max 5)");
         int n = s.nextInt();
         Producto compra[] = new Producto [n];
         for (int i = 0; i<n; i++) {
            compra[i] = new Producto(p.validarInt("Ingresa el código: "), p.validarString("Ingresa el nombre del producto: "), p.validarDouble("Ingresa el precio: "), p.validarString("Ingresa la descripcion: "), p.validarInt("Ingresa la cantidad: "));
         }
         Venta venta=new Venta(p.validarInt("Ingrese el código de venta:"), empleado, compra, p.validarDouble("Ingrese el descuento: "));
         System.out.println(nombre);
         System.out.println(fecha);
         System.out.println(empleado);
         System.out.println(venta);

      }
      else
         System.out.println("\n***Se supero el numero maximo de intentos***");
   }
   
   
   //método login para dar acceso al sistema 
   public boolean darAcceso() {
   Scanner s = new Scanner(System.in);
      //crear las cuentas ya establecidas
      UsuarioContrasena usuarioContrasenas = new UsuarioContrasena();
      //guardar las cuentas en una variable tipo HashMap
      HashMap<String,String> accounts = usuarioContrasenas.getAccounts();
      String userID, password;
      boolean acceso = false;
      //Permitir hasta 3 intentos de acceso. Sino, sale del sistema por seguridad.
      for (int i = 0; i<3; i++) {
         System.out.println("Ingrese el usuario: ");
         userID = s.nextLine();
         System.out.println("\nIngrese la contrasena: ");
         password = s.nextLine();
         //checar si los datos ingresados concuerdan con alguna cuenta registrada
         if (accounts.containsKey(userID)) {
            if (accounts.get(userID).equals(password)){
               acceso = true;
               i = 3;
            }
            else
               System.out.println("\nLa contrasena ingresada es incorrecta!\n");   
         }
         else
            System.out.println("\nUsuario no encontrado\n");
      }
      return acceso;
   }
   public String validarString(String mensaje){
    //Validar la cantidad máxima para que no salga mal en la salida
    Scanner s=new Scanner(System.in);
        System.out.println(mensaje);
        return s.nextLine();
}

    public int validarInt(String mensaje){
        int numEntero=0;
        String numeroS="";
        boolean verdadero=true;
    do{
        Scanner s=new Scanner (System.in);
        System.out.println(mensaje);
        numeroS=s.nextLine();
        try{
            numEntero=Integer.parseInt(numeroS);
        }catch(NumberFormatException e){
            verdadero=false;
            System.out.println("Tiene que ser un número entero");
        }
        }while (verdadero==false);
        return numEntero;
    }

    public double validarDouble(String mensaje){
        double numDouble=0;
        String numeroS="";
        boolean verdadero=true;
    do{
            Scanner s=new Scanner(System.in);
            System.out.println("Ingresa el precio: ");
            numeroS=s.nextLine(); 
            try {  
            numDouble=Double.parseDouble(numeroS); 
            }catch(NumberFormatException e){ 
            verdadero=false;
            System.out.println("Tiene que ser un numero"); 
            } 
        }while(verdadero==false);
        return numDouble;
    }
}



