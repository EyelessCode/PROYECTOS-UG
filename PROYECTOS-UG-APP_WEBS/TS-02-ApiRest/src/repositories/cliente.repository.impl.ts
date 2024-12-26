import {Cliente} from '../models/cliente';
import { IClienteRepository } from './cliente.repository.interface';

export class ClienteRepositoryImplement implements IClienteRepository{
    clientes:Cliente[]=[{
        codigo:20,
        cedula:'094784512',
        nombres:'Carlos Luís Andrade'
    },
    {
        codigo:21,
        cedula:'0948752589',
        nombres:'Ana María Raffo'
    },
    {
        codigo:22,
        cedula:'0985741589',
        nombres:'Juan Carlos Macías'
    }
];

    getAll(): Cliente[] {
        // throw new Error('Method not implemented.');
        return this.clientes;
    }
    getByCodigo(codigo: number): Cliente | undefined {
        // throw new Error('Method not implemented.');
        return this.clientes.find((clienteFind)=>clienteFind.codigo===codigo);
    }
    create(cliente: Cliente): Cliente {
        // throw new Error('Method not implemented.');
        this.clientes.push(cliente);
        return cliente;
    }
    update(codigo: number, clienteActualizado: Cliente): Cliente | undefined {
        // throw new Error('Method not implemented.');
        let index=this.clientes.findIndex((clienteFind)=>clienteFind.codigo===codigo);
        if(index==1){
            this.clientes[index]={... clienteActualizado,codigo};
            return this.clientes[index];
        }
        return undefined;
    }
    delete(codigo: number): boolean {
        // throw new Error('Method not implemented.');
        let index=this.clientes.findIndex((clienteFind)=>clienteFind.codigo===codigo);
        if(index!=-1){
            this.clientes.splice(index,1);
            return true;
        }
        return false;
    }
    
}