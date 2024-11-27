import React, { useState } from "react";
import "./styles.css";
function Formulario() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [message, setMessage] = useState("");
  const handleSubmit = (event) => {
    event.preventDefault();
    setMessage(`Name: ${name} | Password: ${password} | Email: ${email}`);
  };
  return (
    <>
      <form onSubmit={handleSubmit} className="form">
        <div>
          <p>Name: </p>
          <input
            type="text"
            name="name"
            value={name}
            onChange={(x) => setName(x.target.value)}
          />
        </div>
        <div>
          <p>Email: </p>
          <input
            type="text"
            name="email"
            value={email}
            onChange={(x) => setEmail(x.target.value)}
          />
        </div>
        <div>
          <p>Pssword: </p>
          <input
            type="text"
            name="password"
            value={password}
            onChange={(x) => setPassword(x.target.value)}
          />
        </div>
        <button type="submit">Submit</button>
      </form>
      {message && <p>{message}</p>}
    </>
  );
}
export default Formulario;
