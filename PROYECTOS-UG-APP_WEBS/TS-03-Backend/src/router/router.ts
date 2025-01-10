import { Router } from "express";
import { SignoVitalController } from "../controller/signoVitalController";

const router=Router()
const controller=new SignoVitalController()

router.get('/signoVital',controller.controllerGetAll)
router.get('/signoVital/:codigo',controller.controllerGetOne)
router.post('/signoVital',controller.controllerCreate)
router.put('/signoVital/:codigo',controller.controllerUpdate)
router.delete('/signoVital/:codigo',controller.controllerDelete)


export default router;