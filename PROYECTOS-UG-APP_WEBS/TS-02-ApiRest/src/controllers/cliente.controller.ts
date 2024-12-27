import { Request, Response } from "express";
import { ClienteRepositoryImplement } from "../repositories/cliente.repository.impl";
import { IClienteRepository } from "../repositories/cliente.repository.interface";

export class ClienteController{
    private repositorioClientes:IClienteRepository;

    constructor(repositorio:IClienteRepository=new ClienteRepositoryImplement()) {
        this.repositorioClientes=repositorio;
    }

    obtenerTodo=(req:Request,res:Response):void=>{
        let cliente=this.repositorioClientes.getAll();
        res.json(cliente);
    }

    obtenerCodigo=(req:Request,res:Response):void=>{
        let codigo=Number(req.params.codigo);

        let cliente=this.repositorioClientes.getByCodigo(codigo);

        if (cliente) {
            res.json(cliente);
        }else{
            res.status(404).json({
                message:"Código de cliente no encontrado!"
            });
        }
    }

    crear=(req:Request,res:Response):void=>{
        let cliente=this.repositorioClientes.create(req.body);
        res.status(201).json(cliente);
    }

    actualizar=(req:Request,res:Response):void=>{
        let codigo=Number(req.params.codigo);

        let clienteActualizado=this.repositorioClientes.update(codigo,req.body);

        if (clienteActualizado) {
            res.json(clienteActualizado);
        }else{
            res.status(404).json({
                message:"Código de Cliente no encontrado!"
            });
        }
    }

    eliminar=(req:Request,res:Response):void=>{
        let codigo=Number(req.params.codigo);

        let clienteEliminado=this.repositorioClientes.delete(codigo);

        if (clienteEliminado) {
            res.status(404).json({
                message:"Cliente eliminado con éxito"
            });
        }else{
            res.status(404).json({
                message:"Código de Cliente no encontrado!"
            });
        }
    }
}