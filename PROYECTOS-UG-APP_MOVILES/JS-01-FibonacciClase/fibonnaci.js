import { fibonacciWithLimit } from "./serie.js"

let txtLimite=document.getElementById("txtLimite")
let txtSerie=document.getElementById("txtSerie")
let btnCalcular=document.getElementById("btnCalcular")

btnCalcular.addEventListener("click",()=>{
    let limite=txtLimite.value
    // console.log(limite);
    let serie=fibonacciWithLimit(parseInt(limite))
    // console.log(serie);
    let cadenaSerie = ''
    txtSerie.innerHTML=''

    for (let indice in serie) {
        cadenaSerie = cadenaSerie + String(serie[indice]) + " "    
    }

    txtSerie.value=serie
})