# Estacionano

## 📌 Sobre este ejercicio

La misma idea que `Estacion del año` (determinar la estación a partir del mes), reescrita con `switch` moderno — y aprovechando que un mismo `case` puede agrupar **varios valores** separados por comas.

## 🧩 Qué incluye

```java
var estacion = switch (mes) {
    case 12, 1, 2 -> "Invierno";
    case 3, 4, 5 -> "Primavera";
    case 6, 7, 8 -> "Verano";
    case 9, 10, 11 -> "Otoño";
    default -> "Mes no válido";
};
```

## 💻 Compilar y ejecutar

```bash
javac Estacionano.java
java Estacionano
```

## 📝 Notas

⚠️ **Este archivo parece a medio terminar, y además no compila tal cual está:**

1. **Falta el `import java.util.Scanner;`** — igual que en la versión `if`/`else if`.
2. `public static void main(Sting[] args){` → falta la `r` de `String[]`.
3. `System.out.print(*** Estacion del año ***);` → faltan las comillas.
4. `Integgre.parseInt(...)` → debería ser `Integer.parseInt(...)`.
5. **Al `switch` le falta el `;` final.** Aquí el `switch` se usa como *expresión* (devuelve un valor que se guarda en `estacion`), y toda asignación en Java termina en `;` — tiene que quedar `};` en vez de `}` después del último `case`.
6. **Nunca se imprime el resultado.** Se calcula `estacion`, pero no hay ningún `System.out.println()`/`printf()` que lo muestre — probablemente falta esa línea al final.

- Lo más interesante de este ejercicio frente al anterior: `case 12, 1, 2 ->` agrupa 3 valores en un solo `case`, algo que la sintaxis clásica de `switch` no permite hacer de forma tan directa (habría que escribir 3 `case` seguidos cayendo al mismo código, usando el comportamiento de "caer al siguiente" sin `break`).