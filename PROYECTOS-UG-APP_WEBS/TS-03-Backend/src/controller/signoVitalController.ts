import { Request, Response } from "express";
import { IRepository } from "../interface/repositoryInterface";
import { SignoVital } from "../repository/signoVitalRepository";

export class SignoVitalController{
    private repositorioSignoVital:IRepository

    constructor(repositorio:IRepository=new SignoVital()) {
        this.repositorioSignoVital=repositorio
    }

    controllerGetAll=(req:Request,res:Response):void=>{
        let signoVital=this.repositorioSignoVital.getAll()
        res.json(signoVital)
    }

    controllerGetOne=(req:Request,res:Response):void=>{
        let codigo=parseInt(req.params.codigo)
        let signoVital=this.repositorioSignoVital.getOneSigno(codigo)

        if (signoVital) {
            res.json(signoVital)
        } else {
            res.status(404).json({
                message:"Código de cliente no encontrado!"
            })
        }
    }

    controllerCreate=(req:Request,res:Response):void=>{
        let signoVital=this.repositorioSignoVital.createSigno(req.body)
        res.status(201).json(signoVital)
    }

    controllerUpdate=(req:Request,res:Response):void=>{
        let codigo=parseInt(req.params.codigo)
        let signoVital=this.repositorioSignoVital.updateSigno(req.body,codigo)

        if (signoVital) {
            res.json(signoVital)
        } else {
            res.status(404).json({
                message:"Código de cliente no encontrado"
            })
        }
    }

    controllerDelete=(req:Request,res:Response):void=>{
        let codigo=parseInt(req.params.codigo)
        let signoVital=this.repositorioSignoVital.deleteSigno(codigo)

        if (signoVital) {
            res.json(signoVital)
        } else {
            res.status(404).json({
                message:"Código de cliente no encontrado"
            })
        }
    }
}