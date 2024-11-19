let seconds = 0;
let task;

function addSecond() {
  seconds++;
  document.getElementById("seconds").textContent = seconds;
}

function start() {
  if (!task) {
    task = setInterval(addSecond, 1000);
  }
}

function stop() {
  clearInterval(task);
  task = null;
}
