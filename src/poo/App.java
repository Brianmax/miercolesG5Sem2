package poo;

public class App {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.username = "jose_10";
        usuario1.password = "1234";
        usuario1.email = "jose@gmail.com";


        boolean respuesta = usuario1.login("jose_10", "1234");



        Usuario usuario2 = new Usuario();
        usuario2.username = "maria_90";
        usuario2.password = "1234";
        usuario2.email = "maria@gmail.com";

        usuario1.saludar("Maria");

        usuario2.saludar("Paolo");

        Usuario usuario3 = new Usuario("pepe_9", "password", "pepe@gmail.com");
    }
}
