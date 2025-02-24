Algoritmo trianguloRectangulo
	Definir resultado, lado1, lado2, lado3 Como Real
	Definir hipotenusa, cat1, cat2 Como Real
	
	Escribir "Dime cual es el lado1:"
	Leer lado1
	Escribir "Dime cual es el lado2:"
	Leer lado2
	Escribir "Dime cual es el lado3:"
	Leer lado3
	
	Si lado1 > lado2 y lado1> lado3 Entonces 
		hipotenusa=lado1
		cat1=lado2
		cat2=lado3
	SiNo
		Si lado2>lado1 y lado2>lado3 Entonces
			hipotenusa=lado2
			cat1=lado1
			cat2=lado3
		SiNo
			Si lado3>lado1 y lado3>lado2 Entonces
				hipotenusa=lado3
				cat1=lado1
				cat2=lado2
			FinSi
		FinSi
		
	FinSi
	
	
	
	Si hipotenusa^2 = cat1^2+cat2^2 Entonces
		Escribir "Es un triángulo rectángulo"
	SiNo 
		Escribir "No es un triángulo rectángulo"
		
	FinSi
	
FinAlgoritmo
