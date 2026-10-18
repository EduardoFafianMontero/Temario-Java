# Funciones (sumar)

## 📌 Sobre este ejercicio

Una función con **dos parámetros** que **devuelve un `int`**: `sumar(a, b)`. Se llama dos veces con valores distintos y el resultado se guarda en una variable.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Definición | `static int sumar(int a, int b)` | Recibe dos enteros y devuelve un entero |
| Variable local | `var resultado = a + b;` | Guarda la suma dentro de la función |
| Retorno | `return resultado;` | Devuelve el valor a quien la llamó |
| Primera llamada | `var resultado_funcion = sumar(arg1, arg2);` | Con `arg1 = 3` y `arg2 = 8` |
| Segunda llamada | `resultado_funcion = sumar(10, 20);` | Con valores escritos directamente |

**Salida esperada:**

```
resultado_funcion = 11
resultado_funcion = 30
```

### 🔎 Qué pasa en cada llamada

| Llamada | `a` | `b` | Devuelve |
| :--- | :---: | :---: | :---: |
| `sumar(arg1, arg2)` | 3 | 8 | 11 |
| `sumar(10, 20)` | 10 | 20 | 30 |

## 💻 Compilar y ejecutar

```bash
javac FuncionSumar.java
java FuncionSumar
```

## 📝 Notas

✅ **Compila y funciona.**

- **Estilo de nombres:** en Java se usa `camelCase` (`resultadoFuncion`), no `snake_case` (`resultado_funcion`). Compila igual, pero lo habitual es `camelCase`.
- `resultado` dentro de `sumar` es **local**: solo existe dentro de la función. En `main` hay que guardar lo que devuelve en otra variable.
- Se podría acortar a `return a + b;` sin variable intermedia. Con `var resultado` se ve más claro el proceso paso a paso, bueno para aprender.
- Los parámetros se pasan **por valor**: `sumar` recibe una copia de `arg1` y `arg2`, no las modifica.
- Reasignar `resultado_funcion` en la línea 12 funciona porque es `var` y sigue siendo `int`; no se puede cambiar su tipo.
- Si la función es `int` y se le pasa un `double` (`sumar(1.5, 2)`), no compila: habría que cambiar los tipos o hacer un *cast*.