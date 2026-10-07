# Mayodosnumeos

## 📌 Sobre este ejercicio

Compara dos números introducidos por consola y dice cuál es mayor, o si son iguales.

## 🧩 Qué incluye

| Condición | Resultado |
| :--- | :--- |
| `primerNumero > segundoNumero` | `"El mayor de los dos numeros es: " + primerNumero` |
| `segundoNumero > primerNumero` | `"El mayor de los dos numeros es: " + segundoNumero` |
| Ninguna de las dos (son iguales) | `"Los dos numeros son iguales"` |

## 💻 Compilar y ejecutar

```bash
javac Mayodosnumeos.java
java Mayodosnumeos
```

## 📝 Notas

⚠️ **No compila tal cual está — dos errores:**

1. `public static void main(Sting[] args){` → falta la `r` de `String[]`.
2. `System.out.print(*** El mayor de dos numeros ***);` → le faltan las comillas alrededor del texto (mismo fallo que viste en `Si un numero es positivo`). Sin ellas, Java intenta leer `***` como multiplicaciones sobre variables inexistentes.

- La lógica de los 3 casos (mayor, menor, iguales) con `if`/`else if`/`else` está bien planteada — una vez arregladas las comillas y `String[]`, compila y funciona.