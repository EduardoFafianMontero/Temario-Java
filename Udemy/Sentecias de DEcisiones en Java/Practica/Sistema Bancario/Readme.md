# SistemaBancario

## 📌 Sobre este ejercicio

Pregunta al usuario si quiere salir del sistema, y usa lógica **inversa** con `!` para decidir qué mensaje mostrar: en vez de preguntar "¿quieres continuar?", pregunta "¿quieres salir?" y niega la respuesta para saber si debe continuar.

## 🧩 Qué incluye

| Código | Qué hace |
| :--- | :--- |
| `var salirSisema = Boolean.parseBoolean(consola.nextLine());` | Lee si el usuario quiere salir |
| `if (!salirSistema) { ... }` | Si **no** quiere salir (`!`invierte el valor) → sigue en el sistema |
| `else { ... }` | Si sí quiere salir → mensaje de despedida |

## 💻 Compilar y ejecutar

```bash
javac SistemaBancario.java
java SistemaBancario
```

## 📝 Notas

⚠️ **Esto no compila tal cual está — dos errores:**

1. La variable se declara como `salirSisema` (falta la `t` de "Sistema"), pero en el `if` se usa `salirSistema` (con la `t`) — son dos nombres distintos para Java, hay que unificarlos.
2. `System.out.ptintln(...)` → falta la `r`, debería ser `println`.

- El patrón `!variable` para invertir la pregunta ("¿salir?" → "si NO quiere salir, continúa") es el mismo que ya usaste en `Operadores Logicos` y en `Rango de una variable` — aquí lo aplicas a una decisión de flujo real, no solo como ejercicio de operadores sueltos.