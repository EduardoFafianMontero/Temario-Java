# Funciones (saludar)

## 📌 Sobre este ejercicio

Primera función propia: `saludar`. **No devuelve nada** (`void`) y recibe un parámetro `String`. Se escribe una sola vez y se llama desde `main` tantas veces como haga falta.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Definición | `static void saludar(String mensaje)` | Crea la función. `void` = no devuelve valor |
| Parámetro | `String mensaje` | Dato que recibe la función |
| Cuerpo | `System.out.println("Mensaje: " + mensaje);` | Lo que hace al llamarla |
| Llamadas | `saludar("Hola desde Java");` `saludar("Adios");` | Misma función, distintos argumentos |

**Salida esperada:**

```
Mensaje: Hola desde Java
Mensaje: Adios
```

### 🔎 Parámetro vs argumento

| Término | Dónde está | Valor |
| :--- | :--- | :--- |
| **Parámetro** | En la definición: `String mensaje` | Un nombre vacío que se rellena |
| **Argumento** | En la llamada: `"Hola desde Java"` | El valor real que se pasa |

## 💻 Compilar y ejecutar

```bash
javac Funciones.java
java Funciones
```

## 📝 Notas

✅ **Compila y funciona.**

- **¿Por qué `static`?** `main` es `static`, y desde un método `static` solo se pueden llamar otros métodos `static` de la misma clase sin crear un objeto.
- La función se declara **fuera** de `main`, dentro de la clase. El orden no importa: se puede escribir antes o después de `main`.
- Una función `void` se llama como una instrucción suelta (`saludar("...");`). No se puede hacer `var x = saludar("...");` porque no devuelve nada.
- El nombre de la clase (`Funciones`) coincide con el del archivo (`Funciones.java`), como exige Java.