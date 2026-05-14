#Singleton

Este directorio contiene un ejemplo práctico del patrón de diseño **Singleton** implementado en Java.

## ¿Qué es el patrón Singleton?

El patrón Singleton es un patrón de diseño creacional que garantiza que una clase tenga **una única instancia** y proporciona un punto de acceso global a dicha instancia.

Es muy útil en escenarios donde necesitas un control estricto sobre recursos compartidos, como por ejemplo:
- Conexiones a bases de datos.
- Gestores de configuración.
- Sistemas de logging.

---

## Explicación del Ejemplo

El ejemplo consta de dos clases principales:

### 1. `ConfigurationManager.java` (El Singleton)
Esta clase representa un gestor de configuraciones para una aplicación y está implementada usando el patrón Singleton. Las características clave de su implementación son:

- **Constructor Privado (`private ConfigurationManager()`)**: Evita que otras clases puedan instanciar objetos de `ConfigurationManager` usando la palabra reservada `new`.
- **Instancia Estática Privada (`private static ConfigurationManager instance;`)**: Almacena la única instancia de la clase que existirá.
- **Método de Acceso Global (`public static ConfigurationManager getInstance()`)**: Este es el método que otras clases llamarán para obtener la instancia. Utiliza una técnica llamada **"Double-Checked Locking"** (bloqueo de doble comprobación):
  - Primero comprueba si la instancia es nula sin sincronización (por rendimiento).
  - Si es nula, sincroniza el bloque (`synchronized (ConfigurationManager.class)`) para evitar que múltiples hilos creen múltiples instancias si acceden al mismo tiempo.
  - Vuelve a comprobar si es nula antes de crear la instancia.
- **Estado Compartido (`private final Map<String, String> config`)**: Un mapa que simula las propiedades de configuración. Todos los que accedan al Singleton leerán y modificarán este mismo mapa.

### 2. `SingletonDemo.java` (Demostración)
Esta es la clase con el método `main` para probar el funcionamiento del Singleton:

1. **Obtención de la instancia:** Se obtienen dos referencias al `ConfigurationManager` (`config1` y `config2`) llamando a `ConfigurationManager.getInstance()`.
2. **Comprobación de identidad:** Se imprime si ambas referencias apuntan al mismo objeto en memoria (`config1 == config2`). El resultado será `true`.
3. **Acceso a datos compartidos:** Se lee información de configuración utilizando ambas referencias.
4. **Modificación de estado:** Se añade un nuevo valor de configuración utilizando `config1`. Al leer ese mismo valor con `config2`, se demuestra que el cambio está presente, confirmando que ambas variables manejan exactamente el mismo objeto.
---

Gracias a este patrón, aseguramos que la configuración de la aplicación sea cargada solo una vez en memoria y que cualquier parte del código que necesite una configuración o quiera modificarla interactúe con el mismo y único gestor.
