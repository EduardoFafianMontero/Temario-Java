# Tipo VAR

## 📌 Sobre esta carpeta

Uso de la palabra clave `var` (disponible desde Java 10) para inferencia de tipos: en vez de escribir el tipo explícitamente, Java lo deduce a partir del valor asignado.

Está dividida en dos subcarpetas:

- **[Ejercicios/](./Ejercicios)** — Prácticas que voy haciendo sobre lo visto en teoría.
- **[Temario/](./Temario)** — Apuntes y notas de los conceptos de este tema.

## 📂 Ejercicios

- **TipoVar** — Compara declarar una variable con tipo explícito (`String`) frente a usar `var`, y varios ejemplos de `var` infiriendo `int`, `double`, `boolean` y `char`.

| Variable | Declaración | Tipo inferido |
| :--- | :--- | :--- |
| `nombre1` | `String nombre1="Juan";` | `String` (explícito, sin `var`) |
| `nombre2` | `var nombre2="Carlos";` | `String` |
| `edad` | `var edad=22;` | `int` |
| `sueldo` | `var sueldo=5000.99;` | `double` |
| `esCasado` | `var esCasado=false;` | `boolean` |
| `genero` | `var genero='M';` | `char` |

*(Esta lista se irá ampliando a medida que añada más ejercicios.)*

## 💻 Compilar y ejecutar

```bash
javac Ejercicios/TipoVar.java
java -cp Ejercicios TipoVar
```

## 🔄 Estado

En progreso.

## 📝 Notas

- ⚠️ El comentario del código dice que `sueldo` "se refiere al tipo float", pero `5000.99` sin sufijo `F` es un literal `double` — `var` lo infiere como `double`, no `float`. Para que fuera `float` habría que escribir `5000.99F`.
- `var` solo infiere el tipo **una vez**, en la declaración — a partir de ahí, la variable sigue teniendo ese tipo fijo (no es como en JavaScript, donde el tipo puede cambiar).
- Typo en el `println`: `"Nombe1="` en vez de `"nombre1="` (no afecta al resultado, solo al texto impreso).