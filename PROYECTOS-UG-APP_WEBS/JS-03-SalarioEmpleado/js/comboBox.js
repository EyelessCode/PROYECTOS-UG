import {mesesitos} from './BD.js';

const monthsContainer=document.getElementById('months');

window.addEventListener("DOMContentLoaded",()=>{
    const labelTicket=document.createElement('label');

    labelTicket.textContent="Mes: ";

    monthsContainer.appendChild(labelTicket);

})

window.addEventListener("DOMContentLoaded",()=>{
    const combo=document.createElement('select');

    mesesitos.forEach(meses=>{
        let opcion=document.createElement('option');

        opcion.value=meses.codigo;
        opcion.text=meses.mes;

        combo.appendChild(opcion);
    })

    monthsContainer.appendChild(combo);

})
