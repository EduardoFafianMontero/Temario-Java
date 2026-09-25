# inmutabilidad

## 📌 Sobre este ejercicio

Demuestra por qué `String` es inmutable en Java: "modificar" una variable `String` no cambia el objeto original, sino que la variable pasa a apuntar a un objeto nuevo.

## 🧩 Qué incluye

| Paso | Código | Qué pasa |
| :--- | :--- | :--- |
| 1 | `var cadena1="Hola";` | `cadena1` apunta al objeto `"Hola"` |
| 2 | `var cadena2=cadena1;` | `cadena2` apunta **al mismo objeto** que `cadena1` (todavía `"Hola"`) |
| 3 | `cadena1= "Adios";` | `cadena1` pasa a apuntar a un objeto **nuevo** (`"Adios"`) — el objeto `"Hola"` no se toca |
| 4 | `println(cadena1)` → `"Adios"` | `cadena1` ya apunta al nuevo objeto |
| 5 | `println(cadena2)` → `"Hola"` | `cadena2` sigue apuntando al objeto original, que nunca cambió |

## 💻 Compilar y ejecutar

```bash
javac inmutabilidad.java
java inmutabilidad
```

## 📝 Notas

- Esta es la clave de la inmutabilidad: `cadena1 = "Adios"` no modifica el `"Hola"` original — crea un objeto nuevo y reasigna la variable `cadena1` para que apunte a él. El objeto `"Hola"` sigue existiendo en memoria, y `cadena2` sigue apuntándolo.
- Es el mismo motivo por el que en el ejercicio de `Método de Cadenas`, cosas como `.toUpperCase()` o `.replace()` no cambian la cadena original: siempre devuelven una cadena nueva.