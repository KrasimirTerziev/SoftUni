function solve(input) {

    input.sort((curr, next) => {
        if (curr.length > next.length) {
            return 1;
        } else if (curr.length === next.length) {
            return curr > next;
        } else {
            return -1;
        }

    }).forEach(e => console.log(e));

}

solve(['alpha',
    'beta',
    'gamma']
);