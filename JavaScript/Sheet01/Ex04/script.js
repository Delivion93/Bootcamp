checkNumber(0);
checkNumber(33);
checkNumber(-42);

function checkNumber(numero) {
  if (numero > 0) {
    console.log(`El numero ${numero} es negativo`);
  } else if (numero < 0) {
    console.log(`El numero ${numero} es positivo`);
  } else {
    console.log(`El numero ${numero} es cero`);
  }
}
