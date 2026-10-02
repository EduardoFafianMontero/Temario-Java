# TicketVenta

## 📌 Sobre este ejercicio

Pide el precio de 3 productos por consola, calcula el subtotal, aplica un 16% de impuestos, y muestra un ticket de venta formateado combinando un *text block* con `printf`.

## 🧩 Qué incluye

| Paso | Código | Para qué sirve |
| :--- | :--- | :--- |
| Leer 3 precios | `Double.parseDouble(consola.nextLine())` × 3 | Lee texto y lo convierte a `double` (leche, pan, lechuga) |
| Subtotal | `precioLeche + precioPan + precioLechuga` | Suma de los 3 precios |
| Impuestos | `subtotal * 0.16` | 16% del subtotal |
| Total | `subtotal + impuestos` | Subtotal con impuestos incluidos |
| Ticket | *Text block* + `printf("%.2f", ...)` | Imprime los 3 valores con 2 decimales, en varias líneas |

## 💻 Compilar y ejecutar

```bash
javac TicketVenta.java
java TicketVenta
```

## 📝 Notas

- Combina dos cosas ya vistas por separado: el *text block* (`"""`) de `Manejo de Cadenas` y el `%.2f` de `FormateoCadena` — aquí se juntan para imprimir un ticket de varias líneas con los decimales controlados.
- `%%` dentro del *text block* (en `"impuestos (16%%)"`) es la forma de imprimir un símbolo `%` literal con `printf` — un `%` suelto se interpretaría como el inicio de un marcador de formato, por eso hace falta escaparlo duplicándolo.
- Ningún error de compilación en este — los 3 precios, el cálculo y el formato están bien encadenados.