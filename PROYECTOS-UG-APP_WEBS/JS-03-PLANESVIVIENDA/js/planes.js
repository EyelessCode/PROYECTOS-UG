import { modeloList } from "./DDBB.js";

//! Recuperar los WIDGETS DE LA PÁGINA
const cmbModelos = document.getElementById("cmbModelos");
const txtTamanio = document.getElementById("txtTamanio");
const txtDormitorios = document.getElementById("txtDormitorios");
const txtBanio = document.getElementById("txtBanio");
const txtPrecio = document.getElementById("txtPrecio");

//! EVENTO AL CARGAR EN LA VENTANA
window.addEventListener("DOMContentLoaded", () => {
    //? CREAR LAS OPCIONES (json) DEL SELECT (DDBB.js)
    modeloList.forEach((modelo) => {
        const option = document.createElement("option");

        option.value = modelo.id;
        option.textContent = modelo.nombre;

        cmbModelos.appendChild(option);
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
