# Patrón de Diseño: Builder

Este directorio contiene un ejemplo práctico del patrón de diseño creacional **Builder** (Constructor) implementado en Java.

## ¿Qué es el Patrón Builder?

El patrón Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso. Este patrón nos ayuda a separar la construcción de un objeto complejo de su representación, de manera que el mismo proceso de construcción pueda crear diferentes representaciones.

### ¿Qué problema resuelve?

A menudo, las clases requieren de un constructor con muchos parámetros (conocido como *telescoping constructor antipattern*). Cuando una clase tiene muchos atributos opcionales, crear instancias se vuelve confuso y propenso a errores, ya que terminamos con constructores enormes donde es difícil identificar qué valor corresponde a cada parámetro.

El patrón Builder resuelve esto al extraer el código de construcción del objeto a clases separadas llamadas *builders*, las cuales proporcionan un enfoque fluido (encadenamiento de métodos) para configurar el objeto antes de construirlo.

## Explicación del Ejemplo

El código en este directorio demuestra cómo se utiliza el patrón Builder para crear una orden de compra (`OrderModel`).

### Componentes:

1. **`OrderModel`**: Es la clase principal o producto complejo que queremos construir. Posee múltiples atributos como cliente (`customer`), lista de productos (`products`), subtotales (`subtotal`, `taxes`, `shipping`, `total`), estado (`status`) y fecha de creación (`createdAt`). Instanciar esto directamente mediante un constructor requeriría pasar 8 parámetros.
   
2. **`OrderBuilder`**: Es la clase constructora que facilita la creación de `OrderModel`. Ofrece métodos individuales (como `customer()`, `products()`, `subtotal()`, etc.) para configurar cada atributo uno por uno. Cada método devuelve la misma instancia del constructor (`this`), lo que permite encadenar las llamadas de forma fluida. Al final, el método `build()` ensambla y devuelve el objeto `OrderModel` final.

3. **`OrderService`**: Actúa como un cliente que orquesta la creación del objeto. Utiliza el builder para definir los valores por defecto o calculados (como impuestos y envíos) y construir la orden final paso a paso sin lidiar con un constructor masivo.

4. **`Main`**: Es la clase de punto de entrada donde se ejecuta el programa, demostrando cómo solicitar la creación de una orden a través del servicio e imprimir el resultado de forma sencilla.

## Ventajas observadas en el ejemplo

* **Código más legible:** En `OrderService`, la creación de la orden se lee casi como un texto natural gracias a los métodos encadenados.
* **Control en la instanciación:** No es necesario pasar todos los parámetros de golpe ni lidiar con valores nulos para atributos que no se necesitan inmediatamente.
* **Inmutabilidad (Opcional):** El uso de Builder facilita la creación de objetos inmutables si omitimos los métodos *setters* en el `OrderModel`, obligando a que toda la configuración ocurra en el builder.

## Cómo ejecutar

Para ver el patrón en acción, simplemente compila y ejecuta la clase `Main.java`. Deberías ver en consola los detalles de la orden recién construida.
