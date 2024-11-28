import { modeloList, planesList } from "./DDBB.js";
import { cuotaEntrada, saldoEntrada, interesMensual,cuotaMensual } from "./logicaCalculo.js";

//! Recuperar los WIDGETS DE LA PÁGINA DEL 'SELECT'
const cmbModelos = document.getElementById("cmbModelos");
const txtTamanio = document.getElementById("txtTamanio");
const txtDormitorios = document.getElementById("txtDormitorios");
const txtBanio = document.getElementById("txtBanio");
const txtPrecio = document.getElementById("txtPrecio");

//? RECUPERAR LOS WIDGETS PARA EL SELECT DE PLANES
const cmbPlanes = document.getElementById('cmbPlanes');

const txtTasaAnual = document.getElementById('txtTasaAnual');
const txtPorcentajeEntrada = document.getElementById('txtPorcentajeEntrada');
const txtMeses = document.getElementById('txtMeses');

const txtCuotaEntrada = document.getElementById('txtCuotaEntrada');
const txtSaldo = document.getElementById('txtSaldo');
const txtCuotaMensual = document.getElementById('txtCuotaMensual');

const btnCalcularCuotas = document.getElementById('btnCalcularCuotas');
const btnGenerarTabla = document.getElementById('btnGenerarTabla');


//! EVENTO AL CARGAR EN LA VENTANA
window.addEventListener("DOMContentLoaded", () => {
    //? CREAR LAS OPCIONES (json) DEL SELECT (DDBB.js)
    modeloList.forEach((modelo) => {
        let option = document.createElement("option");

        option.value = modelo.id;
        option.textContent = modelo.nombre;

        cmbModelos.appendChild(option);
    });

    //! OPCIÒN POR DEFECTO
    let optionDefault = document.createElement('option');
    optionDefault.textContent = '-- Seleccione un modelo--';
    optionDefault.value = '';
    cmbPlanes.appendChild(optionDefault);

    //? CREAR LAS OPCIONES (json) DEL SELECT (DDBB.js)
    planesList.forEach((plano) => {
        let option = document.createElement("option");
        option.value = plano.id;
        option.textContent = plano.nombre;
        cmbPlanes.appendChild(option);
    });
});

//! EVENTO CHANGE DEL SELECT -> cmbModelos
cmbModelos.addEventListener("change", () => {
    let indice = cmbModelos.selectedIndex;
    let codigo = cmbModelos.options[indice].value;
    // el valio recupera en string, hay que hacer una conversión

    // alert(`índice selecionado ${indice}`);
    //? RECUPERAR EL MODELO DEL ARREGLO modelosList
    const modeloSeleccion = modeloList.find(
        (modelo) => modelo.id === parseInt(codigo)
    );
    //! el 'modelo.id===codigo es un predicado

    //? CARGAR LOS DATOS DEL MODELO DE VIVIENDA EN LAS CAJAS DE TEXTO
    txtTamanio.value = String(modeloSeleccion.tamanio);
    txtDormitorios.value = String(modeloSeleccion.dormitorios);
    txtBanio.value = String(modeloSeleccion.banios);
    txtPrecio.value = String(modeloSeleccion.precio.toFixed(2));

    txtCuotaEntrada.value = '';
    txtSaldo.value = '';
    txtCuotaMensual.value = '';

    // alert(`modelo selecionado ${modeloSeleccion.id} - ${modeloSeleccion.nombre}`);
    // alert(`indice selecionado: ${indice} - códdigo: ${codigo}`);
});

//! EVENTO CHANGE DEL SELECT -> cmbPlanes
cmbPlanes.addEventListener('change', () => {
    // alert(`Opción seleccionada: ${cmbPlanes.selectedIndex} - ${cmbPlanes.value}`)
    let indice = cmbPlanes.selectedIndex;
    let codigoPlan = cmbPlanes.options[indice].value;

    //? BUSCAR y obtener el plan de financiamineto de acuerdo al código del dicho plan
    let planSeleccionado = planesList.find((planes) => planes.id === parseFloat(codigoPlan));

    //? CARGAR LOS DATOS DEL PLAN DE FINANCIAMIENTO EN LAS CAJAS DE TEXTO
    txtTasaAnual.value = String(planSeleccionado.interesAnual.toFixed(2));
    txtPorcentajeEntrada.value = String(planSeleccionado.interesEntrada.toFixed(2));
    txtMeses.value = String(planSeleccionado.plazo * 12);

    //! VARIABLES PARA ALMACENAR LOS DATOS DEL MODELO DE VIVIENDA Y DEL PLAN DE FINANCIAMIENTO
    /*let precio=parseFloat(txtPrecio.value);
    let entrada=parseFloat(txtCuotaEntrada.value);
    let interes=parseFloat(interesAnual) */

    txtCuotaEntrada.value = '';
    txtSaldo.value = '';
    txtCuotaMensual.value = '';

    btnCalcularCuotas.addEventListener('click', () => {
        let precio = parseFloat(txtPrecio.value);
        let porcentajeEntrada = parseFloat(txtPorcentajeEntrada.value);
        let interesAnual = parseFloat(txtTasaAnual.value);
        let meses = parseInt(txtMeses.value);
        let entrada = cuotaEntrada(porcentajeEntrada, precio);
        let saldo = saldoEntrada(precio, entrada);
        let interes = interesMensual(interesAnual);
        let cuota = cuotaMensual(saldo, interes, meses);
        
        txtCuotaEntrada.value = entrada.toFixed(2);
        txtSaldo.value = saldo.toFixed(2);
        txtCuotaMensual.value = cuota.toFixed(2);
    });
});





// let indice = cmbModelos.selectedIndex;
// let codigo = cmbModelos.options[indice].value;
// let modeloSeleccionado = modeloList.find((modelo) => modelo.id === parseFloat(codigo));

// // let i = cmbModelos.selectedIndex;
// // let codigo = cmbModelos.options[indice].value;
// // let plan = planesList.find((planes) => planes.id === parseFloat(codigoPlan));

// //? OTRO INTENTO DE CALCULAR CUOTAS
// // let precioVariable=parseFloat(txtPrecio.value);

// const entrada=cuotaEntrada(planSeleccionado.interesEntrada,modeloSeleccionado.precio).toFixed(2);
// // const entrada=cuotaEntrada(planSeleccionado.interesEntrada,precioVariable).toFixed(2);
// const saldo=saldoEntrada(modeloSeleccionado.precio,entrada).toFixed(2);
// // const saldo=saldoEntrada(precioVariable,entrada).toFixed(2);
// const interes=interesAnualEntrada(planSeleccionado.interesAnual).toFixed(2);
// const mes=plazoEntrada(txtSaldo.value,interes,txtMeses.value).toFixed(2);
// // const cuotaTotal=cuotaTotal(saldo,interes,mes);




// // const mes=plazoEntrada(txtMeses.value);

// // const cuotaMensual=cuotaMensual(planSeleccionado.interesAnual,modeloSeleccionado
// //     .precio,planSeleccionado.plazo).toFixed(2);

// txtCuotaEntrada.value=String(entrada);
// txtSaldo.value=String(saldo);

// const cuotaTotal=cuotaTotal(saldo,interes,cuotaMensual);
// txtCuotaMensual.value=String(cuotaTotal);





/* n=(plazo*12)
i=(%entrada/12)
v=(cuotaEntrada-precio)
cuotaEntrada=(precio*%entrada)

c=v*(((1+i)^n*i)/((1+i)^n-1)) */
// let plan = planesList.find((planes) => planes.id === parseFloat(codigoPlan));

// //! VARIABLES PARA ALMACENAR LOS DATOS DEL MODELO DE VIVIENDA Y DEL PLAN DE FINANCIAMIENTO
// let p=parseFloat(txtPrecio.value);
// let e=parseFloat(txtCuotaEntrada.value);

// //todo: CARGAR DATOS CALCULADOS
// const entrada=cuotaEntrada(plan.interesEntrada,p).toFixed(2);
// const saldo=saldoEntrada(p,e).toFixed(2);

// txtCuotaEntrada.value=entrada;
// txtSaldo.value=saldo;