# Menuiterativo

## 📌 Sobre este ejercicio

Menú de administración de cuentas que se **repite** hasta que el usuario elige salir. Es la base del cajero: una bandera booleana, un `while` y un `switch` con la forma moderna (`->`).

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Bandera | `var salir = false;` | Mientras sea `false`, el menú sigue |
| Ciclo | `while (!salir)` | `!` invierte: repite mientras NO haya que salir |
| Menú | *text block* `"""..."""` | Imprime las 3 opciones |
| Opción | `consola.nextInt()` | Lee el número |
| `case 1` / `case 2` | `println(...)` | Simulan crear y eliminar cuenta |
| `case 3` | `salir = true;` dentro de `{ }` | Con varias instrucciones el `case` lleva llaves |
| `default` | mensaje de opción inválida | Cualquier otro número |

## 💻 Compilar y ejecutar

```bash
javac Menuiterativo.java
java Menuiterativo
```

## 📝 Notas

⚠️ **Esto no compila tal cual está:** `System.out.prinln (...)` en el `default` → falta una `t`, es `println`.

- Erratas en los textos (no rompen nada): `Elimiar Cueta` → `Eliminar Cuenta`, `Administracion`, `ieracion` → `iteración`.
- Un `case` con **una sola instrucción** no necesita llaves; el `case 3` sí las lleva porque hace dos cosas (imprimir y `salir = true`).
- Si olvidas `salir = true`, el menú no termina nunca (ciclo infinito).
- Con `nextInt()`, escribir una letra lanza `InputMismatchException`.