const diasDeLaSemana = [
  "lunes",
  "martes",
  "miércoles",
  "jueves",
  "viernes",
  "sábado",
  "domingo",
];
for (let i in diasDeLaSemana) {
  console.log(diasDeLaSemana[i]);
}

function sumarArreglo(array) {
  let result = 0;
  for (let i in array) {
    result += array[i];
  }
  return result;
}

let array = [1, 2, 3, 4, 5];
console.log(
  `resultado de llamada sumarArreglo(array) es ${sumarArreglo(array)}`
);
