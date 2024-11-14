function generateRandomNumber(rango) {
  const number = Math.floor(Math.random() * rango) + 1;
  document.getElementById("result").textContent = number;
}
