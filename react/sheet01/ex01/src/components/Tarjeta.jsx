import "./Tarjeta.css";
import React from "react";

function Tarjeta({ nombre, apellido, ocupacion, imagenURL }) {
  return (
    <>
      <div className="card">
        <div className="info">
          <p>Nombre: {nombre}</p>
          <p>Apellido: {apellido}</p>
          <p>Ocupacion: {ocupacion}</p>
        </div>
        <div className="foto">
          <img src={imagenURL} alt="foto" />
        </div>
      </div>
    </>
  );
}

export default Tarjeta;
