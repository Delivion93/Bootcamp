import "./App.css";
import ListaDeProductos from "./components/ListOfProducts";
import Product from "./components/Product";
const arrayDeProductos = [
  {
    nombre: "Cervaza",
    precio: "incalculable",
    decsripcion: "que cosa mas rica",
  },
  { nombre: "Vodka", precio: "5 euro", decsripcion: "que cosa mas fea" },
  { nombre: "Manzana", precio: "2 euro", decsripcion: "fruta" },
  { nombre: "Nissan Primera", precio: "incalculable", decsripcion: "raketa" },
];

function App() {
  return (
    <>
      <ListaDeProductos productos={arrayDeProductos} />
    </>
  );
}

export default App;
