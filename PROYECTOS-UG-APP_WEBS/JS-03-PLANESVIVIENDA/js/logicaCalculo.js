import {planosList} from './DDBB.js';

const txtCuotaEntrada=document.getElementById('txtCuotaEntrada');
const txtPrecio = document.getElementById("txtPrecio");


export function calculoCuotas(tasaInteresCuotaEntrada,precioVivienda){
    let cuotaEntrada=precioVivienda*tasaInteresCuotaEntrada;
    // let planSeleccionado=planosList.
    
    return cuotaEntrada;
};