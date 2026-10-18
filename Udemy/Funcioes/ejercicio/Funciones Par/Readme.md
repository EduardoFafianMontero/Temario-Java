# Funciones (esPar)

## 📌 Sobre este ejercicio

Una función que **devuelve un `boolean`**: `esPar` recibe un número y responde `true` si es par o `false` si es impar. El programa pide el número por consola y muestra el resultado.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Definición | `static boolean esPar(int numero)` | Recibe un `int` y devuelve un `boolean` |
| Condición | `numero % 2 == 0` | El resto de dividir entre 2 es 0 → es par |
| Retorno | `return (numero % 2 == 0) ? true : false;` | Devuelve el resultado con el operador ternario |
| Lectura | `Integer.parseInt(new Scanner(System.in).nextLine())` | Lee una línea y la pasa a `int` |
| Llamada | `esPar(numero)` | Se usa dentro del `println` |

**Ejemplo de ejecución:**

```
Proporciona un valor numérico: 8
Número par? true
```

### 🔎 Tres formas de escribir lo mismo

```java
// 1) if / else (lo que tienes comentado)
if (numero % 2 == 0)
    return true;
else
    return false;

// 2) Operador ternario (lo que usas)
return (numero % 2 == 0) ? true : false;

// 3) Directa: la condición YA es un boolean
return numero % 2 == 0;
```

## 💻 Compilar y ejecutar

```bash
javac FuncionPar.java
java FuncionPar
```

## 📝 Notas

✅ **Compila y funciona.** *(En la captura no se ve la línea 1; doy por hecho que está `import java.util.Scanner;`. Sin ese import no compilaría.)*

- **Ternario redundante:** `(cond) ? true : false` devuelve exactamente lo mismo que `cond`. La versión más corta y limpia es `return numero % 2 == 0;`.
- Dejar el `if/else` comentado para comparar con el ternario es buena forma de estudiar las alternativas.
- `new Scanner(System.in)` dentro de la misma línea funciona para una sola lectura. Si se leyeran varios datos, conviene crear **un único** `Scanner` y reutilizarlo.
- Si el usuario escribe algo que no es un entero (`"abc"` o `"3,5"`), `Integer.parseInt` lanza `NumberFormatException`.
- Con números negativos funciona: `-4 % 2` es `0`, pero `-3 % 2` es `-1` (distinto de 0, así que dice impar, correcto).
- Una función que devuelve `boolean` suele llamarse con prefijo `es`/`tiene` (`esPar`), y queda muy legible dentro de un `if`: `if (esPar(n)) { ... }`.