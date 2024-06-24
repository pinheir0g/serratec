import { useState } from "react";
import RotasPrivadas from "./RotasPrivadas";
import RotasPublicas from "./RotasPublicas";

const Routes = () => {
    
    const [isLogado, setLogado] = useState(false);

    return (
        <>
           {isLogado ? <RotasPrivadas/> : <RotasPublicas/>}
        </>
    )
};

export default Routes;