function growingWord() {

  let parent = document.getElementById('exercise');
  let growing = parent.lastElementChild;
  let color = document.getElementById('colors');

  if(!growing.style.fontSize){
    growing.style.fontSize = '2px';
  } else {
    growing.style.fontSize = parseInt(growing.style.fontSize) * 2 + 'px';
  }

  let firstColor = color.firstElementChild;
  let finalColor = firstColor.innerHTML.toLowerCase();

  growing.style.color = finalColor;

  color.appendChild(firstColor);
}