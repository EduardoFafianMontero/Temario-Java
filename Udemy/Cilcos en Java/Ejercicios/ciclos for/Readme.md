CicloFor
📌 Sobre este ejercicio

Primer ciclo for: imprime 1, 2 y 3 en la misma línea. El for junta en una sola línea las tres piezas del ciclo: inicio, condición y avance.

🧩 Qué incluye
Parte	Código	Para qué sirve
Inicio	var contador = 1	Se ejecuta una sola vez, al empezar
Condición	contador <= 3	Se comprueba antes de cada vuelta
Avance	contador++	Se ejecuta al final de cada vuelta
Salida	System.out.print(contador + " ");	Imprime sin salto de línea, con un espacio detrás

Salida esperada: 1 2 3  (en una sola línea).

💻 Compilar y ejecutar
bash
javac CicloFor.java
java CicloFor
📝 Notas

✅ Este compila y funciona tal cual está.

print vs println: print no salta de línea, por eso salen todos juntos. Con println saldrían uno por línea.
La variable contador solo existe dentro del for: fuera del ciclo ya no se puede usar.
Comparado con el while: el mismo ciclo escrito con while necesitaría el var contador = 1; antes, y el contador++ dentro del bloque. El for lo agrupa todo en la cabecera, así es más difícil olvidar el avance y caer en un ciclo infinito.