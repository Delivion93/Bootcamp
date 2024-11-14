let number = Math.floor(Math.random() * 100) + 1;

function guessNumber() {
  const userNumber = document.getElementById("input").value;
  const message = document.getElementById("result");
  if (userNumber > number) {
    document.getElementById("result").textContent = "El numer es menor";
    document.getElementById("result").style.color = "red";
  } else if (userNumber < number) {
    document.getElementById("result").textContent = "El numer es mayor";
    document.getElementById("result").style.color = "red";
  } else {
    document.getElementById("result").textContent = "¡Adivinaste el número!";
    document.getElementById("result").style.color = "green";
  }
}
