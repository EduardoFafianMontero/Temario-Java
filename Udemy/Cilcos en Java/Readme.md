Ciclos en Java
📌 Sobre esta carpeta

Estructuras que repiten un bloque de código: los ciclos while, do-while y for. Más adelante entrarán las sentencias break / continue.

Está dividida en tres subcarpetas:

Ejercicios/ — Ejercicios que sigo del curso.
Practica/ — Práctica libre sobre este tema.
Temario/ — Apuntes y notas de los conceptos.
🔁 Los ciclos de un vistazo
Ciclo	Cuándo comprueba la condición	¿Se ejecuta al menos una vez?
while	Antes de cada vuelta	❌ No (si la condición empieza en false, nunca entra)
do-while	Después de cada vuelta	✅ Sí, siempre una vez como mínimo
for	Antes de cada vuelta	❌ No; junta inicio, condición y avance en una línea

Un ciclo necesita siempre tres piezas: inicio (var contador = 0;), condición (contador <= 5) y avance (contador++). Si falta el avance, el ciclo es infinito.

📂 Ejercicios
Ciclo While — Contar de 0 a 5 con un while y contador++.
Ciclos do while — Contar de 1 a 3 con un do-while.
ciclos for — Contar de 1 a 3 con un for, con print en una sola línea.
📂 Practica
Numeros Pares — Mostrar los pares con while, if y %.
Numeros impares — Mostrar los impares con do-while, if y %.
Numeros inversos — Cuenta atrás del 10 al 1 con do-while y contador--.
Numeros pares con ciclo for — Los pares del 0 al 20 con for; el mismo ejercicio que Numeros Pares, sin el ciclo infinito.
⚠️ Error que se repite

En Numeros Pares y Numeros impares (con while y do-while) el contador++ quedó dentro del if, lo que provoca un ciclo infinito. Regla: el avance va fuera de la condición.

🔄 Estado

🔄 En progreso. Tema anterior: Sentecias de DEcisiones en Java/.