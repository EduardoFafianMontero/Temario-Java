# MetodosCadenas

## 📌 Sobre este ejercicio

Métodos más comunes de la clase `String` para consultar y transformar texto.

## 🧩 Qué incluye

| Método | Qué hace | Ejemplo en el código | Resultado |
| :--- | :--- | :--- | :--- |
| `.length()` | Devuelve el número de caracteres | `cadena1.length()` | `24` |
| `.replace(a, b)` | Sustituye todas las apariciones de un carácter por otro | `cadena1.replace('o', 'a')` | `"Bienvenidas a mi esquema"` |
| `.toUpperCase()` | Convierte todo el texto a mayúsculas | `cadena1.toUpperCase()` | `"BIENVENIDOS A MI ESQUEMA"` |
| `.toLowerCase()` | Convierte todo el texto a minúsculas | `cadena1.toLowerCase()` | `"bienvenidos a mi esquema"` |
| `.trim()` | Elimina espacios en blanco al principio y al final (no los del medio) | `cadena2.trim()` | `"Leo Reyes"` (sin espacios en los extremos) |

## 💻 Compilar y ejecutar

```bash
javac MetodosCadenas.java
java MetodosCadenas
```

## 📝 Notas

- Ninguno de estos métodos modifica la cadena original — `String` es inmutable en Java, así que todos devuelven una cadena **nueva** con el cambio aplicado.
- En los dos últimos `println` (los de `cadena2`) falta un signo `=` o `:` entre el texto y el valor (`"cadena2 con espacios"+ cadena2` en vez de `"cadena2 con espacios="+ cadena2`), así que en consola sale todo pegado sin separador.