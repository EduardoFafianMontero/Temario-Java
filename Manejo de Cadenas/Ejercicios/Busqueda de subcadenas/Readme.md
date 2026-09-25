# BusquedasdeSubcadenas

## 📌 Sobre este ejercicio

Buscar la posición de una subcadena dentro de otra, con `indexOf()` (primera aparición) y `lastIndexOf()` (última aparición).

## 🧩 Qué incluye

Cadena base: `" Hola mundo"` (con un espacio al principio).

| Variable | Código | Resultado | Por qué |
| :--- | :--- | :--- | :--- |
| `indice1` | `cadena1.indexOf("Hola")` | `1` | `"Hola"` empieza en el índice 1 (el espacio inicial ocupa el índice 0) |
| `indice2` | `cadena1.lastIndexOf("mundo")` | `6` | `"mundo"` empieza en el índice 6 |
| `indice3` | `cadena1.indexOf("java")` | `-1` | No existe `"java"` en la cadena |
| `indice4` | `cadena1.lastIndexOf("java")` | `-1` | Tampoco se encuentra buscando desde el final |

## 💻 Compilar y ejecutar

```bash
javac BusquedasdeSubcadenas.java
java BusquedasdeSubcadenas
```

## 📝 Notas

- Cuando la subcadena buscada no existe, tanto `indexOf()` como `lastIndexOf()` devuelven `-1` — es el valor estándar para "no encontrado", útil para comprobarlo con un `if (indice == -1)`.
- El espacio al principio de `" Hola mundo"` desplaza todos los índices una posición respecto a si la cadena empezara directamente por `"Hola"`.