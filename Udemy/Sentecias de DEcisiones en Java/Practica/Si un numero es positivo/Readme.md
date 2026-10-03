# numeropositivo

## 📌 Sobre este ejercicio

Pide un número por consola y, con `if`/`else if`/`else`, indica si es positivo, negativo o cero.

## 🧩 Qué incluye

| Condición | Resultado |
| :--- | :--- |
| `num > 0` | `"El numero es positivo: " + num` |
| `num < 0` | `"El numero es negativo: " + num` |
| Resto (`num == 0`) | `"El numero es cero: " + num` |

## 💻 Compilar y ejecutar

```bash
javac numeropositivo.java
java numeropositivo
```

## 📝 Notas

⚠️ **Esto no compila tal cual está — varios errores encadenados:**

1. `public static void main(Sting[] args){` → falta la `r`, debería ser `String[]`.
2. `System.out.println(*** Valor Positivo ***);` → le faltan las comillas alrededor del texto. Sin ellas, Java intenta interpretar `***` como operadores de multiplicación sobre `Valor` y `Positivo`, que no existen como variables — debería ser `System.out.println("*** Valor Positivo ***");`.
3. `if(numeo > 0){` → la variable declarada se llama `num`, pero aquí se usa `numeo` (le falta la última letra).
4. `else if(numero < 0 ){` → aquí se usa `numero`, que tampoco coincide con `num`.

Los tres nombres (`num`, `numeo`, `numero`) deberían ser todos el mismo — lo más limpio es dejarlos todos como `num`, que es como ya están escritos correctamente dentro de los `println`.

Una vez corregidos los 4 puntos, el ejercicio compila y funciona con la lógica ya bien planteada.