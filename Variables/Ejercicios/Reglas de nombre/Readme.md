# Reglas de nombre

## 📌 Sobre este ejercicio

Qué nombres de variable son válidos en Java (reglas del lenguaje) y cuáles, aun siendo válidos, no siguen las buenas prácticas de estilo (convención `camelCase`).

El detalle de cada caso está comentado directamente en el código, junto a cada declaración.

## 🧩 Casos que cubre

- Nombre en `camelCase` (correcto y buena práctica): `nombreCompleto`.
- Nombre empezando por mayúscula (válido, pero no es buena práctica — las mayúsculas al inicio se reservan por convención para clases).
- Guion medio en el nombre (`nombre-cliente`) → **no válido**, Java no lo permite.
- `snake_case` (`nombre_cliente`): válido, pero no sigue la convención de Java.
- Nombre empezando por `_` o `$` (`_apellido`, `$apellido`): válidos, pero tampoco recomendados salvo casos concretos.
- `totalPiezas`, `esCasado`: correctos y con buenas prácticas — el estilo a seguir en el resto del repositorio.

## 💻 Compilar y ejecutar

```bash
javac ReglasNombresVariables.java
java ReglasNombresVariables
```

## 📝 Notas

- ⚠️ El nombre de la clase en el código es `ReglasNombresVaiables` (sin la primera `r` de "Variables"), pero el archivo se llama `ReglasNombresVariables.java`. En Java el nombre de la clase pública y el del archivo deben coincidir exactamente, así que esto dará error al compilar — solo hay que renombrar la clase o el archivo para que coincidan.
- Java permite letras, dígitos, `_` y `$` en los nombres de variable (no pueden empezar por un dígito), pero eso no significa que todo lo permitido sea buena práctica.