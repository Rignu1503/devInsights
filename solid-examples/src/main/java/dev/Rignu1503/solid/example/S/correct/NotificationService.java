package dev.Rignu1503.solid.example.S.correct;

// Clase para manejar notificaciones
public class NotificationService {

    public void sendEmail(String email, String message) {
        System.out.println("Enviando correo a " + email + ": " + message);
    }
}