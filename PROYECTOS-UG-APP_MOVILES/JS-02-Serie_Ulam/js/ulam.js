import { ulam } from "./serie.js"

let txtLimite=document.getElementById("txtLimite")
let txtSerie=document.getElementById("txtSerie")
let btnCalcular=document.getElementById("btnCalcular")

btnCalcular.addEventListener("click",()=>{
    txtSerie.style.backgroundColor="rgb(198, 198, 198)"
    txtSerie.style.outlineColor="gray"
    let limite=txtLimite.value
    if(isNaN(limite)||limite<=2){
        txtSerie.value="Por favor ingrese un número mayor a 2."
        txtSerie.style.outlineColor="red"
        txtSerie.style.backgroundColor="rgba(211, 60, 60, 1)"
        return;
    }
    let serie=ulam(parseInt(limite))

    txtSerie.value=""
    txtSerie.value = serie.join(", ");
})