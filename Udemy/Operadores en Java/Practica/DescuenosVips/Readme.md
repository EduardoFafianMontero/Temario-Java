# DescuetosVips

## 📌 Sobre este ejercicio

Simula un sistema de descuentos: un cliente accede al descuento VIP solo si compró suficientes productos **y** tiene membresía — dos condiciones que deben cumplirse a la vez.

## 🧩 Qué incluye

| Dato | Cómo se obtiene | Tipo |
| :--- | :--- | :--- |
| `NO_PRODUCTOS_DESCUENTOS` | Constante (`final`) | `int`, valor `10` |
| `cantidadProductos` | `Integer.parseInt(consola.nextLine())` | `int` |
| `tienesmemebresia` | `Boolean.parseBoolean(consola.nextLine())` | `boolean` |
| `esElegibleDescuento` | `cantidadProductos >= NO_PRODUCTOS_DESCUENTOS && tienesmemebresia` | `boolean` |

## 💻 Compilar y ejecutar

```bash
javac DescuetosVips.java
java DescuetosVips
```

## 📝 Notas

- `NO_PRODUCTOS_DESCUENTOS` está en MAYÚSCULAS_CON_GUION_BAJO — es la convención correcta para constantes que vimos en el ejercicio de `Constantes`. Buena señal de que ya se quedó fijada.
- `Boolean.parseBoolean()` se comporta distinto a `Integer.parseInt()`: si el texto no es válido, **nunca lanza un error** — simplemente devuelve `false` para cualquier cosa que no sea `"true"` (sin distinguir mayúsculas/minúsculas). Por ejemplo, si el usuario escribe `"si"`, `"1"` o incluso lo escribe mal, el resultado sería `false` sin avisar de que hubo un error, a diferencia de `parseInt()`, que sí lanzaría una excepción con un texto no numérico.
- El texto del prompt tiene un typo: `"(tue/False)?"` en vez de `"(true/False)?"` — no afecta a la ejecución, solo a lo que lee el usuario en pantalla.