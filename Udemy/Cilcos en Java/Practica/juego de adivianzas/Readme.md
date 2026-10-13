# JuegoAdivinanzas

## 📌 Sobre este ejercicio

El programa elige un número secreto al azar entre 1 y 50 y el jugador tiene **5 intentos** para adivinarlo. Después de cada intento recibe una pista (mayor o menor). Combina `Random`, `Scanner`, un `while` con **dos condiciones**, `if / else if` y `printf`.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Aleatorio | `random.nextInt(50) + 1` | `nextInt(50)` da de 0 a 49; el `+ 1` lo pasa a 1–50 |
| Constante | `final var INTENTOS_MAXIMOS = 5;` | Límite de intentos; en MAYÚSCULAS por convención |
| Contador | `var intentos = 0;` | Cuenta los intentos gastados |
| Estado inicial | `var adivinanza = 0;` | Valor que no puede ser el secreto, para que el ciclo arranque |
| Ciclo | `while (adivinanza != numeroSecreto && intentos < INTENTOS_MAXIMOS)` | Sigue mientras **no haya acertado Y queden intentos** |
| Pistas | `if (adivinanza < numeroSecreto) ... else if (adivinanza > numeroSecreto)` | Orienta al jugador |
| Avance | `intentos++;` | Al final de cada vuelta |
| Resultado | `if (adivinanza == numeroSecreto) {...} else {...}` | Distingue ganar de quedarse sin intentos |

## 💻 Compilar y ejecutar

```bash
javac JuegoAdivinanzas.java
java JuegoAdivinanzas
```

## 📝 Notas

✅ **Compila y funciona.** Es el primer ejercicio del tema con un ciclo que puede terminar de **dos formas distintas**: acertando, o agotando los intentos. Por eso, después del `while`, hay que volver a comprobar cuál de las dos pasó.

- **`&&` en la condición del ciclo:** el ciclo continúa solo si se cumplen **las dos** cosas. En cuanto una falla (acertó o no quedan intentos), sale.
- **Por qué `adivinanza = 0` al principio:** como el secreto va de 1 a 50, el 0 nunca coincide, y el ciclo entra siempre al menos una vez.
- **Constante bien escrita:** `INTENTOS_MAXIMOS` sigue la convención de mayúsculas con guion bajo. Es la que conviene usar siempre en las constantes.
- Si el jugador escribe una letra en vez de un número, `nextInt()` lanza `InputMismatchException` y el programa se cae.
- No se valida el rango: se puede escribir `500` o `-3` y se gasta un intento.
- Errata en el mensaje de victoria: `advinaste` → `adivinaste`.
- **Mejora posible:** mostrar los intentos que quedan después de cada fallo (`INTENTOS_MAXIMOS - intentos`).