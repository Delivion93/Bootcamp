import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);
  const plus = () => {
    setCount((count) => count + 1);
  };
  const minus = () => {
    setCount((count) => count - 1);
  };

  const reset = () => {
    setCount((count) => 0);
  };
  return (
    <>
      Count is {count};
      <div className="buttons">
        <button onClick={plus} name="">
          Plus
        </button>
        <button onClick={minus}>Minus</button>
        <button onClick={reset}>Reset</button>
      </div>
    </>
  );
}

export default App;
