const cmbPaises=document.getElementById('cmbPaises');

cmbPaises.addEventListener('change',() =>{
    alert(`índice seleccionado: ${cmbPaises.selectedIndex}`)

    const indice=cmbPaises.selectedIndex

    const paisSeleccionado=cmbPaises[indice]

    alert(`pais seleccionado: ${paisSeleccionado.value} - ${paisSeleccionado.label}`)
})