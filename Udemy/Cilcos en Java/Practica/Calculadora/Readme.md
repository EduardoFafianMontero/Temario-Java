Calculadora
📌 Sobre este ejercicio

Calculadora en consola con menú: suma, resta, multiplicación y división. Se repite con un while hasta que el usuario elige Salir, y un switch ejecuta la operación elegida. Reúne todo lo visto en el tema: bandera + while + switch + if/else + Scanner + printf.

🧩 Qué incluye
Elemento	Código	Para qué sirve
Variables	double operando1 = 0, operando2 = 0, resultado;	Dos números y el resultado, en double para admitir decimales
Bandera	var salir = false;	Al pasar a true, el while termina
Ciclo	while (!salir)	Repite el menú
Menú	text block con \s final	Muestra las 5 opciones
Filtro	if (opcion >= 1 && opcion <= 4)	Pide los dos valores solo si la opción es una operación (no para Salir ni inválida)
Operaciones	case 1 a case 4 con ->	Suma, resta, multiplicación y división
División segura	if (operando2 != 0) {...} else {...}	Evita dividir entre cero
Salida	case 5 → salir = true;	Termina el programa
Resto	default	Opción inválida
💻 Compilar y ejecutar
bash
javac Calculadora.java
java Calculadora
📝 Notas

✅ Compila y funciona. Es el ejercicio más completo del tema hasta ahora.

Por qué se comprueba la división entre cero: con double, Java no lanza error al dividir entre 0; devuelve Infinity. (Con enteros, int, sí lanzaría ArithmeticException.) Por eso el if (operando2 != 0) es necesario para mostrar un mensaje útil.
Buena decisión: el if (opcion >= 1 && opcion <= 4) antes del switch evita pedir números cuando el usuario elige Salir u otra opción.
Decimales con coma: con Java en español, nextDouble() espera la coma (2,5). Con punto (2.5) lanza InputMismatchException.
Sin validar: si escribes una letra en vez de un número, el programa se cae.
Acentos en la consola de Windows: si ves caracteres raros en Multiplicación u opción, compila con javac -encoding UTF-8 Calculadora.java.
%.2f redondea el resultado a 2 decimales (10 / 3 → 3,33) y %n%n deja una línea en blanco después.
Mejora posible: repetir la lectura con do-while mientras el valor no sea válido.