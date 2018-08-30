//Write a calculator that takes two numbers and an operator and performs a calculation between them using the operator


function calculate(a, b, op) {
    /*
        let calc = function(a, b, op){
            return op(a, b)
        };
        let sum = function(a, b){return a + b};
        let subtract = function(a, b){return a + b};
        let multiply = function(a, b){return a * b};
        let divide = function(a, b){return a / b};

        switch (op){
            case '+': return calc(a, b, sum);
            case '-': return calc(a, b, subtract());
            case '*': return calc(a, b, multiply());
            case '/': return calc(a, b, divide());
        }
    }
    */
    switch (op){
        case '+' : return a + b;
        case '*' : return a * b;
        case '/' : return a / b;
        case '-' : return a - b;
    }
}



console.log(calculate(2, 4, '+'));