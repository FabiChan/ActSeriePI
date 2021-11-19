import java.io.*;
import java.util.*;
import java.text.*;

//Clase padre Producto 
class Producto{
   protected int codigoProd;
   protected String nomProd;
   protected double precio;
   protected String categoria;
   protected int cantidad;
   
   //Metodo constructor 
   public Producto(int codigoProd, String nomProd, double precio, String categoria, int cantidad){
      setCodigoProd(codigoProd);
      setNomProd(nomProd);
      setPrecio(precio);
      setCategoria(categoria);
      setCantidad(cantidad);
   }
   
   //Sets y gets de atributos
   
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
}


//Clase hija Producto Alimento que hereda de la clase padre Producto
class Alimento extends Producto {   
   private Fecha fechaCadu; //Composicion de la clase fecha
   
   //Metodo constructor
   public Alimento(int codigoProd, String nomProd, double precio, String categoria, int cantidad, Fecha fechaCadu) {
      super(codigoProd, nomProd, precio, categoria, cantidad);
      setFechaCadu(fechaCadu);
   }
   
   //Sets y gets de atributo
   
   public void setFechaCadu(Fecha fechaCadu) {
      this.fechaCadu=fechaCadu;
   }
   
   public Fecha getFechaCadu(){
      return fechaCadu;
   }
   
}


//clase hija Prodcuto Ropa que hereda de la clase padre Producto
class Ropa extends Producto{   
   private char talla;
   
   //Metodo constructor
   public Ropa(int codigoProd, String nomProd, double precio, String categoria, int cantidad, char talla) {
      super(codigoProd, nomProd, precio, categoria, cantidad);
      setTalla(talla);
   }
   
   //Sets y gets de atributo 
   public void setTalla(char talla) {
      this.talla=talla;
   }
   
   public char getTalla() {
      return talla;
   }   
}


//clase hija Prodcuto Limpieza que hereda de la clase padre Producto
class Limpieza extends Producto{   
   private String tipo;
   
   //Metodo constructor
   public Limpieza(int codigoProd, String nomProd, double precio, String categoria, int cantidad, String tipo){
      super(codigoProd, nomProd, precio, categoria, cantidad);
      setTipo(tipo);
   }
   
   //Sets y gets
   
   public void setTipo(String tipo) {
      this.tipo=tipo;
   }
   
   public String getTipo(){
      return tipo;
   }
}


//Clase Fecha que tiene dia mes y año
class Fecha {

   private int dia;
   private int mes;
   private int anio;
   
//Metodo constructor
   public Fecha(int dia, int mes, int anio)
   {
      setDia(dia);
      setMes(mes);
      setAnio(anio);
   }
   
   //Sets y gets de atributos

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
   
//Metodo toString para imprimir objeto fecha
   public String toString()
   {
      return dia+"-"+mes+"-"+anio;
   }
}


//Clase para crear ventas
class Venta{
    private int numArticulo;
    private String nombreCompra;
    private double precioCompra;
    private double descuento;
    private double precioTotal;
    
    //Metodo constructor
    public Venta(int numArticulo, String nombreCompra, double precioCompra, double descuento, double precioTotal){
        setNumArticulo(numArticulo);
        setNombreCompra(nombreCompra);
        setPrecioCompra(precioCompra);
        setDescuento(descuento);
        setPrecioTotal(precioTotal);
    }
    
    //Sets y gets de atributos
    public void setNumArticulo(int numArticulo) {
        this.numArticulo = numArticulo;
    }
    public void setNombreCompra(String nombreCompra) {
        this.nombreCompra = nombreCompra;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public void setPrecioTotal(double precioTotal){
        this.precioTotal = precioTotal;
    }
    public int getNumArticulo() {
        return numArticulo;
    }
    public String getNombreCompra() {
        return nombreCompra;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }
    public double getDescuento() {
        return descuento;
    }
    
    public double getPrecioTotal(){
        return precioTotal;
    }

      //Método para generar los espacios de formato
    public String generarEspacios(String variable){
       while(variable.length() < 22){
         variable += " ";
       }
       return variable;
       }
       
//Metodo toString para desplegar cada venta realizada
    public String toString() {
        DecimalFormat d= new DecimalFormat("0.00");
        String salida = "";
        salida += generarEspacios(Integer.toString(numArticulo))+generarEspacios(nombreCompra)+"$"+generarEspacios(d.format(precioCompra))+"$"+generarEspacios(d.format(descuento))+"$"+generarEspacios(d.format(precioTotal)); 
        return "\n"+salida;             
    }
}


//Clase que imprime arreglo/lista de ventas realizadas durante el día
class ReporteDiario{
    private ArrayList<Venta> ventas;
    
    public ReporteDiario (ArrayList<Venta> ventas){
        setVentas(ventas); 
    }
    
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    public ArrayList<Venta> ventas() {
        return ventas;
    }

    //Método para generar los espacios de formato
    public String generarEspacios(String variable){
       while(variable.length() < 22){
         variable += " ";
       }
       return variable;
       }
    //Metodo que calcula el total de todas las ventas   
    public double calcularTotalVenta(){
    double total = 0.0;
    for(Venta venta: ventas)
      total+= venta.getPrecioTotal();
    return total;
    }
       
//Metodo to String para imprimir el reporte diario
    public String toString() {
      String reporte = "-------------- Reporte Diario de Ventas ---------------\n"+generarEspacios("Num Articulo:")+generarEspacios("Nombre:")+generarEspacios("Precio:")+generarEspacios("Descuento:")+generarEspacios("Subtotal :");
      for(int i = 0; i < ventas.size(); i++) //Ciclo que manda a desplegar cada venta realizada al metodo venta que contiene toda la informacion necesaria
        reporte += ventas.get(i);
      return reporte+="\nTotal de ventas: $"+calcularTotalVenta();
    }
}

//Clase que imprime el inventario de la tienda
class Inventario{
    private ArrayList<Alimento> productosA; //Array lists hechas leyendo del Archivo.txt
    private ArrayList<Ropa> productosR;
    private ArrayList<Limpieza> productosL;
    
    //Metodo constructor
    public Inventario (ArrayList<Alimento> productosA, ArrayList<Ropa> productosR, ArrayList<Limpieza> productosL){
        setProductosA(productosA);
        setProductosR(productosR);
        setProductosL(productosL);
    }
    
    //Sets y gets de las array lists
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
    //Metodo que suma las cantidades de todos los productos en el inventario
    public int calcularTotalProductos() {
        int total = 0;
        for(Alimento a: productosA)
            total+=a.getCantidad();
        for(Ropa r: productosR)
            total+=r.getCantidad();
        for(Limpieza l: productosL)
            total+=l.getCantidad();
        return total;
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
      String salida = "\n\n***INVENTARIO***\n\n\n\n------Productos Alimentos------\nCodigo                Nombre                Precio                Categoria             Cantidad              Fecha Caducidad              \n\n";
      for(Alimento alimento: productosA)
         salida += generarEspacios(String.valueOf(alimento.getCodigoProd()))+generarEspacios(alimento.getNomProd())+generarEspacios("$"+String.valueOf(d.format(alimento.getPrecio())))+generarEspacios(alimento.getCategoria())+generarEspacios(String.valueOf(alimento.getCantidad()))+generarEspacios((alimento.getFechaCadu()).toString())+"\n";
      salida += "\n\n------Productos Ropa------\nCodigo                Nombre                Precio                Categoria             Cantidad              Talla              \n\n";
      for(Ropa ropa: productosR)
         salida += generarEspacios(String.valueOf(ropa.getCodigoProd()))+generarEspacios(ropa.getNomProd())+generarEspacios("$"+String.valueOf(d.format(ropa.getPrecio())))+generarEspacios(ropa.getCategoria())+generarEspacios(String.valueOf(ropa.getCantidad()))+generarEspacios(String.valueOf(ropa.getTalla()))+"\n";
      salida += "\n\n------Productos Limpieza------\nCodigo                Nombre                Precio                Categoria             Cantidad              Tipo              \n\n";
      for(Limpieza limpieza: productosL)
         salida += generarEspacios(String.valueOf(limpieza.getCodigoProd()))+generarEspacios(limpieza.getNomProd())+generarEspacios("$"+String.valueOf(d.format(limpieza.getPrecio())))+generarEspacios(limpieza.getCategoria())+generarEspacios(String.valueOf(limpieza.getCantidad()))+generarEspacios(limpieza.getTipo())+"\n";
      salida+="\n\nTOTAL DE PRODUCTOS EN INVENTARIO: "+ calcularTotalProductos() + "\n";
   return salida;
   }
}


//clase qu guarda las cuentas del sistema usuario-contraseña
public class UsuarioContrasena {
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
      Principal p = new Principal(); //Se crea objeto Principal para llamar metodos de forma dinamica
      boolean acceso = p.darAcceso(); //Llama metodo para comprobar acceso
      if (acceso) {
         System.out.println("\n\t\t\t\t'Bienvenido!'");
         System.out.println("-----------------------------------");
         boolean continuar = true;
         byte respuestaMenu;
         ArrayList<Venta> ventas = new ArrayList<>();
         ArrayList<Alimento> productosAlimento = new ArrayList<>();
         ArrayList<Ropa> productosRopa = new ArrayList<>();
         ArrayList<Limpieza> productosLimpieza = new ArrayList<>();
         
        //Proceso de lectura del archivo.txt
         try {
            File f = new File("C:\\Users\\Juan Pablo\\Documents\\JP\\Carrera\\3er Semestre\\Progra Intermedia\\lista-productos.txt");
            FileInputStream f2 = new FileInputStream(f);
            InputStreamReader f3 = new InputStreamReader(f2);
            BufferedReader f4 = new BufferedReader(f3);
            String producto, infoProducto [];
            producto = f4.readLine();
         while(producto!=null) { //Mientras existan datos en la linea leida del archivo se seguiran capturando datos
            infoProducto = producto.split("\\,");//Variable que guarda en un arreglo los elementos indiviuales de una lunea del archivo. Linea por linea.
             //If para determinar si el producto pertenece a categoria "Alimento" para crear objeto Alimento         
            if (infoProducto[3].equals("alimento")) {
               Alimento a = new Alimento(Integer.parseInt(infoProducto[0]),infoProducto[1],Double.parseDouble(infoProducto[2]),infoProducto[3],Integer.parseInt(infoProducto[4]),p.capturarFecha(infoProducto[5]));
               productosAlimento.add(a);
            }
            else
            //If para determinar si el producto pertenece a categoria "Ropa" para crear objeto Ropa
               if (infoProducto[3].equals("ropa")) {
                  Ropa r = new Ropa(Integer.parseInt(infoProducto[0]),infoProducto[1],Double.parseDouble(infoProducto[2]),infoProducto[3],Integer.parseInt(infoProducto[4]),(infoProducto[5]).charAt(0));
                  productosRopa.add(r);
               }
               else {
               //Else para determinar si el producto pertenece a categoria "Limpieza" para crear objeto Limpieza
                  Limpieza l = new Limpieza(Integer.parseInt(infoProducto[0]),infoProducto[1],Double.parseDouble(infoProducto[2]),infoProducto[3],Integer.parseInt(infoProducto[4]),infoProducto[5]);
                  productosLimpieza.add(l);
               }
            producto = f4.readLine();//Se pasa a la siguiente linea del archivo para que continue el ciclo
         }
         Inventario i = new Inventario(productosAlimento,productosRopa,productosLimpieza); //Se crea objeto inventario
         p.consultarInventario(p,i); //Metodo que imprime el objeto inventario
         f4.close();
      }
      catch(IOException e) {
         System.out.println("Error en en la lectura del archivo");
      }  
      ventas = p.hacerVenta(ventas, productosAlimento, productosRopa, productosLimpieza); //Metodo para realizar ventas 
      Inventario i2 = new Inventario(productosAlimento,productosRopa,productosLimpieza); //Se crea el inventario actualizado dependiendo de las ventas realizadas
      p.consultarInventario(p,i2); //Se imprime el inventario actualizado
      try{
       File f = new File("C:\\Users\\Juan Pablo\\Documents\\JP\\Carrera\\3er Semestre\\Progra Intermedia\\inventario-actualizado.txt");
       FileOutputStream f2 = new FileOutputStream(f, true);
       PrintStream f3 = new PrintStream(f2);
       f3.println(i2);
       f3.close();
       }catch(IOException e){System.out.println("Error en el archivo");}
       
      }
      else
         System.out.println("\n*Se supero el numero maximo de intentos*");
         
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
  

   //método para imprimir el inventario
   public void consultarInventario(Principal p, Inventario i) {
         System.out.println(i);
   }
   
   //Metodo para realizar ventas y mantener registro de cambios en el inventario
   public ArrayList<Venta> hacerVenta(ArrayList<Venta> ventas, ArrayList<Alimento> productosAlimento, ArrayList<Ropa> productosRopa, ArrayList<Limpieza> productosLimpieza) {
      Scanner s=new Scanner (System.in);
            int productoVenta, cant =0;
            int numArticulo = 1;
            double porcentajeDesc, descuento, precioST, totalVenta = 0;
            byte compra = 0;
            do{ //Ciclo que pregunta si hubieron mas compras
             System.out.println("Ingresa el codigo del producto vendido");
             productoVenta = s.nextInt();
             System.out.println("Ingrese la cantidad del producto");
             cant = s.nextInt();
             //Validar que categoria de producto se esta comprando
             for(Alimento alimento: productosAlimento)
               if(alimento.getCodigoProd() == productoVenta){
                  if(alimento.getCantidad() > 0 && alimento.getCantidad() >= cant){ 
                         alimento.setCantidad(alimento.getCantidad() - cant);
                         System.out.println("Ingrese el descuento del producto. Si no tiene ingresa 0.");
                         porcentajeDesc = s.nextDouble();
                         descuento = (alimento.getPrecio() * cant) * (porcentajeDesc / 100);
                         precioST = alimento.getPrecio() * cant - descuento;
                         Venta v = new Venta(numArticulo,alimento.getNomProd(),alimento.getPrecio(),descuento, precioST);
                         ventas.add(v);
                         totalVenta += precioST;
                         numArticulo++;
                         }else
                           System.out.println("No existe la cantidad deseada");
               }
               //Validar que categoria de producto se esta comprando
               for(Ropa ropa: productosRopa)
               if(ropa.getCodigoProd() == productoVenta){
                  if(ropa.getCantidad() > 0 && ropa.getCantidad() >= cant){ 
                         ropa.setCantidad(ropa.getCantidad() - cant);
                         System.out.println("Ingrese el descuento del producto. Si no tiene ingresa 0.");
                         porcentajeDesc = s.nextDouble();
                         descuento = (ropa.getPrecio() * cant) * (porcentajeDesc / 100);
                         precioST = ropa.getPrecio() * cant - descuento;
                         Venta v = new Venta(numArticulo,ropa.getNomProd(),ropa.getPrecio(),descuento, precioST);
                         ventas.add(v);
                         totalVenta += precioST;
                         numArticulo++;
                         }else
                           System.out.println("No existe la cantidad deseada");
               }
               //Validar que categoria de producto se esta comprando
               for(Limpieza limpieza: productosLimpieza)
               if(limpieza.getCodigoProd() == productoVenta)
                  if(limpieza.getCantidad() > 0 && limpieza.getCantidad() >= cant){ 
                         limpieza.setCantidad(limpieza.getCantidad() - cant);
                         System.out.println("Ingrese el descuento del producto. Si no tiene ingresa 0.");
                         porcentajeDesc = s.nextDouble();
                         descuento = (limpieza.getPrecio() * cant) * (porcentajeDesc / 100);
                         precioST = limpieza.getPrecio() * cant - descuento;
                         Venta v = new Venta(numArticulo,limpieza.getNomProd(),limpieza.getPrecio(),descuento, precioST);
                         ventas.add(v);
                         totalVenta += precioST;
                         numArticulo++;
                         }else
                           System.out.println("No existe la cantidad deseada");
                           
            System.out.println("Quieres seguir registrando ventas?(1) Si (0) No");
            compra = s.nextByte();
            }while(compra != 0);
            ReporteDiario rd = new ReporteDiario(ventas); //Se crea el objeto ReporteDiario con todas las ventas del dia
            System.out.println(rd);
      return ventas;
   }
}
