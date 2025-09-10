# D — Dependency Inversion Principle (Inversión de Dependencias)

**Dicho:**  
Los módulos de alto nivel no deben depender de módulos de bajo nivel; ambos deben depender de abstracciones.

**Mini explicación:**  
El código debe trabajar con interfaces o abstracciones, no con implementaciones concretas.  
Esto permite que el sistema sea flexible, fácil de mantener y probar.

---

## ❌ Ejemplo Incorrecto
`UserService` depende directamente de `EmailService`.  
Si queremos cambiar el canal de notificación, debemos modificar `UserService`.

Archivos en: `incorrect/`

---

## ✅ Ejemplo Correcto
Creamos una interfaz `NotificationService`.  
`UserService` depende de esta abstracción, y podemos inyectar implementaciones como `EmailService` o `SmsService` sin modificar la lógica del servicio.

Archivos en: `correct/`
