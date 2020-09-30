function solve(input) {

let max = Number.MIN_SAFE_INTEGER;

input.forEach(num => {
    if(num >= max){
        max = num;
        console.log(max);
    }
});

}

solve([1,
    3,
    8,
    4,
    10,
    12,
    3,
    2,
    24]
);