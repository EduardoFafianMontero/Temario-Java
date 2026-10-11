NumerosParesFor
📌 Sobre este ejercicio

El mismo ejercicio que Numeros Pares, pero con un ciclo for en vez de while: muestra los números pares del 0 al 20 en una sola línea.

🧩 Qué incluye
Parte	Código	Para qué sirve
Ciclo	for (var i = 0; i <= 20; i++)	Recorre del 0 al 20; i es el contador
Comprobación	if (i % 2 == 0)	Es par si el resto de dividir entre 2 es 0
Salida	System.out.print(i + " ");	Imprime sin salto de línea

Salida esperada: 0 2 4 6 8 10 12 14 16 18 20 

💻 Compilar y ejecutar
bash
javac NumerosParesFor.java
java NumerosParesFor
📝 Notas

⚠️ Esto no compila tal cual está: el archivo se llama NumerosParesFor.java pero la clase es NumeroParesFor (falta la s de Numeros). En Java, una clase public debe llamarse igual que su archivo. Debería ser public class NumerosParesFor.

✅ La lógica sí está bien, y es justo el fallo que se arregla con el for: en Numeros Pares (con while) el contador++ estaba dentro del if y el ciclo no terminaba. Aquí el avance i++ va en la cabecera del for, fuera del if, así que el ciclo termina siempre.

Como empieza en 0, el 0 también se imprime (0 % 2 == 0). Para ir solo del 1 al 20: var i = 1.
El if sin llaves funciona porque solo hay una instrucción, pero con llaves { } es más seguro y claro.