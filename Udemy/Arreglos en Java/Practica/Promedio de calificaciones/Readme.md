# promedioCalificaciones

## 📌 Sobre este ejercicio

Pregunta cuántas calificaciones se quieren introducir, las guarda en un arreglo y calcula el **promedio**. Junta todo lo visto: `Scanner`, arreglos, dos `for` y un acumulador.

## 🧩 Qué incluye

| Paso | Código | Qué hace |
| :--- | :--- | :--- |
| Cantidad | `totalCalificaciones = Integer.parseInt(consola.nextLine())` | Tamaño del arreglo |
| Arreglo | `new int[totalCalificaciones]` | Espacio para las notas |
| Lectura | primer `for` | Pide `calificaciones[i]` |
| Suma | segundo `for` con `sumaCalificaciones += calificaciones[i];` | Acumulador de las notas |
| Promedio | `sumaCalificaciones / totalCalificaciones` | Suma entre cantidad |

## 💻 Compilar y ejecutar

```bash
javac promedioCalificaciones.java
java promedioCalificaciones
```

## 📝 Notas

✅ **Compila y funciona, pero tiene un error de lógica importante:**

⚠️ **División entera.** `sumaCalificaciones` y `totalCalificaciones` son `int`, así que `/` **descarta los decimales**. Con las notas `8` y `7` (suma 15, entre 2) el promedio real es `7.5`, pero el programa muestra **`7`**.

✅ Solución: convertir a `double` antes de dividir:

```java
var promedio = (double) sumaCalificaciones / totalCalificaciones;
```

⚠️ **Si el usuario escribe `0` calificaciones:** `0 / 0` con enteros lanza `ArithmeticException` (división entre cero). Habría que comprobar `if (totalCalificaciones > 0)` antes de calcular.

- Se podría sumar **en el mismo `for`** en que se leen las notas, sin necesidad del segundo ciclo.
- Es el mismo patrón de **acumulador** de *Suma Acumulativa*, ahora sobre un arreglo.
- Con `%.2f` en un `printf` se puede mostrar el promedio con 2 decimales.
- Convención: la clase debería empezar en mayúscula (`PromedioCalificaciones`).