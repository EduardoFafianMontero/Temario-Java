# CicloWhile

## 📌 Sobre este ejercicio

Primer ciclo `while`: imprime los números del 0 al 5 incrementando un contador.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Contador | `var contador = 0;` | Inicio del ciclo |
| Condición | `while (contador <= 5)` | Repite mientras sea `true` |
| Salida y avance | `System.out.println(contador++);` | Imprime el valor y **después** suma 1 (post-incremento) |

**Salida esperada:** `0 1 2 3 4 5` (uno por línea).

## 💻 Compilar y ejecutar

```bash
javac CicloWhile.java
java CicloWhile
```

## 📝 Notas

⚠️ **Esto no compila tal cual está — dos errores de escritura:**

1. `whyle(contador <= 5)` → la palabra reservada es `while`.
2. `System.out.pintln(...)` → falta la `r`, es `println`.

- Aquí el avance va dentro del `println` con `contador++`: imprime el valor actual y luego lo incrementa. Por eso no hace falta una línea aparte.