# PrecedenciaOpeadores

## 📌 Sobre este ejercicio

Repaso del orden de precedencia de operadores en Java (de mayor a menor prioridad, según los comentarios del código): paréntesis/corchetes, unarios, `*`/`/`/`%`, `+`/`-`, relacionales, igualdad, lógicos, y asignación. Lo aplica resolviendo una expresión aritmética paso a paso.

## 🧩 Qué incluye

Expresión: `var a = 12 / 3 + 2 * 3 - 1;`

| Paso | Operación | Resultado parcial |
| :--- | :--- | :--- |
| 1 | División: `12 / 3` | `4` |
| 2 | Multiplicación: `2 * 3` | `6` |
| 3 | Suma: `4 + 6` | `10` |
| 4 | Resta: `10 - 1` | `9` |

**Resultado final:** `a = 9`.

## 💻 Compilar y ejecutar

```bash
javac PrecedenciaOpeadores.java
java PrecedenciaOpeadores
```

## 📝 Notas

⚠️ **Esto no compila tal cual está — y el motivo es más de fondo que un simple typo:**

1. **Falta la clase que envuelve todo el código.** El archivo empieza directamente con `public static void main(...)`, sin una línea `public class PrecedenciaOpeadores{` antes. En Java, todo método tiene que vivir dentro de una clase — un método suelto al nivel más alto del archivo no es válido.
2. **El método `main` está duplicado, uno dentro del otro:** hay dos líneas `public static void main(String[] args) {` seguidas, y todo el contenido real (los comentarios y el cálculo) queda dentro de la segunda. Java no permite declarar un método dentro de otro método — hay que quitar una de las dos líneas duplicadas.

**Para que compile**, la estructura correcta sería:

```java
public class PrecedenciaOpeadores {
    public static void main(String[] args) {
        // todo el contenido actual, una sola vez
    }
}
```

- La precedencia que demuestra el ejercicio es correcta: multiplicación/división siempre se resuelven antes que suma/resta, de izquierda a derecha cuando hay varias del mismo nivel — por eso `12/3` y `2*3` se calculan antes que la suma y la resta finales, sin importar el orden en que están escritas en la expresión.