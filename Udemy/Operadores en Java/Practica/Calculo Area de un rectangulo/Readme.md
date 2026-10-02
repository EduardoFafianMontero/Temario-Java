# CalculoAreaRectanngulo

## 📌 Sobre este ejercicio

Pide la base y la altura de un rectángulo por consola, y calcula su área y su perímetro.

## 🧩 Qué incluye

| Dato | Código | Fórmula |
| :--- | :--- | :--- |
| `base` | `Integer.parseInt(consola.nextLine())` | — |
| `altura` | `Integer.parseInt(consola.nextLine())` | — |
| `area` | `base * altura` | base × altura ✅ correcta |
| `perimetroRectangulo` | `2 * (base + altura) * 2` | ⚠️ ver Notas — da el doble del valor real |

## 💻 Compilar y ejecutar

```bash
javac CalculoAreaRectanngulo.java
java CalculoAreaRectanngulo
```

## 📝 Notas

⚠️ **Esto no compila tal cual está — tres errores:**

1. `import java.util.scanner;` → `scanner` en minúscula no existe; la clase se llama `Scanner` (con mayúscula). Los nombres de clase son sensibles a mayúsculas/minúsculas en Java.
2. `var consola= ew Scanner(System.in);` → falta la `n` de `new`; tal como está (`ew Scanner(...)`), Java no reconoce esa palabra y da error de sintaxis.
3. `Integrer.parseInt(...)` → sobra una `r`, debería ser `Integer.parseInt(...)`.

⚠️ **Además, hay un error de lógica (no de compilación) en el perímetro:** la fórmula correcta del perímetro de un rectángulo es `2 * (base + altura)`. Aquí está como `2 * (base + altura) * 2`, que multiplica el resultado por 2 otra vez — así que el valor calculado sale **el doble** de lo que debería. Por ejemplo, con `base=4` y `altura=3`, el perímetro real es `14`, pero el código daría `28`. Habría que quitar el `* 2` final.

- El cálculo del área sí está bien: `base * altura` es la fórmula correcta.