Algoritmo notasClase
	//1 promedio de las notas
	//2 cuantos estudiantes han aprobado y cuantos han suspendido
	Definir calificacion, numeroAlumnos, sumaCalificaciones, numAprobados, numSuspendidos, promedio Como Real
	
	numeroAlumnos = 0
	sumaCalificaciones = 0
	numAprobados = 0
	numSuspendidos = 0
	
	Repetir
		Escribir "Introduce la calificacion:"
		Leer calificacion
		
		Si calificacion >= 0 Entonces
			numeroAlumnos = numeroAlumnos + 1
			sumaCalificaciones = sumaCalificaciones + calificacion
			
			Si calificacion >= 5 Entonces
				numAprobados = numAprobados + 1
			Sino 
				numSuspendidos = numSuspendidos + 1
			FinSi
			
		FinSi
	Hasta Que calificacion < 0
	
	Si numeroAlumnos > 0 Entonces
		promedio = sumaCalificaciones / numeroAlumnos
		Escribir "El promedio de las notas es:" promedio
		Escribir "Numero de alumnos aprobados:" numAprobados
		Escribir "Numero de alumnos suspensos:" numSuspendidos
		
	FinSi
	
FinAlgoritmo
