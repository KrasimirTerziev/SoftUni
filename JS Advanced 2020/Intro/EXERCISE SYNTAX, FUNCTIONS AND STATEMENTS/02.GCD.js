function divisor(num01, num02){
    let first = Number(num01);
    let second = Number(num02);

    let currentDivisor = 2;
    while(first>0){

        first /= currentDivisor;
    }
}