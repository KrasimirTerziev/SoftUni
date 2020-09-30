function solve(input) {
    let result = [];

    for (let i = 0; i < input.length; i++) {
        if (input[i] > 0 || input[i] == 0) {
            result.push(input[i]);
        }
        else if (input[i] < 0) {
            result.unshift(input[i]);
        }

    }
    console.log(result);
}