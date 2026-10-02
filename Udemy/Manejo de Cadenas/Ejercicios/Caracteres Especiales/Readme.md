# CaracteresEspeciales

## 📌 Sobre este ejercicio

Secuencias de escape en `String`: caracteres que no se pueden escribir directamente dentro de las comillas y necesitan una `\` delante.

## 🧩 Qué incluye

| Secuencia | Significado | Ejemplo en el código |
| :--- | :--- | :--- |
| `\n` | Salto de línea | `"Hola  \n mundo"` |
| `\t` | Tabulador | `"\tHola \tmundo"` |
| `\'` | Comilla simple dentro de un texto | `"Hola \' mundo"` |
| `\"` | Comilla doble dentro de un texto | `"Hola \" mundo"` |
| `\\` | Barra invertida literal | `"Hola \\  mundo"` |

## 💻 Compilar y ejecutar

```bash
javac CaracteresEspeciales.java
java CaracteresEspeciales
```

## 📝 Notas

⚠️ **Este archivo no compila — le falta la estructura básica de una clase Java.** Ahora mismo todo el código está suelto directamente dentro de la clase, sin un método `main` que lo contenga:

1. La línea `public static void mai(Sting[] args);` tiene tres problemas: el método se llama `mai` (falta la `n` de `main`), el tipo del parámetro es `Sting` (falta la `r` de `String`), y termina en `;` en vez de abrir con `{` — así declarada, es solo una firma sin cuerpo, no un método real.
2. Como no hay un `{` que abra el método, todo lo que viene después (`var cadena1=...`, los `println`...) queda flotando directamente dentro de la clase, fuera de cualquier método — y eso no es válido en Java: no se pueden declarar variables con `var` ni llamar a `println()` a ese nivel.
3. `system.out.println(...)` está en minúscula en las 5 llamadas — debe ser `System` (con mayúscula).

**Para que compile**, la estructura tendría que quedar así:

```java
public class CaracteresEspeciales {
    public static void main(String[] args) {
        // aquí dentro van las 5 variables y sus System.out.println()
    }
}
```

Una vez arreglada la estructura, el contenido de cada `println` (las secuencias de escape) ya está bien planteado.