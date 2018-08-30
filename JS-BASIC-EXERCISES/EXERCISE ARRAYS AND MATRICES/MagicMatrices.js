/*
Write a JS function that checks if a given matrix of numbers is magical.
A matrix is magical if the sums of the cells of every row and every column are equal.
The input comes as an array of arrays, containing numbers (number 2D matrix).
The input numbers will always be positive.
The output is a Boolean result indicating whether the matrix is magical or not.
 */

function magic(matrix){

    let sumOne = 0;
    let sumTwo = 0;

    for (let row = 0; row < matrix.length; row++) {
        for (let col = 0; col < matrix.length; col++) {
            sumOne += matrix[row][row];
            sumTwo += matrix[row][col];
        }
    }
    if(sumTwo === sumOne){
        console.log('true');
    } else{
        console.log('false');
    }
}
/*
function magic(arr) {

    let sum = 0;
    arr[0].forEach(x => sum += x);
    for (let row = 1; row < arr.length; row++) {
        let rowSum = 0;
        arr[row].forEach(x => rowSum += x);
        if (rowSum != sum)	console.log('false');
    }
    for (let col = 0; col < arr[0].length; col++) {
        let colSum = 0;
        for (let row = 0; row < arr.length; row++)
            colSum += arr[row][col];
        if (colSum != sum)	console.log('false');
    }
    console.log('true');
}
*/
magic([[4, 5, 6],
    [6, 5, 4],
    [5, 5, 5]]);