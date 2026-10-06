# SaludFitnes

## 📌 Sobre este ejercicio

Pide el nombre y los pasos dados hoy, calcula las calorías quemadas, comprueba si se alcanzó la meta diaria de pasos con un operador ternario, y muestra un resumen formateado con *text block* + `printf`.

## 🧩 Qué incluye

| Dato | Código | Para qué sirve |
| :--- | :--- | :--- |
| `META_PASOS` | `final var ... = 10000;` | Meta diaria de pasos |
| `CALORIAS_POR_PASO` | `final var ... = 0.04;` | Calorías aproximadas quemadas por cada paso |
| `pasos` | `consola.nextInt()` | Pasos dados hoy |
| `metaAlcanzada` | `(pasos >= META_PASOS) ? "...alcanzado..." : "...no has alcanzado..."` | Mensaje según si llegó a la meta |
| `caloriasQuemadas` | `pasos * CALORIAS_POR_PASO` | Calorías quemadas estimadas |

## 💻 Compilar y ejecutar

```bash
javac SaludFitnes.java
java SaludFitnes
```

## 📝 Notas

⚠️ **No compila tal cual está:** `public static void main(Sing[] args){` → a `String[]` le faltan las letras `tr`, queda como `Sing[]`.

⚠️ **Además, una vez corregido eso, el programa compilaría pero fallaría al ejecutarse.** En el `printf`, el marcador `%d` (línea *"meta de pasos diarios alcanzada: %d"*) está emparejado con `metaAlcanzada`, que es un **texto** (el resultado del operador ternario), no un número — `%d` solo acepta enteros. Esto no lo detecta el compilador (los marcadores de `printf` no se comprueban al compilar), así que el error solo aparece al ejecutar el programa, como un `IllegalFormatConversionException`. La solución es cambiar ese `%d` por `%s`, ya que `metaAlcanzada` es un `String`.

- Es un buen ejemplo de por qué conviene revisar que cada `%x` del `printf` coincida en tipo y en orden con la variable que le corresponde — un error aquí no avisa hasta que se ejecuta, a diferencia de los errores de sintaxis que ya has visto en otros ejercicios.
- `META_PASOS` y `CALORIAS_POR_PASO` siguen bien la convención de nombres para constantes.