"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SignoVitalController = void 0;
const signoVitalRepository_1 = require("../repository/signoVitalRepository");
class SignoVitalController {
    constructor(repositorio = new signoVitalRepository_1.SignoVital()) {
        this.controllerGetAll = (req, res) => {
            let signoVital = this.repositorioSignoVital.getAll();
            res.json(signoVital);
        };
        this.controllerGetOne = (req, res) => {
            let codigo = parseInt(req.params.codigo);
            let signoVital = this.repositorioSignoVital.getOneSigno(codigo);
            if (signoVital) {
                res.json(signoVital);
            }
            else {
                res.status(404).json({
                    message: "Código de cliente no encontrado!"
                });
            }
        };
        this.controllerCreate = (req, res) => {
            let signoVital = this.repositorioSignoVital.createSigno(req.body);
            res.status(201).json(signoVital);
        };
        this.controllerUpdate = (req, res) => {
            let codigo = parseInt(req.params.codigo);
            let signoVital = this.repositorioSignoVital.updateSigno(req.body, codigo);
            if (signoVital) {
                res.json(signoVital);
            }
            else {
                res.status(404).json({
                    message: "Código de cliente no encontrado"
                });
            }
        };
        this.controllerDelete = (req, res) => {
            let codigo = parseInt(req.params.codigo);
            let signoVital = this.repositorioSignoVital.deleteSigno(codigo);
            if (signoVital) {
                res.json(signoVital);
            }
            else {
                res.status(404).json({
                    message: "Código de cliente no encontrado"
                });
            }
        };
        this.repositorioSignoVital = repositorio;
    }
}
exports.SignoVitalController = SignoVitalController;
//# sourceMappingURL=signoVitalController.js.map