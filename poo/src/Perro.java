public class Perro {
    //Atributos


    private String nombrePerro;
    private String razaPerro;
    private String colorPerro;
    private int edadPerro;
    private String sexoPerro;




    //Constructor

    public Perro(){
        System.out.println("Constructor general");
    }

    public Perro(String razaPerro){
        System.out.println("Constructor con raza");
        this.razaPerro = razaPerro;
    }

    public Perro(String razaPerro, String sexoPerro){
        System.out.println("Constructor con raza y sexo de perro");
        this.razaPerro=razaPerro;
        this.sexoPerro=sexoPerro;
    }


    //getter y setters: Get y Set Metodos para obtener
    //Los utilizamos para los atributos (1 get y 1 set para c/ atributos)

    //get= leer

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public String getColorPerro() {
        return colorPerro;
    }

    public void setColorPerro(String colorPerro) {
        this.colorPerro = colorPerro;
    }

    public int getEdadPerro() {
        return edadPerro;
    }

    public void setEdadPerro(int edadPerro) {
        this.edadPerro = edadPerro;
    }

    public String getSexoPerro() {
        return sexoPerro;
    }

    public void setSexoPerro(String sexoPerro) {
        this.sexoPerro = sexoPerro;
    }


    // Metodos

    public void mostrarPerro(){
        System.out.print("/nNombre: " + getNombrePerro() + "/nRaza: " + getRazaPerro() + "/nSexo: " + getSexoPerro() + "/nEdad: " + getEdadPerro() + "/nColor: " + getColorPerro());
    }

    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}
