/*
Write a JS function that prints a given array.
The input comes as array of strings. The last element of the array is the delimiter.
The output is the same array, printed on the console, each element separated from
the others by the given delimiter.
 */

function printArr (input){
    let delimeter = input[input.length - 1];
    input.pop();
    let result = "";

    for (let i = 0; i < input.length; i++) {
        if (i === 0){
            result += input[i];
        } else {
            result += delimeter + input[i];
        }
    }
    console.log(result);
}

printArr(['One', 'Two', 'Three', 'Four', 'Five', '_']);