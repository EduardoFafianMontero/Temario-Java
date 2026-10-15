Matrices
📌 Sobre este ejercicio

Primera matriz: crea una tabla de 2 filas y 3 columnas, le asigna valores a las seis posiciones y muestra tres de ellos accediendo con [fila][columna].

🧩 Qué incluye
Código	Qué hace
var matriz = new int[2][3];	Matriz de 2 filas x 3 columnas, todo a 0
matriz[0][0] = 100; ... matriz[1][2] = 600;	Asigna cada elemento
println("Valor 1 [0][0] = " + matriz[0][0]);	Lee y muestra un elemento

Contenido de la matriz:

	col 0	col 1	col 2
fila 0	100	200	300
fila 1	400	500	600

Salida esperada:

Valor 1 [0][0] = 100
Valor 5 [1][1] = 500
Valor 6 [1][2] = 600
💻 Compilar y ejecutar
bash
javac Matrices.java
java Matrices
📝 Notas

✅ Compila y funciona.

Los "Valor 1, 5 y 6" cuentan posiciones desde 1, de izquierda a derecha y de arriba abajo: [0][0] es la 1ª, [1][1] la 5ª y [1][2] la 6ª. Los índices siempre empiezan en 0.
//int[][] matriz = new int[2][3]; (comentada) es la misma declaración con el tipo explícito. Las dos formas son equivalentes.
Acceder fuera de rango, como matriz[2][0], lanza ArrayIndexOutOfBoundsException.
Faltan por mostrar los demás elementos; recorrerla con dos for anidados será lo siguiente (ver el Temario).
La carpeta se llama Matices (falta la r). Si la corriges a Matrices, cambia también el enlace en el Readme del tema.