let array;

export const ulam=(limite)=>{
    array=[1,2]
    let candidato=3
    // if(limite<2)throw new Error("La secuencia necesita al menos 2 términos.")
    while(array.length<limite){
        let formas=0

        for (let i = 0; i < array.length; i++) { //!array=2
            for (let j = i+1; j < array.length; j++) { //!array=2
                if (array[i]+array[j]===candidato) {
                    formas++
                    if(formas>1)break
                }
            }
            if(formas>1)break
        }
        if(formas===1){
            array.push(candidato)
        }
        candidato++
    }
    console.log(array);
    return array
}
// let show=ulam(15)
// console.log(show);
