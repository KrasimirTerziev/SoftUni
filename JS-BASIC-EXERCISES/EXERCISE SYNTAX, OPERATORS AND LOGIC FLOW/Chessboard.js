//Write a JS function to print a chessboard of size n.

function chessboard(num){
    let result = '<div class="chessboard">\n';
    for (let row = 0; row < num; row ++) {
        result += '  <div>\n';
        let color = (row % 2 === 0) ? 'black' : 'white';
        for (let col = 0; col < num; col ++) {
            result += `    <span class="${color}"></span>\n`;
            color = (color === 'white') ? 'black' : 'white';
        }
        result += '  </div>\n';
    }
    console.log (result + '</div>');
}
chessboard(3);