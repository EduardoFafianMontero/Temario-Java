# ComparaciónCadenas

## 📌 Sobre este ejercicio

Diferencia entre comparar `String` con `==` (compara si son el mismo objeto en memoria, es decir, la referencia) y con `.equals()` (compara si tienen el mismo contenido).

## 🧩 Qué incluye

| Comparación | Cómo se crean | Resultado (`==`) | Resultado (`.equals()`) |
| :--- | :--- | :--- | :--- |
| `cadena1 == cadena2` | Ambas literales: `"Java"` y `"Java"` | `true` | — |
| `cadena1 == cadena3` | `cadena1` literal, `cadena3` con `new String("Java")` | `false` | `true` |

## 💻 Compilar y ejecutar

```bash
javac ComparaciónCadenas.java
java ComparaciónCadenas
```

## 📝 Notas

- Java reutiliza los literales de texto en un área especial de memoria llamada *String pool*: `cadena1` y `cadena2` apuntan al mismo objeto reutilizado, por eso `==` da `true` entre ellas.
- `new String("Java")` fuerza a crear un objeto **nuevo** en memoria, aunque el contenido sea idéntico — por eso `cadena1 == cadena3` da `false`: son objetos distintos.
- `.equals()` sí compara el contenido carácter a carácter, así que `cadena1.equals(cadena3)` da `true` aunque `==` diera `false`.
- **Regla práctica:** para comparar `String` en Java, se usa casi siempre `.equals()`, nunca `==` — salvo que quieras comprobar deliberadamente si son el mismo objeto.