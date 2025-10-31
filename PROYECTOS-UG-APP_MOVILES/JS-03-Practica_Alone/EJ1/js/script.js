function verificarPerfecto() {
    const num = parseInt(document.getElementById("numPerfecto").value);
    let suma = 0;
    for (let i = 1; i < num; i++) {
    if (num % i === 0) suma += i;
    }
    const esPerfecto = suma === num;
    document.getElementById("resultado1").textContent = esPerfecto
    ? `${num} es un número perfecto.`
    : `${num} no es un número perfecto.`;
}
