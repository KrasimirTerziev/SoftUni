/*
You are given a JSON string representing an array of objects, parse the JSON and create a table using the supplied
objects. The table should have 2 columns "name" and "score", each object in the array will also have these keys.
Any text elements must also be escaped in order to ensure no dangerous code can be passed.
You can either write the HTML escape function yourself or use the one from the Strings and Regular Expressions Lab.
The input comes as a single string argument – the array of objects as a JSON.
The output should be printed on the console – a table with 2 columns - "name" and "score", containing the values
from the objects as rows.
 */

function score(str) {

    let arr = JSON.parse(str);
    let result = '<table>\n  <tr>'

    for (const key in arr[0]) {
        result += `<th>${key}</th>`;
    }
    result += '</tr>\n';
    for (const obj of arr) {
        result += `  <tr><td>${escapeHtml(obj['name'])}</td><td>${escapeHtml(obj['score'] + '')}</td></tr>\n`;
    }
    console.log(result + '</table>');



    function escapeHtml(str) {
        return str.replace(/&/g, '&amp;')
            .replace(/</g, '&lt;')
            .replace(/>/g, '&gt;')
            .replace(/"/g, '&quot;')
            .replace(/'/g, '&#39;')

    }

}

score(['[{"name":"Pesho","score":479},{"name":"Gosho","score":205}]']);