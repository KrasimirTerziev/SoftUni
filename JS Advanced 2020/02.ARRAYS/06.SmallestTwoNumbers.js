function solve(input) {

    let numbers = input.sort((a, b) => a - b);
    let result = numbers.splice(0, 2);

    console.log(result.join(' '));
}

solve([30, 15, 50, 5]);