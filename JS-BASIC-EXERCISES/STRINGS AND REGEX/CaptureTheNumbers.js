/*
Write a JS function that finds all numbers in a sequence of strings.
The input comes as array of strings. Each element represents one of the strings.
The output is all the numbers, extracted and printed on a single line – each separated by a single space.
 */
function capture(input) {

   let text = input.join(' ');
   let regex = /\d+/g;
   let numbers = text.match(regex);
   console.log(numbers.join(' '));
}

capture(['The300', 'What is that?',
    'I think it’s the 3rd movie.',
    'Lets watch it at 22:45']);