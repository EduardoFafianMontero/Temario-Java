# modificarArreglo

## 📌 Sobre este ejercicio

Crea un arreglo de 5 enteros y cambia el valor de tres de sus posiciones usando el índice.

## 🧩 Qué incluye

| Código | Qué hace |
| :--- | :--- |
| `var enteros = new int[5];` | Arreglo de 5 posiciones, todas a `0` |
| `enteros[0] = 13;` | Primera posición → 13 |
| `enteros[1] = 21;` | Segunda posición → 21 |
| `enteros[4] = 62;` | Última posición → 62 |

**Estado final del arreglo:**

| Índice | 0 | 1 | 2 | 3 | 4 |
| :--- | :---: | :---: | :---: | :---: | :---: |
| Valor | 13 | 21 | 0 | 0 | 62 |

## 💻 Compilar y ejecutar

```bash
javac modificarArreglo.java
java modificarArreglo
```

## 📝 Notas

✅ **Compila y funciona**, pero no imprime nada: solo modifica los valores. Para verlos hay que leerlos (siguiente ejercicio).

- Las posiciones que no se tocan (2 y 3) **siguen valiendo `0`**.
- El índice máximo es `4`: `enteros[5] = 1;` lanzaría `ArrayIndexOutOfBoundsException`.
- Convención: los nombres de clase empiezan en **mayúscula** (`ModificarArreglo`). Si lo cambias, renombra también el archivo.