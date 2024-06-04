import React, { useEffect, useState } from 'react';
import styles from './styles.module.css';

function App() {
  const [count, setCount] = useState(0);
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  function addCount() {
    setCount(count => count + 1)
  };

  useEffect(() => {
    console.log("password", password)
    console.log("email", email)
  }, [count]);

  return (
    <div className={styles.container}>
      <p>Email</p>
      <input onChange={e => setEmail(e.target.value)} />
      <p>Senha</p>
      <input onChange={e => setPassword(e.target.value)} />
      <button onClick={addCount}>
        Atualiza contagem
      </button>
    </div>

  )
}

export default App
