public class Condiciones {
    public static void main(String[] args) {
        //Condiciones IF - ELSE

        int edad = 15;
        boolean tieneLicencia = true;
        //if (condicion)
        //      accion
        // else
        //      accion

        if (edad >= 18) {
            System.out.println("Puede tramitar la licencia.");

            if (tieneLicencia)
                System.out.println("Puede manejar.");
            else
                System.out.println("No debe manejar sin licencia.");
        } else
            System.out.println("No puede tramitar la licencia.");



        if (tieneLicencia){
            System.out.println("Puede manejar.");
        } else if (edad >= 18) {
            System.out.println("Puede tramitar la licencia.");
        } else {
            System.out.println("No puede tramitar la licencia, es menor de edad");
        }

        // calificaciones 7 = C, 8=B, 9 =B+, 10= A, 7 = R
        /*
        char calificacio = 8;
        char puntaje = 9;

                if (calificacion == 7){
            System.out.println("C");
        } else if (calificacion == 8) {
            System.out.println("B");
        } else if (calificacion == 9){
            System.out.println("B++");
        } else if (calificacion == 10){
            System.out.println("A");
        } else {
            System.out.println("R");
            }
         */

        //Condiciones SWITCH
        //switch - case
        /*
        switch(condicion){
        case X:
             statements;
             break:
        case Y:
             statements;
             break;
        case Z:
             statements;
             break;
             case ...:
             statements:
             default:
             other statement;
         */

        int puntaje = 6;
        char calificacion;

switch (puntaje){
    case 6:
    case 7:
        calificacion = 'D';
        break;
    case 8:
        calificacion = 'C';
        break;
    case 9:
        calificacion = 'B';
        break;
    case 10:
        calificacion = 'A';
        break;
    default:
        calificacion = 'R';
        break;
}
        System.out.println("La calificacion es de: "+ calificacion);
    }
}
