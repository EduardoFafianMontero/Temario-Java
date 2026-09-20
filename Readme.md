# Java — Carpeta de aprendizaje

## 📌 Sobre esta carpeta

Aquí voy guardando los ejercicios que hago mientras aprendo Java desde cero, siguiendo el curso de Udemy **"Universidad Java - Cero a Experto"** (+155 horas) y usando Visual Studio Code como editor. La idea es ir practicando los conceptos básicos del lenguaje poco a poco, empezando por lo más simple (imprimir texto por consola) e ir añadiendo cosas nuevas a medida que avance en el curso.

Los ejercicios están organizados por temas en subcarpetas, cada una con su propio README explicando qué se cubre en ella.

## 📂 Temario

| Carpeta | Estado | Contenido |
| :--- | :--- | :--- |
| [`introduccion/`](./introduccion) | ✅ Completado | Estructura básica de una clase Java, `main`, `System.out.println()` |
| [`Variables/`](./Variables) | 🔄 En progreso | Declaración, tipos de datos y uso de variables |
| [`Tipos de datos/`](./Tipos%20de%20datos) | 🔄 En progreso | Tipos primitivos (`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`) y tipos de referencia (`String`) |
| [`Manejo de Cadenas/`](./Manejo%20de%20Cadenas) | 🔄 En progreso | Creación y concatenación de `String`, `new String()`, text blocks |

*(Esta tabla se irá ampliando a medida que avance en el curso.)*

## 💻 Comandos básicos de terminal

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

# Ver la versión de Java instalada
java -version
javac -version

# Empaquetar clases compiladas en un .jar ejecutable
jar cfe NombreJar.jar NombreClase *.class

# Ejecutar un .jar
java -jar NombreJar.jar
```

**¿Qué hace cada uno?**

- **`javac`** → El compilador de Java. Convierte el código fuente (`.java`, texto legible) en bytecode (`.class`, lo que entiende la máquina virtual de Java). Si hay errores de sintaxis, es aquí donde saltan.
- **`java`** → El intérprete/ejecutor. Coge un `.class` ya compilado y lo ejecuta, buscando el método `main` como punto de entrada.
- **`-d bin`** → Le dice a `javac` dónde guardar los `.class` generados (en este caso, en una carpeta llamada `bin`), en vez de dejarlos sueltos junto al `.java`.
- **`-cp` (classpath)** → Le dice a `java` en qué carpeta(s) buscar los `.class` necesarios para ejecutar el programa. Imprescindible cuando el código y los `.class` no están en la misma carpeta.
- **`-version`** → Muestra la versión instalada, útil para comprobar que el compilador y el ejecutor son compatibles entre sí.
- **`jar`** → Empaqueta varios `.class` en un único archivo `.jar`, para poder compartir o ejecutar el programa sin tener que llevar todos los `.class` sueltos.

## 📝 Notas generales

- El nombre del archivo `.java` debe coincidir exactamente con el nombre de la clase pública que contiene.
- Si el nombre de la clase lleva tilde o caracteres especiales, el archivo debe llamarse igual (con la tilde incluida) o puede dar problemas al compilar.
- Cada ejercicio es una clase Java independiente, con su propio archivo `.java`, y su nombre coincide con el de la clase.