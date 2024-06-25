import { createContext } from 'react';
import { PropsChildren } from '../types';

type MeuCtxData = {
    nome: string
}

export const MeuCtx = createContext<MeuCtxData>({} as MeuCtxData)

const MeuProvider = ({ children }: PropsChildren) => {
    return (
        <MeuCtx.Provider value={{ nome: "Gustavo" }}>
            {children}
        </MeuCtx.Provider>
    );
};

export default MeuProvider;