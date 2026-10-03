# SeteciaIf

## 📌 Sobre este ejercicio

Encadena una tercera posibilidad con `else if`: ahora hay 3 caminos distintos según el valor de `edad`, no solo 2.

## 🧩 Qué incluye

| Condición | Rango | Resultado |
| :--- | :--- | :--- |
| `if (edad >= 18)` | 18 o más | `"Eres mayor de edad"` |
| `else if (edad >= 13 && edad < 18)` | 13 a 17 | `"Eres un adolescente"` |
| `else` | Resto (menos de 13) | `"Eres un niño"` |

Con `edad = 16`: no cumple la primera condición (`16 >= 18` es `false`), pero sí la segunda (`16 >= 13 && 16 < 18` es `true`) → imprime `"Eres un adolescente"`.

## 💻 Compilar y ejecutar

```bash
javac SeteciaIf.java
java SeteciaIf
```

## 📝 Notas

⚠️ **Mismos dos errores de firma que en los dos ejercicios anteriores:** `mai` en vez de `main`, y `Strig[]` en vez de `String[]`.

- Java evalúa las condiciones **en orden, de arriba a abajo**, y se queda con la primera que sea `true` — por eso en el `else if` no hace falta repetir `edad < 18` como límite superior ya cubierto por el primer `if` (aunque aquí sí se repite explícitamente con `&& edad < 18`, que no está mal, solo es redundante: si el código llega a esa línea, ya sabe que `edad < 18` porque si no, el primer `if` ya lo habría capturado).
- El `else` final actúa como "todo lo demás" — no necesita ninguna condición propia, cubre cualquier caso que no haya entrado en los anteriores.