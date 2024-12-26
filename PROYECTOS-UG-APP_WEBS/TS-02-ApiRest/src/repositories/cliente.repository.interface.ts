import { Cliente } from "../models/cliente";

export interface IClienteRepository{
    getAll():Cliente[];
    getByCodigo(codigo:number):Cliente|undefined;
    create(cliente:Cliente):Cliente;
    update(codigo:number,clienteActualizado:Cliente):Cliente|undefined;
    delete(codigo:number):boolean;
}