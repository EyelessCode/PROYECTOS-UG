"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const router = (0, express_1.Router)();
router.get('/signoVital');
router.get('/signoVital/:id');
router.post('/signoVital');
router.put('/signoVital/:id');
router.delete('/signoVital/:id');
exports.default = router;
//# sourceMappingURL=router.js.map