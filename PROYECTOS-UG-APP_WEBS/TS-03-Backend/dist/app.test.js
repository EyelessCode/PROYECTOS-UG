"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const signoVitalRepository_1 = require("./repository/signoVitalRepository");
let signoTest = {
    codigo: 10,
    descripcion: "loremloremloremloremloremloremloremloremlorem"
};
let repository = new signoVitalRepository_1.SignoVital();
repository.getAll().forEach((signoEach) => console.log(`código: ${signoEach.codigo} - descripción: ${signoEach.descripcion}`));
repository.createSigno(signoTest);
repository.getAll().forEach((signoEach) => console.log(`Llamando de nuevo, código: ${signoEach.codigo} - descripción: ${signoEach.descripcion}`));
let getOne = repository.getOneSigno(10);
console.log(`Código: ${getOne === null || getOne === void 0 ? void 0 : getOne.codigo} Descripcion: ${getOne === null || getOne === void 0 ? void 0 : getOne.descripcion}`);
repository.deleteSigno(10);
repository.getAll().forEach((signoEach) => console.log(`Llamando por 2da vez, código: ${signoEach.codigo} - descripción: ${signoEach.descripcion}`));
//# sourceMappingURL=app.test.js.map