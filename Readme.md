# Matrices en Java

## 📌 Sobre esta carpeta

Una **matriz** es un arreglo de arreglos: una tabla con **filas y columnas**. Aquí veo cómo declararla, darle valores y acceder a ellos con dos índices. Más adelante se recorrerá con dos `for` anidados.

Está dividida en tres subcarpetas:

- **[Ejercicios/](./Ejercicios)** — Ejercicios que sigo del curso.
- **[Practicas/](./Practicas)** — Práctica libre sobre este tema.
- **[Temario/](./Temario)** — Apuntes y notas de los conceptos.

## 🧱 Las matrices de un vistazo

| Concepto | Ejemplo | Significado |
| :--- | :--- | :--- |
| Declarar y crear | `new int[2][3]` | 2 filas y 3 columnas, todas a `0` |
| Acceder | `matriz[1][2]` | Fila 1, columna 2 |
| Modificar | `matriz[0][0] = 100;` | Cambia ese elemento |
| Nº de filas | `matriz.length` | Cantidad de filas |
| Nº de columnas | `matriz[0].length` | Cantidad de columnas de la fila 0 |

El orden siempre es **`[fila][columna]`**, y ambos índices empiezan en **0**.

## 📂 Ejercicios

- **[Matices](./Ejercicios/Matices)** — Crear una matriz de 2x3, asignarle valores y leer algunos elementos por sus dos índices.
- **[Recorrer una Matriz](./Ejercicios/Recorrer%20una%20Matriz)** — Recorrer toda la matriz con dos `for` anidados: uno para las filas y otro para las columnas.
- **[Sintaxis Simplificadasen Java](./Ejercicios/Sintaxis%20Simplificadasen%20Java)** — Crear la matriz con sus valores en una sola expresión y recorrerla con `.length`, sin constantes.
- **[Introducir a Datos](./Ejercicios/Introducir%20a%20Datos)** — Pedir por consola el tamaño y los valores de una matriz con `Scanner` y dos `for` anidados, y luego imprimirla.

*(Esta lista se irá ampliando a medida que añada más ejercicios.)*

## 📂 Practicas

- **[Suma Diagonal de una Matriz](./Practicas/Suma%20Diagonal%20de%20una%20Matriz)** — Pedir una matriz por consola y sumar los elementos de su diagonal principal (`ren == col`).

## 🔄 Estado

🔄 En progreso. Tema anterior: [`Arreglos en Java/`](../Arreglos%20en%20Java).