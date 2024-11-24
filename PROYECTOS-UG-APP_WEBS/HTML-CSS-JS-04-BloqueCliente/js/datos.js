const params = new URLSearchParams(window.location.search);

const nombre = params.get('nombre');
const apellido = params.get('apellido');
const direccion = params.get('direccion');
const telefono = params.get('telefono');
const inconveniente = params.get('inconveniente');

document.getElementById('spNombre').textContent = nombre || "No proporcionado";
document.getElementById('spApellido').textContent = apellido || "No proporcionado";
document.getElementById('spDireccion').textContent = direccion || "No proporcionado";
document.getElementById('spTelefono').textContent = telefono || "No proporcionado";
document.getElementById('spInconveniente').textContent = inconveniente || "No proporcionado";
