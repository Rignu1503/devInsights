package dev.Rignu1503.solid.example.S.incorrect;

public class UserService {

    public void createUser(String name, String email) {
        // Lógica para crear un usuario
        System.out.println("Usuario creado: " + name);

        // También envía correo (otra responsabilidad)
        sendEmail(email, "Bienvenido " + name);
    }

    private void sendEmail(String email, String message) {
        System.out.println("Enviando correo a " + email + ": " + message);
    }
}

