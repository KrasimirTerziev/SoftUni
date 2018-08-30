function triangle (input){
    for (let i = 0; i <= input; i++) {
        console.log('*'. repeat(i));
    }
    for (let i = input - 1; i >= 1; i--) {
        console.log('*'.repeat(i));
    }
}

triangle(5);