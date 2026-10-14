# Arreglos en Java

## 📌 Sobre esta carpeta

Los **arreglos** (*arrays*) guardan **varios valores del mismo tipo** en una sola variable, en vez de crear una variable por cada dato. Aquí veo cómo declararlos, inicializarlos, leer y modificar sus elementos y recorrerlos con un `for`.

Está dividida en tres subcarpetas:

- **[Ejercicios/](./Ejercicios)** — Ejercicios que sigo del curso.
- **[Practica/](./Practica)** — Práctica libre sobre este tema.
- **[Temario/](./Temario)** — Apuntes y notas de los conceptos.

## 🧱 Los arreglos de un vistazo

| Concepto | Ejemplo | Significado |
| :--- | :--- | :--- |
| Declarar | `int[] enteros;` | Anuncia que existirá un arreglo de enteros |
| Crear con tamaño | `new int[5]` | 5 posiciones, todas a `0` |
| Crear con valores | `new int[]{100, 200, 300}` | Tamaño 3, con esos valores |
| Acceder | `enteros[0]` | Primer elemento (el índice empieza en **0**) |
| Modificar | `enteros[1] = 21;` | Cambia el segundo elemento |
| Tamaño | `enteros.length` | Cantidad de elementos (**sin paréntesis**) |

## 📂 Ejercicios

- **[Declarar e inicializar Areglo](./Ejercicios/Declarar%20e%20inicializar%20Areglo)** — Las tres formas de declarar e inicializar un arreglo con `new`.
- **[Modificar Valores de un Arreglo](./Ejercicios/Modificar%20Valores%20de%20un%20Arreglo)** — Asignar valores a posiciones concretas con el índice.
- **[Leer los valores de un arreglo](./Ejercicios/Leer%20los%20valores%20de%20un%20arreglo)** — Mostrar elementos concretos por su índice.
- **[Sintaxis Simplificada de Areglos](./Ejercicios/Sintaxis%20Simplificada%20de%20Areglos)** — Crear un arreglo con sus valores en una línea y por qué imprimirlo directamente no sirve.
- **[Intoduccir Valores a un Arreglo](./Ejercicios/Intoduccir%20Valores%20a%20un%20Arreglo)** — Pedir el tamaño y los valores por consola con `Scanner` y un `for`.
- **[Iterar un Arreglo](./Ejercicios/Iterar%20un%20Arreglo)** — Recorrer un arreglo completo con `for` y `.length`.

## 📂 Practica

- **[Promedio de calificaciones](./Practica/Promedio%20de%20calificaciones)** — Pedir N notas, guardarlas en un arreglo y calcular el promedio.

## 🔄 Estado

🔄 En progreso. Tema anterior: [`Cilcos en Java/`](../Cilcos%20en%20Java).