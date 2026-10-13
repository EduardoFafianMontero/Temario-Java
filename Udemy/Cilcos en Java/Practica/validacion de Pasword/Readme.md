# ValidacionPassword

## 📌 Sobre este ejercicio

Pide un password por consola y **vuelve a pedirlo mientras tenga menos de 6 caracteres**. Es el uso más típico de un `while`: repetir la lectura hasta que el dato sea válido.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Primera lectura | `var password = consola.nextLine();` | Lee el texto completo de la línea |
| Condición | `while (password.length() < 6)` | Repite mientras sea demasiado corto |
| Dentro del ciclo | `println(error)` + `password = consola.nextLine();` | Avisa y vuelve a pedir el valor |
| Salida | `println("El valor de password es válido: " + password);` | Solo se llega aquí cuando el password cumple |

## 💻 Compilar y ejecutar

```bash
javac ValidacionPassword.java
java ValidacionPassword
```

## 📝 Notas

✅ **Compila y funciona.**

- **La lectura va dos veces, y es correcto:** una **antes** del `while` (para tener algo que comprobar) y otra **dentro** (para actualizar el valor). Si la de dentro faltara, el ciclo sería infinito: es el "avance" de este ciclo.
- **`while`, no `do-while`:** si el primer password ya es válido, el ciclo **no se ejecuta ninguna vez**. Con `do-while` se podría evitar la lectura duplicada, pero habría que mostrar el error de otra forma.
- `nextLine()` lee la línea entera, incluidos los espacios: un password de 6 espacios sería "válido". Para evitarlo: `password.trim().length() < 6`.
- Solo se valida la **longitud**. Un password real también pediría mayúscula, número o símbolo, y eso se podrá añadir más adelante con `for` y condiciones.
- Imprimir el password en pantalla no se hace en una aplicación real. Aquí es solo para comprobar que funciona.
- La carpeta se llama `validacion de Pasword`: si quieres, corrige la errata a `Password`; entonces hay que cambiar también el enlace en el Readme del tema.