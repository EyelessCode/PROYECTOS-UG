import { estudiantesDB } from "../js/DDBB.js";

const divTabla = document.getElementById("divTabla");

window.addEventListener("DOMContentLoaded", () => {
    let tabla = document.createElement("table");
    let thead = document.createElement('thead');
    let tboby = document.createElement('tbody');

    //! CREAR LA CABECERA
    let filaCabecera=document.createElement('tr');
    // const cabeceras=["Codigo","Cedula","Nombres","Edad"]
    const cabeceras=["Código","Cédula","Nombres","Edad"];
    cabeceras.forEach(textoHeader => {
        const th=document.createElement('th');

        th.textContent=textoHeader;
        //! AGREGA AL NOMBRE

        filaCabecera.appendChild(th);
        //! 'appendChild' AGREGA AL 'tr'
    });

    // AÑADIR LA FILA 'thead'
    thead.appendChild(filaCabecera);

    // AÑADIR EL 'thead' Y EL 'body' A LA TABLA
    tabla.appendChild(thead);


    //! CREAR LAS FILAS DEL 'body' DE LA TABLA
    //? ITERAR LA COLECCIÓN DE ESTUDIANTES
    estudiantesDB.forEach(estudiante=>{
        const fila=document.createElement('tr');

        //? ITERAR EL OBJETO ESTUDIANTE
        Object.values(estudiante).forEach(valor=>{
            const celdas=document.createElement('td');
            celdas.textContent=valor;

            fila.appendChild(celdas);
        })

        //? AÑADIR LA FILA AL 'tbody'
        tboby.appendChild(fila);

    })



    tabla.appendChild(tboby);

    // FINALMENTE AÑADO LA TABLA AL 'div'
    divTabla.appendChild(tabla);
});
