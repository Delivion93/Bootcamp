function saludar(nombre) {
  console.log(`Hola ${nombre}`);
}
function mayor(a, b) {
  if (a > b) {
    return a;
  }
  if (b > a) {
    return b;
  }
  return "los numeros son iguales";
}

console.log(`resultado de funcion mayor(5,7) es ${mayor(5, 7)}`);
console.log(`resultado de funcion mayor(51,22) es ${mayor(51, 22)}`);
console.log(`resultado de funcion mayor(44,44) es ${mayor(44, 44)}`);
