public class Animal {
    //Atributos

    //cadena de caracteres y es una clase
    private String especieAnimal;
    private String reproduccionDeAnimal;
    private String esqueletoAnimal;
    private String alimentacionDeAnimal;
    private String habitatAnimal;



    //Constructor

    public Animal(){
        System.out.println("Constructor general");
    }

    public Animal(String esqueletoAnimal){
        System.out.println("Constructor con tipo de esqueleto de animal");
        this.esqueletoAnimal = esqueletoAnimal;
    }

    public Animal(String esqueletoAnimal, String alimentacionDeAnimal){
        System.out.println("Constructor con estructura y alimentacion de animal");
        this.esqueletoAnimal=esqueletoAnimal;
        this.alimentacionDeAnimal=alimentacionDeAnimal;
    }


    //getter y setters: Get y Set Metodos para obtener
    //Los utilizamos para los atributos (1 get y 1 set para c/ atributos)

    //get= leer

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public String getReproduccionDeAnimal() {
        return reproduccionDeAnimal;
    }

    public void setReproduccionDeAnimal(String reproduccionDeAnimal) {
        this.reproduccionDeAnimal = reproduccionDeAnimal;
    }

    public String getEsqueletoAnimal() {
        return esqueletoAnimal;
    }

    public void setEsqueletoAnimal(String esqueletoAnimal) {
        this.esqueletoAnimal = esqueletoAnimal;
    }

    public String getAlimentacionDeAnimal() {
        return alimentacionDeAnimal;
    }

    public void setAlimentacionDeAnimal(String alimentacionDeAnimal) {
        this.alimentacionDeAnimal = alimentacionDeAnimal;
    }

    public String getHabitatAnimal() {
        return habitatAnimal;
    }

    public void setHabitatAnimal(String habitatAnimal) {
        this.habitatAnimal = habitatAnimal;
    }


// Metodos

    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    public void hacersonido() {
        System.out.println("El animal está haciendo sonido.");
    }
}
