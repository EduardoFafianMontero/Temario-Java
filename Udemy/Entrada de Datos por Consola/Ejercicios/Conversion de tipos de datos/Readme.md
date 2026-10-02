# LeertipoDatos

## 📌 Sobre este ejercicio

Leer distintos tipos de dato por consola con `Scanner`: un entero, y luego texto — viendo por qué hace falta "limpiar" el salto de línea entre medio.

## 🧩 Qué incluye

| Dato | Método | Nota |
| :--- | :--- | :--- |
| `edad` | `consola.nextInt()` | Lee un número entero |
| `altura` | `consola.nextInt()` | ⚠️ Lee otro entero, aunque el comentario dice "tipo double" (ver Notas) |
| — | `consola.nextLine()` | Línea "vacía" para consumir el salto de línea pendiente (ver Notas) |
| `nombre` | `consola.nextLine()` | Lee una línea completa de texto |

## 💻 Compilar y ejecutar

```bash
javac LeertipoDatos.java
java LeertipoDatos
```

## 📝 Notas

- ⚠️ **Esto no compila tal cual está**, por dos errores de escritura:
  - `System.out.pintln(...)` → falta la `r`, debería ser `println`.
  - El último `println` usa la variable `nombe`, pero la variable declarada se llama `nombre` — Java no reconoce `nombe` y da error de compilación. Hay que corregir uno de los dos nombres para que coincidan.
- `altura` se lee con `nextInt()`, aunque el comentario dice "Leer un tipo double" — si el objetivo era leer un decimal, el método correcto sería `nextDouble()`.
- **Por qué hace falta el `consola.nextLine()` suelto:** `nextInt()` deja el salto de línea (`\n`) sin consumir en el buffer. Si después llamas directamente a `nextLine()` para leer texto, esa primera llamada "lee" ese salto de línea sobrante y se queda vacía. La línea extra sirve para descartar ese `\n` antes de leer el texto real.