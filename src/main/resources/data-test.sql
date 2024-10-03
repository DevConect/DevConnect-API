-- Insertar Usuarios
INSERT INTO usuarios (nombre, correo, contrasena, rol) VALUES
                                                           ('Juan Pérez', 'juan.perez@example.com', 'contrasena123', 'Desarrollador'),
                                                           ('María López', 'maria.lopez@example.com', 'contrasena456', 'Cliente'),
                                                           ('Carlos Fernández', 'carlos.fernandez@example.com', 'contrasena789', 'Desarrollador'),
                                                           ('Lucía Martínez', 'lucia.martinez@example.com', 'contrasena012', 'Cliente'),
                                                           ('Pedro Gómez', 'pedro.gomez@example.com', 'contrasena345', 'Desarrollador'),
                                                           ('Ana Torres', 'ana.torres@example.com', 'contrasena678', 'Cliente'),
                                                           ('Fernando Ruiz', 'fernando.ruiz@example.com', 'contrasena901', 'Desarrollador'),
                                                           ('Sofía Morales', 'sofia.morales@example.com', 'contrasena234', 'Cliente'),
                                                           ('Javier Silva', 'javier.silva@example.com', 'contrasena567', 'Desarrollador'),
                                                           ('Clara Jiménez', 'clara.jimenez@example.com', 'contrasena890', 'Cliente');

-- Insertar Clientes
INSERT INTO clientes (empresa, descripcion_empresa, usuario_id) VALUES
                                                                    ('Tech Innovations', 'Empresa dedicada a la tecnología', 2),
                                                                    ('Creative Solutions', 'Agencia de diseño y marketing', 4),
                                                                    ('Digital World', 'Servicios de consultoría digital', 6),
                                                                    ('Smart Tech', 'Desarrollo de software y aplicaciones', 8),
                                                                    ('NextGen Systems', 'Soluciones de TI innovadoras', 10);

-- Insertar Proyectos
INSERT INTO proyectos (nombre, descripcion, oferta_laboral_id, cliente_id) VALUES
                                                                               ('Proyecto Alpha', 'Desarrollo de software para gestión de inventarios', NULL, 1),
                                                                               ('Proyecto Beta', 'Aplicación web para reservas en línea', NULL, 2),
                                                                               ('Proyecto Gamma', 'Sistema de gestión de recursos humanos', NULL, 3),
                                                                               ('Proyecto Delta', 'Desarrollo de una plataforma de e-learning', NULL, 4),
                                                                               ('Proyecto Épsilon', 'Creación de una app móvil de finanzas', NULL, 5);

-- Insertar Perfiles de Desarrollador
INSERT INTO perfiles_desarrolladores (habilidades, portafolio, usuario_id) VALUES
                                                                               ('Java, Spring, Hibernate', 'https://miportafolio.com/juan', 1),
                                                                               ('JavaScript, React, Node.js', 'https://miportafolio.com/carlos', 3),
                                                                               ('Python, Django, Flask', 'https://miportafolio.com/pedro', 5),
                                                                               ('C#, ASP.NET, SQL Server', 'https://miportafolio.com/fernando', 7),
                                                                               ('Ruby, Rails, PostgreSQL', 'https://miportafolio.com/javier', 9);

-- Insertar Ofertas Laborales
INSERT INTO ofertas_laborales (titulo, descripcion, habilidades_requeridas, presupuesto) VALUES
                                                                                             ('Desarrollador Backend', 'Se busca desarrollador backend con experiencia en Java', 'Java, Spring', 5000),
                                                                                             ('Desarrollador Frontend', 'Necesitamos un frontend con conocimientos en React', 'JavaScript, React', 4000),
                                                                                             ('Desarrollador Fullstack', 'Buscamos un desarrollador Fullstack con experiencia en Node.js', 'Node.js, Express', 6000),
                                                                                             ('Desarrollador de Aplicaciones Móviles', 'Desarrollo de apps móviles para Android y iOS', 'Flutter, Dart', 7000),
                                                                                             ('Desarrollador de Python', 'Desarrollo de aplicaciones con Python y Django', 'Python, Django', 5500);

-- Insertar Hitos
INSERT INTO hitos (nombre, descripcion, fecha_inicio, fecha_fin, proyecto_id) VALUES
                                                                                  ('Inicio del Proyecto Alpha', 'Fase inicial del Proyecto Alpha', '2024-01-01', '2024-01-15', 1),
                                                                                  ('Inicio del Proyecto Beta', 'Fase inicial del Proyecto Beta', '2024-02-01', '2024-02-15', 2),
                                                                                  ('Inicio del Proyecto Gamma', 'Fase inicial del Proyecto Gamma', '2024-03-01', '2024-03-15', 3),
                                                                                  ('Inicio del Proyecto Delta', 'Fase inicial del Proyecto Delta', '2024-04-01', '2024-04-15', 4),
                                                                                  ('Inicio del Proyecto Épsilon', 'Fase inicial del Proyecto Épsilon', '2024-05-01', '2024-05-15', 5);

-- Insertar Tareas
INSERT INTO tareas (titulo, descripcion, fecha_entrega, estado, hito_id) VALUES
                                                                             ('Configuración del Entorno', 'Configurar el entorno de desarrollo para el proyecto', '2024-01-05', 'Pendiente', 1),
                                                                             ('Diseño de la Interfaz', 'Crear el diseño de la interfaz de usuario', '2024-01-10', 'Pendiente', 1),
                                                                             ('Implementación del Backend', 'Desarrollar la lógica del backend', '2024-01-12', 'Pendiente', 1),
                                                                             ('Configuración de la Base de Datos', 'Crear la base de datos del proyecto', '2024-01-14', 'Pendiente', 1),
                                                                             ('Pruebas del Sistema', 'Realizar pruebas del sistema completo', '2024-01-15', 'Pendiente', 1);

-- Insertar Contratos
INSERT INTO contratos (cliente_id, desarrollador_id, oferta_laboral_id, fecha_inicio, fecha_fin, estado) VALUES
                                                                                                             (2, 1, 1, '2024-01-01', '2024-12-31', 'Activo'),
                                                                                                             (4, 3, 2, '2024-02-01', '2024-12-31', 'Activo'),
                                                                                                             (6, 5, 3, '2024-03-01', '2024-12-31', 'Activo'),
                                                                                                             (8, 7, 4, '2024-04-01', '2024-12-31', 'Activo'),
                                                                                                             (10, 9, 5, '2024-05-01', '2024-12-31', 'Activo');

-- Insertar Evaluaciones
INSERT INTO evaluaciones (puntuacion, comentario, contrato_id) VALUES
                                                                   (5, 'Excelente trabajo y dedicación.', 1),
                                                                   (4, 'Buen desempeño, algunas mejoras posibles.', 2),
                                                                   (3, 'Trabajo aceptable, se pueden mejorar algunos aspectos.', 3),
                                                                   (5, 'Gran comunicación y excelente resultado final.', 4),
                                                                   (4, 'Trabajo sólido, pero con algunas demoras.', 5);

-- Insertar Aplicaciones a Ofertas
INSERT INTO aplicaciones_ofertas (desarrollador_id, oferta_laboral_id, estado) VALUES
                                                                                   (1, 1, 'Aceptado'),
                                                                                   (3, 2, 'Pendiente'),
                                                                                   (5, 3, 'Rechazado'),
                                                                                   (7, 4, 'Pendiente'),
                                                                                   (9, 5, 'Aceptado');
