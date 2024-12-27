import { Cliente } from './models/cliente';
import { ClienteRepositoryImplement } from './repositories/cliente.repository.impl';
import { IClienteRepository } from './repositories/cliente.repository.interface';

let cliente1:Cliente=({
    codigo:10,
    cedula:'0914253678',
    nombres:'Carlos Macías'
});

// console.log(`Nombres: ${cliente1.nombres}`);
let repository:IClienteRepository=new ClienteRepositoryImplement();

repository.getAll().forEach((cliente)=>console.log(`Cédula: ${cliente.cedula} y nombre: ${cliente.nombres}`));
repository.delete(20);
repository.create(cliente1);
repository.getAll().forEach((cliente)=>console.log(`Cédula: ${cliente.cedula} y nombre: ${cliente.nombres}`));

let gett=repository.getByCodigo(21);

console.log(`${gett?.codigo} - ${gett?.cedula} - ${gett?.nombres}`);
// repository.getAll().forEach((cliente)=>console.log(`Cédula: ${cliente.cedula} y nombre: ${cliente.nombres}`));
