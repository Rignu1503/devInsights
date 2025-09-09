# O — Open/Closed Principle (Abierto / Cerrado)

**Dicho:**  
El software debe estar **abierto para extensión, pero cerrado para modificación**.

**Explicación:**  
Podemos agregar nuevas funcionalidades sin alterar el código existente. Las extensiones se implementan mediante subclases o interfaces, lo que permite extender el comportamiento sin modificar lo ya construido.

**Ejemplo:**  
❌ Una clase que se modifica cada vez que aparece un nuevo tipo de descuento.  
✅ Una interfaz `DiscountStrategy` con implementaciones específicas (`RegularDiscount`, `ChristmasDiscount`), que permite extender sin modificar la calculadora.
