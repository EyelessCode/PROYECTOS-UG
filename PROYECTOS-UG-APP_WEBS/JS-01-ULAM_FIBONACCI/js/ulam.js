import { ulam } from "./series.js";

//? Vamos a recuperar los widgets por su id

const txtNumero = document.getElementById('txtNumero');
const txtSerie = document.getElementById('txtSerie');
const btnGenerarSerie = document.getElementById('btnGenerarSerie');

//? 2. Registrar el evento click al boton 

btnGenerarSerie.addEventListener('click', (event) =>{
    //alert('Se disparo el evento click del boton...') //Defincion de funcion anonima/callback
    event.preventDefault() //Se cancela el submit

    let numero = parseInt(txtNumero.value)
    let serie = ulam(numero)
    txtSerie.value = serie 

    //console.log(`serie --> ${serie}`)
    //alert(serie)
})