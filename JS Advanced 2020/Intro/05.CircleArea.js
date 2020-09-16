function area(num){
    
    let inputType = typeof(num);
    let areaCircle;

    //if (isNaN(num)){
    //   console.log("We can not calculate the circle area, because we receive a string.");
    if(inputType === 'number'){
        areaCircle = Math.PI * Math.pow(num, 2);
        console.log(areaCircle.toFixed(2));
    } 
    else {
        console.log(`We can not calculate the circle area, because we receive a ${inputType}.`);
    } 
}

area(5);