/*
You are tasked with storing sequences of numbers. You will receive an unknown amount of arrays containing numbers from
which you must store only the unique arrays (duplicate arrays should be discarded).
An array is considered the same (NOT unique) if it contains the same numbers as another array, regardless of their order.
After storing all arrays, your program should print them back in ascending order based on their length, if two arrays
have the same length they should be printed in order of being received from the input. Each individual array should
be printed in descending order in the format "[a1, a2, a3,… an]". Check the examples bellow.
The input comes as an array of strings where each entry is a JSON representing an array of numbers.
The output should be printed on the console - each array printed on a new line in the format "[a1, a2, a3,… an]" ,
following the above mentioned ordering.
 */

function solve(input) {

    let result = [];
    for (let i = 0; i < input.length; i++) {
        let currentRow = JSON.parse(input[i])
            .map(Number)
            .sort((a, b) => b - a);
        let currentSum = currentRow.reduce((a,b) => a+b);
        if(!result.find(array =>array.reduce((a,b) => a+b) === currentSum)){
         result.push(currentRow);
        }
    }
    result.sort((a,b) => a.length - b.length).forEach(arr => console.log(`[${arr.join(', ')}]`));
}

solve(['[-3, -2, -1, 0, 1, 2, 3, 4]', '[10, 1, -17, 0, 2, 13]', '[4, -3, 3, -2, 2, -1, 1, 0]']);