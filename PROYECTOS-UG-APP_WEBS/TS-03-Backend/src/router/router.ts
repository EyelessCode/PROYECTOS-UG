import { Router } from "express";

const router=Router()
router.get('/signoVital')
router.get('/signoVital/:id')
router.post('/signoVital')
router.put('/signoVital/:id')
router.delete('/signoVital/:id')


export default router;