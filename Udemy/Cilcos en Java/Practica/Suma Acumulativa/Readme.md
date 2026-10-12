# SumaAcumulativa

## 📌 Sobre este ejercicio

Suma los números del 1 al 5 con un **acumulador**: una variable que va guardando el total parcial en cada vuelta del `while`.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Constante | `final var Maximo = 5;` | Límite de la suma (no cambia) |
| Acumulador | `var acumuladorSuma = 0;` | Guarda el total; **empieza en 0** |
| Contador | `var numero = 1;` | Recorre del 1 al máximo |
| Ciclo | `while (numero <= Maximo)` | Repite mientras no pase del máximo |
| Suma | `acumuladorSuma += numero++;` | Suma `numero` y **después** lo incrementa |

### 🔎 Traza (qué pasa en cada vuelta)

| Vuelta | `numero` | `acumuladorSuma` antes | después |
| :---: | :---: | :---: | :---: |
| 1 | 1 | 0 | 1 |
| 2 | 2 | 1 | 3 |
| 3 | 3 | 3 | 6 |
| 4 | 4 | 6 | 10 |
| 5 | 5 | 10 | 15 |

**Resultado final:** `15`.

## 💻 Compilar y ejecutar

```bash
javac SumaAcumulativa.java
java SumaAcumulativa
```

## 📝 Notas

✅ **Compila y funciona.** Los fallos son de presentación:

- `acumuladorSuma += numero++;` es una línea que hace dos cosas: suma el valor **actual** de `numero` y luego lo aumenta (post-incremento). Por eso no hay `numero++` aparte y el ciclo termina.
- La línea 12 imprime el **texto** `(acumuladorSuma +numero) ->` tal cual, porque está entre comillas; no calcula nada. Sale `(acumuladorSuma +numero) ->0+ 1`.
- Faltan espacios o dos puntos al imprimir: `"Suma parcial acumulada" + acumuladorSuma` sale pegado (`acumulada1`). Mejor `"Suma parcial acumulada: "`. Lo mismo en la última línea: `numeros5 numeros 15`.
- Erratas: `pimeros cincos numeros` → `primeros cinco números`, `acumulaiva`.
- Convención: las constantes se escriben en MAYÚSCULAS: `MAXIMO`, no `Maximo`.