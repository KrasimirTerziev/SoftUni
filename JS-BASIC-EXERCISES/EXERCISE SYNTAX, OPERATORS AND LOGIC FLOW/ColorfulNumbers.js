/*
Write a JS function to print the numbers from 1 to n
Return a string holding HTML list <ul><li>…</li></ul>
Display the odd lines in green, even lines in blue
 */

function generateNumber(count) {
    let result = '<ul>\n';
    for (let i = 1; i <= count; i++) {
        let color = (i % 2 === 0) ? 'blue' : 'green';
        result += `   <li><span style='color:${color}'>${i}</span></li>\n`;
    }
    console.log(result += '</ul>')

}
generateNumber(10);

