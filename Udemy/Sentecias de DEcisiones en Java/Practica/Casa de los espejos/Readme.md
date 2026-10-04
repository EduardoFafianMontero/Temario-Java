# CasaEspejo

## 📌 Sobre este ejercicio

Comprueba si alguien puede entrar a una atracción según dos condiciones a la vez: que **no** tenga miedo a la oscuridad y que tenga al menos 10 años.

## 🧩 Qué incluye

| Código | Qué hace |
| :--- | :--- |
| `edad` | Edad introducida por consola (`int`) |
| `miedoOscuridad` | Si tiene miedo a la oscuridad (`boolean`) |
| `if (!miedoOscuridad && edad >= 10)` | Puede entrar solo si **no** tiene miedo **y** tiene 10 años o más |
| `else` | En cualquier otro caso, no puede entrar |

## 💻 Compilar y ejecutar

```bash
javac CasaEspejo.java
java CasaEspejo
```

## 📝 Notas

✅ **Este compila y funciona sin errores.**

- Combina `!` (niega `miedoOscuridad`) con `&&` (exige que las dos condiciones se cumplan a la vez) — el mismo patrón que `Sistema Bancario`, pero aquí con dos condiciones en vez de una sola.
- Las dos condiciones son independientes: alguien sin miedo pero menor de 10 años no entra, igual que alguien mayor de 10 pero con miedo. Solo entra quien cumple ambas.