# S — Single Responsibility Principle (Responsabilidad Única)

## ❌ Ejemplo Incorrecto
Una clase con **más de una responsabilidad**: manejar usuarios **y** enviar correos.

Archivo: `incorrect/UserService.java`

## ✅ Ejemplo Correcto
Separación de responsabilidades:
- `UserService.java` → solo gestiona usuarios.
- `NotificationService.java` → solo envía notificaciones.

Archivos en: `correct/`
