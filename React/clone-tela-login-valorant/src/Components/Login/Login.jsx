import React, { useState } from 'react';
import './Login.css';
// import logoRiotGames from  './assets/logo-riot-games.jpg'


const Login = () => {

    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    const handleSubmit = (event) => {
        event.preventDefault();
        alert("Enviando os dados: " + username + " - " + password);s
    }

    return (
        <div className="container">
        <div className="login-box">
          <div className="login-form">
            <img src="" alt="Riot Games Logo" className="logo" />
            <h2>Fazer login</h2>
            <form onSubmit={handleSubmit}>
              <input type="text" placeholder="Nome de Usuário" required onChange={(e) => setUsername(e.target.value)}/>
              <input type="password" placeholder="Senha" required onChange={(e) => setPassword(e.target.value)}/>
              <div className="social-login">
                <button type="button" className="btn facebook">FB</button>
                <button type="button" className="btn google">Google</button>
                <button type="button" className="btn apple">Apple</button>
                <button type="button" className="btn xbox">Xbox</button>
                <button type="button" className="btn playstation">PS</button>
              </div>
              <label>
                <input type="checkbox" /> Manter login
              </label>
              <button type="submit" className="submit-btn">Login</button>
            </form>
            <p className="help-text">Não consegue fazer login? <a href="#">Criar conta</a></p>
          </div>
        </div>
        <div className="image-box">
          <img src="/assets/bg_vava.jpg" alt="Login Background" />
        </div>
      </div>
    )
}

export default Login;