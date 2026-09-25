# RemplazarSubcadenas

## 📌 Sobre este ejercicio

Sustituir texto dentro de una cadena con `.replace(textoBuscado, textoNuevo)`.

## 🧩 Qué incluye

Cadena base: `"hola mundo"`.

| Variable | Código | Resultado |
| :--- | :--- | :--- |
| `nuevaCadena` (1ª vez) | `cadena.replace("mundo", "a todos")` | `"hola a todos"` |
| `nuevaCadena` (2ª vez) | `cadena.replace("hola", "Saludos")` | `"Saludos mundo"` |

## 💻 Compilar y ejecutar

```bash
javac RemplazarSubcadenas.java
java RemplazarSubcadenas
```

## 📝 Notas

- Las dos llamadas a `.replace()` parten de `cadena` (el original), **no** de `nuevaCadena` — por eso el segundo resultado es `"Saludos mundo"` y no `"Saludos a todos"`. Si el objetivo era encadenar los dos cambios, habría que llamar `nuevaCadena.replace(...)` la segunda vez, sobre el resultado del primero.
- El comentario dice "Remplazar la subcadena Hola por Adios", pero el código sustituye por `"Saludos"`, no por `"Adios"` — solo es un comentario desactualizado, no afecta a la ejecución.
- Como en el resto de métodos de `String`, `.replace()` no modifica `cadena` — devuelve una cadena nueva cada vez.