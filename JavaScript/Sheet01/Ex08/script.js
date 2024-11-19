const persona = {
  name: "artem",
  age: 31,
  city: "Benalmadena",
  toString: function () {
    return `Name: ${this.name}, age: ${this.age}, city: ${this.city}`;
  },
};

printObject(persona);

function printObject(object) {
  console.log(object.toString());
}
