# OperadoresAsignacion

## 📌 Sobre este ejercicio

Asignación simple (`=`) y asignación compuesta (`+=`, `*=`, y por nombre en el comentario `-=`, `/=`, `%=`, aunque solo se usan las dos primeras), más declarar varias variables en una sola línea.

## 🧩 Qué incluye

| Paso | Código | Valor de `minumero` después |
| :--- | :--- | :--- |
| Asignación simple | `var minumero = 10;` | `10` |
| Asignación compuesta `+=` | `minumero += 5;` (equivale a `minumero = minumero + 5`) | `15` |
| Asignación compuesta `*=` | `minumero *= 2;` (equivale a `minumero = minumero * 2`) | `30` *(no se llega a imprimir — ver Notas)* |
| Variables múltiples | `int a= 10, b =15, c=20;` | `a=10, b=15, c=20` |

## 💻 Compilar y ejecutar

```bash
javac OperadoresAsignacion.java
java OperadoresAsignacion
```

## 📝 Notas

- ⚠️ **Esto no compila tal cual está** — el segundo `println` tiene dos errores:
  - `System.out.pritntln(...)` → falta la `l`, debería ser `println`.
  - Usa la variable `minuemro`, que no existe — la variable se llama `minumero`. Hay que corregir ambos para que compile.
- `minumero2` se declara y se le asigna `15`, pero no se llega a usar en ningún `println` — no da error (en Java está permitido), pero es una variable "muerta" que no aporta nada al resultado.
- El comentario menciona `-=`, `/=` y `%=`, pero el código solo llega a usar `+=` y `*=` — si quieres cubrir los 5 operadores compuestos, faltarían esos tres por añadir.
- `int a= 10, b =15, c=20;` es la misma idea que ya vimos en `OperadoresAritmeticos`: declarar varias variables del mismo tipo en una línea, separadas por comas.