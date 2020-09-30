function solve(n, k){

    let result = [1];

    for(let i = 1; i < n; i++){
        let lastKnum = result.slice(-k);
        let sum = lastKnum.reduce((a, x) => a + x, 0);
        result.push(sum);
    }
    console.log(result.join(' '));

}

solve(8, 2);