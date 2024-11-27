import { useState } from "react";
import Formulario from "./components/Formulario/Formulario";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <Formulario />
    </>
  );
}

export default App;
