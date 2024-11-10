export function ulam(numero){

    //todo 20 -> 10 5 16 8 4 2 1
    let cadenaSerie  = String(numero) + "  ";

    while(numero > 1){
        if(numero % 2 == 0){
        numero = numero / 2;
        }else{
        numero = numero * 3 + 1;
        }
        cadenaSerie = cadenaSerie + String(numero) + " ";
    }
    return cadenaSerie;
    }

export function fibonacci(limite){
    //todo x 0 y 1 ----> 0 1 1 2 3 5 8
    let x = 0 
    let y = 1
    let suma = 0
    let arregloSerie = []

    arregloSerie.push(x)
    arregloSerie.push(y)

    for(let i=0; i < limite; i=i+1){
        suma = x + y
        x = y
        y = suma

        arregloSerie.push(suma)
    }

    return arregloSerie;
}
