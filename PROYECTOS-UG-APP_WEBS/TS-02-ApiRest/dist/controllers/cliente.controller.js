"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ClienteController = void 0;
const cliente_repository_impl_1 = require("../repositories/cliente.repository.impl");
class ClienteController {
    constructor(repositorio = new cliente_repository_impl_1.ClienteRepositoryImplement()) {
        this.obtenerTodo = (req, res) => {
            let cliente = this.repositorioClientes.getAll();
            res.json(cliente);
        };
        this.obtenerCodigo = (req, res) => {
            let codigo = Number(req.params.codigo);
            let cliente = this.repositorioClientes.getByCodigo(codigo);
            if (cliente) {
                res.json(cliente);
            }
            else {
                res.status(404).json({
                    message: "Código de cliente no encontrado!"
                });
            }
        };
        this.crear = (req, res) => {
            let cliente = this.repositorioClientes.create(req.body);
            res.status(201).json(cliente);
        };
        this.actualizar = (req, res) => {
            let codigo = Number(req.params.codigo);
            let clienteActualizado = this.repositorioClientes.update(codigo, req.body);
            if (clienteActualizado) {
                res.json(clienteActualizado);
            }
            else {
                res.status(404).json({
                    message: "Código de Cliente no encontrado!"
                });
            }
        };
        this.eliminar = (req, res) => {
            let codigo = Number(req.params.codigo);
            let clienteEliminado = this.repositorioClientes.delete(codigo);
            if (clienteEliminado) {
                res.status(404).json({
                    message: "Cliente eliminado con éxito"
                });
            }
            else {
                res.status(404).json({
                    message: "Código de Cliente no encontrado!"
                });
            }
        };
        this.repositorioClientes = repositorio;
    }
}
exports.ClienteController = ClienteController;
