import { createContext, useState } from 'react';
import { PropsChildren } from '../types';
import { signIn } from '../services/auth';
import api from '../services/api';

type User = {
    name: string,
    email: string
}


type AuthCtxData = {
    user: null | User,
    login(email: string, senha: string): Promise<void>,
    logout(): void,
    signed: boolean, 
}

export const AuthCtx = createContext<AuthCtxData>({} as AuthCtxData)

const AuthProvider = ({ children }: PropsChildren) => {

    const [user, setUser] = useState<null | User>(null);

    const login = async (login: string, senha: string) => {
        const dados = await signIn(login, senha);
        console.log(dados);

        //Configura o token na instância do Axios
        //Manda o token para api em toda requisição
        api.defaults.headers.Authorization = `Bearer ${dados.token}`

        setUser(dados.user);
    };

    const logout = () => {
        setUser(null);
    };

    return (
        <AuthCtx.Provider value={{user, login, logout, signed: !!user}}>
            {children}
        </AuthCtx.Provider>
    );
};

export default AuthProvider;