"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ClienteRepositoryImplement = void 0;
class ClienteRepositoryImplement {
    constructor() {
        this.clientes = [{
                codigo: 20,
                cedula: '094784512',
                nombres: 'Carlos Luís Andrade'
            },
            {
                codigo: 21,
                cedula: '0948752589',
                nombres: 'Ana María Raffo'
            },
            {
                codigo: 22,
                cedula: '0985741589',
                nombres: 'Juan Carlos Macías'
            }
        ];
    }
    getAll() {
        return this.clientes;
    }
    getByCodigo(codigo) {
        return this.clientes.find((clienteFind) => clienteFind.codigo === codigo);
    }
    create(cliente) {
        this.clientes.push(cliente);
        return cliente;
    }
    update(codigo, clienteActualizado) {
        let index = this.clientes.findIndex((clienteFind) => clienteFind.codigo === codigo);
        if (index != 1) {
            this.clientes[index] = Object.assign(Object.assign({}, clienteActualizado), { codigo });
            return this.clientes[index];
        }
        return undefined;
    }
    delete(codigo) {
        let index = this.clientes.findIndex((clienteFind) => clienteFind.codigo === codigo);
        if (index != -1) {
            this.clientes.splice(index, 1);
            return true;
        }
        return false;
    }
}
exports.ClienteRepositoryImplement = ClienteRepositoryImplement;
