# iterarArreglo

## 📌 Sobre este ejercicio

Recorre un arreglo completo con un `for`, usando `enteros.length` como límite, y muestra cada índice con su valor.

## 🧩 Qué incluye

| Código | Qué hace |
| :--- | :--- |
| `var enteros = new int[]{100,200,300,400,500};` | Arreglo con 5 valores |
| `for (var i = 0; i < enteros.length; i++)` | `i` recorre de `0` a `4` |
| `println("Valor del indice: " + i + " = " + enteros[i]);` | Muestra el índice y su valor |

**Salida esperada:**

```
Valor del indice: 0 = 100
Valor del indice: 1 = 200
Valor del indice: 2 = 300
Valor del indice: 3 = 400
Valor del indice: 4 = 500
```

## 💻 Compilar y ejecutar

```bash
javac iterarArreglo.java
java iterarArreglo
```

## 📝 Notas

✅ **Compila y funciona.**

- **`enteros.length` va sin paréntesis** (es una propiedad). En un `String` sí: `texto.length()`.
- Usar `.length` en la condición hace el código válido para **cualquier tamaño** de arreglo.
- Hay que usar `<` y no `<=`: con `<=` llegaría al índice `5` y daría `ArrayIndexOutOfBoundsException`.
- El `for` no lleva llaves porque solo tiene una instrucción; con llaves es más seguro.
- Convención: la clase debería empezar en mayúscula (`IterarArreglo`).