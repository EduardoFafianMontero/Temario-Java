# Constantes

## 📌 Sobre esta carpeta

Uso de `final` para declarar constantes: variables cuyo valor se fija una vez y ya no se puede reasignar. Combinado con `var`, Java infiere el tipo igual que en una variable normal, pero el valor queda bloqueado.

Está dividida en dos subcarpetas:

- **[Ejercicios/](./Ejercicios)** — Prácticas que voy haciendo sobre lo visto en teoría.
- **[Temario/](./Temario)** — Apuntes y notas de los conceptos de este tema.

## 📂 Ejercicios

- **constantes** — Declara 4 constantes con `final var`, de tipos `int`, `double` y `String`.

| Constante | Tipo inferido | Valor |
| :--- | :--- | :--- |
| `Dias_Semana` | `int` | `7` |
| `PI` | `double` | `3.1416` |
| `Mensaje_Biemvenida` | `String` | `"Bienbenido a mi repositorio"` |
| `minutos_por_segundo` | `int` | `60` |

*(Esta lista se irá ampliando a medida que añada más ejercicios.)*

## 💻 Compilar y ejecutar

```bash
javac Ejercicios/constantes.java
java -cp Ejercicios constantes
```

## 📝 Notas

- ⚠️ Por convención en Java, las constantes (`final`) se nombran en **MAYÚSCULAS con guion bajo**: `DIAS_SEMANA`, `PI`, `MENSAJE_BIENVENIDA`, `MINUTOS_POR_SEGUNDO`. Aquí solo `PI` sigue esa convención — el resto mezcla mayúscula inicial con `snake_case`, que no es ni `camelCase` (variables normales) ni `SCREAMING_SNAKE_CASE` (constantes).
- Typos en los textos: `"Biemvenida"` → `"Bienvenida"`, `"Bienbenido"` → `"Bienvenido"` (no afectan a la compilación, solo al texto impreso).
- Intentar reasignar cualquiera de estas variables más adelante en el código daría un error de compilación, precisamente por ser `final`.