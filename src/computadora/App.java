package computadora;

public class App {
    public static void main(String[] args) {
        Computadora computer1 = new Computadora();
        computer1.precio = 3499.99;
        computer1.almacenamiento = 512;
        computer1.color = "negro";
        computer1.ram = 16;
        computer1.marca = "HP";

        computer1.encender();

        computer1.apagar();
    }
}
