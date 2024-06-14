import React, { useEffect, useState } from 'react';
import styles from './styles.module.css';
import logoRiotGame from '../../assets/riot-games.png'
import setaLogin from '../../assets/setaLogin.png'
import setaLoginDesa from '../../assets/setaLoginDesa.png'
import logoFB from '../../assets/logoFB.png'
import logoGG from '../../assets/logoGG.png'
import logoAP from '../../assets/logoAP.png'
import logoXB from '../../assets/logoXB.png'
import logoPS from '../../assets/logoPS.png'


const Login = () => {

    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    
    const [buttonColor, setButtonColor] = useState();
    const [isButtonDisabled, setIsButtonDisabled] = useState();
    const [changeCursor, setChangeCursor] = useState();
    const [clickBtn, setClickBtn] = useState(0);

    const dadosLogin = [
      { username: "paixao", password: "somebody" },
      { username: "fred", password: "xerelete"}
      ];

    const estiloBtn = {
      img: buttonColor,
      cursor: changeCursor
      }
    
    function addClick() {
      setClickBtn(clickBtn => clickBtn + 1);
    }

    useEffect(() => {
      const userLogado = dadosLogin.find((usuario) => usuario.username === username && usuario.password === password);

      if(userLogado !== undefined){
        alert("Logado com sucesso!")
      }else if(clickBtn > 0){
        alert("Dados incorretos.")
      }
    }, [clickBtn])

    useEffect( () => {
      if (username && password){
        setButtonColor(setaLogin);
        setIsButtonDisabled(false);
        setChangeCursor('pointer')

      } else{
        setButtonColor(setaLoginDesa);
        setChangeCursor('not-allowed')
        setIsButtonDisabled(true);
      }
    }, [username, password])

    return (
        <div className={styles.container}>
        <div className={styles.loginBox}>
          <div className={styles.loginForm}>
            <img src={logoRiotGame} alt="Riot Games Logo" className={styles.logo} />
            <h2>Fazer login</h2>
            <form>

              <input type="text" placeholder="Nome de Usuário" required onChange={(e) => setUsername(e.target.value)}/>

              <input type="password" placeholder="Senha" required onChange={(e) => setPassword(e.target.value)}/>

              <div className={styles.socialLogin}>
                <button type="button" className={styles.facebookBtn}>
                  <img src={logoFB} alt="facebook" />
                  </button>
                <button type="button" className={styles.googleBtn}>
                  <img src={logoGG} alt="google" />
                </button>
                <button type="button" className={styles.appleBtn}>
                  <img src={logoAP} alt="apple"/>
                </button>
                <button type="button" className={styles.xboxBtn}>
                  <img src={logoXB} alt="xbox"/>
                </button>
                <button type="button" className={styles.psBtn}>
                  <img src={logoPS} alt="playstation"/>
                </button>
              </div>
              <label>
                <input type="checkbox" className={styles.checkbox}/> 
                Manter login
              </label>
            <button 
              type="submit"
              className={styles.submitBtn}
              onClick={addClick}
              style={estiloBtn}
              disabled={isButtonDisabled}>
                <img src={estiloBtn.img}/>
              </button>
            </form>
            <p className={styles.helpText}>Não consegue fazer login?</p> 
            <a href="https://authenticate.riotgames.com/?client_id=prod-xsso-playvalorant&code_challenge=KbkYt_5Rea-GyBDKFHovA8HQ7i3PclwEuC3VsggmcL8&method=riot_identity_signup&platform=web&redirect_uri=https%3A%2F%2Fauth.riotgames.com%2Fauthorize%3Fclient_id%3Dprod-xsso-playvalorant%26code_challenge%3DKbkYt_5Rea-GyBDKFHovA8HQ7i3PclwEuC3VsggmcL8%26code_challenge_method%3DS256%26prompt%3Dsignup%26redirect_uri%3Dhttps%253A%252F%252Fxsso.playvalorant.com%252Fredirect%26response_type%3Dcode%26scope%3Dopenid%2520account%2520email%2520offline_access%26show_region%3Dtrue%26state%3Dd600f96e779be9841422836c0a%26uri%3Dhttps%253A%252F%252Fplayvalorant.com%252Fpt-br%252Fdownload&show_region=true" target='_blank'>Criar conta</a>
          </div>
        </div>
        <div className={styles.imageBox}></div>
      </div>
    )
}

export default Login;