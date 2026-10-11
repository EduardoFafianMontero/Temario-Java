Temario · Ciclos en Java
🔁 while
java
while (condicion) {
    // se repite mientras la condición sea true
}
Evalúa la condición.
Si es true, ejecuta el bloque y vuelve al paso 1.
Si es false, sale del ciclo.
🔁 do-while
java
do {
    // se ejecuta al menos una vez
} while (condicion);

⚠️ Lleva ; al final del while, a diferencia del while normal.

🔁 for
java
for (inicio; condicion; avance) {
    // se repite mientras la condición sea true
}
java
for (var contador = 1; contador <= 3; contador++) {
    System.out.print(contador + " ");
}
Parte	Cuándo se ejecuta
inicio	Una sola vez, al empezar
condicion	Antes de cada vuelta
avance	Al final de cada vuelta

Se usa cuando sé cuántas vueltas quiero dar; while y do-while cuando depende de una condición.

🔢 Contador y operadores
Código	Significado
var contador = 0;	Inicio del contador
contador++	Suma 1 (post-incremento: usa el valor y luego suma)
contador % 2 == 0	Es par (el resto de dividir entre 2 es 0)
⚠️ Errores típicos
Olvidar el avance (contador++) → ciclo infinito.
Poner el avance dentro de un if → si la condición del if no se cumple, el contador nunca avanza.
Confundir < con <= → una vuelta de más o de menos.