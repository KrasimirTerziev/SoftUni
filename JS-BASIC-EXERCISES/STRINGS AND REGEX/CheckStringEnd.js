/*
Write a JS function that checks if a given string, ends with a given substring.
The input comes as 2 string arguments. The first string will represent the main one.
 The second one will represent the substring.
The output is either “true” or “false” based on the result of the check.
The comparison is case-sensitive!
 */
function beginString(string, substring) {

    let text = reverseString(string);
    let part = reverseString(substring);

    if (text.indexOf(part) === 0) {
        console.log('true');
    } else {
        console.log('false');
    }
    function reverseString(str) {
        let newString = "";
        for (let i = str.length - 1; i >= 0; i--) {
            newString += str[i];
        }
        return newString;
    }
}

beginString('How have you been?', 'been?');
beginString('How have you been?', 'Been?');