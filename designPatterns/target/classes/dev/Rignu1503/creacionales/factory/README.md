# Factory Design Pattern

## Descripción

El patrón **Factory Method** (o simplemente Factory) es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, pero permite a las subclases alterar el tipo de objetos que se crearán. Es especialmente útil cuando hay un proceso de creación complejo, cuando la clase exacta del objeto a crear no se conoce hasta el tiempo de ejecución, o para centralizar la lógica de creación de objetos en un solo lugar.

## Propósito

- Ocultar la lógica de creación de objetos al cliente.
- Desacoplar el código cliente de las clases concretas que necesita instanciar.
- Facilitar la adición de nuevos tipos de objetos sin cambiar el código existente (cumpliendo con el Principio Abierto/Cerrado - Open/Closed Principle).

## Ejemplo Implementado: Sistema de Procesamiento de Pagos

En este ejemplo, simulamos un sistema de *checkout* en un e-commerce que puede procesar pagos a través de diferentes métodos, como Tarjeta de Crédito, PayPal y Criptomonedas. El cliente (el sistema de checkout) no necesita saber cómo se instancia o se configura cada procesador de pago específico. 

### Componentes:

1. **`PaymentProcessorInterface`**: Interfaz común que declaran todos los procesadores de pago. Define el método `processPayment(double amount, String details)`.
2. **Clases Concretas (Servicios)**:
   - `CreditCardProcessorService`: Implementa el pago con tarjeta de crédito.
   - `PayPalProcessorService`: Implementa el pago vía PayPal.
   - `CryptoProcessorService`: Implementa el pago con criptomonedas.
3. **`PaymentProcessorFactory`**: La clase fábrica. Contiene el método estático `createProcessor(String paymentMethod)` que recibe un identificador del método de pago deseado y retorna una instancia de la clase concreta correspondiente, pero bajo la interfaz `PaymentProcessorInterface`.
4. **`Main` (Cliente)**: Utiliza la fábrica para obtener el procesador adecuado en base a la selección del usuario ("credit_card", "paypal", "crypto") y procesa el pago sin acoplarse a la implementación específica de cada método de pago.

## Ventajas de usar Factory aquí

- **Flexibilidad:** Si el día de mañana se añade un nuevo método de pago (ej. "Transferencia Bancaria"), solo hay que crear la nueva clase que implemente `PaymentProcessorInterface` y agregar un `case` en el `PaymentProcessorFactory`. El código cliente en `Main` permanecería intacto (salvo por invocar el nuevo método, si se requiere probarlo).
- **Mantenibilidad:** Toda la lógica de creación (y posible configuración futura, como inyectar credenciales de API para cada pasarela) está centralizada en la clase Factory.

## Cómo Ejecutarlo

Puedes ejecutar la clase `Main.java` para ver cómo la fábrica crea los diferentes tipos de procesadores de pago según el string proporcionado, y cómo cada procesador maneja su propia lógica de manera polimórfica.
