package dev.Rignu1503.solid.example.S.correct;

// Clase para manejar usuarios
public class UserService {

    private final NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void createUser(String name, String email) {
        System.out.println("Usuario creado: " + name);

        // Delegamos la notificación a otra clase
        notificationService.sendEmail(email, "Bienvenido " + name);
    }
}
