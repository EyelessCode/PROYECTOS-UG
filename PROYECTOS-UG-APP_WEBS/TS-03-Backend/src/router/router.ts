import { Router } from "express";
import { SignoVitalController } from "../controller/signoVitalController";

const router=Router()
const controller=new SignoVitalController()

router.get('/signoVital',controller.controllerGetAll)
router.get('/signoVital/:id',controller.controllerGetOne)
router.post('/signoVital',controller.controllerCreate)
router.put('/signoVital/:id',controller.controllerUpdate)
router.delete('/signoVital/:id',controller.controllerDelete)


export default router;