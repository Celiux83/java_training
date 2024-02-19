

public class libro {
    //Atributos

    //cadena de caracteres y es una clase
    private String tituloLibro;
    private String autor;

    private String genero;
    private int ejemplaresLibro;
    private int ejemplaresPrestados;

    //Constructor

    public libro() {
        System.out.println("Constructor general");
    }

    public libro(String titulo, String autor, String genero, int ejemplaresLibro, int ejemplaresPrestados) {
        System.out.println("Constructor con parametros");
        this.tituloLibro = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ejemplaresLibro = ejemplaresLibro;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }


    //getter y setters: Get y Set Metodos para obtener
    //Los utilizamos para los atributos (1 get y 1 set para c/ atributos)

    //get= leer

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEjemplaresLibro() {
        return ejemplaresLibro;
    }

    public void setEjemplaresLibro(int ejemplaresLibro) {
        this.ejemplaresLibro = ejemplaresLibro;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }


    // Metodos

    public void busqueda() {
        System.out.println("Datos del libro que se busca...");
    }

    public void prestamos() {
        System.out.println("método para realizar el prestamo de un libro...");

        if (ejemplaresLibro > ejemplaresPrestados)
            System.out.println("Se encuentra ejemplar disponible ");
        else
            System.out.println("No hay ejemplar disponible ");
    }

    public boolean devolucion() {
        System.out.println("método para realizar la devolución de un libro...");
        if (ejemplaresPrestados != 0) {
            ejemplaresPrestados--;
            return true;
        }
        return false;
    }

}