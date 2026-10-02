# OperadorLogico

## 📌 Sobre este ejercicio

Los 3 operadores lógicos de Java, aplicados a dos booleanos: `a = true` y `b = false`.

## 🧩 Qué incluye

| Operador | Nombre | Qué hace | Código | Resultado |
| :--- | :--- | :--- | :--- | :--- |
| `&&` | AND | `true` solo si **ambos** valores son `true` | `a && b` | `false` |
| `\|\|` | OR | `true` si **al menos uno** es `true` | `a \|\| b` | `true` |
| `!` | NOT | Invierte el valor lógico | `!a` | `false` |

## 💻 Compilar y ejecutar

```bash
javac OperadorLogico.java
java OperadorLogico
```

## 📝 Notas

⚠️ **Esto no compila tal cual está** — hay 3 errores a corregir:

1. **El nombre de la clase no coincide con el del archivo:** la clase se llama `OpeadorLogico` (falta la `r`), pero el archivo es `OperadorLogico.java`. En Java tienen que coincidir exactamente.
2. **`var resultado` está declarado 3 veces** (líneas 6, 10 y 14) dentro del mismo método — Java no permite redeclarar una variable en el mismo bloque. Se declara con `var` solo la primera vez, y en las siguientes se reasigna sin `var` (`resultado = a || b;`), como ya hiciste en `OperadoresComparacion`.
3. **Falta el `;` al final de `var resultado = !a`** (línea 14).

Detalle menor: el primer `println` abre con `***` pero no cierra con otros `***` (cosmético, no afecta a nada).