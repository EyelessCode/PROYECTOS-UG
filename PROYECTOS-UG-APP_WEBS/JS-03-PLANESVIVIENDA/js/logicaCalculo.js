
export function cuotaEntrada(porcentajeEntrada,precioVivienda) {
    let cuotaEntrada=precioVivienda*porcentajeEntrada;
    return cuotaEntrada;
};

export function saldoEntrada(precioVivienda,cuotaEntrada) {
    let capitalPrestamo=precioVivienda-cuotaEntrada;
    return capitalPrestamo
};

export function interesAnualEntrada(interesAnual) {
    let interes=interesAnual/12;
    return interes;
};

export function plazoEntrada(meses){
    let plazoMeses=meses*12;
    return plazoMeses;
}

export function cuotaTotal(capitalPrestamo,interes,mes) {
    // let cuotaEntrada=precioVivienda*porcentajeEntrada;
    // let capitalPrestamo=precioVivienda-cuotaEntrada;
    // let interes=interesAnual/12;
    const test=
    capitalPrestamo*((((1+interes)*(mes*12))*interes)
    /((1+interes)*(mes*12))-1);

    // let test=
    // v*((((1+i)*n)*i)
    // /((1+i)*n)-1);

    return test;
}

/* n=(plazo*12)
i=(%entrada/12)
v=(cuotaEntrada-precio)
cuotaEntrada=(precio*%entrada)

c=v*(((1+i)^n*i)/((1+i)^n-1)) */



// import { planosList } from './DDBB.js';

// const txtPrecio = document.getElementById("txtPrecio");

// const txtTasaAnual = document.getElementById('txtTasaAnual');
// const txtPorcentajeEntrada = document.getElementById('txtPorcentajeEntrada');
// const txtMeses = document.getElementById('txtMeses');

// const txtCuotaEntrada = document.getElementById('txtCuotaEntrada');
// const txtSaldo = document.getElementById('txtSaldo');
// const txtCuotaMensual = document.getElementById('txtCuotaMensual');

// const btnCalcularCuotas = document.getElementById('btnCalcularCuotas');

// btnCalcularCuotas.addEventListener('click', () => {
//     let precio = parseFloat(txtPrecio.value)
//     let tasaAnual = parseFloat(txtTasaAnual.value)
//     let porcentajeEntrada = parseFloat(txtPorcentajeEntrada.value)
//     let meses = parseInt(txtMeses.value)
//     let cuotaEntrada = precio * (porcentajeEntrada / 100);
//     let tasaMensual = (tasaAnual / 100) / meses;
//     let cuotaMensual = (cuotaEntrada + (cuotaEntrada * tasaMensual));
//     let saldo = precio - cuotaEntrada;
//     txtCuotaEntrada.value = cuotaEntrada.toFixed(2);
//     txtSaldo.value = saldo.toFixed(2);
//     txtCuotaMensual.value = cuotaMensual.toFixed(2);
// });