function solve(number) {

    let sum = 0;
    let lastDigit = number % 10;
    let equalCount = 0;

    while (number / 10 > 0) {
        let digit = number % 10;
        sum += digit;

        if (digit !== lastDigit) {
            equalCount++;
        }

        lastDigit = digit;
        number = Math.floor(number / 10);
    }
    console.log(equalCount == 0 ? true : false);
    console.log(sum);

    //number = number.toString();
    //for(let i = 0; i < number.length; i++){
    //    if(number[i] != number[i + 1]){
    //      
    //}
    //}
}

solve('222322')