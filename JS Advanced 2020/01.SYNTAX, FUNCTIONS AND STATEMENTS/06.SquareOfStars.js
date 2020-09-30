function stars(row){
    if(!row){
        for(let i = 1; i <= 5; i ++){
            console.log('* * * * *');
        }
    }
    else{
        let starsRow = +row;
        for (let i= 1; i <= starsRow; i ++){
             console.log("* ".repeat(row));
        }
    }
}

stars(5);