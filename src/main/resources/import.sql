-- Tipos de Productos
INSERT INTO `tipo_producto` VALUES(1, 'Frutas y Verduras');
INSERT INTO `tipo_producto` VALUES(2, 'Cereales y Carbohidratos');
INSERT INTO `tipo_producto` VALUES(3, 'Proteínas');
INSERT INTO `tipo_producto` VALUES(4, 'Lácteos');
INSERT INTO `tipo_producto` VALUES(5, 'Grasas y Aceites');
INSERT INTO `tipo_producto` VALUES(6, 'Azúcares y dulces');

-- Frutas y Verduras
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Manzana Roja', 1, 2, 10);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Pera', 1, 1, 20);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Naranja', 1, 3, 15);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Plátano', 1, 4, 12);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Tomate', 1, 5, 4);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Patata', 1, 20, 2);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Zanahoria', 1, 3, 8);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Espinaca', 1, 2, 6);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Fresa', 1, 6, 10);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Sandía', 1, 8, 3);

-- Cereales y Carbohidratos
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Arroz', 2, 2, 25);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Pan Integral', 2, 3, 18);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Avena', 2, 4, 20);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Pasta', 2, 2, 15);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Harina de trigo', 2, 3, 10);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Maíz', 2, 1, 22);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Cereal de desayuno', 2, 5, 12);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Pancake Mix', 2, 4, 8);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Galletas de avena', 2, 3, 7);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Cuscús', 2, 6, 6);

-- Proteínas
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Pollo', 3, 6, 10);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Salmón', 3, 8, 6);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Atún', 3, 5, 15);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Carne de res', 3, 10, 8);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Huevo', 3, 3, 30);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Lentejas', 3, 2, 25);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Tofu', 3, 4, 12);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Garbanzos', 3, 2, 20);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Filete de cerdo', 3, 7, 9);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Pavo', 3, 5, 12);
INSERT INTO producto (nombre, tipo_producto_id, precio, cantidad) VALUES ('Macaco Fresco', 3, 9, 19);

-- Lácteos
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Yogurt', 4, 4, 8);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Leche', 4, 1, 100);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Queso fresco', 4, 5, 8);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Mantequilla', 4, 3, 10);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Leche de almendras', 4, 5, 12);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Helado', 4, 6, 15);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Queso cheddar', 4, 7, 8);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Crema', 4, 4, 10);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Yogurt griego', 4, 3, 12);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Leche de soja', 4, 6, 9);

-- Grasas y Aceites
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Aceite de oliva', 5, 7, 15);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Aceite de coco', 5, 8, 10);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Mantequilla de maní', 5, 4, 12);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Aguacate', 5, 3, 6);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Nueces', 5, 6, 8);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Semillas de chía', 5, 5, 10);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Aceitunas', 5, 4, 15);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Margarina', 5, 3, 18);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Mantequilla de almendras', 5, 5, 9);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Cacao en polvo', 5, 6, 7);

-- Azúcares y Dulces
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Miel', 6, 4, 20);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Azúcar', 6, 2, 30);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Chocolate negro', 6, 3, 25);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Gominolas', 6, 1, 40);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Mermelada', 6, 5, 18);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Chocolate con leche', 6, 4, 22);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Caramelos', 6, 2, 35);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Jarabe de arce', 6, 7, 10);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Malvaviscos', 6, 3, 28);
INSERT INTO `producto` (`nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES ('Regaliz', 6, 2, 20);

-- Recetas

INSERT INTO `receta` (`dificultad`, `id_receta`, `nombre`) VALUES (1, 1, 'fresas con azucar')
INSERT INTO receta (dificultad, id_receta, nombre) VALUES (2, 2, 'Sopa du Macaco')

-- RecetasProducto
INSERT INTO `receta_producto` (`producto_id`, `receta_id`) VALUES ('9', '1')
INSERT INTO `receta_producto` (`producto_id`, `receta_id`) VALUES ('53', '1')

INSERT INTO `receta_producto` (`producto_id`, `receta_id`) VALUES ('31', '2')
INSERT INTO `receta_producto` (`producto_id`, `receta_id`) VALUES ('27', '2')
