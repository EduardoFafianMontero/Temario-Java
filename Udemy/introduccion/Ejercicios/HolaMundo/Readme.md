# Primer ejercicio en Java — HolaMundo

## 📌 Descripción

Este es mi primer programa en Java, creado como ejercicio de introducción al lenguaje usando Visual Studio Code.

El programa consiste en una clase llamada `HolaMundo` que contiene el método `main`, el punto de entrada obligatorio de cualquier programa Java. Dentro de este método se usan instrucciones `System.out.println()` para imprimir texto por consola:

1. Un primer mensaje de tipo "Hola Mundo", el clásico ejercicio inicial para comprobar que el entorno funciona correctamente.
2. Justo debajo, un segundo mensaje de saludo (por ejemplo, algo como `"¡Hola, bienvenido a Java!"` o similar), que sirve para practicar cómo se pueden encadenar varias líneas de salida dentro del mismo método `main`.

Este ejercicio me sirve para entender:
- La estructura básica de una clase en Java (`public class NombreClase { ... }`).
- Que el nombre del archivo `.java` debe coincidir con el nombre de la clase pública.
- Cómo funciona el método `main` como punto de arranque del programa.
- El uso de `System.out.println()` para mostrar texto en la terminal.

## 💻 Comandos de terminal (compilar y ejecutar)

Para compilar y ejecutar este ejercicio desde la terminal integrada de VSCode:

```bash
# 1. Compilar el archivo .java (genera un archivo .class)
javac HolaMundo.java

# 2. Ejecutar el programa ya compilado
java HolaMundo
```

> 💡 Nota: el comando `javac` **compila** el código (lo traduce a bytecode) y el comando `java` **ejecuta** la clase compilada. No hace falta poner la extensión `.class` al ejecutar, solo el nombre de la clase.