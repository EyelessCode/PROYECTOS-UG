import { fibonacciWithLimit } from "./serie.js"

let txtLimite=document.getElementById("txtLimite")
let txtSerie=document.getElementById("txtSerie")
let btnCalcular=document.getElementById("btnCalcular")

btnCalcular.addEventListener("click",()=>{
    let limite=txtLimite.value
    if(isNaN(limite)||limite<=2){
        txtSerie.value="Por favor ingrese un número mayor a 2."
        return;
    }
    // console.log(limite);
    let serie=fibonacciWithLimit(parseInt(limite))
    // console.log(serie);
    // let cadenaSerie = '';
    /* for (let indice in serie) {
        cadenaSerie += serie[indice] + ", ";
    } */

    txtSerie.value=""
    txtSerie.value = serie.join(", ");
})