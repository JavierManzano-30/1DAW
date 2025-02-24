Algoritmo calcularPorcentajesPersonas
	
	Definir hombres,mujeres,porcentajeHombres,porcentajeMujeres,total Como Real
	Escribir "Dime cuantos hombres hay:"
	Leer hombres
	Escribir "Dime cuantas mujeres hay:"
	Leer mujeres
	
	total = hombres + mujeres
	porcentajeHombres = (hombres * 100) /total
	porcentajeMujeres = 100 - porcentajeHombres
	
	Escribir "hombres:" porcentajeHombres "mujeres:" porcentajeMujeres
	
	
	
FinAlgoritmo
