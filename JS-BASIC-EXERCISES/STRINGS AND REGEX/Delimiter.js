/*
Write a JS function that splits a string with a given delimiter.
The input comes as 2 string arguments. The first one is the string you need to split and the second one is the delimiter.
The output should consist of all elements you’ve received, after you’ve split the given string by the given delimiter.
Each element should be printed on a new line.
 */
/*
function  delimiter(input) {

    let splittedElements = input[0].split(input[1]);

    for (let i = 0; i < splittedElements.length; i++) {
        console.log(splittedElements[i]);
    }
}
delimiter(['One-Two-Three-Four-Five ', '-']);
*/

function delimiter(string, delimiter){

    let splittedElements = string.split(delimiter);

    for (let i = 0; i < splittedElements.length; i++) {
        console.log(splittedElements[i]);
    }
}
delimiter('One-Two-Three-Four-Five ', '-');