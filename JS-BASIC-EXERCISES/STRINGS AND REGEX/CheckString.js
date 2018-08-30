/*
Write a JS function that checks if a given string, starts with a given substring.
The input comes as 2 string arguments. The first string will represent the main one.
The second one will represent the substring.
The output is either “true” or “false” based on the result of the check.
The comparison is case-sensitive!
 */
function beginString(string, substring) {

    if(string.indexOf(substring) === 0){
        console.log(true);
    }else{
        console.log('false');
    }

}
beginString('How have you been?', 'how');
beginString('How have you been?', 'How');