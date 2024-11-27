import React, { useState } from "react";
function Formulario() {
  const [nombre, setNombre] = useState("");
  const [email, setEmail] = useState("");
  const [contrasena, setContrasena] = useState("");
  const [mensaje, setMensaje] = useState("");
  const handleSubmit = (event) => {
    event.preventDefault();
    setMensaje(`Nombre: ${nombre}, Email: ${email}, Contraseña: ${contrasena}`);
  };
  return <></>;
}
export default Formulario;
