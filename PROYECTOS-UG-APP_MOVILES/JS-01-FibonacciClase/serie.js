// Si el valor del array es mayor se detiene.
let array=[0,1];

const fibonacciWithValue=(limite)=>{
    for (let index = 2; index < limite; index++) {
        array.push(array[index-1]+array[index-2])
        let last=array[array.length-1]
        if(last>=limite){
            break;
        }
    }
    return array
}

export const fibonacciWithLimit=(limite)=>{
    for (let index = 2; index < limite; index++) {
        array.push(array[index-1]+array[index-2])
    }
    return array
}

// let show=asd(100)
// console.log(show);
