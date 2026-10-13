# DibujaTriangulo

## 📌 Sobre este ejercicio

Pide un número de filas y dibuja con asteriscos un **triángulo centrado** (una pirámide). Es el primer ejercicio del tema que **construye texto** dentro de un `for`, usando `String.repeat()`.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Entrada | `consola.nextInt()` | Número de filas del triángulo |
| Ciclo | `for (var fila = 1; fila <= numeroFilas; fila++)` | Una vuelta por cada fila, de la 1 a la última |
| Espacios | `" ".repeat(numeroFilas - fila)` | Margen izquierdo que centra la fila |
| Asteriscos | `"*".repeat(2 * fila - 1)` | Fila 1 → 1, fila 2 → 3, fila 3 → 5... (siempre impar) |
| Salida | `println(espaciosBlanco + asteriscos)` | Une espacios y asteriscos en una línea |

### 🔎 Ejemplo con 4 filas

| `fila` | Espacios (`4 - fila`) | Asteriscos (`2*fila - 1`) | Resultado |
| :---: | :---: | :---: | :--- |
| 1 | 3 | 1 | `   *` |
| 2 | 2 | 3 | `  ***` |
| 3 | 1 | 5 | ` *****` |
| 4 | 0 | 7 | `*******` |

## 💻 Compilar y ejecutar

```bash
javac DibujaTriangulo.java
java DibujaTriangulo
```

## 📝 Notas

✅ **Compila y funciona** (necesita Java 11 o superior por `String.repeat()`).

- **La carpeta no coincide con el ejercicio:** se llama `Dibujar un rectangulo`, pero el código dibuja un **triángulo**. Conviene renombrarla a `Dibujar un triangulo`; si lo haces, cambia también el enlace en el Readme del tema.
- **Cada fila sube 2 asteriscos** (1, 3, 5, 7...), por eso la fórmula es `2 * fila - 1`. Y los espacios **bajan 1** por fila, para que quede centrado.
- Erratas en los textos: `unn Triángulo` → `un Triángulo`, y el comentario `tiagulo` → `triángulo`.
- Si se escribe una letra en vez de un número, `nextInt()` lanza `InputMismatchException`.
- **Reto para practicar:** dibujar un triángulo rectángulo (solo asteriscos, `"*".repeat(fila)`) y uno invertido.