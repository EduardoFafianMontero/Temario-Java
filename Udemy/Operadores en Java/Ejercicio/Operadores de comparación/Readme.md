# OperadoresComparacion

## 📌 Sobre este ejercicio

Los 6 operadores de comparación de Java, aplicados a dos enteros: `a = 3` y `b = 2`. Todos devuelven un valor `boolean` (`true` o `false`).

## 🧩 Qué incluye

| Operador | Significado | Código | Resultado |
| :--- | :--- | :--- | :--- |
| `==` | Igual a | `a == b` | `false` |
| `!=` | Distinto de | `a != b` | `true` |
| `>` | Mayor que | `a > b` | `true` |
| `>=` | Mayor o igual que | `a >= b` | `true` |
| `<` | Menor que | `a < b` | `false` |
| `<=` | Menor o igual que | `a <= b` | `false` |

## 💻 Compilar y ejecutar

```bash
javac OperadoresComparacion.java
java OperadoresComparacion
```

## 📝 Notas

- `var resultado = a == b;` infiere el tipo `boolean` automáticamente, porque una comparación siempre produce `true` o `false` — y la misma variable se reutiliza después para el resto de comparaciones.
- No confundir `==` (comparar) con `=` (asignar): `a == b` pregunta si son iguales; `a = b` le da a `a` el valor de `b`.
- Recordar lo visto en `Comparación de cadenas`: `==` sirve para comparar tipos primitivos como estos `int`, pero para comparar el contenido de `String` hay que usar `.equals()`.
- Typo menor en un texto impreso: `"esultado a != b : "` (falta la `r` inicial) — no afecta a la ejecución, solo a lo que sale en consola.