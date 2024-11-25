import { modeloList, planosList } from "./DDBB.js";

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
    planosList.forEach((plano) => {
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

    // alert(`modelo selecionado ${modeloSeleccion.id} - ${modeloSeleccion.nombre}`);
    // alert(`indice selecionado: ${indice} - códdigo: ${codigo}`);
});

//! EVENTO CHANGE DEL SELECT -> cmbPlanes
cmbPlanes.addEventListener('change', () => {
    // alert(`Opción seleccionada: ${cmbPlanes.selectedIndex} - ${cmbPlanes.value}`)
    let indice = cmbPlanes.selectedIndex;
    let codigoPlan = cmbPlanes.options[indice].value;

    //? BUSCAR y obtener el plan de financiamineto de acuerdo al código del dicho plan
    let planSeleccionado = planosList.find((plano) => plano.id === parseInt(codigoPlan));

    //? CARGAR LOS DATOS DEL PLAN DE FINANCIAMIENTO EN LAS CAJAS DE TEXTO
    txtTasaAnual.value = String(planSeleccionado.interesAnual.toFixed(2));
    txtPorcentajeEntrada = String(planSeleccionado.interesEntrada.toFixed(2));
    txtMeses.value = String(planSeleccionado.plazo * 12);
});
