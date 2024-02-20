public class Ciclos {
    public static void main(String [] args) {
        // for, while, do-while

        /*for
        for ( iniciador; condicion; incremento/decremento){
        statement; logica
        }
         */
        // Contador que sume del 1 al 10

        for (int i = 1; i <=10; i++){ // 1a = 1; 2da=2 ; 3ra= 3; 4ta: i=4 -- NO
            System.out.println("Contador " + i);
        }
        System.out.println("Llegue al final");

        for (int j = 10; j >=5; j--){
            System.out.println("Temporizador " + j);
        }
        System.out.println("Afuera del for");

        /* while : mientras
        while(condicion){
             logica;
             hacer algo para cumplir la condicion;
        }
         */
        int init = 1;
        while (init <= 10){ // mientras el contador sea menor o ihual a 10 hacer algo
            System.out.println("Soy el numero " + init);
            init++; // 2da = 2, 2ra = 3 ... init = 11: NO -- break porque ya se cumplio la condicion
        }

        System.out.println("Ahora soy el numero " + init);

        // do - while
        /*
            do {
                //hacer algo, lógica
            } while (condición);
         */
        int contador = 1;
        do {
            System.out.println("Soy el número " + contador);
            contador ++; // contador = contador + 1;
        } while(contador <= 5); //1era vez es 1
    }
}
