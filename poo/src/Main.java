
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    //llamar la clase carro

    carro coche1 = new carro(); // utilizando constructor 1
    carro coche2 = new carro("VIN123"); // utilizando constructor 2
    carro coche3 = new carro("1232456","azul"); // utilizando constructor 3

    System.out.println(coche2.getVin(3));
    System.out.println(coche3.getColor());

    }
}