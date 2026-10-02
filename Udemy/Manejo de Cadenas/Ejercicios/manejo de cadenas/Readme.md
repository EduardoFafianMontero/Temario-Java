# Cadenas

## 📌 Sobre este ejercicio

Crea `String` como literal y con `new String()`, las concatena con espacios, y usa un *text block* (`"""`) para una cadena de varias líneas.

| Variable | Cómo se crea | Valor |
| :--- | :--- | :--- |
| `cadena1` | Literal (`var cadena1="Hola";`) | `"Hola"` |
| `cadena2` | `new String("Mundo")` | `"Mundo"` |
| `cadena3` | Concatenación (`cadena1 + " " + cadena2`) | `"Hola Mundo"` |
| `cadena4` | Text block (`"""` ... `"""`) | Texto en 2 líneas |

## 💻 Compilar y ejecutar

```bash
javac Cadenas.java
java Cadenas
```

## 📝 Notas

- `var cadena1="Hola";` y `new String("Mundo")` acaban creando el mismo tipo de objeto (`String`), pero lo normal en Java es usar el literal (`"Hola"`) — `new String(...)` crea un objeto nuevo en memoria de forma innecesaria y casi nunca se usa en código real.
- Los *text blocks* (`"""`) son una forma de escribir cadenas de varias líneas sin tener que concatenar con `\n`. Disponibles desde Java 15.
- `cadena4` se declara pero no se llega a imprimir con `System.out.println()` — si quieres verla en consola, faltaría esa línea.