/*
Write a JS function that finds all variable names in a given string. A variable name starts with an underscore
(“_”) and contains only Capital and Non-Capital English Alphabet letters and digits.
Extract only their names, without the underscore. Try to do this only with regular expressions.
The input comes as single string, on which you have to perform the matching.
The output consists of all variable names, extracted and printed on a single line, each separated by a comma.
 */

function variable(input) {

    let regex = /\_[a-zA-Z]*/g;
    let string = input.match(regex);
    console.log(string.join(','));
}

variable('The _id and _age variables are both integers.');