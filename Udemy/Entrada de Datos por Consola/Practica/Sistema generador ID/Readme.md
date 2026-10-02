# GeneradorID

## 📌 Sobre este ejercicio

Genera un identificador único a partir de datos del usuario: las 2 primeras letras del nombre, las 2 primeras del apellido, 2 caracteres del año de nacimiento, y un número aleatorio de 4 dígitos con relleno de ceros.

## 🧩 Qué incluye

| Paso | Código | Ejemplo |
| :--- | :--- | :--- |
| Pedir nombre, apellido y año | `consola.nextLine()` × 3 | `"Eduardo"`, `"Fafián"`, `"2001"` |
| Normalizar (2 primeras letras, mayúsculas) | `.trim().toUpperCase().substring(0,2)` | `"ED"`, `"FA"`, `"20"` |
| Número aleatorio 1-9999 | `aleatorio.nextInt(9999) + 1` | p. ej. `47` |
| Formatear a 4 dígitos con ceros | `String.format("%04d", numeroAleatorio)` | `"0047"` |
| Unir todo | `nombre2 + apellido2 + anionacimiento2 + numeroAleatorioformato` | `"EDFA200047"` |
| Imprimir con *text block* + `printf` | `System.out.printf("""..."""paragraphs, idUnico)` | `"tu id único es: EDFA200047"` |

## 💻 Compilar y ejecutar

```bash
javac GeneradorID.java
java GeneradorID
```

## 📝 Notas

- **`%04d`** formatea un entero a 4 dígitos, rellenando con ceros a la izquierda si hace falta (`47` → `"0047"`) — así el ID siempre tiene la misma longitud, tenga el número aleatorio 1 o 4 cifras.
- `anionacimiento` se lee como texto (`nextLine()`) y nunca se convierte a número — no hace falta, porque solo se usan sus 2 primeros caracteres con `.substring(0,2)`. El `.toUpperCase()` sobre el año no hace nada (los dígitos no tienen mayúsculas/minúsculas), pero tampoco causa ningún problema.
- ⚠️ **Con un año como `"2001"`, `.substring(0,2)` coge `"20"` (los 2 primeros dígitos)**, que van a ser los mismos para cualquiera nacido entre 2000 y 2099 — si la idea era añadir variedad al ID según el año de nacimiento, coger los **últimos** 2 dígitos (`anionacimiento.substring(anionacimiento.length()-2)`) daría más variación entre usuarios de distintos años.
- ⚠️ Si el usuario escribe un nombre, apellido o año de **menos de 2 caracteres**, `.substring(0,2)` lanza un error (`StringIndexOutOfBoundsException`) porque intenta coger 2 caracteres de un texto que no los tiene.
- Buena práctica al final: `consola.close()` cierra el `Scanner` cuando ya no se necesita.