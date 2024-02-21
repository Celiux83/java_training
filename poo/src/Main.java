public class Main {
    public static void main(String[] args) {
/*
        //llamar la clase carro

        carro coche1 = new carro(); // utilizando constructor 1
        carro coche2 = new carro("VIN123"); // utilizando constructor 2
        carro coche3 = new carro("1232456", "azul"); // utilizando constructor 3

        System.out.println(coche2.getVin(3));
        System.out.println(coche3.getColor());


        coche1.arrancar("coche 1");
        coche1.avanzar();
        coche2.arrancar("coche 2");
        coche2.avanzar();
        coche1.girar();
        coche1.frenar();

        coche3.arrancar("coche 3");

        coche3 = new carro("vin2","rojo");
        System.out.println(coche3.getColor());



        //llamar la clase libro
        libro libro1 = new libro(); // utilizando constructor 1
        libro libro2 = new libro("Guerra y Paz", "Leon Tolstoi", "Novela", 1, 0); // utilizando constructor 2

        Scanner sc = new Scanner(System.in);
        String titulo, autor, genero;
        int ejemplares;

        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Introduce genero: ");
        genero = sc.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = sc.nextInt();
        System.out.println();

        //se asigna a libro2 los datos pedidos por teclado.
        //para ello se utilizan los métodos setters
        libro1.setTituloLibro(titulo);
        libro1.setAutor(autor);
        libro1.setGenero(genero);
        libro1.setEjemplaresLibro(ejemplares);

        //se muestran por pantalla los datos del objeto libro2
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTituloLibro());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplaresLibro());
        System.out.println("Prestados: " + libro2.getEjemplaresPrestados());
        System.out.println();

        //se realiza un devolucion de libro1.

        if (libro1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTituloLibro());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTituloLibro() + " prestados");
        }
        System.out.println();

        // se realiza un prestamo del libro2
        libro2.prestamos();
        System.out.print("para prestar del libro " + libro2.getTituloLibro() + "/n");


    //llamar la clase animal

    animal animal1 = new animal(); // utilizando constructor 1
    animal animal2 = new animal("invertebrado"); // utilizando constructor 2
    animal animal3 = new animal("vertebrado", "carnivoro"); // utilizando constructor  3
        System.out.println(animal2.getEsqueletoAnimal());
        System.out.println(animal3.getAlimentacionDeAnimal());


        //llamar la clase perro
        perro perro1 = new perro(); // utilizando constructor 1
        perro perro2 = new perro("Beagle"); // utilizando constructor 2
        perro perro3 = new perro("Labrador", "Femenino"); // utilizando constructor  3
        System.out.println(perro2.getRazaPerro());
        System.out.println(perro3.getSexoPerro());


    //llamar la clase factura
        factura factura1 = new factura(); // utilizando constructor 1
        factura factura2 = new factura("RCD8714", "MER750916AB8","La tiendita S.A. de C.V."); // utilizando constructor  3
        System.out.println(factura2.getRegistroFederalContribuyente());


*/
        // nuestra clase principal es carro por eso utilizamos todos sus metos y funciones
        //Clase principal es carro
        Vehiculo deportivo = new Autodeportivo("El Rojo");
        deportivo.avanzar();
        deportivo.nombre("Auto deportivo");
        deportivo.arrancar("Mi auto");

        //Clase principal es deportivo
        Autodeportivo deportivo2 = new Autodeportivo("La golfa");
        deportivo2.setTurbo(true);
        deportivo.avanzar();
        deportivo2.nombre();

        Bote bote = new Bote();
        bote.arrancar();

      }


}