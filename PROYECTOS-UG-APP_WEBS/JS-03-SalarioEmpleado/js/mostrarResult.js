// Selección de elementos
const salarioInput = document.getElementById('txtSalario');
const horasExtrasInput = document.getElementById('txtHorasExtras');
const costoHoraInput = document.getElementById('txtCostoHora');
const porcentajeAportacionInput = document.getElementById('txtPorcenAporta');
const montoAportacionInput = document.getElementById('txtMontoAporta');
const netoRecibirInput = document.getElementById('txtNetoRecibir');
const calcularBtn = document.getElementById('btnCalcular');

calcularBtn.addEventListener('click', () => {
    const salario = parseFloat(salarioInput.value) || 0;
    const horasExtras = parseFloat(horasExtrasInput.value) || 0;
    const costoHora = parseFloat(costoHoraInput.value);
    const porcentajeAportacion = parseFloat(porcentajeAportacionInput.value);

    if (salario <= 0) {
        alert('Por favor, ingresa un salario válido.');
        return;
    }

    const totalHorasExtras = horasExtras * costoHora;

    const montoAportacion = (salario + totalHorasExtras) * (porcentajeAportacion / 100);

    const netoRecibir = (salario + totalHorasExtras) - montoAportacion;

    montoAportacionInput.value = montoAportacion.toFixed(2);
    netoRecibirInput.value = netoRecibir.toFixed(2);
});
