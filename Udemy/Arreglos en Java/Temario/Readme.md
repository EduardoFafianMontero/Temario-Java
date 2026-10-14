# Temario · Arreglos en Java

## 🧱 ¿Qué es un arreglo?

Una estructura de **tamaño fijo** que guarda varios valores del **mismo tipo**, cada uno en una posición numerada llamada **índice**. El primer índice es `0`; el último es `length - 1`.

| Índice | 0 | 1 | 2 | 3 | 4 |
| :--- | :---: | :---: | :---: | :---: | :---: |
| Valor | 100 | 200 | 300 | 400 | 500 |

## 📝 Formas de crear un arreglo

```java
int[] a;                          // 1. declarar
a = new int[3];                   // 2. inicializar (3 posiciones, todas a 0)
int[] b = new int[2];             // 3. declarar e inicializar a la vez
int[] c = {100, 200, 300};        // 4. sintaxis simplificada, con valores
var d = new int[]{100, 200, 300}; // 5. con var hay que usar new int[]{...}
```

⚠️ La sintaxis `{100, 200}` sola **solo funciona al declarar con el tipo** (`int[] c = {...}`). Con `var` es obligatorio `new int[]{...}`.

## 🔢 Valores por defecto

Al crear un arreglo con `new`, todas las posiciones se llenan solas:

| Tipo | Valor inicial |
| :--- | :--- |
| `int`, `long`... | `0` |
| `double`, `float` | `0.0` |
| `boolean` | `false` |
| `String` y objetos | `null` |

## 🔍 Acceder y modificar

```java
enteros[0] = 13;                   // modificar
System.out.println(enteros[0]);    // leer
```

## 🔁 Recorrer con `for`

```java
for (var i = 0; i < enteros.length; i++) {
    System.out.println(enteros[i]);
}
```

| | Arreglo | `String` |
| :--- | :--- | :--- |
| Tamaño | `enteros.length` | `texto.length()` |

## ⚠️ Errores típicos

- **`ArrayIndexOutOfBoundsException`:** acceder a una posición que no existe. Un arreglo de 5 elementos llega hasta el índice `4`; `enteros[5]` falla.
- **Empezar a contar en 1:** el primer elemento es el `[0]`.
- **`<=` en vez de `<`** en el `for`: `i <= enteros.length` pasa de largo y da error.
- **Imprimir el arreglo directamente:** `System.out.println(enteros)` no muestra los valores, sino algo como `[I@1b6d3586`. Para verlos: `Arrays.toString(enteros)` (con `import java.util.Arrays;`) o recorrerlo con un `for`.
- **Tamaño negativo:** `new int[-1]` lanza `NegativeArraySizeException`.
- **Tamaño fijo:** un arreglo no crece; si hace falta más espacio, hay que crear otro.