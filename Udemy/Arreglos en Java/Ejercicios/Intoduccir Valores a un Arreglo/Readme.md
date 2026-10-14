# valoresArreglos

## 📌 Sobre este ejercicio

Pide por consola **el tamaño** del arreglo y **cada uno de sus valores**, y al final los imprime. Combina `Scanner`, `Integer.parseInt` y dos ciclos `for`.

## 🧩 Qué incluye

| Paso | Código | Qué hace |
| :--- | :--- | :--- |
| Tamaño | `Integer.parseInt(consola.nextLine())` | Lee cuántos elementos tendrá |
| Crear | `new int[largoArreglo]` | Arreglo del tamaño elegido (en tiempo de ejecución) |
| Rellenar | `for` con `enteros[i] = Integer.parseInt(consola.nextLine());` | Pide cada valor |
| Mostrar | segundo `for` con `println("enteros[" + i + "] = " + enteros[i])` | Imprime todos |

**Ejemplo de ejecución:**

```
Proporciona el largo del arreglo: 3
Proporciona enteros[0] = 10
Proporciona enteros[1] = 20
Proporciona enteros[2] = 30

Impresión del Arreglo:
enteros[0] = 10
enteros[1] = 20
enteros[2] = 30
```

## 💻 Compilar y ejecutar

```bash
javac valoresArreglos.java
java valoresArreglos
```

## 📝 Notas

✅ **Compila y funciona.**

- **Dos `for` con la misma forma:** uno para **llenar** y otro para **leer**. El índice `i` va de `0` a `largoArreglo - 1`.
- `Integer.parseInt(consola.nextLine())` evita el problema de `nextInt()` con el salto de línea pendiente.
- Si se escribe una letra, lanza `NumberFormatException`; si el tamaño es negativo, `NegativeArraySizeException`.
- Convención: la clase debería empezar en mayúscula (`ValoresArreglos`).
- La carpeta se llama `Intoduccir Valores a un Arreglo` (con errata); si la corriges, cambia también el enlace en el Readme del tema.