# Sistema de reserva en hotel

## 📌 Sobre este ejercicio

Datos de una reserva de hotel (cliente, distancia a la playa, tarifa diaria, si tiene vistas) declarados con `var`, impresos, modificados y vueltos a imprimir para ver el "antes y después" de la reserva.

## 🧩 Qué incluye

| Variable | Valor inicial | Valor modificado |
| :--- | :--- | :--- |
| `nombrecliente` | `" Eduardo"` | *(sin cambios)* |
| `apellidoscliente` | `"Fafián Montero"` | *(sin cambios)* |
| `distancia` | `"7"` | `"4"` |
| `tarifadiaria` | `"50"` | `"90"` |
| `vistas` | `"false"` | `"true"` |

## 💻 Compilar y ejecutar

```bash
javac sistemareserva.java
java sistemareserva
```

## 📝 Notas

- ⚠️ Todas las variables están declaradas como `String` (texto), incluidas `distancia`, `tarifadiaria` y `vistas`, que representan un número y un booleano. Funciona para imprimir, pero así no se pueden hacer operaciones matemáticas con `distancia`/`tarifadiaria` ni evaluar `vistas` en un `if` — para eso habría que declararlas como `int`/`double` y `boolean` en vez de `String`.
- `nombrecliente` tiene un espacio de más al principio (`" Eduardo"`), lo que se nota al concatenarlo con `apellidoscliente` sin espacio entre medio.
- En el `println` de `apellidoscliente` falta el signo `=` (dice `"apellidoscliente"+apellidoscliente` en vez de `"apellidoscliente="+apellidoscliente`), así que en la consola sale pegado sin separador.