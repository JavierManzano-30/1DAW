//Se le pide al usuario que adivine un número en 10 intentos
Algoritmo adivinaNumero
	
	Definir numeroSuerte, numUsuario, numIntentos Como Entero
	numeroSuerte = azar(100) + 1
	numIntentos = 1
	Escribir "Adivina el número entre el 1 y el 100:"
	Leer numUsuario
	
	Mientras numUsuario <> numeroSuerte y numIntentos < 10 Hacer 
		Si numeroSuerte > numUsuario Entonces
			Escribir "muy bajo"
		SiNo
			Escribir "Es muy alto"
		FinSi
		
		//Incrementar a 1 por cada interacción
		numIntentos = numIntentos + 1
		Escribir "Llevas:" numIntentos, "intentos"
		Leer numUsuario
	FinMientras
	
	Si numUsuario = numeroSuerte Entonces
		Escribir "Enhorabuena, has acertado", numUsuario
	SiNo
		Escribir "El numeroo era:" numeroSuerte
	FinSi
	
FinAlgoritmo
