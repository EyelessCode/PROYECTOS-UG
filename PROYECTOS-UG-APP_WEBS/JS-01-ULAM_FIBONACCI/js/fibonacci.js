import { fibonacci } from "./series.js";

const txtNumero = document.getElementById('txtNumero')
const txtSerie = document.getElementById('txtSerie')
const btnGenerarSerie = document.getElementById('btnGenerarSerie')

btnGenerarSerie.addEventListener('click', (e) => {
    e.preventDefault()

    let limite = txtNumero.value
    let arregloSerie = fibonacci(limite)
    let cadenaSerie = ''

    for (let indice in arregloSerie) {
        cadenaSerie = cadenaSerie + String(arregloSerie[indice]) + " "    
    }
    
    txtSerie.value = cadenaSerie
})