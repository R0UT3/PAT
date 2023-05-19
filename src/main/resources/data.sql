INSERT INTO usuario ( nombre, email, password)
VALUES
  ( 'Pepe', 'pepe@gmail.com', 'pepe1234'),
  ( 'Javier', 'javi@gmail.com', 'pepe1234'),
  ( 'Pablo', 'pablo@gmail.com', 'pepe1234'),
  ( 'Juan', 'juan@gmail.com', 'pepe1234'),
  ( 'Carlos', 'carlos@gmail.com', 'pepe1234'),
  ( 'Sergio', 'sergio@gmail.com', 'pepe1234');

INSERT INTO carrito (usuario_id,nentradasvip,nentradasnormal, granpremio)
VALUES
  (1, 2,2, 1),
  (2, 2,2, 3),
  (3, 2,2, 5),
  (4, 2,2, 15);

INSERT INTO grandespremios ( nombre, ganador)
VALUES
  ( 'Sakhir', 1),
  ( 'Jeddah International Street Circuit', 11),
  ( 'Albert Park', 1),
  ( 'Baku City Circuit', 11),
  ( 'Hard Rock Stadium Circuit', 1),
  ( 'Imola', NULL),
  ( 'Montecarlo', NULL),
  ( 'Catalunya', NULL),
  ( 'Gilles Villeneuve', NULL),
  ( 'Red Bull Ring', NULL),
  ( 'Silverstone', NULL),
  ( 'Hungaroring', NULL),
  ( 'Spa-Francorchamps', NULL),
  ( 'Zandvoort', NULL),
  ( 'Monza', NULL),
  ( 'Marina Bay', NULL),
  ( 'Suzuka', NULL),
  ( 'Losail', NULL),
  ( 'Las Américas', NULL),
  ( 'Hermanos Rodríguez', NULL),
  ( 'Interlagos', NULL),
  ( 'Las Vegas', NULL),
  ( 'Yas Marina', NULL);

INSERT INTO pilotos ( id, nombre, pais)
VALUES
  (1, 'Max Verstappen', 'Países Bajos'),
  (2, 'Logan Sargent', 'Estados Unidos'),
  (4, 'Lando Norris', 'Inglaterra'),
  (10, 'Pierre Gasly', 'Francia'),
  (11, 'Sergio Perez', 'México'),
  (14, 'Fernando Alonso', 'España'),
  (16, 'Charles Leclerc', 'Mónaco'),
  (18, 'Lance Stroll', 'Canadá'),
  (20, 'Kevin Magnussen', 'Dinamarca'),
  (21, 'Nyck De Vries', 'Países Bajos'),
  (22, 'Yuki Tsunoda', 'Japón'),
  (23, 'Alexander Albon', 'Tailandia'),
  (24, 'Zhou Guanyu', 'China'),
  (27, 'Nico Hulkenberg', 'Alemania'),
  (31, 'Esteban Ocon', 'Francia'),
  (44, 'Lewis Hamilton', 'Inglaterra'),
  (55, 'Carlos Sainz', 'España'),
  (63, 'George Rusell', 'Inglaterra'),
  (77, 'Valtteri Bottas', 'Finlandia'),
  (81, 'Oscar Piastri', 'Australia');

  INSERT INTO contacto (email, texto)
  VALUES
  ('pepe@gmail.com', 'pepe1234'),
  ('pepe2@gmail.com', 'pepe1234'),
  ('pepe3@gmail.com', 'pepe1234'),
  ('pepe4@gmail.com', 'pepe1234');