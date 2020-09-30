function solve(input) {

let step = Number(input.pop());

input.forEach((num, index) => {
    if(index % step == 0){
        console.log(num);
    }
})

}

solve(['5',
    '20',
    '31',
    '4',
    '20',
    '2']
);