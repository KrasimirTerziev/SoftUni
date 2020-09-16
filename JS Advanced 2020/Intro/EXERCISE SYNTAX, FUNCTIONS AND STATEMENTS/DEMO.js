

function calc(fruit, grams, price){

    let weigth = grams/1000;
    let money = price * weigth;

    console.log(`I need $${money} to buy ${weight} kilograms ${fruit}.`);

}

calc('orange', 2500, 1.80)