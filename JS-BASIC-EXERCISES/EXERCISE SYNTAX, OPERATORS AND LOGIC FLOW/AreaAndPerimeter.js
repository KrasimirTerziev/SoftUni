/*
Write a JS function that calculates the area and perimeter of a rectangle by given two sides.
The input comes as 2 numbers that are the lengths of the 2 sides of the rectangle (sideA and sideB)
The output should be printed to the console on two lines.
 */

function calculates(a, b){

    let s = a*b;
    let p = 2*(a + b);

    console.log(s);
    console.log(p);
}

calculates(2, 2);