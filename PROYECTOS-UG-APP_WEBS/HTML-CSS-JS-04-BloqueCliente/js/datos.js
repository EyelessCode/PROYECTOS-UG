const params = new URLSearchParams(window.location.search);

const nombre = params.get('nombre');
const apellido = params.get('apellido');
const direccion = params.get('direccion');
const telefono = params.get('telefono');
const equipo=params.get('equipo')
const modelo = params.get('modelo');
const serie = params.get('serie');
const mouse=params.get('respuestaMouse');
const teclado=params.get('respuestaTeclado');
const camara=params.get('respuestaCamara');
const inconveniente = params.get('inconveniente');

document.getElementById('spNombre').textContent = nombre || "No proporcionado";
document.getElementById('spApellido').textContent = apellido || "No proporcionado";
document.getElementById('spDireccion').textContent = direccion || "No proporcionado";
document.getElementById('spTelefono').textContent = telefono || "No proporcionado";
document.getElementById('spEquipo').textContent = equipo || "No proporcionado";
document.getElementById('spModelo').value = modelo || "No proporcionado";
document.getElementById('spSerie').textContent = serie || "No proporcionado";
document.getElementById('spMouse').textContent = mouse || "No proporcionado";
document.getElementById('spTeclado').textContent = teclado || "No proporcionado";
document.getElementById('spCamara').textContent = camara || "No proporcionado";
document.getElementById('spInconveniente').textContent = inconveniente || "No proporcionado";
