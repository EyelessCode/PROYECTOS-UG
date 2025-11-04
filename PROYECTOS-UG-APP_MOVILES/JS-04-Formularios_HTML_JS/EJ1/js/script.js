export const factorial=(n)=>{
    let resultado
    let array=[]
    for(let i=n;i>1;i--){
        n=n*(i-1)
        // console.log(n)
        array.push(n)
        resultado=n
    }
    return {array,resultado}
}

// factorial(5)
