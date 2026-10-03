# SeteciaIf

## 📌 Sobre este ejercicio

Continúa el ejercicio anterior añadiendo `else`: ahora el programa cubre **los dos caminos posibles**, no solo el caso en que la condición se cumple.

## 🧩 Qué incluye

| Código | Qué hace |
| :--- | :--- |
| `var edad = 10;` | Variable de prueba (esta vez menor de edad) |
| `if (edad >= 18) { ... }` | Se ejecuta si la condición es `true` |
| `else { ... }` | Se ejecuta si la condición es `false` — la alternativa |

Con `edad = 10`, la condición del `if` es `false`, así que salta al `else` e imprime `"Eres menor de edad"`.

## 💻 Compilar y ejecutar

```bash
javac SeteciaIf.java
java SeteciaIf
```

## 📝 Notas

⚠️ **Mismos dos errores que en el ejercicio anterior, en la firma del método:**

1. `mai` en vez de `main`.
2. `Strig[]` en vez de `String[]`.

- La diferencia clave con el ejercicio anterior: antes, si `edad < 18`, el programa simplemente no imprimía nada (no había ningún camino alternativo). Ahora, con `else`, siempre se ejecuta uno de los dos bloques — nunca se queda sin imprimir nada.
- Aquí el archivo se llama igual que el del ejercicio anterior (`SeteciaIf.java`), pero al estar en una carpeta distinta no hay conflicto.