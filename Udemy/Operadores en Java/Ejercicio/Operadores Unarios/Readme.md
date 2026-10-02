# OperadoresUnarios

## 📌 Sobre este ejercicio

Diferencia entre usar el operador de incremento/decremento **antes** (pre-) o **después** (post-) de la variable: cambia si se usa el valor viejo o el nuevo en esa misma línea.

## 🧩 Qué incluye

| Sección | Código | `resultado` | Valor final de la variable |
| :--- | :--- | :--- | :--- |
| Pre-incremento | *(pendiente — no está en la captura)* | — | — |
| Post-incremento | `a = 3; resultado = a++;` | `3` | `a` pasa a `4` |
| Pre-decremento | `b = -2; resultado = --b;` | `-3` | `b` pasa a `-3` |
| Post-decremento | `b = -2; resultado = b--;` | `-2` | `b` pasa a `-3` |

## 💻 Compilar y ejecutar

```bash
javac OperadoresUnarios.java
java OperadoresUnarios
```

## 📝 Notas

- **Post-incremento (`a++`):** primero se guarda el valor actual de `a` en `resultado`, y *después* se incrementa `a`. Por eso `resultado` vale `3` (el valor viejo), aunque `a` ya valga `4` en la siguiente línea.
- **Pre-decremento (`--b`):** al revés — primero se decrementa `b`, y *después* se usa ese valor ya actualizado. Por eso `resultado` y `b` coinciden en `-3`.
- **Post-decremento (`b--`):** vuelve a resetear `b = -2` antes de esta parte, para partir del mismo valor que en el pre-decremento y poder comparar. `resultado` guarda el valor viejo (`-2`), y `b` queda en `-3` después.
- Confirmado por la salida real en terminal: `"A en este mometo se incrementa = 4"`, `"resultado --b=-3"`, `"b ya se decremento=-3"`.

⚠️ Me falta la parte de **Pre-incremento** (líneas 1-23, antes de donde empieza la captura) — probablemente algo como `a = 3; resultado = ++a;`. Pásamela y completo la tabla y las notas.