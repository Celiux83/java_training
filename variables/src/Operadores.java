public class Operadores {
    public static void main (String [] args) {
    // Operadores aritmeticos
    // +, -, *, / y %
    int resultado = 5 + 10;
    //+ suma
    int numero1, numero2;
    numero1=5;
    numero2=10;
    System.out.println("Suma: " + resultado);

    // - resta
    resultado= numero2 - numero1;
    System.out.println("Resta: " + resultado);


        // * multiplicacion
        resultado= numero2 * numero1;
        System.out.println("Multiplicacion: " + resultado);

        // / division
        resultado= numero2 / numero1;
        System.out.println("Division: " + resultado);

        //Modulo : dividir 10 / 5 = 2 --- sobra 0, el cero es el modulo
        resultado = 10 % 3; // 3 y sobra 1
        System.out.println("Modulo: " + resultado);


        //Operadores comparacion
        // Mayor que (>), Menor que (<), <=, >=
        // == Igualdad
        // != diferente a
        boolean condicion;

        //numero1 es 5 y numero2 es 10
        condicion = numero1 > numero2;
        System.out.println("Es mayor num1 a num2? " + condicion);

        condicion = numero1 < numero2;
        System.out.println("Es menor num1 a num2? " + condicion);

        condicion = numero1 == numero2;
        System.out.println("Es igual num1 a num2? " + condicion);

        condicion = numero1 != numero2;
        System.out.println("Es diferente num1 a num2? " + condicion);

        //Operadores Logicos
        //AND &&
        //OR ||
        //NOT !
        /* AND && -- TODO DEBE SER IGUAL / COINCIDIR
        0 && 0 -- FALSE 0
        0 && 1 -- FALSE 0
        1 && 0 -- FALSE 0
        1 && 1 -- TRUE 1
         */

        /* OR || -- MIENTRAS UN VALOR COINCIDA / ENCENDIDO
        0 && 0 -- FALSE 0
        0 && 1 -- TRUE 1
        1 && 0 -- TRUE 1
        1 && 1 -- TRUE 1
         */

        /* ! NEGACION
        0 -- ! es igual a 1
        1 -- ! es igual a 0
        FALSE --!FALSE entonces es TRUE
        TRUE --!TRUE entonces es FALSE

         */
        boolean manejar;
        int edad1 = 16;
        int edad2 = 19;
        boolean tieneLicencia = true;
        boolean tieneLicencia2 = false;
        boolean tieneCoche = false;


        manejar = edad1 >= 18 && tieneLicencia; // FALSE && TRUE ? ENTONCES FALSE
        System.out.println("Puede manejar? " + manejar);

        manejar = edad2 >= 18 && tieneLicencia; // TRUE && TRUE ? ENTONCES TRUE
        System.out.println("Puede manejar? " + manejar);

        manejar = edad2 >= 18 && tieneLicencia2 && tieneCoche; // TRUE && FALSE && FALSE ? ENTONCES FALSE
        System.out.println("Puede manejar? " + manejar);

        manejar = edad2 >= 18  || tieneLicencia2; // TRUE || FALSE ? ENTONCES TRUE
        System.out.println("Puede manejar? " + manejar);

        boolean licenciaTRamitada = !tieneLicencia2; // false = al negarse se convierte en TRUE
        System.out.println("YA tiene licencia" + licenciaTRamitada);

    }
}
