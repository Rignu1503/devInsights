# L — Liskov Substitution Principle (Sustitución de Liskov)

**Dicho:**  
Los objetos de una subclase deben poder reemplazar a los de su superclase sin alterar el correcto funcionamiento del sistema.

**Explicación:**  
Si una implementación no cumple con lo que promete el contrato de la clase padre o interfaz, se rompe el principio de sustitución de Liskov.

---

## ❌ Ejemplo Incorrecto
Un `Airplane` hereda de `Vehicle` pero lanza una excepción en `move()`, rompiendo el contrato que promete que todo vehículo se puede mover por el suelo.

Archivos en: `incorrect/`

---

## ✅ Ejemplo Correcto
Creamos una interfaz `Vehicle` y cada clase (`Car`, `Bicycle`, `Airplane`) implementa `move()` de forma coherente, sin romper expectativas.

Archivos en: `correct/`
