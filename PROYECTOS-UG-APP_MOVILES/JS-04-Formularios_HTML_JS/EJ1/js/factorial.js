import { factorial } from "./script.js"

const txtFact=document.getElementById("txtFact")
const txtResultado=document.getElementById("txtResultado")
const btnCalcular=document.getElementById("btnCalcular")
const div=document.getElementById("div-second")

btnCalcular.addEventListener("click",()=>{
    let num=parseInt(txtFact.value)

    txtResultado.style.backgroundColor="rgb(228, 228, 228)"
    txtFact.style.outlineColor="black"
    txtResultado.style.outlineColor="black"
    btnCalcular.style.backgroundColor="greenyellow"
    if(isNaN(num)||num<=0){
        txtResultado.value="Por favor ingrese un número mayor a 0."
        txtFact.style.outlineColor="red"
        txtResultado.style.outlineColor="red"
        txtResultado.style.backgroundColor="rgba(213, 103, 103, 1)"
        btnCalcular.style.backgroundColor="rgba(213, 103, 103, 1)"
        return;
    }

    const {resultado,array}=factorial(num)
    // txtResultado.value=''
    txtResultado.value=array.join("; ")
    let parrafo=document.createElement("p")
    parrafo.textContent=`Resultado directo: ${resultado}`
    const anterior=document.getElementById("resultado-directo")
    if(anterior)anterior.remove()
    parrafo.id="resultado-directo"

    div.appendChild(parrafo)
})
