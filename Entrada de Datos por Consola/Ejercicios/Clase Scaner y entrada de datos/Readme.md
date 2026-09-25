# ManejoConsola

## 📌 Sobre este ejercicio

Primer contacto con `Scanner`: crear el objeto que lee la entrada estándar (`System.in`) y leer una línea de texto con `.nextLine()`.

## 🧩 Qué incluye

| Paso | Código | Para qué sirve |
| :--- | :--- | :--- |
| Crear el `Scanner` | `new Scanner(System.in)` | `System.in` es la entrada estándar (el teclado); `Scanner` la envuelve para poder leer de forma cómoda |
| Leer texto | `consola.nextLine()` | Lee todo lo que el usuario escriba hasta pulsar Enter, como `String` |

## 💻 Compilar y ejecutar

```bash
javac ManejoConsola.java
java ManejoConsola
```

## 📝 Notas

- `Scanner` está en el paquete `java.util`, por eso hace falta el `import java.util.Scanner;` al principio del archivo.
- Typo en el texto impreso: `"Escribe tu nombe: "` en vez de `"nombre"` (no afecta a la ejecución, solo al texto en consola).