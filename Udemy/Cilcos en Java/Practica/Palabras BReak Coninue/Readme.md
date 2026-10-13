# PalabraBreakContinue

## 📌 Sobre este ejercicio

Muestra cómo cambian el flujo de un ciclo las palabras reservadas **`break`** y **`continue`**, usando dos `for` casi idénticos que recorren del 1 al 9.

## 🧩 Qué incluye

| Palabra | Qué hace | En este ejercicio | Salida |
| :--- | :--- | :--- | :--- |
| `break` | **Sale del ciclo** por completo | Imprime el primer par y para | `2` |
| `continue` | **Salta a la siguiente vuelta**, sin terminar la actual | Si es impar, salta; si es par, imprime | `2 4 6 8` |

### 🔎 Traza del `break`

| `numero` | ¿`% 2 == 0`? | Qué pasa |
| :---: | :---: | :--- |
| 1 | No | Sigue |
| 2 | Sí | Imprime `2` y **sale** del ciclo con `break` |

### 🔎 Traza del `continue`

| `numero` | ¿Impar? | Qué pasa |
| :---: | :---: | :--- |
| 1 | Sí | `continue`: salta, no imprime |
| 2 | No | Llega al `print` → `2` |
| 3 | Sí | Salta |
| 4 | No | Imprime `4` |
| ... | ... | Así hasta el 9 (impar, salta) |

## 💻 Compilar y ejecutar

```bash
javac PalabraBreakContinue.java
java PalabraBreakContinue
```

## 📝 Notas

✅ **Compila y funciona.**

- **`break` vs `continue` en una frase:** `break` termina el ciclo; `continue` solo termina **esa vuelta** y el ciclo sigue.
- **Salida real:** como `println("Palabra break: ")` salta de línea, el `2` aparece en la línea de abajo.
  ```
  *** break y continue ***
  Palabra break: 
  2 
  Palabra continue: 
  2 4 6 8 
  ```
- La condición es `numero < 10`, así que recorre del 1 al **9** (el 10 no entra).
- La variable `numero` se declara en los dos `for`, y no hay conflicto: solo existe dentro de cada ciclo.
- El `continue` es una forma de evitar un `if` anidado: en vez de `if (par) { imprimir }`, se descartan los impares primero y el resto del código queda sin sangrar.
- Con `while` y `do-while`, ¡cuidado con `continue`! Si el avance del contador está **después** del `continue`, se salta y el ciclo puede volverse infinito. En el `for` no pasa, porque el avance va en la cabecera.
- Nombre de la carpeta con errata: `Palabras BReak Coninue`. Si la corriges (`Palabras Break Continue`), cambia el enlace en el Readme del tema.