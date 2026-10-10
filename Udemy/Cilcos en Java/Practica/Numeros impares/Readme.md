# NumerosImpares

## 📌 Sobre este ejercicio

Muestra los números impares con un `do-while`, comprobando con `%` si el resto de dividir entre 2 es distinto de 0.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Contador | `var contador = 0;` | Inicio |
| Comprobación | `if (contador % 2 != 0)` | Es impar si el resto **no** es 0 |
| Condición | `while (contador <= 20);` | Repite hasta pasar de 20 |

## 💻 Compilar y ejecutar

```bash
javac NumerosImpares.java
java NumerosImpares
```

## 📝 Notas

⚠️ **Esto no compila tal cual está:** `System.out.prinltn(...)` → es `println` (las letras `l` y `t` están cambiadas).

⚠️ **Y aunque se corrija, es un ciclo infinito (el mismo fallo que en Numeros Pares):** el `contador++` está **dentro del `if`**. Con `contador = 0`, la condición `0 % 2 != 0` es falsa, no se incrementa, y el contador se queda en `0` para siempre.

✅ Solución: sacar el incremento del `if`:

```java
do {
    if (contador % 2 != 0) {
        System.out.println(contador);
    }
    contador++;   // fuera del if
} while (contador <= 20);
```

Salida esperada: `1 3 5 ... 19`.

💡 **Regla para recordar:** el avance del contador va siempre fuera de los `if`, o el ciclo puede no terminar nunca.