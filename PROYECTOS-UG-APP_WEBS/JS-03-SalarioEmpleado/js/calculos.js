export function monto(number){
    let horas=String(number)+"";
    let salario=String(number)+"";

    let cantidadHoras=horas*14.86;
    let salarioHoras=cantidadHoras+salario;
    let montoAportacion=salarioHoras*(9.45/100);
    montoAportacion=number

    return number;
}

export function netoRecibir(number){
    let horas=String(parseFloat)+"";
    let salario=String(parseFloat)+"";

    let cantidadHoras=horas*14.86;
    let salarioHoras=cantidadHoras+salario;
    let montoAportacion=salarioHoras*(9.45/100);

    let neto=salarioHoras-montoAportacion;
    
    neto=number
}