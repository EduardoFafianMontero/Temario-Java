# indicescadena

## 📌 Sobre este ejercicio

Acceder a un carácter concreto dentro de un `String` usando `charAt(indice)`, teniendo en cuenta que el índice empieza en `0`.

## 🧩 Qué incluye

Cadena base: `"Hola mundo"`.

| Variable | Código | Índice | Carácter obtenido |
| :--- | :--- | :--- | :--- |
| `primercaracter` | `cadena1.charAt(0)` | `0` | `'H'` (primer carácter) |
| `ultimocaracter` | `cadena1.charAt(9)` | `9` | `'o'` (último carácter — `"Hola mundo"` tiene 10 caracteres, índices `0` a `9`) |
| `letram` | `cadena1.charAt(5)` | `5` | `'m'` |

## 💻 Compilar y ejecutar

```bash
javac indicescadena.java
java indicescadena
```

## 📝 Notas

- `charAt()` devuelve un `char`, no un `String` — por eso `var` infiere `char` en las tres variables.
- El índice del último carácter siempre es `longitud - 1`, nunca `longitud`, porque se empieza a contar desde `0`. Intentar `charAt(10)` en esta cadena daría un error (`StringIndexOutOfBoundsException`).