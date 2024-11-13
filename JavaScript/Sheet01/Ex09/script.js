function invertirCadena(text) {
  return text.split("").reverse().join("");
}

console.log(`resultado de invertir palabra Hola es :${invertirCadena("Hola")}`);

function contarVocales(text) {
  let vocales = "AEIOUaeiou";
  let charArray = Array.from(text);
  let counter = 0;
  for (let i in charArray) {
    if (vocales.includes(charArray[i])) {
      counter++;
    }
  }
  return counter;
}

console.log(
  `resultado de cantidad de vocales en cadena de"aatttoggu" es ${contarVocales(
    "aatttoggu"
  )}`
);
