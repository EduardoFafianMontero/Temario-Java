# Estacionano

## 📌 Sobre este ejercicio

Determina la estación del año a partir de un mes (1-12) introducido por consola, usando una cadena de `if`/`else if`/`else`.

## 🧩 Qué incluye

| Meses | Estación |
| :--- | :--- |
| 12, 1, 2 | Invierno |
| 3, 4, 5 | Primavera |
| 6, 7, 8 | Verano |
| 9, 10, 11 | Otoño |
| Cualquier otro valor | "mes invalido" |

## 💻 Compilar y ejecutar

```bash
javac Estacionano.java
java Estacionano
```

## 📝 Notas

⚠️ **No compila tal cual está — varios errores:**

1. **Falta el `import java.util.Scanner;`** al principio del archivo — se usa `Scanner` pero nunca se importa, así que Java no lo reconoce.
2. `public static void main(Sting[] args){` → falta la `r` de `String[]`.
3. `System.out.print(*** Estacion del año ***);` → faltan las comillas alrededor del texto.
4. `Integgre.parseInt(...)` → debería ser `Integer.parseInt(...)` (sobra una `g`, falta la `r`).

- Compara con **[Estacion del año mejorado](../Estacion%20del%20a%C3%B1o%20mejorado)**: es el mismo ejercicio resuelto con `switch` moderno en vez de una cadena de `if`/`else if` — útil para ver las dos formas de resolver lo mismo.
- Typo menor en el dato: `"ivierno"` en vez de `"invierno"` (falta la `n`) — no afecta a la compilación, solo al texto que se imprime.