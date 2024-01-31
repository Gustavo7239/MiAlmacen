INSERT INTO `tipo_producto` VALUES(1, 'Lacteo');
INSERT INTO `tipo_producto` VALUES(2, 'Verdura');
INSERT INTO `tipo_producto` VALUES(3, 'Fruta');

INSERT INTO `producto` (`id_producto`, `nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES(1, 'Manzana', 3, 2, 10);
INSERT INTO `producto` (`id_producto`, `nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES(2, 'Pera', 3, 1, 20);
INSERT INTO `producto` (`id_producto`, `nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES(3, 'Yogurt', 1, 4, 8);
INSERT INTO `producto` (`id_producto`, `nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES(4, 'Leche', 1, 1, 100);
INSERT INTO `producto` (`id_producto`, `nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES(5, 'Tomate', 2, 5, 4);
INSERT INTO `producto` (`id_producto`, `nombre`, `tipo_producto_id`, `precio`, `cantidad`) VALUES(6, 'Patata', 2, 20, 2);