# ValorRango

## 📌 Sobre este ejercicio

Práctica que combina varios temas ya vistos: pedir un dato por consola (`Scanner`), definir límites con `final`, y comprobar si el dato está dentro de un rango usando un operador de comparación en cada extremo unidos con `&&`.

## 🧩 Qué incluye

| Paso | Código | Para qué sirve |
| :--- | :--- | :--- |
| Límites del rango | `final var minimo = 0; final var maximo = 5;` | Constantes: no deberían cambiar durante la ejecución |
| Leer el dato | `Integer.parseInt(new Scanner(System.in).nextLine())` | Lee texto por consola y lo convierte a `int` |
| Comprobar el rango | `dato >= minimo && dato <= maximo` | `true` solo si el dato cumple los dos límites a la vez |

## 💻 Compilar y ejecutar

```bash
javac ValorRango.java
java ValorRango
```

## 📝 Notas

- `dato >= minimo && dato <= maximo` es el patrón estándar para comprobar si un valor está "entre" dos límites (ambos incluidos, por usar `>=` y `<=` en vez de `>` y `<`): junta dos comparaciones con `&&` para que las dos tengan que cumplirse a la vez.
- `new Scanner(System.in).nextLine()` crea un `Scanner` nuevo solo para esa línea, en vez de reutilizar uno ya creado (como en otros ejercicios de `Entrada de Datos por Consola`). Funciona igual, pero si en el futuro necesitas leer más de un dato, es más limpio crear el `Scanner` una vez al principio y reutilizarlo en todas las lecturas.
- Al usar `final`, si más adelante intentas reasignar `minimo` o `maximo`, el código no compilaría — es justo lo que se busca en un límite que no debe cambiar.