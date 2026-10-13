# Ciclos en Java

## 📌 Sobre esta carpeta

Estructuras que **repiten** un bloque de código: los ciclos `while`, `do-while` y `for`. También las sentencias `break` y `continue`, que alteran el flujo de un ciclo.

Está dividida en tres subcarpetas:

- **[Ejercicios/](./Ejercicios)** — Ejercicios que sigo del curso.
- **[Practica/](./Practica)** — Práctica libre sobre este tema.
- **[Temario/](./Temario)** — Apuntes y notas de los conceptos.

## 🔁 Los ciclos de un vistazo

| Ciclo | Cuándo comprueba la condición | ¿Se ejecuta al menos una vez? |
| :--- | :--- | :---: |
| `while` | **Antes** de cada vuelta | ❌ No (si la condición empieza en `false`, nunca entra) |
| `do-while` | **Después** de cada vuelta | ✅ Sí, siempre una vez como mínimo |
| `for` | **Antes** de cada vuelta | ❌ No; junta inicio, condición y avance en una línea |

Un ciclo necesita siempre tres piezas: **inicio** (`var contador = 0;`), **condición** (`contador <= 5`) y **avance** (`contador++`). Si falta el avance, el ciclo es infinito.

## 📂 Ejercicios

- **[Ciclo While](./Ejercicios/Ciclo%20While)** — Contar de 0 a 5 con un `while` y `contador++`.
- **[Ciclos do while](./Ejercicios/Ciclos%20do%20while)** — Contar de 1 a 3 con un `do-while`.
- **[ciclos for](./Ejercicios/ciclos%20for)** — Contar de 1 a 3 con un `for`, con `print` en una sola línea.

## 📂 Practica

- **[Numeros Pares](./Practica/Numeros%20Pares)** — Mostrar los pares con `while`, `if` y `%`.
- **[Numeros impares](./Practica/Numeros%20impares)** — Mostrar los impares con `do-while`, `if` y `%`.
- **[Numeros inversos](./Practica/Numeros%20inversos)** — Cuenta atrás del 10 al 1 con `do-while` y `contador--`.
- **[Numeros pares con ciclo for](./Practica/Numeros%20pares%20con%20ciclo%20for)** — Los pares del 0 al 20 con `for`; el mismo ejercicio que Numeros Pares, sin el ciclo infinito.
- **[Suma Acumulativa](./Practica/Suma%20Acumulativa)** — Sumar del 1 al 5 con un acumulador y `while`.
- **[Menu iterativo](./Practica/Menu%20iterativo)** — Menú que se repite con `while` + bandera `salir` + `switch`.
- **[Cajero Automatico](./Practica/Cajero%20Automatico)** — Cajero en consola: consultar, retirar y depositar con `while`, `switch`, `if/else` y `printf`.
- **[Calculadora](./Practica/Calculadora)** — Calculadora con menú: suma, resta, multiplicación y división (con control de división entre cero), usando `while`, `switch` e `if`.
- **[validacion de Pasword](./Practica/validacion%20de%20Pasword)** — Pedir un password y repetir la lectura con `while` hasta que tenga al menos 6 caracteres.
- **[juego de adivianzas](./Practica/juego%20de%20adivianzas)** — Adivinar un número aleatorio del 1 al 50 en 5 intentos, con `Random`, `while` con dos condiciones y pistas.
- **[Dibujar un rectangulo](./Practica/Dibujar%20un%20rectangulo)** — Dibuja un triángulo centrado de asteriscos con `for` y `String.repeat()` (la carpeta dice *rectángulo*, pero el ejercicio es un triángulo).
- **[Palabras BReak Coninue](./Practica/Palabras%20BReak%20Coninue)** — `break` para salir de un ciclo y `continue` para saltar a la siguiente vuelta, con dos `for`.

## ⚠️ Error que se repite

En **Numeros Pares** y **Numeros impares** (con `while` y `do-while`) el `contador++` quedó dentro del `if`, lo que provoca un ciclo infinito. Regla: el avance va fuera de la condición.

## 🔄 Estado

🔄 En progreso. Tema anterior: [`Sentecias de DEcisiones en Java/`](../Sentecias%20de%20DEcisiones%20en%20Java).