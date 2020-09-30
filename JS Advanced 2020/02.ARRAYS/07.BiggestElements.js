function solve(matrix) {

    let maxNuber = Number.MIN_SAFE_INTEGER;

    matrix.forEach(row => {
        let currentMax = Number.MIN_SAFE_INTEGER;

        row.forEach(num => {
            if (currentMax < num) {
                currentMax = num;
            }
        });
        if (maxNuber < currentMax){
            maxNuber = currentMax;
        }
    });

    console.log(maxNuber);
}

solve([[20, 50, 10],
[8, 33, 145]]
);