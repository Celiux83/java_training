public class factura {

    // Atributos
    private String codigoProducto;
    private String descripcionProducto;
    private double cantidadComprada;
    private double precioUnidad;
    private String registroFederalContribuyente;

    private String razonSocial;

    //Constructor

    public factura(){ System.out.println("Constructor general");
    }

    public factura(String codigo, String rfc, String razon){
        System.out.println("Constructor con codigo, RFC y Razon Social.");
        this.codigoProducto = codigo;
        this.registroFederalContribuyente = rfc;
        this.razonSocial = razon;
    }


    //getter y setters: Get y Set Metodos para obtener
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(double cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getRegistroFederalContribuyente() {
        return registroFederalContribuyente;
    }

    public void setRegistroFederalContribuyente(String registroFederalContribuyente) {
        this.registroFederalContribuyente = registroFederalContribuyente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }


//Metodos

    public double obtenerValorArticulo()
    {
        return precioUnidad;
    }
    public double getTotalFactura()
    {
        double calculodelmontoTotal;
        calculodelmontoTotal = cantidadComprada * precioUnidad;
        return calculodelmontoTotal;
    }



}
