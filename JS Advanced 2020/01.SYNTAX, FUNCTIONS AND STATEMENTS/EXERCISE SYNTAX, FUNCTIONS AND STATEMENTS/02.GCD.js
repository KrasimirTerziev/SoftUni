function divisor(num01, num02) {

    let first = Number(num01);
    let second = Number(num02);

    let length = Math.max(first, second);
    let currentDivisor;

    for (let i = 0; i <= length; i++) {
        if (first % i == 0 && second % i == 0) {
            currentDivisor = i;
        }
    }
    console.log(currentDivisor);
}

divisor(15, 5);