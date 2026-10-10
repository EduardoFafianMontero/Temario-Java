# CicloDoWhile

## 📌 Sobre este ejercicio

Primer ciclo `do-while`: imprime 1, 2 y 3. A diferencia del `while`, la condición se comprueba **al final**, así que el bloque se ejecuta como mínimo una vez.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Contador | `var contador = 1;` | Inicio |
| Bloque | `do { System.out.println(contador++); }` | Se ejecuta primero |
| Condición | `while (contador <= 3);` | Se comprueba después; lleva `;` al final |

**Salida esperada:** `1 2 3` (uno por línea).

## 💻 Compilar y ejecutar

```bash
javac CicloDoWhile.java
java CicloDoWhile
```

## 📝 Notas

⚠️ **Esto no compila tal cual está:**

1. **Falta el método `main`.** El código está directamente dentro de la clase; en Java las instrucciones deben ir dentro de un método. Hay que añadir:
   ```java
   public static void main(String[] args) {
       // ... aquí va todo
   }
   ```
2. `System.out.piln(...)` → es `println`.

- Título con errata: `"*** Cilo Do While ***"` → `Ciclo`.
- Prueba a poner `var contador = 10;`: el `do-while` imprimirá igualmente `10` una vez, mientras que un `while` no imprimiría nada.