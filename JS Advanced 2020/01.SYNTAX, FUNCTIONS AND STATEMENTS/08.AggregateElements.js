function elements(numbers) {
    const sum = function (numbers) {
        let result = 0;
        for (let number of numbers) {
            result += number;
        }
        return result;
    };
    const sumA = numbers => {
        let result = 0;
        for (const number of numbers) {
            result += 1 / number;
        }
        return result;
    };
    const concat = numbers => numbers.join('');

    console.log(sum(numbers));
    console.log(sumA(numbers));
    console.log(concat(numbers));

};

elements([1, 2, 3]);