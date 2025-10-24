function fibonacciIterativo(n){
    let fib=[0,1]
    for (let i=2;i<n;i++) {
        fib.push(fib[i-1]+fib[i-2])
        console.log(fib)
    }
    return fib
}
console.log(fibonacciIterativo(10))
