// Write a JS function to check if num is odd or even.
function oddEven(number){

    if(!Number.isInteger(number)){
        console.log('invalid');
    } else if (number % 2 === 0){
        console.log('even');
    } else {
        console.log('odd');
    }
}

oddEven(5);