import { IRepository } from "../interface/repositoryInterface";
import { ISignoVital } from "../model/signoVitalModel";

export class SignoVital implements IRepository{
    const signo

    getAll(): ISignoVital[] {
        // throw new Error("Method not implemented.");
    }
    getOneSigno(codigo: number): ISignoVital | undefined {
        throw new Error("Method not implemented.");
    }
    createSigno(signoVital: ISignoVital): ISignoVital {
        throw new Error("Method not implemented.");
    }
    updateSigno(signoVital: ISignoVital, codigo: number): ISignoVital | undefined {
        throw new Error("Method not implemented.");
    }
    deleteSigno(codigo: number): boolean {
        throw new Error("Method not implemented.");
    }

}