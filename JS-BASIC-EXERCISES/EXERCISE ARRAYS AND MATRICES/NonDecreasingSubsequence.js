/*
Write a JS function that extracts only those numbers that form a non-decreasing subsequence.
In other words, you start from the first element and continue to the end of the given array of numbers.
Any number which is LESS THAN the current biggest one is ignored, alternatively if it’s equal or higher
than the current biggest one you set it as the current biggest one and you continue to the next number.
The input comes as array of numbers.
The output is the processed array after the filtration, which should be a non-decreasing subsequence.
Each element should be printed on a new line.
 */
function Subsequence(input){

    let Arr = [];
    input.map(Number);

    let biggest = input[0];
    for (let i = 0; i < input.length; i++) {
        if(input[i] >= biggest){
            Arr.push(input[i]);
            biggest = input[i];
        }
    }
    console.log(Arr.join('\n'));

}
Subsequence([1, 3, 8, 4, 20]);