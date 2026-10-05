# OperadorTernario

## 📌 Sobre este ejercicio

El operador ternario `?:` como forma corta de escribir un `if`/`else` que devuelve un valor, en una sola línea: `condicion ? valorSiTrue : valorSiFalse`. Incluye un caso simple, y uno **anidado** (un ternario dentro de otro) para cubrir 3 resultados posibles en vez de 2.

## 🧩 Qué incluye

| Caso | Código | Resultado |
| :--- | :--- | :--- |
| Par o impar | *(pendiente — tapado por un tooltip en la captura)* | — |
| Mayoría de edad | `var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";` | Con `edad = 18` → `"Eres mayor de edad"` |
| Positivo/negativo/cero (anidado) | `var resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";` | Con `numero = 0` → `"Cero"` |

*(Me falta la parte de "par o impar" — la tapa un tooltip de VS Code en la captura. Pásamela sin esa ventana encima y completo la tabla.)*

## 💻 Compilar y ejecutar

```bash
javac OperadorTernario.java
java OperadorTernario
```

## 📝 Notas

- `condicion ? exp1 : exp2` se lee: "si `condicion` es `true`, el valor es `exp1`; si no, `exp2`". Es un `if`/`else` compacto, pero solo sirve cuando ambos caminos **devuelven un valor** para usar (asignarlo, imprimirlo...) — no para ejecutar varias instrucciones distintas en cada rama.
- **El ternario anidado** `(numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero"` funciona encadenando: si la primera condición es `false`, en vez de un valor fijo hay *otro* ternario completo como alternativa — equivale a un `if / else if / else` de 3 caminos, pero en una sola línea.
- A partir de cierto punto, encadenar demasiados ternarios anidados hace el código difícil de leer — para 2-3 casos como aquí está bien, pero con más casos suele ser más claro volver a un `if`/`else if`/`else` normal.