# OperadoresAritmeticos

## 📌 Sobre este ejercicio

Los 5 operadores aritméticos básicos de Java, aplicados a dos enteros: `a = 5` y `b = 3`.

## 🧩 Qué incluye

| Operador | Operación | Código | Resultado |
| :--- | :--- | :--- | :--- |
| `+` | Suma | `a + b` | `8` |
| `-` | Resta | `a - b` | `2` |
| `*` | Multiplicación | `a * b` | `15` |
| `/` | División | `a / b` | `1` |
| `%` | Módulo (resto de la división) | `a % b` | `2` |

## 💻 Compilar y ejecutar

```bash
javac OperadoresAritmeticos.java
java OperadoresAritmeticos
```

## 📝 Notas

- ⚠️ A la última línea (`System.out.println("Resultado modulo" + resultado)`) le falta el `;` final — hay que añadirlo para que compile.
- `a / b` da `1`, no `1.666...`, porque `a` y `b` son `int`: al dividir dos enteros en Java, el resultado siempre se trunca a entero (se descarta la parte decimal). Para obtener el resultado exacto, alguno de los dos tendría que ser `double` (por ejemplo, `(double) a / b`).
- `%` (módulo) da el resto de la división: `5 / 3` es `1` con resto `2`, por eso `a % b` da `2`.
- `int a = 5, b = 3, resultado;` declara las 3 variables en una sola línea, separadas por comas — es válido, aunque para variables sin relacionar tan directa suele ser más legible declarar cada una en su propia línea.