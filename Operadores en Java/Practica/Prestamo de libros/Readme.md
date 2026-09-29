# PrestamoLibro

## 📌 Sobre este ejercicio

Simula si un usuario puede pedir un libro prestado: puede si tiene credencial de estudiante **o** si vive lo bastante cerca de la biblioteca (basta con que se cumpla una de las dos, por eso usa `||` en vez de `&&`).

## 🧩 Qué incluye

| Dato | Cómo se obtiene | Tipo |
| :--- | :--- | :--- |
| `DISTANCIA_PERMITIDA_KM` | Constante (`final`) | `int`, valor `3` |
| `TienesCredencial` | `Boolean.parseBoolean(consola.nextLine())` | `boolean` |
| `distaciaBibliotecaKM` | `Integer.parseInt(consola.nextLine())` | `int` |
| `eselegibleprestamo` | `TienesCredencial \|\| distaciaBibliotecaKM < DISTANCIA_PERMITIDA_KM` | `boolean` |

## 💻 Compilar y ejecutar

```bash
javac PrestamoLibro.java
java PrestamoLibro
```

## 📝 Notas

⚠️ **Esto no compila tal cual está — tiene 3 errores:**

1. `consola.nextLie()` → falta la `n`, debería ser `nextLine()`. Java no reconoce `nextLie` como método de `Scanner`.
2. La variable se declara como `eselegibleprestamo` (todo minúsculas), pero en la última línea se usa `esElegiblePrestamo` (con mayúsculas) — son nombres distintos para Java, así que da error de variable no encontrada. Hay que unificarlos.
3. **El paréntesis del último `println` está mal colocado:** `System.out.println("...") + esElegiblePrestamo;` cierra el paréntesis *antes* de sumar la variable, así que intenta hacer `+` sobre el resultado de `println` (que no devuelve nada usable) en vez de concatenar dentro del texto. Debería ser: `System.out.println("Eres elegible para pestamo de libros? " + esElegiblePrestamo);` — con la variable **dentro** del paréntesis.

Una vez arregladas las 3, el ejercicio compila y funciona con la lógica que ya está bien planteada.

- Detalle de estilo (no impide compilar): `TienesCredencial` empieza por mayúscula — por convención de nombres de variable (visto en `Reglas de nombre`), lo habitual sería `tienesCredencial`, en minúscula.