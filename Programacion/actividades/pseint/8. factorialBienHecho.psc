Algoritmo factorialBienHecho
	Definir nf,resultado,n Como Entero
	Escribir "Escribe un n�mero positivo:"
	Leer nf
	
    
	Si nf <0 Entonces
		Escribir "El n�mero factorial debe ser positivo."
	SiNo
		resultado=1
		
		Para n = nf Hasta 1 Con Paso -1
			resultado = resultado*n
			Escribir  "El resultado parcial es: cuando n vale" n "el resultado es:" resultado
			
		FinPara
		Escribir "El resultado es:" resultado
	FinSi

FinAlgoritmo
