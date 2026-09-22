# subcadenas

## 📌 Sobre este ejercicio

Extraer una parte de una cadena con `.substring(inicio, fin)`.

## 🧩 Qué incluye

Cadena base: `"Bienvenidos a mis recursos"`.

| Variable | Código | Rango (índices) | Resultado |
| :--- | :--- | :--- | :--- |
| `subcadena1` | `cadena1.substring(0, 11)` | `0` a `10` | `"Bienvenidos"` |
| `subcadena2` | `cadena2.substring(20, 25)` | `20` a `24` | `"curso"` |

## 💻 Compilar y ejecutar

```bash
javac subcadenas.java
java subcadenas
```

## 📝 Notas

- `.substring(inicio, fin)` extrae desde el índice `inicio` (incluido) hasta `fin` (**excluido**) — por eso `substring(0, 11)` da 11 caracteres, no 12.
- Igual que el resto de métodos de `String`, `.substring()` no modifica la cadena original: devuelve una cadena nueva.