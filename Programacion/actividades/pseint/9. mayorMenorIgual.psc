//Dado a y b 
//a > b => a es mayor que b
//b > a => b es mayor que a
//a = b => a y b son iguales
Algoritmo mayorMenorIgual
	
	Definir a,b Como Real
	Escribir "Escribe un número (a):" 
	Leer a
	Escribir "Escribe un número (b):" 
	Leer b
	
	Si a>b Entonces
		Escribir "a es mayor que b"
	SiNo
		Si a<b Entonces
			Escribir "b es mayor que a"
		SiNo Escribir "a y b son iguales"
		FinSi
		
	FinSi
	
FinAlgoritmo
