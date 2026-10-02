# ConcatenacionCadenas

## 📌 Sobre este ejercicio

Distintas formas de concatenar `String` en Java, más allá del operador `+` que ya vimos en `Variables`: `.concat()`, `StringBuilder`, `StringBuffer` y `String.join()`.

## 🧩 Qué incluye

Cadenas base: `"hola"` y `"mundo"`.

| Forma | Código | Resultado |
| :--- | :--- | :--- |
| Operador `+` | `cadena1 + " " + cadena2` | `"hola mundo"` |
| `.concat()` | `cadena1.concat(" ").concat("mundo")` | `"hola mundo"` |
| `StringBuilder` | `.append()` encadenado + `.toString()` | `"hola mundo"` |
| `StringBuffer` | `.append().append().append()` | *(ver Notas — no se imprime bien)* |
| `String.join()` | `String.join(" ", cadena1, cadena2, "Adiós")` | `"hola mundo Adiós"` |

## 💻 Compilar y ejecutar

```bash
javac ConcatenacionCadenas.java
java ConcatenacionCadenas
```

## 📝 Notas

- ⚠️ El bloque de `StringBuffer` construye el texto (`stringBuffer.append(...)`) pero nunca lo convierte a `String` con `.toString()`, y el `println` de esa sección reutiliza por error la variable `resultado` (la del `StringBuilder` de más arriba) en vez de leer `stringBuffer`. En consola va a salir repetido el resultado del `StringBuilder`, no el del `StringBuffer` — para verlo de verdad, faltaría algo como `var resultadoBuffer = stringBuffer.toString();` y imprimir esa variable.
- **`StringBuilder` vs `StringBuffer`:** hacen básicamente lo mismo (construir cadenas de forma eficiente sin crear un objeto nuevo en cada concatenación), pero `StringBuffer` es *thread-safe* (segura para usar desde varios hilos a la vez) y por eso un poco más lenta. En código normal, sin hilos, se usa `StringBuilder`.
- `String.join(separador, elemento1, elemento2, ...)` es la forma más directa de unir varios textos con un separador fijo entre todos, sin tener que ir concatenando uno a uno.