# leerArreglos

## 📌 Sobre este ejercicio

Crea un arreglo, asigna valores a tres posiciones y los **muestra por pantalla** leyéndolos por su índice.

## 🧩 Qué incluye

| Código | Qué hace |
| :--- | :--- |
| `var enteros = new int[5];` | Arreglo de 5 posiciones |
| `enteros[0] = 13; enteros[1] = 21; enteros[4] = 62;` | Asigna valores |
| `System.out.println("..." + enteros[0]);` | Lee y muestra la posición 0 |

**Salida esperada:**

```
Valor 1 = 13
Valor 2 = 21
Valor 5 = 62
```

## 💻 Compilar y ejecutar

```bash
javac leerArreglos.java
java leerArreglos
```

## 📝 Notas

⚠️ **Esto no compila tal cual está:**

1. **El archivo y la clase no coinciden:** el archivo se llama `leerAeglos.java` pero la clase es `leerArreglos`. Una clase `public` debe llamarse igual que su archivo. Renombra uno de los dos.
2. **Línea 12:** `println` está mal escrito (falta una letra); revísalo.
3. **Línea 13:** `eteros[4]` → la variable se llama `enteros`.

- Errata en el texto: `Valo 1= ` → `Valor 1 = `.
- `Valor 5` corresponde al índice **4**: el quinto elemento está en la posición 4, porque se empieza a contar en 0.
- Las posiciones 2 y 3 valen `0` y no se muestran.