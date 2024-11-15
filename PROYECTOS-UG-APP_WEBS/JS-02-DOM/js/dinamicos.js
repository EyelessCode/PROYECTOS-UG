import {vehiculosDB} from './DDBB.js'

//? Crear dinámicamente un elemento select
//? con opciones creadas dinámicamente generadas

const ctx_select=document.getElementById('ctx_select')


// const vehiculosDB = [
//     { codigo: 10, marca: "Chevrolet", modelo: "Aveo", anio: 2019 },
//     { codigo: 20, marca: "Chevrolet", modelo: "Onix", anio: 2020 },
//     { codigo: 30, marca: "Renault", modelo: "Logan", anio: 2015 },
//     { codigo: 40, marca: "Renault", modelo: "Duster", anio: 2019 },
//     { codigo: 50, marca: "Kia", modelo: "Sportage", anio: 2023 },
//     { codigo: 60, marca: "Kia", modelo: "Rio", anio: 2021 },
//     { codigo: 70, marca: "Mazda", modelo: "X3", anio: 2024 },
// ]

window.addEventListener('DOMContentLoaded',()=>{
    //! Árbol de componentes 'DOMcontentloaded'
    //? crear a través de función 'createElement'
    const combo=document.createElement('select')
    //! Crea el elemeto select

    //? iterar el arreglo de objetos de vehículos
    vehiculosDB.forEach(vehiculo => {
        //? craer un elemento option

        let opcion=document.createElement('option')
        //! Crea el elemeto option

        opcion.value=vehiculo.codigo
        opcion.text=vehiculo.marca+' '+vehiculo.modelo+' '+vehiculo.anio
        
        // agregar el objeto option al select
        combo.appendChild(opcion)
    });

    ctx_select.appendChild(combo)

})