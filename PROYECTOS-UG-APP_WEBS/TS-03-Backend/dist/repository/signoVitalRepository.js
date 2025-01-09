"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SignoVital = void 0;
class SignoVital {
    constructor() {
        this.signo = [
            {
                codigo: 1,
                descripcion: "loremloremloremloremloremloremloremloremloremloremloremloremlorem"
            },
            {
                codigo: 2,
                descripcion: "loremloremloremloremloremloremloremloreml"
            },
            {
                codigo: 3,
                descripcion: "loremloremloremloremloremloremloremloremlo"
            },
            {
                codigo: 4,
                descripcion: "loremloremloremloremloremloremloremloremlo"
            },
            {
                codigo: 5,
                descripcion: "loremloremloremloremloremloremloremloremlo"
            }
        ];
    }
    getAll() {
        return this.signo;
    }
    getOneSigno(codigo) {
        return this.signo.find((signo) => signo.codigo === codigo);
    }
    createSigno(signoVital) {
        this.signo.push(signoVital);
        return signoVital;
    }
    updateSigno(signoVital, codigo) {
        let index = this.signo.findIndex((signoFind) => signoFind.codigo === codigo);
        if (index != 1) {
            this.signo[index] = Object.assign(Object.assign({}, signoVital), { codigo: codigo });
            return this.signo[index];
        }
        return undefined;
    }
    deleteSigno(codigo) {
        let index = this.signo.findIndex((signoFind) => signoFind.codigo === codigo);
        if (index != -1) {
            this.signo.splice(index, 1);
            return true;
        }
        return false;
    }
}
exports.SignoVital = SignoVital;
//# sourceMappingURL=signoVitalRepository.js.map