import {listClientes,listTuristico} from './BD.js';

const btnBuscar=document.getElementById('btnBuscar');
const txtCodigo=document.getElementById('txtCodigo');
const txtCedula=document.getElementById('txtCedula');
const txtNombres=document.getElementById('txtNombres');
const cmbTuristico=document.getElementById('cmbTuristico');
const txtRecorrido=document.getElementById('txtRecorrido')
const txtCosto=document.getElementById('txtCosto')
const btnGrabar=document.getElementById('btnGrabar')
const txtNumPersonas=document.getElementById('txtNumPersonas');
const txtSubtotal=document.getElementById('txtSubtotal');
const txtIva=document.getElementById('txtIva')
const txtTotal=document.getElementById('txtTotal')
const btnCancelar=document.getElementById('btnCancelar')

window.addEventListener('DOMContentLoaded',()=>{
    listTuristico.forEach((turistico)=>{
        let opcion = document.createElement("option");
        opcion.value = turistico.id;
        opcion.textContent = turistico.ciudad;
        cmbTuristico.appendChild(opcion);
    })

});

cmbTuristico.addEventListener('change',()=>{
    let i=cmbTuristico.selectedIndex;
    let codigo=cmbTuristico.options[i].value;
    let seleccion=listTuristico.find((turistico)=>turistico.id===parseInt(codigo));

    txtRecorrido.value=String(seleccion.recorrido)
    txtCosto.value=String(seleccion.costo);
})

//!!! evento BOTOM!!
btnBuscar.addEventListener('click',()=>{
    listClientes.forEach((cliente)=>{
        if(txtCodigo.value==cliente.id){
            const cedu=cliente.cedula;
            const nom=cliente.nombre;

            txtCedula.value=String(cedu);
            txtNombres.value=String(nom);
        }
/*         else if(txtCedula.value>cliente.id){
            txtCedula.value="";
            txtNombres.value="";
        } */
    })

    btnGrabar.addEventListener('click',()=>{
        let i=cmbTuristico.selectedIndex;
        let codigo=cmbTuristico.options[i].value;
        let seleccion=listTuristico.find((turistico)=>turistico.id===parseInt(codigo));

        const numPerso=parseInt(txtNumPersonas.value);
        const costo=parseFloat(txtCosto.value);
        const iva=parseFloat(txtIva.value)

        // let subtotalEntrada=subtotal(seleccion.costo,numPerso);
        let subtotalEntrada=subtotal(costo,numPerso);
        let totalEntrada=total(subtotalEntrada,iva)

        txtSubtotal.value=parseFloat(subtotalEntrada);
        txtTotal.value=parseFloat(totalEntrada);
        function subtotal(costo,personas) {
            return costo*personas;
        }
        
        function total(subtotal,iva) {
            return subtotal*iva;
        }
    })

    btnCancelar.addEventListener('click',()=>{
        txtCedula.value="";
        txtNombres.value="";
        txtRecorrido.value="";
        txtCosto.value="";
        txtNumPersonas.value="";
        txtSubtotal.value="";
        txtTotal.value="";
    })

});
