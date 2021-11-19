import java.io.*;
import java.util.*;
import java.text.*;

//clase padre Producto 
public class Producto{
   protected int codigoProd;
   protected String nomProd;
   protected double precio;
   protected String categoria;
   protected int cantidad;
   
   public Producto(int codigoProd, String nomProd, double precio, String categoria, int cantidad){
      setCodigoProd(codigoProd);
      setNomProd(nomProd);
      setPrecio(precio);
      setCategoria(categoria);
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
   
   public void setCategoria(String categoria) {
      this.categoria=categoria;
   }
   
   public String getCategoria() {
      return categoria;
   }

   public void setCantidad(int cantidad) {
      this.cantidad = cantidad;
   }
   
   public int getCantidad(){
      return cantidad;
   }
   
   //@Override
   //public String toString() {
      //return "Codigo: "+codigoProd+"\nNombre: "+nomProd+"\nPrecio: $"+precio+"\nCategoria: "+categoria+"\nCantidad: "+ cantidad;
   //}
   
}


//clase hija Prodcuto Alimento que hereda de la clase padre Producto
class Alimento extends Producto {   
   private Fecha fechaCadu;
   
   public Alimento(int codigoProd, String nomProd, double precio, String categoria, int cantidad, Fecha fechaCadu) {
      super(codigoProd, nomProd, precio, categoria, cantidad);
      setFechaCadu(fechaCadu);
   }
   
   public void setFechaCadu(Fecha fechaCadu) {
      this.fechaCadu=fechaCadu;
   }
   
   public Fecha getFechaCadu(){
      return fechaCadu;
   }
   
   //@Override
   //public String toString() {       
      //return super.toString() + "\nFecha de caducidad: "+fechaCadu;
   //}
}


//clase hija Prodcuto Ropa que hereda de la clase padre Producto
class Ropa extends Producto{   
   private char talla;
   
   public Ropa(int codigoProd, String nomProd, double precio, String categoria, int cantidad, char talla) {
      super(codigoProd, nomProd, precio, categoria, cantidad);
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
   
   public Limpieza(int codigoProd, String nomProd, double precio, String categoria, int cantidad, String tipo){
      super(codigoProd, nomProd, precio, categoria, cantidad);
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


//Clase Nombre que genera el nombre
class Nombre {
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


//Clase Empleado que guarda sus datos
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


//Clase para crear ventas
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


//Clase que imprime arreglo/lista de ventas realizadas durante el día
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

//Clase que imprime el inventario de la tienda
class Inventario{
    private ArrayList<Alimento> productosA;
    private ArrayList<Ropa> productosR;
    private ArrayList<Limpieza> productosL;
    public Inventario (ArrayList<Alimento> productosA, ArrayList<Ropa> productosR, ArrayList<Limpieza> productosL){
        setProductosA(productosA);
        setProductosR(productosR);
        setProductosL(productosL);
    }
    public void setProductosA(ArrayList<Alimento> productosA) {
        this.productosA = productosA;
    }
    public ArrayList<Alimento> getProductosA() {
        return productosA;
    }
    public void setProductosR(ArrayList<Ropa> productosR) {
        this.productosR = productosR;
    }
    public ArrayList<Ropa> getProductosR() {
        return productosR;
    }
    public void setProductosL(ArrayList<Limpieza> productosL) {
        this.productosL = productosL;
    }
    public ArrayList<Limpieza> getProductosL() {
        return productosL;
    }  
     
    //Método para generar los espacios de formato
    public String generarEspacios(String variable){
       while(variable.length() < 22){
         variable += " ";
       }
       return variable;
    }
   
   //método para imprimir el inventario
   public String toString() {
      DecimalFormat d= new DecimalFormat("0.00");
      String salida = "\n\n***************INVENTARIO***************\n\n\n\n------Productos Alimentos------\nCodigo                Nombre                Precio                Categoria             Cantidad              Fecha Caducidad              \n\n";
      for(Alimento alimento: productosA)
         salida += generarEspacios(String.valueOf(alimento.getCodigoProd()))+generarEspacios(alimento.getNomProd())+generarEspacios("$"+String.valueOf(d.format(alimento.getPrecio())))+generarEspacios(alimento.getCategoria())+generarEspacios(String.valueOf(alimento.getCantidad()))+generarEspacios((alimento.getFechaCadu()).toString())+"\n";
      salida += "\n\n------Productos Ropa------\nCodigo                Nombre                Precio                Categoria             Cantidad              Talla              \n\n";
      for(Ropa ropa: productosR)
         salida += generarEspacios(String.valueOf(ropa.getCodigoProd()))+generarEspacios(ropa.getNomProd())+generarEspacios("$"+String.valueOf(d.format(ropa.getPrecio())))+generarEspacios(ropa.getCategoria())+generarEspacios(String.valueOf(ropa.getCantidad()))+generarEspacios(String.valueOf(ropa.getTalla()))+"\n";
      salida += "\n\n------Productos Limpieza------\nCodigo                Nombre                Precio                Categoria             Cantidad              Tipo              \n\n";
      for(Limpieza limpieza: productosL)
         salida += generarEspacios(String.valueOf(limpieza.getCodigoProd()))+generarEspacios(limpieza.getNomProd())+generarEspacios("$"+String.valueOf(d.format(limpieza.getPrecio())))+generarEspacios(limpieza.getCategoria())+generarEspacios(String.valueOf(limpieza.getCantidad()))+generarEspacios(limpieza.getTipo())+"\n";

   return salida;
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


//clase principal del sistema
@SuppressWarnings("unchecked")
class Principal {
   public static void main(String[] args) {
      Principal p = new Principal();
      boolean acceso = p.darAcceso();
      if (acceso) {
         System.out.println("\n\t\t\t\t'Bienvenido!'");
         System.out.println("-----------------------------------");
         byte respuestaMenu=p.crearMenu();
         switch(respuestaMenu){
            case 1: System.out.println("hola");//Hacer venta
            break;
            case 2: System.out.println("holaa");//Consultar inventario
            break;
            case 3: System.out.println("Holaaa");//Generar reporte de venta
            break;
         }
         try {
            File f = new File("c:lista-productos.txt");
            FileInputStream f2 = new FileInputStream(f);
            InputStreamReader f3 = new InputStreamReader(f2);
            BufferedReader f4 = new BufferedReader(f3);
            ArrayList<Alimento> productosAlimento = new ArrayList<>();
            ArrayList<Ropa> productosRopa = new ArrayList<>();
            ArrayList<Limpieza> productosLimpieza = new ArrayList<>();
            String producto, infoProducto [];
            producto = f4.readLine();
         while(producto!=null) {
            infoProducto = producto.split("\\,");            
            if (infoProducto[3].equals("alimento")) {
               Alimento a = new Alimento(Integer.parseInt(infoProducto[0]),infoProducto[1],Double.parseDouble(infoProducto[2]),infoProducto[3],Integer.parseInt(infoProducto[4]),p.capturarFecha(infoProducto[5]));
               productosAlimento.add(a);
            }
            else
               if (infoProducto[3].equals("ropa")) {
                  Ropa r = new Ropa(Integer.parseInt(infoProducto[0]),infoProducto[1],Double.parseDouble(infoProducto[2]),infoProducto[3],Integer.parseInt(infoProducto[4]),(infoProducto[5]).charAt(0));
                  productosRopa.add(r);
               }
               else {
                  Limpieza l = new Limpieza(Integer.parseInt(infoProducto[0]),infoProducto[1],Double.parseDouble(infoProducto[2]),infoProducto[3],Integer.parseInt(infoProducto[4]),infoProducto[5]);
                  productosLimpieza.add(l);
               }
            producto = f4.readLine();   
         }
         Inventario i = new Inventario(productosAlimento,productosRopa,productosLimpieza);
         System.out.println(i);
         f4.close();
      }
         catch(IOException e) {
            System.out.println("Error en en la lectura del archivo");
         }
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
   
   //metodo para convertir la fecha en objeto Fecha
   public Fecha capturarFecha(String fecha) {
      String f[] = fecha.split("\\-");//al tener la fecha, la dividimos para obtener cada valor por separado
      Fecha f1 = new Fecha(Integer.parseInt(f[0]),Integer.parseInt(f[1]),Integer.parseInt(f[2]));
      return f1;
   }

   //metodo para crear menú 
   public byte crearMenu (){
      Scanner s=new Scanner (System.in);
      byte respuestaMenu;
      do{
         System.out.println("¿Qué desea realizar el día de hoy?\n1.Hacer venta \n2.Consultar Inventario\n3.Generar reporte de venta");
         respuestaMenu=s.nextByte();
         if(respuestaMenu<1||respuestaMenu>3)
         System.out.println("No se encuentra esa opción, intenta de nuevo");
      }while (respuestaMenu<1||respuestaMenu>3);
      return respuestaMenu;
   }
}

