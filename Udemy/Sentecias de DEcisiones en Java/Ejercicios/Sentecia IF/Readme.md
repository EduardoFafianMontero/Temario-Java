# SeteciaIf

## 📌 Sobre este ejercicio

Primer contacto con `if`: ejecuta un bloque de código **solo si** la condición entre paréntesis es `true`.

## 🧩 Qué incluye

| Código | Qué hace |
| :--- | :--- |
| `var edad = 30;` | Variable de prueba |
| `if (edad >= 18) { ... }` | Si `edad` es 18 o más, ejecuta lo que hay dentro de las llaves |
| `System.out.println("Eres mayor de edad");` | Solo se imprime si la condición del `if` es `true` |

Con `edad = 30`, la condición se cumple, así que imprime `"Eres mayor de edad"`.

## 💻 Compilar y ejecutar

```bash
javac SeteciaIf.java
java SeteciaIf
```

## 📝 Notas

⚠️ **Esto no compila tal cual está — dos errores en la firma del método:**

1. `public static void mai (Strig[] args){` → el método se llama `mai`, le falta la `n` de `main`.
2. El tipo del parámetro es `Strig[]`, le falta la `n` de `String[]` — como está escrito, Java no reconoce `Strig` como ningún tipo existente.

Con ambos corregidos (`public static void main(String[] args){`), el resto del código ya está bien planteado.

- Si cambias `edad` a un valor menor que `18`, el `if` simplemente no se ejecuta y el programa no imprime nada — todavía no hay un `else` que cubra ese caso (probablemente el siguiente paso del curso).