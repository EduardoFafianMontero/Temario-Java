# Arreglo

## 📌 Sobre este ejercicio

Primer contacto con los arreglos: declarar uno, inicializarlo con `new` y hacer las dos cosas a la vez. El programa no imprime nada; solo muestra la sintaxis.

## 🧩 Qué incluye

| Paso | Código | Qué hace |
| :--- | :--- | :--- |
| 1. Declarar | `int[] enteros;` | Anuncia el arreglo, sin reservar espacio todavía |
| 2. Inicializar | `enteros = new int[3];` | Reserva 3 posiciones (todas a `0`) |
| 3. Declarar e inicializar | `int[] numeros = new int[2];` | Las dos cosas en una línea |

## 💻 Compilar y ejecutar

```bash
javac Arreglo.java
java Arreglo
```

## 📝 Notas

⚠️ **Esto no compila tal cual está — dos errores:**

1. Línea 7: `new it[3]` → el tipo se llama `int`: `new int[3]`.
2. Línea 9: falta el `;` al final de `int [] numeros = new int[2]`.

- Al ejecutarlo sin errores no sale nada por pantalla, porque no hay ningún `println`.
- Es mejor escribir `int[]` junto, sin espacio, aunque `int []` también funciona.
- El parámetro de `main` se escribe `args` por convención (aquí `ags`; funciona igual).
- Errata en los comentarios: `u arreglo` → `un arreglo`, `iicializar` → `inicializar`.