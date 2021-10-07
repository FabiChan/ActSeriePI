
class Cliente{
   private String rfc;
   private Nombre nombre;
   private Direccion direccion;

   public Cliente(String rfc, Nombre nombre, Direccion direccion)
   {
      setRfc(rfc);
      setNombre(nombre);
      setDireccion(direccion);
   }
   
   public void setRfc(String rfc)
   {
   this.rfc=rfc;
   }

   public void setNombre(Nombre nombre)
   {
   this.nombre=nombre;
   }
   
   public void setDireccion(Direccion direccion)
   {
   this.direccion=direccion;
   }

    public String getRfc()
   {
      return rfc;
   }

   public Nombre getNombre()
   {
      return nombre;
   }

   public Direccion getDireccion()
   {
      return direccion;
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
   private int numero;
   private String colonia;
   private String municipio;
   private int cp;

   public Direccion(String calle, int numero, String colonia, String municipio, int cp)
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

   public void setNumero(int numero)
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

   public int getNumero()
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
class Factura{
   private int numFactura;
   private Detalle detalle;
   
   public Factura(int numFactura, Detalle detalle){
      setNumFactura(numFactura);
      setDetalle(detalle);
   }
  
   public void SetNumFactura(int numFactura)
   {
      this.numFactura=numFactura;
   }
  
   public void SetDetalle(Detalle detalle)
   {
      this.detalle=detalle;
   }
    
   public int getNumFactura()
   {
      return numFactura;
   }
  
   public Detalle getDetalle()
   {
      return detalle;
   }
   
}

class Detalle{
   private Producto producto1;
   private Producto producto2;
   private Producto producto3;
  
   public Detalle(){
      setProducto1(producto1);
      setProducto2(producto2);
      setProducto3(producto3);
   }
    //aquí ya no supe
}

class Producto{
   private int clave;
   private String nombre;
   private int cantidad;
   private double precio;
      
   public Producto(int clave, String nombre, int cantidad, double precio){
      setClave(clave);
      setNombre(nombre);
      setCantidad(cantidad);
      setPrecio(precio);
   }
   
   public void setClave(int clave)
   {
      this.clave=clave;
   }

   public void setNombre(String nombre)
   {
      this.nombre=nombre;
   }
   
   public void setCantidad(int cantidad)
   {
      this.cantidad=cantidad;
   }
   
   public void setPrecio(String precio)
   {
      this.precio=precio;
   }
   
    public int getClave()
   {
      return clave;
   }
   
    public String getNombre()
   {
      return nombre;
   }
   
    public int getCantidad()
   {
      return cantidad;
   }

    public double getPrecio()
   {
      return precio;
   }
 
   public String toString(){
      return cantidad + "\t"+clave+"\t"+nombre+"\t\t $"+precio;
   {
}
