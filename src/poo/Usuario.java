package poo;

public class Usuario {
    String username;
    String password;
    String email;

    public Usuario(String username, String password, String email)
    {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    // constructor sin argumentos

    public Usuario()
    {

    }
    // metodos
    void saludar(String nombre)
    {
        System.out.println("Holaaaa " + nombre);
    }
    boolean login(String usernameForm, String passwordForm)
    {
        if(usernameForm.equals(username) && passwordForm.equals(password))
        {
            return true;
        }
        else {
            return false;
        }
    }
}