"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const cliente_repository_impl_1 = require("./repositories/cliente.repository.impl");
let cliente1 = ({
    codigo: 10,
    cedula: '0914253678',
    nombres: 'Carlos Macías'
});
let repository = new cliente_repository_impl_1.ClienteRepositoryImplement();
repository.getAll().forEach((cliente) => console.log(`Cédula: ${cliente.cedula} y nombre: ${cliente.nombres}`));
repository.delete(20);
repository.create(cliente1);
let gett = repository.getByCodigo(10);
console.log(`${gett === null || gett === void 0 ? void 0 : gett.codigo} - ${gett === null || gett === void 0 ? void 0 : gett.cedula} - ${gett === null || gett === void 0 ? void 0 : gett.nombres}`);
repository.getAll().forEach((cliente) => console.log(`Cédula: ${cliente.cedula} y nombre: ${cliente.nombres}`));
