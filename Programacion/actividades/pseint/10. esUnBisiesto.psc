Algoritmo esUnBisiesto
	
	Definir ano Como Real
	Escribir "Dame el a�o que quieres saber si es bisiesto:"
	Leer ano
	
	Si ano MOD 400 = 0 Entonces
		Escribir "El a�o es bisiesto"
	SiNo
		Si ano MOD 4 = 0 Entonces
			Escribir "El a�o es bisiesto"
		SiNo
			Si ano MOD 100 = 0 Entonces
				Escribir "El a�o es bisiesto"
			SiNo Escribir "El a�o no es bisiesto"
			FinSi
			
		FinSi
		

	FinSi
	
FinAlgoritmo
