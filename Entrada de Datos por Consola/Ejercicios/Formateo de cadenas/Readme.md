# FormateoCadena

## 📌 Sobre este ejercicio

Insertar valores de variables dentro de un texto de forma ordenada, con `String.format()` (devuelve un `String`) y `System.out.printf()` (imprime directamente), usando marcadores de formato (`%s`, `%d`, `%f`...).

## 🧩 Qué incluye

Datos: `nombre = "Eduardo"`, `edad = 35`, `salario = 21000.50`.

| Marcador | Tipo de dato | Para qué sirve |
| :--- | :--- | :--- |
| `%s` | Texto (`String`) | Inserta el valor tal cual |
| `%d` | Entero (`int`) | Inserta un número entero |
| `%f` | Decimal (`float`/`double`) | Inserta un decimal — sin más, con 6 decimales por defecto |
| `%.2f` | Decimal con precisión | Igual que `%f`, pero limitando a 2 decimales |
| `%n` | Salto de línea | Salto de línea "portable" (se adapta al sistema operativo) |

**Resultados:**
- `String.format("Nombre: %s", nombre)` → `"Nombre: Eduardo"`
- `String.format("Nombre: %s, Edad:%d,Salario: %f", nombre, edad, salario)` → `"Nombre: Eduardo, Edad:35,Salario: 21000.500000"`
- `System.out.printf("Nombre: %s, Edad:%d, Salario: %.2f%n", nombre, edad, salario)` → `"Nombre: Eduardo, Edad:35, Salario: 21000.50"`

## 💻 Compilar y ejecutar

```bash
javac FormateoCadena.java
java FormateoCadena
```

## 📝 Notas

- `String.format()` **devuelve** un `String` nuevo (hay que guardarlo o imprimirlo); `printf()` **imprime directamente**, sin devolver nada útil — por eso el último `System.out.printf(...)` no necesita un `println` alrededor.
- Con `%f` a secas, Java usa 6 decimales por defecto (`21000.500000`) — si quieres controlar cuántos decimales mostrar, hay que indicarlo como `%.2f` (2 decimales), `%.1f` (1 decimal), etc.
- `%n` es preferible a escribir `\n` a mano dentro de un `printf`, porque se adapta automáticamente al salto de línea del sistema operativo (Windows, Linux, Mac usan caracteres distintos internamente).