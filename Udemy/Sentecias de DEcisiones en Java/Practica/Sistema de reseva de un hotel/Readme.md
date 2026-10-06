# SistemaReservaHotel

## 📌 Sobre este ejercicio

Calcula el costo total de una estadía en hotel, según los días y si la habitación tiene vista al mar (tarifa distinta en cada caso). Termina mostrando un resumen formateado con *text block* + `printf`.

## 🧩 Qué incluye

| Dato | Código | Valor |
| :--- | :--- | :--- |
| `TARIFA_DIARIA_CON_VISTA_MAR` | Constante (`final`) | `190.50` |
| `TARIFA_DIARIA_SIN_VISTA_MAR` | Constante (`final`) | *(pendiente — no visible en la captura)* |
| `nombreCliente` | `consola.nextLine()` | Nombre del cliente |
| `diasEstadia` | `Integer.parseInt(consola.nextLine())` | Días de estadía |
| `conVistaAlMar` | `Boolean.parseBoolean(consola.nextLine())` | Si la habitación tiene vista al mar |
| `costoTotal` | `diasEstadia * TARIFA_DIARIA_CON_VISTA_MAR` o `..._SIN_VISTA_MAR`, según `conVistaAlMar` | — |


## 💻 Compilar y ejecutar

```bash
javac SistemaReservaHotel.java
java SistemaReservaHotel
```

## 📝 Notas

- El `if`/`else` aquí no usa llaves `{ }` porque cada rama es una sola instrucción — es válido en Java (las llaves son opcionales si solo hay una línea), aunque muchos equipos prefieren ponerlas siempre, precisamente para evitar errores si alguien añade una segunda línea a una rama sin darse cuenta de que queda fuera del `if`.
- El ternario `conVistaAlMar ? "Sí :)" : "No :("` dentro de los argumentos del `printf` es el mismo patrón que ya usaste en `Operador Ternario`, aquí aplicado directamente como argumento sin pasar por una variable intermedia.
