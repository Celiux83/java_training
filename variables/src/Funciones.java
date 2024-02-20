public class Funciones {
    public static void main(String[] args) {
        // Función si.
        sumar(123,222);
        int suma = sumarDosNumeros(123,555);
        System.out.println("Suma de dos numeros: " + suma);

        System.out.println(estaActivo());
    }
    // Método No regresa una respuest
        /*
            modificador public/private/protected void NombreDelMetodo(valores a recibir/argumentos) {}

            MODIFICADORES
            sino se le coloca ningun modificador al método/función java asume que son publicos
            public: se pueden hacer uso de otra clase
            private: no son visibles
            protected:

         */
    /***
     * Este método sirve para sumar dos números
     * @param numero1
     * @param numero2
     */
    public static void sumar(int numero1, int numero2) {
        int resultado;
        resultado = numero1 + numero2;
        System.out.println("El resultado es " + resultado);
    }

    // Funciónes
    private static int sumarDosNumeros(int numero1, int numero2) {
        return numero1 + numero2;
        //  int resultado;
        //  resultado = numero1 + numero2;
        // return resultado;
    }

    protected static boolean estaActivo() {
        return true;
    }
}
