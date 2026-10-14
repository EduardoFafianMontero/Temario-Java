# sintaxisArreglos

## 📌 Sobre este ejercicio

Crea un arreglo **con sus valores desde el principio**, en una sola línea, lee sus elementos y prueba a imprimir el arreglo completo.

## 🧩 Qué incluye

| Código | Qué hace |
| :--- | :--- |
| `//int[] enteros = {100,200,300,400,500};` | Sintaxis simplificada (comentada) |
| `var enteros = new int[]{100,200,300,400,500};` | Equivalente que **sí** funciona con `var` |
| `enteros[0]` ... `enteros[4]` | Lee cada elemento |
| `println("..." + enteros)` | Intenta imprimir todo el arreglo de golpe |

## 💻 Compilar y ejecutar

```bash
javac sintaxisArreglos.java
java sintaxisArreglos
```

## 📝 Notas

⚠️ **Esto no compila tal cual está:**

1. **El archivo y la clase no coinciden:** el archivo es `sintaxisArreglos.java` pero la clase es `sintaxisrArreglos` (sobra una `r`).
2. **`println` mal escrito** en las líneas 7 a 11 y en la 13 (en la captura aparece como `pritl`).
3. **Línea 13:** `ennteros` → `enteros`.

💡 **Con `var` hay que escribir `new int[]{...}`.** La forma corta `{100, 200}` solo vale si declaras el tipo: `int[] enteros = {100, 200};`. Por eso la línea 4 está comentada.

⚠️ **Aunque lo corrijas, la última línea no muestra los valores.** Imprimir un arreglo directamente da algo como `[I@1b6d3586` (el tipo y una dirección de memoria). Para ver el contenido:

```java
import java.util.Arrays;
// ...
System.out.println(Arrays.toString(enteros));   // [100, 200, 300, 400, 500]
```