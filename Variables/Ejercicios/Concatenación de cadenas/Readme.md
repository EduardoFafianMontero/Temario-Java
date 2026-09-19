# Concatenación de cadenas

## 📌 Sobre esta carpeta

Unir dos o más `String` en uno solo, usando el operador `+`.

Está dividida en dos subcarpetas:

- **[Ejercicios/](./Ejercicios)** — Prácticas que voy haciendo sobre lo visto en teoría.
- **[Temario/](./Temario)** — Apuntes y notas de los conceptos de este tema.

## 📂 Ejercicios

- **ConcatenacionCadenas** — Declara `nombre` y `apellido` por separado y los une en `nombrecompleto` con `+`.

*(Esta lista se irá ampliando a medida que añada más ejercicios.)*

## 💻 Compilar y ejecutar

```bash
javac Ejercicios/ConcatenacionCadenas.java
java -cp Ejercicios ConcatenacionCadenas
```

## 🔄 Estado

En progreso.

## 📝 Notas

- ⚠️ **Esto no compila tal cual está:** la línea `var nombrecompleto= nombre + apellido:` termina en `:` (dos puntos) en vez de `;` (punto y coma). Hay que cambiarlo o dará error de sintaxis.
- El `+` concatena `nombre` y `apellido` pegados, sin espacio entre ellos → el resultado sería `"EduFafián"`. Si se quiere `"Edu Fafián"`, hay que añadir un espacio: `nombre + " " + apellido`.