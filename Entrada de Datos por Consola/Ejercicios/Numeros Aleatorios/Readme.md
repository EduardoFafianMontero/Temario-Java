# NumerosAleatorios

## 📌 Sobre este ejercicio

Generar números aleatorios con la clase `Random`: un entero en un rango, un decimal, y simular el lanzamiento de un dado.

## 🧩 Qué incluye

| Variable | Código | Rango posible |
| :--- | :--- | :--- |
| `numeroAleatorio` (1ª vez) | `random.nextInt(10)` | `0` a `9` |
| `numeroAleatorio` (2ª vez) | `random.nextInt(10)+1` | `1` a `10` |
| `flotanteAleatorio` | `random.nextFloat()` | `0.0` (incluido) a `1.0` (excluido) |
| `dado` | `random.nextInt(6)+1` | `1` a `6` |

## 💻 Compilar y ejecutar

```bash
javac NumerosAleatorios.java
java NumerosAleatorios
```

## 📝 Notas

- `Random` está en el paquete `java.util`, igual que `Scanner`.
- `random.nextInt(n)` siempre devuelve un valor entre `0` (incluido) y `n` (**excluido**) — por eso, para simular un dado de 6 caras (`1` a `6`), hace falta `nextInt(6) + 1`: sin el `+1`, el rango sería `0` a `5`.
- `nextFloat()` da un decimal entre `0.0` y `1.0` — para llevarlo a otro rango (por ejemplo, `0.0` a `100.0`) habría que multiplicarlo, algo como `random.nextFloat() * 100`.