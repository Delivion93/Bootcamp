import Producto from "./Product";

function ListaDeProductos({ productos }) {
  return (
    <div className="lista-productos">
      {productos.map((product, id) => (
        <Producto
          key={id}
          nombre={product.nombre}
          precio={product.precio}
          descripcion={product.descripcion}
        />
      ))}
    </div>
  );
}
export default ListaDeProductos;
