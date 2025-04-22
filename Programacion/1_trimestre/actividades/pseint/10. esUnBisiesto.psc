Algoritmo esUnBisiesto
	
	Definir ano Como Real
	Escribir "Dame el año que quieres saber si es bisiesto:"
	Leer ano
	
	Si ano MOD 400 = 0 Entonces
		Escribir "El año es bisiesto"
	SiNo
		Si ano MOD 4 = 0 Entonces
			Escribir "El año es bisiesto"
		SiNo
			Si ano MOD 100 = 0 Entonces
				Escribir "El año es bisiesto"
			SiNo Escribir "El año no es bisiesto"
			FinSi
			
		FinSi
		

	FinSi
	
FinAlgoritmo
