function solve(matrix) {
    let primarySum = 0;
    let secondaySum = 0;

    let elementIndex = 0;

    matrix.forEach((row, i) => {
        primarySum += row[elementIndex];
        secondaySum += row[row.length - 1 - elementIndex];

        elementIndex++;
    });
    console.log(primarySum + ' ' + secondaySum);
}

solve([[20, 40],
    [10, 60]]
   );