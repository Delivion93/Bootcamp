function addListItem() {
  const text = document.getElementById("textInput").value.trim();

  if (text === "") {
    alert("text filed can't be empty");
  } else {
    const list = document.getElementById("list");
    const item = document.createElement("li");
    item.textContent = text;
    list.appendChild(item);
    document.getElementById("textInput").value = "";
  }
}

function changeBackgorungColor() {
  const div = document.getElementById("magicDiv");
  div.style.backgroundColor = getRandomColor();
  div.style.color = getRandomColor();
}

function getRandomColor() {
  const r = Math.floor(Math.random() * 256);
  const g = Math.floor(Math.random() * 256);
  const b = Math.floor(Math.random() * 256);
  return `rgb(${r},${g},${b})`;
}
