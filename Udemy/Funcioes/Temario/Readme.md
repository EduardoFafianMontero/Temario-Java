# Temario · Funciones en Java

## 🧱 ¿Qué es una función?

Un bloque de código con **nombre** que se escribe una vez y se puede **reutilizar** llamándolo. En Java, las funciones dentro de una clase se llaman también **métodos**.

```java
static int sumar(int a, int b) {
    return a + b;
}
```

## 🔧 Partes de una función

| Parte | Ejemplo | Significado |
| :--- | :--- | :--- |
| Modificador | `static` | Se puede llamar desde `main` sin crear un objeto |
| Tipo de retorno | `int` / `boolean` / `void` | Qué devuelve (`void` = nada) |
| Nombre | `sumar` | Cómo se llama (en `camelCase`) |
| Parámetros | `(int a, int b)` | Datos que recibe |
| Cuerpo | `{ ... }` | Lo que hace |
| `return` | `return a + b;` | Devuelve el valor y termina la función |

## 📞 Llamar a una función

```java
saludar("Hola");                 // void: como instrucción
var total = sumar(3, 8);         // con retorno: se guarda o se usa
if (esPar(total)) { ... }        // boolean: dentro de una condición
```

## 🧮 Tipos de funciones vistos

| Tipo | Ejemplo | Devuelve |
| :--- | :--- | :--- |
| Sin retorno | `saludar(String)` | Nada (`void`) |
| Con retorno `boolean` | `esPar(int)` | `true` / `false` |
| Con retorno `int` | `sumar(int, int)` | Un número |
| Recursiva | `funcionRecursiva(int)` | Se llama a sí misma |

## 🔁 Recursividad

Una función recursiva necesita:

1. **Caso base:** la condición donde **para**.
2. **Caso recursivo:** se llama a sí misma con un valor **más cercano** al caso base.

```java
static void contar(int n) {
    if (n == 1) {                 // caso base
        System.out.print(n + " ");
    } else {
        contar(n - 1);            // caso recursivo
        System.out.print(n + " ");
    }
}
```

Si falta el caso base o nunca se alcanza → `StackOverflowError`.

## 📌 Parámetro vs argumento

- **Parámetro:** la variable en la definición (`int a`).
- **Argumento:** el valor en la llamada (`3`).
- Los tipos primitivos se pasan **por valor** (una copia).

## ⚠️ Errores típicos

- **Olvidar `return`** en una función que no es `void` → error de compilación.
- **Tipo de retorno equivocado:** `int` pero devolver `"texto"`.
- **Llamar con menos o más argumentos** de los que pide.
- **Usar el resultado de una `void`:** `var x = saludar("hola");` no compila.
- **Variables locales:** lo declarado dentro de una función no existe fuera.
- **Recursión sin caso base** o que no se acerca a él.
- **Olvidar `static`** al llamar desde `main` sin crear un objeto.