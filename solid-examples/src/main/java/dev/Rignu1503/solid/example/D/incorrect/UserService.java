package dev.Rignu1503.solid.example.D.incorrect;

public class UserService {
    private EmailService emailService = new EmailService();

    public void registerUser(String name) {
        System.out.println("Usuario registrado: " + name);
        emailService.sendEmail("Bienvenido " + name);
    }
}
