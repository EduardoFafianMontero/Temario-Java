# NumerosPares

## 📌 Sobre este ejercicio

Muestra por consola los números pares recorriendo un contador con un `while`, y comprobando con `%` si cada número es par.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Contador | `var contador = 0;` | Variable que cuenta las vueltas |
| Ciclo | `while (contador <= 20)` | Repite mientras el contador no pase de 20 |
| Comprobación | `if (contador % 2 == 0)` | Es par si el resto de dividir entre 2 es 0 |
| Salida | `System.out.println(contador);` | Imprime el número par |

## 💻 Compilar y ejecutar

```bash
javac NumerosPares.java
java NumerosPares
```

## 📝 Notas

⚠️ **Esto no compila tal cual está:** `cotador++;` → falta la `n`, la variable se llama `contador`.

⚠️ **Y aunque se corrija, hay un error de lógica que provoca un ciclo infinito:** el `contador++` está **dentro del `if`**. Con `contador = 0` imprime `0` y pasa a `1`; con `1`, la condición `1 % 2 == 0` es falsa, no entra al `if`, el contador no avanza y se queda en `1` **para siempre**.

✅ Solución: sacar `contador++;` del `if` (justo antes de cerrar el `while`), para que avance en cada vuelta, sea par o no.

```java
while (contador <= 20) {
    if (contador % 2 == 0) {
        System.out.println(contador);
    }
    contador++;   // fuera del if
}
```

- El título dice "del 1 al 20" pero el contador empieza en `0`, así que también imprimiría el `0`. Para ir del 1 al 20, `var contador = 1;`.