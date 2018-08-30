//Write a JS function to enter n numbers and print for each number x its binary logarithm (log2 x)

function binaryLogarithm(nums) {
    for (let x of nums) {
        console.log(Math.log2(x));
    }
}
