function solve(input) {
    let count = input.pop();

    for (let i = 0; i < count; i++) {
        let lastEl = input.pop();
        input.unshift(lastEl);
    }
    console.log(input.join(" "));
}

solve(['1',
    '2',
    '3',
    '4',
    '2'
])