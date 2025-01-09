import { IRepository } from "../interface/repositoryInterface";
import { ISignoVital } from '../model/signoVitalModel';

export class SignoVital implements IRepository{
    // const signo
    signo:ISignoVital[]=[
        {
            codigo:1,
            descripcion:"loremloremloremloremloremloremloremloremloremloremloremloremlorem"
        },
        {
            codigo:2,
            descripcion:"loremloremloremloremloremloremloremloreml"
        },
        {
            codigo:3,
            descripcion:"loremloremloremloremloremloremloremloremlo"
        },
        {
            codigo:4,
            descripcion:"loremloremloremloremloremloremloremloremlo"
        },
        {
            codigo:5,
            descripcion:"loremloremloremloremloremloremloremloremlo"
        }
    ]

    getAll(): ISignoVital[] {
        // throw new Error("Method not implemented.");
        return this.signo
    }
    getOneSigno(codigo: number): ISignoVital | undefined {
        // throw new Error("Method not implemented.");
        return this.signo.find((signo) => signo.codigo === codigo)
    }
    createSigno(signoVital: ISignoVital): ISignoVital {
        // throw new Error("Method not implemented.");
        this.signo.push(signoVital);
        return signoVital
    }
    updateSigno(signoVital: ISignoVital, codigo: number): ISignoVital | undefined {
        // throw new Error("Method not implemented.");
        let index=this.signo.findIndex((signoFind)=>signoFind.codigo===codigo);
        if(index!=1){
            this.signo[index]={... signoVital,codigo:codigo};
            return this.signo[index];
        }
        return undefined;
    }
    deleteSigno(codigo: number): boolean {
        // throw new Error("Method not implemented.");
        let index=this.signo.findIndex((signoFind)=>signoFind.codigo===codigo);
        if(index!=-1){
            this.signo.splice(index,1);
            return true;
        }
        return false
    }

}