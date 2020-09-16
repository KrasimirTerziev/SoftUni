function input(string01, string02, string03){
    let sumlength;
    let finallength;

    let string01Length = string01.length;
    let string02Length = string02.length;
    let string03Length = string03.length;

    sumlength = string01Length + string02Length + string03Length;
    finallength = Math.floor(sumlength/3);

    console.log(sumlength);
    console.log(finallength);

}

input("text", "program", "softuni");