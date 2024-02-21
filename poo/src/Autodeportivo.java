//Heredar de una clase se utiliza la palabra extends
public class Autodeportivo extends Vehiculo {
    private String nombreAtributo;
    public Autodeportivo (String nombreAtributo){
        System.out.println("Constructor con nombreAtributo");
        this.nombreAtributo = nombreAtributo;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    private boolean turbo;

    public void nombre(){
        System.out.println(nombreAtributo);
    }

    public void arrancar (){
        System.out.println("Arranca en el suelo");
    }
}
