/*
Write a JS function that rotates an array. The array should be rotated to the right side, meaning that the last
element should become the first, upon rotation.
The input comes as array of strings. The last element of the array is the amount of rotation you need to perform.
The output is the resulted array after the rotations. The elements should be printed on one line, separated by a
single space.
 */

function rotate(arr){
    let rotateCounter = Number(arr.pop());
    rotateCounter %= arr.length;

    for (let i = 0; i < rotateCounter; i++) {
        let lastElement = arr.pop();
        arr.unshift(lastElement);
    }
console.log(arr.join(' '));
}
rotate(['1', '2', '3', '4', '5', '2']);