# NumerosInversos

## 📌 Sobre este ejercicio

Cuenta hacia atrás del 10 al 1 con un `do-while` y un contador que **decrementa**.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Contador | `var contador = 10;` | Empieza en el valor más alto |
| Bloque | `System.out.println(contador--);` | Imprime y **después** resta 1 (post-decremento) |
| Condición | `while (contador > 0);` | Repite mientras sea mayor que 0 |

**Salida esperada:** `10 9 8 7 6 5 4 3 2 1` (uno por línea).

## 💻 Compilar y ejecutar

```bash
javac NumerosInversos.java
java NumerosInversos
```

## 📝 Notas

⚠️ **Esto no compila tal cual está — dos errores:**

1. **El nombre de la clase no coincide con el del archivo.** El archivo es `NumerosInversos.java` pero la clase se llama `NumeroInnvesos`. En Java, una clase `public` debe llamarse exactamente igual que su archivo. Debería ser `public class NumerosInversos`.
2. `system.out.println(...)` → `System` lleva la **S mayúscula**.

- El título dice "del 1 al 10" pero cuenta de 10 a 1; mejor `"*** Numeros Inversos del 10 al 1 ***"`.
- Aquí el avance (`contador--`) sí está bien colocado, dentro del `println` y fuera de cualquier `if`, por eso el ciclo termina.