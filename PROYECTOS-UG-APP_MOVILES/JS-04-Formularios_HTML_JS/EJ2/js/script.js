function verificarPalindromo() {
    const palabra = document.getElementById("palabra").value.toLowerCase().replace(/\s+/g, '');
    const invertida = palabra.split('').reverse().join('');
    const esPalindromo = palabra === invertida;
    document.getElementById("resultado").textContent = esPalindromo
    ? `"${palabra}" es un palíndromo.`
    : `"${palabra}" no es un palíndromo.`;
}