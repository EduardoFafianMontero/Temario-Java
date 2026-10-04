# TiendaEnLinea

## 📌 Sobre este ejercicio

Calcula el descuento de una compra según dos factores: si supera un monto mínimo y si el cliente es miembro de la tienda. Combina `if`/`else if`/`else` para decidir el porcentaje de descuento, y *text blocks* + `printf` para mostrar un ticket formateado.

## 🧩 Qué incluye

| Condición | Descuento |
| :--- | :--- |
| `montoCompra >= 1000` **y** `eresMiembro` | 10% |
| Solo `eresMiembro` (sin llegar a 1000) | 5% |
| Ninguna de las dos | 0% |

| Variable | Código | Para qué sirve |
| :--- | :--- | :--- |
| `MONTO_COMPRA_DESC` | `final var ... = 1000.00;` | Monto mínimo para el descuento grande |
| `montoCompra` | `Double.parseDouble(consola.nextLine())` | Importe de la compra |
| `eresMiembro` | `Boolean.parseBoolean(consola.nextLine())` | Si tiene membresía |
| `descuento` | `0.1` / `0.05` / `0` | Porcentaje aplicado, según el caso |
| `montoDescuento` | `montoCompra * descuento` | Cuánto se descuenta en euros |
| `montoFinal` | `montoCompra - montoDescuento` | Total a pagar |

## 💻 Compilar y ejecutar

```bash
javac TiendaEnLinea.java
java TiendaEnLinea
```

## 📝 Notas

✅ **Este compila y funciona sin errores** — buena señal, nada que corregir.

- `if (descuento != 0) { ... } else { ... }` después del bloque de cálculo es un patrón útil: en vez de repetir la lógica de "qué caso fue" dentro del `printf`, usa el propio valor de `descuento` para decidir qué ticket mostrar.
- `MONTO_COMPRA_DESC` sigue la convención correcta de nombres para constantes (MAYÚSCULAS_CON_GUION_BAJO).
- `%n` dentro del *text block* al principio de cada mensaje añade una línea en blanco antes del texto — un detalle de formato para que el ticket no salga pegado a lo anterior en la consola.
- `%.0f%%` en el primer ticket imprime el descuento como número entero sin decimales (`%.0f`) seguido de un `%` literal (`%%`) — por ejemplo, `10%` en vez de `10.0%`.