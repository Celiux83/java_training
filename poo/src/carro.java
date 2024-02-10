import java.util.Set;

public class carro {
    //Atributos

    //cadena de caracteres y es una clase
    private String color;
    private String tipoDeCoche;
    private String tipoDeTransmision;
    private String modelo;
    private int anio;
    private String vin;
    private String tipoDeMotor;
    private byte velocidadMaxima;

    //Constructor

    public carro(){
        System.out.println("Constructor general");
    }

    public carro(String vin){
        System.out.println("Constructor con vin");
        this.vin = vin;
    }

    public carro (String vin, String color){
        System.out.println("Constructor con color y vin");
        this.vin=vin;
        this.color=color;
    }


    //getter y setters: Get y Set Metodos para obtener
    //Los utilizamos para los atributos (1 get y 1 set para c/ atributos)

    //get= leer
    public String getTipoDeCoche() {
        return tipoDeCoche;
    }

    public void setTipoDeCoche(String tipoDeCoche) {
        this.tipoDeCoche = tipoDeCoche;
    }

    public String getTipoDeTransmision() {
        return tipoDeTransmision;
    }

    public void setTipoDeTransmision(String tipoDeTransmision) {
        this.tipoDeTransmision = tipoDeTransmision;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVin(int algo) {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    public byte getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(byte velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    String getColor(){ // dame el color del coche
        return color;
    }

    void setColor(String color){ // guarda el color del coche
        this.color= color;
    }

    public int getAnio (){
        return this.anio;
    }

    void setAnio(int anio){
        this.anio = anio;
    }

    //Metodos
    public void avanzar(){
        System.out.println("ESTOY AVANZANDO...");
    }

    public void frenar(){
        System.out.println("ESTOY FRENANDO...");
    }

    public void girar (){
        System.out.println("GIRA...");
    }

    private void arrancar (){
        System.out.println("ARRANCANDO...");
    }


}
