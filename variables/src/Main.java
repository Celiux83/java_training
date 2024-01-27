/***
 * Esta es la clase principal
 */
public class Main {
    /***
     * Este es nuestro metodo principal
     * @param args
     */
    public static void main(String[] args) {
        /*comenta todo un parrafo --> En estas lineas explica el dato entero*/
        // comentar una linea, no se ejecuta
        //4 Tipos que son enteros, decimales, caracteres y booleanos

        // nomenclatura empezar con minuscula
        // mas de 2 palabras usar con el formato cammel case: primerApellido, nombreDeLaMascota
        // Tipo de dato y el nombre de la variable
        //ENTERO
        int edad;

        //inicializar -> poner un valor a la variable
        edad= 20;

        System.out.println("Mi edad es " + edad + " años.");

        int anioDeNacimiento= 1900;
        System.out.println("Mi año de nacimiento es " + anioDeNacimiento);

        edad=30;
        System.out.println("Mi edad es " + edad);

        int mes, anio, dia;
        mes=1;
        anio=1983;
        dia=26;

        long enteroLargo= 12345634;
        short mesShort= 12;
        byte bitDia= 12;
        //CARACTERES
        // se ponen con clomillas simples ''
        char femenino ='f';
        char masculino ='m';
        System.out.println("Generos " + femenino + masculino);

        //BOOLEANOS
        //verdadero o falso
        boolean verdadero= true;
        boolean falso= false;

        //Decimales
        double dinero= 123123123123.123; // numeros grandes
        float estatura= 1.59f; //pequeñas cantidades cuando son flotantes necesita la letra f

    }
}