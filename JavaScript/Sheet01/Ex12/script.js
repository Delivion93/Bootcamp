function calc(operacion) {
  const num1 = parseFloat(document.getElementById("num1").value);
  const num2 = parseFloat(document.getElementById("num2").value);
  let result;
  let articulo;
  switch (operacion) {
    case "suma":
      result = num1 + num2;
      articulo = "de la";
      break;
    case "diferencia":
      result = num1 - num2;
      articulo = "de la";
      break;
    case "producto":
      result = num1 * num2;
      articulo = "del";
      break;
    case "cociente":
      if (num2 === 0) {
        result = "no se puede dividir por 0";
        articulo = "del";
      }
      result = num1 / num2;
      break;
    default:
      result = "error";
  }
  document.getElementById(
    "resultado"
  ).textContent = `El resultado ${articulo} ${operacion} es ${result}`;
}
