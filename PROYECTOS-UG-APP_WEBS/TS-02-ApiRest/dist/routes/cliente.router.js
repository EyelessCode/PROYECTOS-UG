"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const cliente_controller_1 = require("../controllers/cliente.controller");
const router = (0, express_1.Router)();
const controller = new cliente_controller_1.ClienteController();
router.get('/clientes', controller.obtenerTodo);
router.get('/clientes/:codigo', controller.obtenerCodigo);
router.post('/clientes/', controller.crear);
router.put('/clientes/:codigo', controller.actualizar);
router.delete('/clientes/:codigo', controller.eliminar);
exports.default = router;