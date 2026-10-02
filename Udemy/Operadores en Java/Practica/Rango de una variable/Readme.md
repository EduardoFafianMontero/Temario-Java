# RangoVariable

## 📌 Sobre este ejercicio

Comprobar si un dato introducido por consola está dentro de un rango (`1` a `10`), y también su lógica inversa (si está **fuera** del rango) usando el operador `!` (NOT) sobre toda la condición.

## 🧩 Qué incluye

| Variable | Código | Para qué sirve |
| :--- | :--- | :--- |
| `dato` | `Integer.parseInt(consola.nextLine())` | El valor leído por consola, convertido a `int` |
| `estaDentroRango` | `dato >= 1 && dato <= 10` | `true` si el dato está entre 1 y 10 (ambos incluidos) |
| `estafueraRango` | `!(dato >= 1 && dato <= 10)` | Invierte el resultado de la misma condición con `!` |

## 💻 Compilar y ejecutar

```bash
javac RangoVariable.java
java RangoVariable
```

## 📝 Notas

⚠️ **Esto no compila tal cual está.** El problema real es más grande de lo que parece a primera vista:

1. `public static void main(String[] arg);` termina en `;` en vez de abrir con `{` — así declarado, no es un método con cuerpo, es solo una firma suelta.
2. **Como el método nunca se abre con `{`, todo el código de las líneas 4 a 15 queda fuera de cualquier método**, flotando directamente dentro de la clase — y eso no es válido en Java: no se pueden declarar variables con `var` ni llamar a `System.out.println()` a ese nivel (es el mismo problema estructural que vimos en `CaracteresEspeciales`).
3. Además, `Integre.parseInt(...)` → falta la `r`, debería ser `Integer.parseInt(...)`.

**Para que compile**, el método tiene que abrirse correctamente:

```java
public static void main(String[] args) {
    // aquí dentro va todo el contenido actual (líneas 4 a 15)
}
```

- Typo en un texto impreso: `"Proporciona un dato enetero: "` en vez de `"entero"` — no afecta a la ejecución.
- El patrón `!(condición)` de `estafueraRango` es una forma limpia de invertir una condición completa sin reescribir cada comparación por separado (cambiar `>=` por `<`, `&&` por `||`, etc. a mano es más propenso a errores).