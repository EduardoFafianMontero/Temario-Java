# Ciclos en Java

## 📌 Sobre esta carpeta

Estructuras que **repiten** un bloque de código: el ciclo `while` y el ciclo `do-while`. Más adelante entrarán `for` y las sentencias `break` / `continue`.

Está dividida en tres subcarpetas:

- **[Ejercicios/](./Ejercicios)** — Ejercicios que sigo del curso.
- **[Practica/](./Practica)** — Práctica libre sobre este tema.
- **[Temario/](./Temario)** — Apuntes y notas de los conceptos.

## 🔁 Los ciclos de un vistazo

| Ciclo | Cuándo comprueba la condición | ¿Se ejecuta al menos una vez? |
| :--- | :--- | :---: |
| `while` | **Antes** de cada vuelta | ❌ No (si la condición empieza en `false`, nunca entra) |
| `do-while` | **Después** de cada vuelta | ✅ Sí, siempre una vez como mínimo |

Un ciclo necesita siempre tres piezas: **inicio** (`var contador = 0;`), **condición** (`contador <= 5`) y **avance** (`contador++`). Si falta el avance, el ciclo es infinito.

## 📂 Ejercicios

- **[Numeros Pares](./Ejercicios/Numeros%20Pares)** — Mostrar los números pares del 1 al 20 combinando `while`, `if` y el operador módulo `%`.

## 📂 Practica

- **[Ciclo While](./Practica/Ciclo%20While)** — Contar de 0 a 5 con un `while` y `contador++`.
- **[Ciclos do while](./Practica/Ciclos%20do%20while)** — Contar de 1 a 3 con un `do-while`.

## 🔄 Estado

🔄 En progreso. Tema anterior: [`Sentecias de DEcisiones en Java/`](../Sentecias%20de%20DEcisiones%20en%20Java).