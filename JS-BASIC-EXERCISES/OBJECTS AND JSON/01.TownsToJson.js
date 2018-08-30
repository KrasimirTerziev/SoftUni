/*
You’re tasked to create and print a JSON from a text table. You will receive input as an array of strings, where each
string represents a row of a table, with values on the row encompassed by pipes &quot;|&quot; and optionally spaces. The
table will consist of exactly 3 columns “Town”, “Latitude” and “Longitude”. The latitude and longitude columns will
always contain valid numbers. Check the examples to get a better understanding of your task.
The input comes as an array of strings – the first string contains the table’s headings, each next string is a row from
the table.
The output should be an array of objects wrapped in JSON.stringify(). Latitude and longitude must be parsed to
numbers!
 */
function towns (input){

    input.shift();

    for (let i = 0; i < input.length; i++) {
        let values = input[i].split(/\s*\|\s*/).filter(a => a !== '');
        /*
        let obj = {};
        obj['Town'] = values[0];
        obj['Latitude'] = values[0];
        obj['Longitude'] = values[0];
        */
        input[i] = {Town : values[0], Latitude : +values[1], Longitude : +values[2]};
    }
    console.log(JSON.stringify(input));
}
towns (['| Town | Latitude | Longitude |', '| Sofia | 42.696552 | 23.32601 |', '| Beijing | 39.913818 | 116.363625 |']);