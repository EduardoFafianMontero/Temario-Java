# Generadoremail

## 📌 Sobre este ejercicio

Reto del curso: generar una dirección de email a partir de un nombre completo y una empresa, normalizando el texto (sin espacios, en minúsculas).

## 🧩 Qué incluye

| Dato | Valor de entrada | Tras normalizar |
| :--- | :--- | :--- |
| Nombre | `"Eduardo Fafian Motero"` | `"eduardo.fafian.motero"` |
| Empresa | `"Fenando Wirtz"` | `"fenando.wirtz"` |
| Dominio | `".com"` | — |

**Resultado final:** `eduardo.fafian.motero@fenando.wirtz.com`

## 💻 Compilar y ejecutar

```bash
javac Generadoremail.java
java Generadoremail
```

## 📝 Notas

- La normalización combina 3 métodos encadenados: `.strip()` (quita espacios sobrantes al principio/final), `.replace(" ", ".")` (sustituye espacios internos por puntos) y `.toLowerCase()` (todo a minúsculas) — un buen ejemplo de cómo encadenar varios métodos de `String` en una sola línea.
- `.strip()` hace lo mismo que `.trim()` (visto en `Método de Cadenas`), pero es la versión más moderna, con mejor soporte para espacios Unicode.
- Los valores de entrada tienen algún nombre con typo (`"Fenando"`, `"Motero"`) — es solo el dato de prueba, no afecta al funcionamiento del programa.