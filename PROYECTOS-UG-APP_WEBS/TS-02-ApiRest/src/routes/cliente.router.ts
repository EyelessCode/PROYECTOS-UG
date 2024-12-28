import { Router } from "express";
import { ClienteController } from "../controllers/cliente.controller";

const router=Router();
const controller=new ClienteController();

router.get('/clientes',controller.obtenerTodo);
router.get('/clientes/:codigo',controller.obtenerCodigo);
router.post('/clientes/',controller.crear);
router.put('/clientes/:codigo',controller.actualizar);
router.delete('/clientes/:codigo',controller.eliminar);

export default router;