function Producto({ nombre, precio, descripcion }) {
  return (
    <div className="producto">
      <h2>{nombre}</h2>
      <p>Precio: {precio}</p>
      <p>{descripcion}</p>
    </div>
  );
}

export default Producto;
