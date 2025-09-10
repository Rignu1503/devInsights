package dev.Rignu1503.solid.example.D.correct;

import dev.Rignu1503.solid.example.D.correct.interfaces.NotificationService;

public class UserService {

    private final NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String name) {
        System.out.println("Usuario registrado: " + name);
        notificationService.send("Bienvenido " + name);
    }
}
