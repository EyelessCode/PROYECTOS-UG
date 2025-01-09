import { ISignoVital } from "./model/signoVitalModel";
import { SignoVital } from "./repository/signoVitalRepository";

let signoTest:ISignoVital={
    codigo:10,
    descripcion:"loremloremloremloremloremloremloremloremlorem"
}

let repository:SignoVital=new SignoVital();
repository.getAll().forEach((signoEach)=>console.log(
    `código: ${signoEach.codigo} - descripción: ${signoEach.descripcion}`
))
repository.createSigno(signoTest)
repository.getAll().forEach((signoEach)=>console.log(
    `Llamando de nuevo, código: ${signoEach.codigo} - descripción: ${signoEach.descripcion}`
))
let getOne=repository.getOneSigno(10)
console.log(`Código: ${getOne?.codigo} Descripcion: ${getOne?.descripcion}`);
repository.deleteSigno(10)
repository.getAll().forEach((signoEach)=>console.log(
    `Llamando por 2da vez, código: ${signoEach.codigo} - descripción: ${signoEach.descripcion}`
))