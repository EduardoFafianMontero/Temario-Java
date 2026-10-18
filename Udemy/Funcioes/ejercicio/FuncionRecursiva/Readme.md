# Funciones (recursiva)

## 📌 Sobre este ejercicio

Una función que **se llama a sí misma**: `funcionRecursiva` imprime los números del `1` al `10` en orden ascendente. Toda recursión necesita un **caso base** (cuándo parar) y un **caso recursivo** (cómo acercarse al caso base).

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Definición | `static void funcionRecursiva(int numero)` | Recibe el número desde el que empieza |
| Caso base | `if (numero == 1) print(numero + " ");` | Cuando llega a 1, imprime y **deja de llamarse** |
| Caso recursivo | `funcionRecursiva(numero - 1);` | Se llama a sí misma con un número menor |
| Impresión tras la llamada | `print(numero + " ");` | Se ejecuta **al volver** de la llamada recursiva |
| Llamada inicial | `funcionRecursiva(10);` | Arranca todo desde el 10 |

**Salida esperada:**

```
1 2 3 4 5 6 7 8 9 10 
```

### 🔎 Cómo se ejecuta (con `funcionRecursiva(3)` para simplificar)

```
funcionRecursiva(3)
 └─ llama a funcionRecursiva(2)
     └─ llama a funcionRecursiva(1)
         └─ caso base: imprime "1 "
     └─ vuelve a (2): imprime "2 "
 └─ vuelve a (3): imprime "3 "
```

| Fase | Qué ocurre |
| :--- | :--- |
| **Bajada** | 10 → 9 → 8 → … → 1. Nada se imprime todavía, solo se apilan llamadas |
| **Caso base** | En 1 imprime `1` |
| **Subida** | Cada llamada pendiente retoma y imprime su número: 2, 3, … 10 |

Por eso salen **ascendentes** aunque se empiece en 10: el `print` está **después** de la llamada recursiva.

## 💻 Compilar y ejecutar

```bash
javac FuncionRecursiva.java
java FuncionRecursiva
```

## 📝 Notas

✅ **Compila y funciona.**

- **Comentario desfasado:** dice `Imprimir 1 al 5`, pero `main` llama con `10`, así que imprime del 1 al 10. Conviene actualizar el comentario.
- **Orden importante:** si se pusiera el `print` **antes** de la llamada recursiva, saldría `10 9 8 … 1` (descendente).
- **Riesgo de `StackOverflowError`:** si se llama con `0` o un negativo, `numero == 1` nunca se cumple y la función se llama sin parar hasta desbordar la pila. Una protección típica es `if (numero <= 1)` como caso base.
- Cada llamada se guarda en la **pila** (*stack*) hasta que termina. Con números muy grandes (miles) también puede desbordarse.
- Este mismo ejercicio se resuelve con un `for` en una línea; la recursión es más útil en problemas como el factorial, Fibonacci o recorrer estructuras en árbol.
- La salida queda en una sola línea con un espacio al final porque usa `print` y no `println`.