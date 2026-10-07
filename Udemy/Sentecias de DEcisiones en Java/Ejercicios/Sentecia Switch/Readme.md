# DiadelaSemana

## 📌 Sobre este ejercicio

El mismo ejercicio que `Sentecia Switch`, reescrito con la sintaxis **moderna** de `switch` (Java 14+): cada `case` usa `->` en vez de `:` + `break;`.

## 🧩 Qué incluye

Misma tabla de resultados que la versión clásica (día 1 = Lunes, ..., día 7 = Domingo, cualquier otro = "Día no válido"), pero escrita como:

```java
case 1 -> System.out.print("Lunes");
```

en vez de:

```java
case 1:
    System.out.print("Lunes");
    break;
```

## 💻 Compilar y ejecutar

```bash
javac DiadelaSemana.java
java DiadelaSemana
```

## 📝 Notas

✅ **Este compila y funciona sin errores** — buena comparación directa con la versión clásica, que tenía varios fallos.

- Con `->`, cada `case` ejecuta **solo** esa línea y sale automáticamente del `switch` — no hace falta (ni se puede) poner `break;`, así que desaparece de raíz el error típico de "olvidar el break" que existe en la sintaxis clásica (donde, sin `break`, la ejecución "cae" al siguiente `case`).
- También evita el error que tenía la versión clásica (`case1:` sin espacio) porque la sintaxis con flecha obliga a una estructura distinta donde ese fallo concreto no es posible.
- Esta es la forma recomendada de escribir `switch` en Java moderno cuando todos los casos son así de simples (una sola instrucción cada uno).