import { ISignoVital } from "../model/signoVitalModel";

export interface IRepository{
    getAll():ISignoVital[]
    getOneSigno(codigo:number):ISignoVital|undefined
    createSigno(signoVital:ISignoVital):ISignoVital
    updateSigno(signoVital:ISignoVital,codigo:number):ISignoVital|undefined
    deleteSigno(codigo:number):boolean
}