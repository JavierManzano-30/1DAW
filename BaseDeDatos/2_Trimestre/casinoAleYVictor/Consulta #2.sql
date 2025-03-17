USE casinos;
CREATE TABLE IF NOT EXISTS personia (
Dni VARCHAR (9),
	Nombre VARCHAR (30),
   Apellido VARCHAR (30),
   Direccion VARCHAR (50),
   Telefono VARCHAR (9),
   Correo VARCHAR (50),
   PRIMARY KEY (Dni)
);
CREATE TABLE IF NOT EXISTS clientie
(
   TarjetaSocio VARCHAR (30),
   NumPases INT (5),
   ClienteAfilia VARCHAR(30),
   Dni VARCHAR (9),
   PRIMARY KEY (TarjetaSocio),
   FOREIGN KEY (Dni) REFERENCES casinos.personia (DNI)
);

CREATE TABLE IF NOT EXISTS duenio
(
   TituloPropiedad VARCHAR (50),
   SalarioD INT (6),
   Dni VARCHAR (9),
   PRIMARY KEY (TituloPropiedad),
   FOREIGN KEY (Dni) REFERENCES casinos.personia (DNI)
);

CREATE TABLE IF NOT EXISTS establecimiento
(
   RefCatastral VARCHAR (20),
   TlfLocal VARCHAR (9),
   DireccionL VARCHAR (50),
   TituloPropiedad VARCHAR (50),
   PRIMARY KEY (RefCatastral),
   FOREIGN KEY (TituloPropiedad) REFERENCES casinos.duenio (TituloPropiedad)
);

CREATE TABLE IF NOT EXISTS entra
(
   TarjetaSocio VARCHAR (30),
   FOREIGN KEY (TarjetaSocio) REFERENCES casinos.clientie (TarjetaSocio),
   RefCatastral VARCHAR (20),
   FOREIGN KEY (RefCatastral) REFERENCES casinos.establecimiento(RefCatastral)
);

CREATE TABLE IF NOT EXISTS juego
(
   CodigoJuego VARCHAR (9),
   LimJugador INT (6),
   PRIMARY KEY (CodigoJuego)
);

CREATE TABLE IF NOT EXISTS juega
(
   TarjetaSocio VARCHAR (30),
   RefCatastral VARCHAR (20),
   CodigoJuego VARCHAR (9),
   FOREIGN KEY (TarjetaSocio) REFERENCES casinos.clientie (TarjetaSocio),
   FOREIGN KEY (RefCatastral) REFERENCES casinos.establecimiento (RefCatastral),
   FOREIGN KEY (CodigoJuego) REFERENCES casinos.juego (CodigoJuego)
);

CREATE TABLE IF NOT EXISTS trabajador 
(
   NumSegSoc VARCHAR (12),
   SalarioT INT (5),
   RefCatastral VARCHAR (20),
   Dni VARCHAR (9),
   PRIMARY KEY (NumSegSoc),
   FOREIGN KEY (RefCatastral) REFERENCES casinos.establecimiento (RefCatastral),
   FOREIGN KEY (Dni) REFERENCES casinos.personia (Dni)
);

CREATE TABLE IF NOT EXISTS supervisa
(
   NumSegSoc VARCHAR (12),
   RefCatastral VARCHAR (20),
   FOREIGN KEY (NumSegSoc) REFERENCES casinos.trabajador (NumSegSoc),
   FOREIGN KEY (RefCatastral) REFERENCES casinos.establecimiento (RefCatastral)
);
