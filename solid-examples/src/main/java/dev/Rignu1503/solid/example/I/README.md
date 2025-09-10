# I — Interface Segregation Principle (Segregación de Interfaces)

**Dicho:**  
Es mejor crear varias interfaces específicas que una sola interfaz grande con métodos innecesarios.

**Explicación:**  
Las clases no deberían estar forzadas a implementar métodos que no usan.  
Interfaces más pequeñas y específicas hacen que el código sea más claro, flexible y mantenible.

---

## ❌ Ejemplo Incorrecto
Una interfaz `Worker` con métodos `work()` y `eat()`.  
El `RobotWorker` se ve forzado a implementar `eat()`, aunque no lo necesita.

Archivos en: `incorrect/`

---

## ✅ Ejemplo Correcto
Separamos en dos interfaces: `Workable` y `Eatable`.
- `HumanWorker` implementa ambas.
- `RobotWorker` implementa solo `Workable`.

Archivos en: `correct/`
