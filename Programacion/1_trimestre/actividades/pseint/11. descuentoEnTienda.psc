//Una tienda ofrece un descuento del x% sobre el total de la compra y
//un cliente desea saber cuanto deberá pagar finalmente por su compra.
Algoritmo descuentoEnTienda
	
	Definir descuento,pagado,total,porcentaje Como Real
	Escribir "Dame el gasto de la compra:"
	Leer pagado
	
	Escribir "Que descuento te han aplicado:"
	Leer descuento
	
	porcentaje = (pagado * descuento) / 100
	
	total = pagado - porcentaje
	
	Escribir "El total es igual a:" total
	
FinAlgoritmo
