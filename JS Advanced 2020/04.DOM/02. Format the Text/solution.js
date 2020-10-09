function solve() {

  let input = document.getElementById('input');
  let text = input.innerHTML;
  let outputElement = document.getElementById('output');
  
  let sentences = text.split('.');

  while(sentences.length > 0){
    let currentParagraph = sentences.splice(0, 3).join('.');
    
    let paragraphElement = document.createElement('p');
    paragraphElement.innerHTML = currentParagraph;

    outputElement.appendChild(paragraphElement);
  }
}