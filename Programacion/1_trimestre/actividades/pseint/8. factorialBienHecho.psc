Algoritmo factorialBienHecho
	Definir nf,resultado,n Como Entero
	Escribir "Escribe un número positivo:"
	Leer nf
	
    
	Si nf <0 Entonces
		Escribir "El número factorial debe ser positivo."
	SiNo
		resultado=1
		
		Para n = nf Hasta 1 Con Paso -1
			resultado = resultado*n
			Escribir  "El resultado parcial es: cuando n vale" n "el resultado es:" resultado
			
		FinPara
		Escribir "El resultado es:" resultado
	FinSi

FinAlgoritmo
