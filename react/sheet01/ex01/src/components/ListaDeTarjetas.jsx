import Tarjeta from "./Tarjeta";
import "./Tarjeta.css";

function ListaDeTarjetas() {
  return (
    <>
      <div className="grid">
        <Tarjeta
          nombre="Artem"
          apellido="Abramov"
          ocupacion="vago"
          imagenURL="https://significado.com/wp-content/uploads/2015/03/Vago.jpg"
        />
        <Tarjeta
          nombre="nose"
          apellido="otro"
          ocupacion="  hace nada"
          imagenURL="https://thumbs.dreamstime.com/z/vago-en-el-centro-de-florencia-75919452.jpg"
        />
        <Tarjeta
          nombre="Artem"
          apellido="Abramov"
          ocupacion="vago"
          imagenURL="https://significado.com/wp-content/uploads/2015/03/Vago.jpg"
        />
      </div>
    </>
  );
}

export default ListaDeTarjetas;
