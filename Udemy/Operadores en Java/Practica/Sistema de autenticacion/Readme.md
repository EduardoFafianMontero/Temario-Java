# SistemaAutenticacion

## 📌 Sobre este ejercicio

Simula un login: pide usuario y contraseña por consola, y comprueba que **ambos** coincidan con unos valores válidos fijos, usando `.equals()` para comparar texto (no `==`).

## 🧩 Qué incluye

| Dato | Código | Valor |
| :--- | :--- | :--- |
| `USUARIO_VALIDO` | Constante (`final`) | `"admin"` |
| `PASSWORD_VALIDO` | Constante (`final`) | `"1234"` |
| `usuarioIngresado` | `consola.nextLine()` | Lo que escriba el usuario |
| `passwordIngresado` | `consola.nextLine()` | Lo que escriba el usuario |
| `sondatoscorrectos` | `usuarioIngresado.equals(USUARIO_VALIDO) && passwordIngresado.equals(PASSWORD_VALIDO)` | `true` solo si ambos coinciden exactamente |

## 💻 Compilar y ejecutar

```bash
javac SistemaAutenticacion.java
java SistemaAutenticacion
```

## 📝 Notas

⚠️ **Esto no compila tal cual está — dos errores:**

1. `public classs SistemaAutenticacion{` → `classs` tiene una `s` de más, debería ser `class`.
2. `system.out.println(...)` → `system` está en minúscula, debería ser `System`.

- Buena práctica aquí: comparar los textos con `.equals()` en vez de `==`, tal como se vio en `Comparación de cadenas` — con `==` esta comparación podría fallar aunque el texto introducido fuera idéntico al válido.
- `USUARIO_VALIDO` y `PASSWORD_VALIDO` siguen la convención correcta de nombres para constantes (MAYÚSCULAS_CON_GUION_BAJO).