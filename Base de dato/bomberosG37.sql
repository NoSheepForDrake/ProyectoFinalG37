-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 23:34:44
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bomberos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `idBombero` int(11) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombreApellido` varchar(50) NOT NULL,
  `fechaNac` date NOT NULL,
  `celular` varchar(15) NOT NULL,
  `codBrigada` int(11) NOT NULL,
  `gSanguineo` varchar(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`idBombero`, `dni`, `nombreApellido`, `fechaNac`, `celular`, `codBrigada`, `gSanguineo`, `estado`) VALUES
(8, '1', 'Soto Carlos', '1982-04-20', '12344567', 4, 'B+', 1),
(9, '2', 'Soto Pablo', '1982-04-21', '12344567', 1, '0+', 1),
(10, '3', 'Soto Juan', '1982-04-22', '12344567', 1, '0-', 1),
(11, '4', 'Soto Domingo', '1982-04-23', '12344567', 1, '0+', 1),
(12, '5', 'Soto Patricio', '1982-04-24', '12344567', 1, 'A-', 1),
(13, '6', 'Carlos Sanchez', '1984-04-15', '34125', 2, 'AB+', 1),
(15, '7', 'Juan Perez', '1985-07-12', '12345678', 3, 'A+', 1),
(16, '8', 'Maria Rodriguez', '1982-09-28', '23456789', 12, 'B+', 1),
(17, '9', 'Luis Martinez', '1978-03-15', '34567890', 6, 'AB+', 1),
(18, '10', 'Laura Garcia', '1989-11-03', '45678901', 9, 'A-', 1),
(19, '11', 'Carlos Lopez', '1976-05-20', '56789012', 14, '0+', 1),
(20, '12', 'Ana Fernandez', '1983-08-08', '67890123', 1, 'A+', 1),
(21, '13', 'Javier Sanchez', '1987-02-17', '78901234', 8, 'AB-', 1),
(22, '14', 'Elena González', '1979-12-05', '89012345', 11, '0-', 1),
(23, '15', 'Diego Ramirez', '1984-06-22', '90123456', 25, 'B+', 1),
(24, '16', 'Carmen Torres', '1977-10-10', '12341234', 2, 'A+', 1),
(25, '17', 'Daniel Herrera', '1981-04-29', '23452345', 10, '0+', 1),
(26, '18', 'Sofia Castro', '1986-01-14', '34563456', 7, 'A-', 1),
(27, '19', 'Manuel Diaz', '1974-07-03', '45674567', 15, 'AB+', 1),
(28, '20', 'Isabel Vargas', '1988-09-09', '56785678', 4, 'A-', 1),
(29, '21', 'Jorge Paredes', '1980-03-26', '67896789', 13, 'AB-', 1),
(30, '22', 'Natalia Rojas', '1975-11-11', '78907890', 6, 'B-', 1),
(31, '23', 'Alejandro Medina', '1983-05-18', '89018901', 5, '0-', 1),
(32, '24', 'Valentina Silva', '1989-02-07', '90129012', 3, 'A+', 1),
(33, '25', 'Ricardo Guzman', '1978-12-29', '12340123', 9, 'A+', 1),
(34, '26', 'Gabriela Mendoza', '1982-08-16', '23451234', 8, 'AB-', 1),
(35, '27', 'Fernando Navarro', '1976-04-03', '34562345', 14, 'B+', 1),
(36, '28', 'Adriana Ortega', '1987-10-21', '45673456', 7, 'A+', 1),
(37, '29', 'Miguel Jimenez', '1981-06-08', '56784567', 2, 'AB+', 1),
(38, '30', 'Paola Rios', '1984-01-25', '67895678', 11, '0-', 1),
(39, '31', 'Roberto Castro', '1973-09-13', '78906789', 5, 'A-', 1),
(40, '32', 'Camila Montes', '1985-07-01', '89017890', 10, 'A-', 1),
(41, '33', 'Gustavo Varela', '1979-03-19', '90128901', 5, 'AB+', 1),
(42, '34', 'Natalie Peralta', '1988-11-16', '12341234', 2, 'AB-', 1),
(43, '35', 'Sebastian Soto', '1977-05-03', '23452345', 13, 'A+', 1),
(44, '36', 'Valeria Salazar', '1982-01-20', '34563456', 8, 'B+', 1),
(45, '37', 'Hector Mora', '1974-07-09', '45674567', 15, 'AB+', 1),
(46, '38', 'Monica Bravo', '1989-09-29', '56785678', 4, '0-', 1),
(47, '39', 'Raul Ochoa', '1980-04-15', '67896789', 9, 'A+', 1),
(48, '40', 'Daniela Torres', '1975-12-02', '78907890', 6, 'A+', 1),
(49, '41', 'Felipe Nunez', '1983-06-19', '89018901', 12, '0-', 1),
(50, '42', 'Marcela Herrera', '1988-03-08', '90129012', 3, 'AB+', 1),
(51, '43', 'Eduardo Mendoza', '1977-10-26', '12340123', 11, 'B+', 1),
(52, '44', 'Carolina Mora', '1981-07-13', '23451234', 7, 'A+', 1),
(53, '45', 'Oscar Ramirez', '1978-02-28', '34562345', 2, 'AB-', 1),
(54, '46', 'Vanessa Paredes', '1985-08-15', '45673456', 10, 'A+', 1),
(55, '47', 'Rodrigo Soto', '1976-06-02', '56784567', 7, 'A-', 1),
(56, '48', 'Gloria Ortega', '1980-01-19', '67895678', 13, 'AB+', 1),
(57, '49', 'Martin Rojas', '1973-11-06', '78906789', 5, 'B-', 1),
(58, '50', 'Isabella Montes', '1989-07-24', '89017890', 12, 'A-', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codBrigada` int(11) NOT NULL,
  `nombreBriga` varchar(20) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `libre` tinyint(1) NOT NULL,
  `nroCuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codBrigada`, `nombreBriga`, `especialidad`, `libre`, `nroCuartel`) VALUES
(1, 'Dalmatas', 'Incendio', 1, 1),
(2, 'Canarios', 'Accidente', 1, 2),
(3, 'Focas', 'Rescate', 1, 3),
(4, 'Zorros', 'Accidente', 1, 1),
(5, 'Horneros', 'Materiales Peligrosos', 1, 3),
(6, 'Lagartos', 'Derrumbes', 1, 2),
(7, 'Ovejas', 'Incendio', 1, 3),
(8, 'Cabras', 'Accidente', 0, 2),
(9, 'Perros', 'Rescate', 1, 1),
(10, 'Gatos', 'Emergencias', 0, 4),
(11, 'Patos', 'Derrumbes', 1, 5),
(12, 'Conejos', 'Materiales Peligrosos', 0, 2),
(13, 'Tigres', 'Incendio', 1, 3),
(14, 'Leones', 'Accidente', 0, 5),
(15, 'Elefantes', 'Rescate', 1, 4),
(16, 'Jirafas', 'Emergencias', 0, 1),
(17, 'Cocodrilos', 'Derrumbes', 1, 3),
(18, 'Halcones', 'Materiales Peligrosos', 0, 2),
(19, 'Canguros', 'Incendio', 1, 5),
(20, 'Pandas', 'Accidente', 0, 4),
(21, 'Ballenas', 'Rescate', 1, 2),
(22, 'Hipopótamos', 'Emergencias', 0, 3),
(23, 'Zorros', 'Derrumbes', 1, 1),
(24, 'Koalas', 'Materiales Peligrosos', 0, 4),
(25, 'Águilas', 'Incendio', 1, 2),
(26, 'Osos', 'Accidente', 0, 3),
(27, 'Serpientes', 'Rescate', 1, 5),
(28, 'Murciélagos', 'Emergencias', 0, 1),
(29, 'Búhos', 'Derrumbes', 1, 4),
(30, 'Hormigas', 'Materiales Peligrosos', 0, 3),
(31, 'Perritos', 'Accidente', 1, 3),
(32, 'Prueba', 'Rescate', 1, 5),
(33, 'Perros', 'Derrumbes', 1, 3),
(34, 'Ducks', 'Derrumbes', 1, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `codCuartel` int(11) NOT NULL,
  `nombreCuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombreCuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`, `estado`) VALUES
(1, 'Cuartel N°17', 'Los Alamos 1337', 30, 42, '120', 'cuartel17@bomberos.ar', 1),
(2, 'Cuartel N°201', 'Los Sauces 3232', 111, 20, '121', 'cuartel201@bomberos.ar', 1),
(3, 'Cuartel N°332', 'Los Pinos 2044', 28, 57, '122', 'cuartel332@bomberos.ar', 1),
(4, 'Cuartel N°43', 'Los Nogales 478', 50, 77, '123', 'cuartel43@bomberos.ar', 1),
(5, 'Cuartel N°177', 'Los Manzanos 1245', 20, 25, '124', 'cuarlte17@bomberos.ar', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigo` int(11) NOT NULL,
  `tipo` varchar(35) NOT NULL,
  `fechaSiniestro` date NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `detalle` text NOT NULL,
  `fechaResol` date DEFAULT NULL,
  `puntuacion` int(11) DEFAULT NULL,
  `codBrigada` int(11) NOT NULL,
  `resuelto` tinyint(1) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codigo`, `tipo`, `fechaSiniestro`, `coord_X`, `coord_Y`, `detalle`, `fechaResol`, `puntuacion`, `codBrigada`, `resuelto`, `activo`) VALUES
(1, 'Incendio', '2023-01-12', 5, 4, 'Incendio en una vivienda', '2023-01-12', 9, 1, 1, 0),
(4, 'Accidente', '2023-01-12', 2, 2, 'Incendio en una vivienda', '2023-01-12', 2, 1, 0, 0),
(5, 'Rescate', '2023-10-12', 4, 7, 'Probando la interfaz', '2023-10-20', 9, 4, 1, 0),
(100, 'Incendio', '2023-09-29', 150, 180, 'Incendio de una vivienda', '2023-10-05', 8, 25, 1, 0),
(101, 'Accidente', '2023-09-27', 70, 120, 'Accidente de tráfico', '2023-10-06', 4, 15, 0, 0),
(102, 'Rescate', '2023-09-25', 90, 60, 'Rescate en montaña', '2023-10-07', 7, 10, 1, 1),
(103, 'Emergencias', '2023-09-23', 40, 100, 'Emergencia médica', '2023-10-08', 6, 18, 1, 1),
(104, 'Derrumbes', '2023-09-21', 110, 190, 'Derrumbe de un edificio', '2023-10-09', 9, 27, 0, 1),
(105, 'Materiales Peligrosos', '2023-09-19', 30, 80, 'Fuga de sustancias químicas', '2023-10-10', 5, 5, 1, 1),
(106, 'Incendio', '2023-09-17', 170, 50, 'Incendio en un bosque', '2023-10-11', 3, 20, 0, 1),
(107, 'Accidente', '2023-09-15', 60, 140, 'Accidente de bicicleta', '2023-10-12', 8, 28, 1, 1),
(108, 'Rescate', '2023-09-13', 100, 30, 'Rescate en río', '2023-10-13', 2, 14, 0, 1),
(109, 'Emergencias', '2023-09-11', 20, 160, 'Emergencia en un evento público', '2023-10-14', 7, 23, 1, 1),
(110, 'Derrumbes', '2023-09-09', 130, 70, 'Derrumbe de una mina', '2023-10-15', 6, 16, 0, 1),
(111, 'Materiales Peligrosos', '2023-09-07', 50, 110, 'Fuga de gas', '2023-10-16', 1, 21, 1, 1),
(112, 'Incendio', '2023-09-05', 190, 90, 'Incendio en una fábrica', '2023-10-17', 10, 29, 1, 1),
(113, 'Accidente', '2023-09-03', 80, 20, 'Accidente de moto', '2023-10-18', 4, 13, 0, 1),
(114, 'Rescate', '2023-09-01', 120, 150, 'Rescate en altamar', '2023-10-19', 6, 26, 1, 1),
(115, 'Emergencias', '2023-08-30', 10, 130, 'Emergencia en un hospital', '2023-10-20', 9, 11, 0, 1),
(116, 'Derrumbes', '2023-08-28', 140, 40, 'Derrumbe en construcción', '2023-10-21', 3, 22, 1, 1),
(117, 'Materiales Peligrosos', '2023-08-26', 70, 170, 'Fuga de productos químicos', '2023-10-22', 8, 17, 0, 1),
(118, 'Incendio', '2023-08-24', 30, 60, 'Incendio en una tienda', '2023-10-23', 5, 24, 1, 1),
(119, 'Accidente', '2023-08-22', 160, 100, 'Accidente de autobús', '2023-10-24', 2, 19, 0, 1),
(120, 'Rescate', '2023-08-20', 100, 10, 'Rescate en cueva', '2023-10-25', 7, 13, 1, 1),
(121, 'Emergencias', '2023-08-18', 40, 140, 'Emergencia en una escuela', '2023-10-26', 9, 28, 0, 1),
(122, 'Derrumbes', '2023-08-16', 130, 80, 'Derrumbe en carretera', '2023-10-27', 1, 15, 1, 1),
(123, 'Materiales Peligrosos', '2023-08-14', 20, 120, 'Fuga de sustancias tóxicas', '2023-10-28', 4, 23, 0, 1),
(124, 'Incendio', '2023-08-12', 180, 50, 'Incendio en un almacén', '2023-10-29', 10, 16, 1, 1),
(125, 'Accidente', '2023-08-10', 90, 160, 'Accidente de coche', '2023-10-30', 6, 21, 0, 1),
(126, 'Rescate', '2023-08-08', 50, 30, 'Rescate en edificio en ruinas', '2023-10-31', 8, 12, 1, 1),
(127, 'Emergencias', '2023-08-06', 140, 100, 'Emergencia en una planta nuclear', '2023-11-01', 3, 29, 0, 1),
(128, 'Derrumbes', '2023-08-04', 10, 140, 'Derrumbe en una mina', '2023-11-02', 7, 18, 1, 1),
(129, 'Materiales Peligrosos', '2023-08-02', 200, 80, 'Fuga de productos químicos', '2023-11-03', 5, 24, 0, 1),
(130, 'Incendio', '2023-07-31', 70, 10, 'Incendio en una gasolinera', '2023-11-04', 2, 17, 1, 1),
(131, 'Accidente', '2023-07-29', 150, 130, 'Accidente de tren', '2023-11-05', 9, 25, 0, 1),
(132, 'Rescate', '2023-07-27', 30, 50, 'Rescate en río contaminado', '2023-11-06', 8, 14, 1, 1),
(133, 'Emergencias', '2023-07-25', 170, 110, 'Emergencia en un avión', '2023-11-07', 4, 27, 0, 1),
(134, 'Derrumbes', '2023-07-23', 90, 30, 'Derrumbe en puente', '2023-11-08', 6, 13, 1, 1),
(135, 'Materiales Peligrosos', '2023-07-21', 10, 70, 'Fuga de gas en edificio', '2023-11-09', 10, 26, 0, 1),
(136, 'Incendio', '2023-07-19', 190, 150, 'Incendio en un hospital', '2023-11-10', 1, 19, 1, 1),
(137, 'Accidente', '2023-07-17', 50, 90, 'Accidente de barco', '2023-11-11', 5, 22, 0, 1),
(138, 'Rescate', '2023-07-15', 130, 10, 'Rescate en montaña nevada', '2023-11-12', 7, 16, 1, 1),
(139, 'Emergencias', '2023-07-13', 10, 190, 'Emergencia en un parque de diversiones', '2023-11-13', 3, 21, 0, 1),
(140, 'Derrumbes', '2023-07-11', 170, 70, 'Derrumbe en construcción', '2023-11-14', 9, 28, 1, 1),
(141, 'Materiales Peligrosos', '2023-07-09', 90, 130, 'Fuga de productos químicos en fábrica', '2023-11-15', 6, 15, 0, 1),
(142, 'Incendio', '2023-07-07', 30, 50, 'Incendio en un restaurante', '2023-11-16', 2, 20, 1, 1),
(143, 'Accidente', '2023-07-05', 170, 110, 'Accidente de camión', '2023-11-17', 8, 23, 0, 1),
(144, 'Rescate', '2023-07-03', 90, 30, 'Rescate en pozo', '2023-11-18', 4, 11, 1, 1),
(145, 'Emergencias', '2023-07-01', 10, 70, 'Emergencia en un cine', '2023-11-19', 6, 27, 0, 1),
(146, 'Derrumbes', '2023-06-29', 150, 150, 'Derrumbe en túnel', '2023-11-20', 7, 14, 1, 1),
(147, 'Emergencias', '2023-10-13', 54, 11, 'Persona se cayo', '2023-10-13', 8, 10, 1, 0),
(148, 'Incendio', '2023-10-05', 123, 56, 'ASK', '2023-10-05', 8, 1, 0, 0),
(149, 'Otros...', '2023-10-04', 87, 55, 'Marinada', '2023-10-11', 2, 2, 0, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`idBombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `bombero_ibfk_1` (`codBrigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`codBrigada`),
  ADD KEY `nroCuartel` (`nroCuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`codCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `siniestro_ibfk_1` (`codBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `idBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=150;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_3` FOREIGN KEY (`nroCuartel`) REFERENCES `cuartel` (`codCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
