package dev.Rignu1503.solid.example.D.correct;

import dev.Rignu1503.solid.example.D.correct.interfaces.NotificationService;

public class EmailService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Enviando correo: " + message);
    }
}
