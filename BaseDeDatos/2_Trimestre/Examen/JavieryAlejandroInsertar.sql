-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.40 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Volcando datos para la tabla manzano_marquez.clasificacion: ~10 rows (aproximadamente)
INSERT INTO `clasificacion` (`nombre_comp`, `codigo_temp`, `nombre_club`, `num_posicion`) VALUES
	('Champions', 2023, 'Club G', 7),
	('Champions', 2023, 'Club H', 8),
	('Copa X', 2023, 'Club E', 5),
	('Copa X', 2023, 'Club F', 6),
	('Europa League', 2023, 'Club A', 9),
	('Europa League', 2023, 'Club B', 10),
	('Liga A', 2023, 'Club A', 1),
	('Liga A', 2023, 'Club B', 2),
	('Liga B', 2023, 'Club C', 3),
	('Liga B', 2023, 'Club D', 4);

-- Volcando datos para la tabla manzano_marquez.club: ~8 rows (aproximadamente)
INSERT INTO `club` (`nombre_club`, `numero_socios`, `nombre_fed`) VALUES
	('Club A', 1500, 'Federacion Norte'),
	('Club B', 2300, 'Federacion Norte'),
	('Club C', 1200, 'Federacion Sur'),
	('Club D', 1800, 'Federacion Sur'),
	('Club E', 900, 'Federacion Este'),
	('Club F', 2000, 'Federacion Este'),
	('Club G', 1100, 'Federacion Oeste'),
	('Club H', 2500, 'Federacion Oeste');

-- Volcando datos para la tabla manzano_marquez.competicion: ~9 rows (aproximadamente)
INSERT INTO `competicion` (`nombre_comp`) VALUES
	('Champions'),
	('Copa X'),
	('Copa Y'),
	('Europa League'),
	('Liga A'),
	('Liga B'),
	('Liga C'),
	('SuperLiga'),
	('Torneo Z');

-- Volcando datos para la tabla manzano_marquez.contrato: ~8 rows (aproximadamente)
INSERT INTO `contrato` (`codigo_persona`, `fecha`, `nombre_club`, `importe_cont`, `fecha_baja`) VALUES
	(9, '2023-09-12', 'Club A', 55000, NULL),
	(10, '2023-10-27', 'Club B', 60000, NULL),
	(11, '2023-11-14', 'Club C', 57000, NULL),
	(12, '2023-12-31', 'Club D', 53000, NULL),
	(13, '2023-01-01', 'Club E', 51000, NULL),
	(14, '2023-02-15', 'Club F', 52000, NULL),
	(15, '2023-03-10', 'Club G', 50500, NULL),
	(16, '2023-04-25', 'Club H', 49500, NULL);

-- Volcando datos para la tabla manzano_marquez.entrenador: ~8 rows (aproximadamente)
INSERT INTO `entrenador` (`codigo_persona`, `fecha_inicio_carrera`) VALUES
	(1, '2010-07-15'),
	(2, '2005-09-12'),
	(3, '2012-06-30'),
	(4, '2014-08-22'),
	(5, '2011-03-17'),
	(6, '2015-11-05'),
	(7, '2018-04-09'),
	(8, '2020-01-14');

-- Volcando datos para la tabla manzano_marquez.especialidad: ~4 rows (aproximadamente)
INSERT INTO `especialidad` (`nombre_esp`) VALUES
	('Ataque'),
	('Defensa'),
	('Portero'),
	('Táctica');

-- Volcando datos para la tabla manzano_marquez.fecha: ~12 rows (aproximadamente)
INSERT INTO `fecha` (`fecha`) VALUES
	('2023-01-01'),
	('2023-02-15'),
	('2023-03-10'),
	('2023-04-25'),
	('2023-05-20'),
	('2023-06-30'),
	('2023-07-05'),
	('2023-08-18'),
	('2023-09-12'),
	('2023-10-27'),
	('2023-11-14'),
	('2023-12-31');

-- Volcando datos para la tabla manzano_marquez.federacion: ~4 rows (aproximadamente)
INSERT INTO `federacion` (`nombre_fed`, `fecha_creacion`) VALUES
	('Federacion Este', '2001-01-15'),
	('Federacion Norte', '1995-06-12'),
	('Federacion Oeste', '1978-11-30'),
	('Federacion Sur', '1987-09-23');

-- Volcando datos para la tabla manzano_marquez.habilidad: ~4 rows (aproximadamente)
INSERT INTO `habilidad` (`codigo_persona`, `nombre_esp`, `grado`) VALUES
	(9, 'Defensa', 85),
	(10, 'Ataque', 90),
	(11, 'Portero', 88),
	(12, 'Táctica', 80);

-- Volcando datos para la tabla manzano_marquez.jugador: ~22 rows (aproximadamente)
INSERT INTO `jugador` (`codigo_persona`, `peso`, `altura`) VALUES
	(9, 78, 1.82),
	(10, 70, 1.76),
	(11, 80, 1.85),
	(12, 70, 1.78),
	(13, 76, 1.82),
	(14, 85, 1.90),
	(15, 90, 1.88),
	(16, 74, 1.79),
	(17, 77, 1.84),
	(18, 82, 1.87),
	(19, 88, 1.92),
	(20, 83, 1.86),
	(21, 65, 1.72),
	(22, 78, 1.83),
	(23, 81, 1.85),
	(24, 87, 1.91),
	(25, 73, 1.78),
	(26, 80, 1.86),
	(27, 79, 1.81),
	(28, 84, 1.88),
	(29, 90, 1.95),
	(30, 86, 1.89);

-- Volcando datos para la tabla manzano_marquez.oferta: ~8 rows (aproximadamente)
INSERT INTO `oferta` (`codigo_persona`, `fecha`, `nombre_club`, `importe_oferta`) VALUES
	(9, '2023-01-01', 'Club A', 55000),
	(10, '2023-02-15', 'Club B', 60000),
	(11, '2023-03-10', 'Club C', 57000),
	(12, '2023-04-25', 'Club D', 53000),
	(13, '2023-05-20', 'Club E', 51000),
	(14, '2023-06-30', 'Club F', 52000),
	(15, '2023-07-05', 'Club G', 50500),
	(16, '2023-08-18', 'Club H', 49500);

-- Volcando datos para la tabla manzano_marquez.persona: ~30 rows (aproximadamente)
INSERT INTO `persona` (`codigo_persona`, `nombre`, `direccion`, `telefono`, `fecha_nacimiento`) VALUES
	(1, 'Juan', 'Calle 1', '123456789', '1990-05-14'),
	(2, 'Pedro', 'Calle 2', '987654321', '1985-07-22'),
	(3, 'Luis', 'Calle 3', '112233445', '1993-02-11'),
	(4, 'Carlos', 'Calle 4', '334455667', '1997-12-30'),
	(5, 'Andres', 'Calle 5', '556677889', '1995-06-25'),
	(6, 'Miguel', 'Calle 6', '223344556', '1992-09-18'),
	(7, 'Javier', 'Calle 7', '667788990', '1999-11-10'),
	(8, 'Ricardo', 'Calle 8', '998877665', '1988-03-08'),
	(9, 'Samuel', 'Calle 9', '554433221', '1991-08-05'),
	(10, 'Sergio', 'Calle 10', '776655443', '1996-10-22'),
	(11, 'Alberto', 'Calle 11', '221133445', '1994-04-15'),
	(12, 'Raul', 'Calle 12', '889900112', '2000-07-04'),
	(13, 'Hector', 'Calle 13', '667788123', '1998-01-25'),
	(14, 'David', 'Calle 14', '778899221', '1997-06-11'),
	(15, 'Gustavo', 'Calle 15', '334411223', '1993-09-30'),
	(16, 'Fernando', 'Calle 16', '998822334', '1989-02-07'),
	(17, 'Oscar', 'Calle 17', '555666777', '1991-12-23'),
	(18, 'Cristian', 'Calle 18', '444333222', '1996-05-19'),
	(19, 'Emilio', 'Calle 19', '666999888', '1990-08-27'),
	(20, 'Ruben', 'Calle 20', '223366445', '1987-11-13'),
	(21, 'Daniel', 'Calle 21', '998822113', '1995-12-05'),
	(22, 'Victor', 'Calle 22', '776655990', '1998-07-18'),
	(23, 'Mariano', 'Calle 23', '123123123', '1986-04-29'),
	(24, 'Ezequiel', 'Calle 24', '321321321', '1992-10-10'),
	(25, 'Diego', 'Calle 25', '213213213', '1999-05-23'),
	(26, 'Fidel', 'Calle 26', '414141414', '2001-09-30'),
	(27, 'Esteban', 'Calle 27', '515151515', '2003-12-20'),
	(28, 'Martín', 'Calle 28', '616161616', '1994-06-15'),
	(29, 'Joaquin', 'Calle 29', '717171717', '1985-02-18'),
	(30, 'Felipe', 'Calle 30', '818181818', '1993-03-22');

-- Volcando datos para la tabla manzano_marquez.temporada: ~6 rows (aproximadamente)
INSERT INTO `temporada` (`codigo_temp`) VALUES
	(2020),
	(2021),
	(2022),
	(2023),
	(2024),
	(2025);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
