# Variables en Java

## 📌 Sobre esta carpeta

Ejercicios sobre declaración y uso de variables en Java: cómo se declaran, los tipos de datos básicos (`int`, `double`, `String`, `boolean`, `char`...) y las reglas para nombrarlas correctamente.

## 📂 Ejercicios

Los ejercicios están dentro de la subcarpeta [`Ejercicios/`](./Ejercicios), cada uno en su propia carpeta:

- **[DetalleLibro](./Ejercicios/DetalleLibro)** — Declaración de variables de distintos tipos (texto, números, booleanos) para representar los datos de un libro y mostrarlos por consola.
- **[Variables](./Ejercicios/Variables)** — Declaración de variables de los tipos `int`, `double`, `boolean` y `char`, acceso a su valor con `System.out.println()`, y modificación del valor de una variable ya declarada.
- **[Practica/DetallePersona](./Ejercicios/Practica)** — Declaración de variables `String`, `int`, `double` y `char` para representar el detalle de una persona (nombre, edad, estatura, país de origen y estado civil) y mostrarlas por consola.

*(Esta lista se irá ampliando a medida que añada más ejercicios.)*

## 💻 Compilar y ejecutar

```bash
# Compilar un archivo .java (genera el .class)
javac NombreClase.java

# Compilar varios archivos .java a la vez
javac *.java

# Ejecutar la clase ya compilada
java NombreClase

# Compilar indicando carpeta de salida para los .class
javac -d bin NombreClase.java

# Ejecutar especificando el classpath (carpeta donde están los .class)
java -cp bin NombreClase
```

## 🔄 Estado

En progreso — 3 ejercicios hechos. Tema anterior: [`introduccion/`](../introduccion).